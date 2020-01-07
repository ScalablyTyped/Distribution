package typings.googleapis.buildSrcApisRunV1alpha1Mod.run_v1alpha1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A single application container. This specifies both the container to run,
  * the command to run in the container and the arguments to supply to it. Note
  * that additional arguments may be supplied by the system to the container at
  * runtime.
  */
@js.native
trait Schema$Container extends js.Object {
  /**
    * Arguments to the entrypoint. The docker image&#39;s CMD is used if this
    * is not provided. Variable references $(VAR_NAME) are expanded using the
    * container&#39;s environment. If a variable cannot be resolved, the
    * reference in the input string will be unchanged. The $(VAR_NAME) syntax
    * can be escaped with a double $$, ie: $$(VAR_NAME). Escaped references
    * will never be expanded, regardless of whether the variable exists or not.
    * Cannot be updated. More info:
    * https://kubernetes.io/docs/tasks/inject-data-application/define-command-argument-container/#running-a-command-in-a-shell
    * +optional
    */
  var args: js.UndefOr[js.Array[String]] = js.native
  /**
    * Entrypoint array. Not executed within a shell. The docker image&#39;s
    * ENTRYPOINT is used if this is not provided. Variable references
    * $(VAR_NAME) are expanded using the container&#39;s environment. If a
    * variable cannot be resolved, the reference in the input string will be
    * unchanged. The $(VAR_NAME) syntax can be escaped with a double $$, ie:
    * $$(VAR_NAME). Escaped references will never be expanded, regardless of
    * whether the variable exists or not. Cannot be updated. More info:
    * https://kubernetes.io/docs/tasks/inject-data-application/define-command-argument-container/#running-a-command-in-a-shell
    * +optional
    */
  var command: js.UndefOr[js.Array[String]] = js.native
  /**
    * List of environment variables to set in the container. Cannot be updated.
    * +optional
    */
  var env: js.UndefOr[js.Array[Schema$EnvVar]] = js.native
  /**
    * List of sources to populate environment variables in the container. The
    * keys defined within a source must be a C_IDENTIFIER. All invalid keys
    * will be reported as an event when the container is starting. When a key
    * exists in multiple sources, the value associated with the last source
    * will take precedence. Values defined by an Env with a duplicate key will
    * take precedence. Cannot be updated. +optional
    */
  var envFrom: js.UndefOr[js.Array[Schema$EnvFromSource]] = js.native
  /**
    * Docker image name. More info:
    * https://kubernetes.io/docs/concepts/containers/images
    */
  var image: js.UndefOr[String] = js.native
  /**
    * Image pull policy. One of Always, Never, IfNotPresent. Defaults to Always
    * if :latest tag is specified, or IfNotPresent otherwise. Cannot be
    * updated. More info:
    * https://kubernetes.io/docs/concepts/containers/images#updating-images
    * +optional
    */
  var imagePullPolicy: js.UndefOr[String] = js.native
  /**
    * Actions that the management system should take in response to container
    * lifecycle events. Cannot be updated. +optional
    */
  var lifecycle: js.UndefOr[Schema$Lifecycle] = js.native
  /**
    * Periodic probe of container liveness. Container will be restarted if the
    * probe fails. Cannot be updated. More info:
    * https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes
    * +optional
    */
  var livenessProbe: js.UndefOr[Schema$Probe] = js.native
  /**
    * Name of the container specified as a DNS_LABEL. Each container must have
    * a unique name (DNS_LABEL). Cannot be updated.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * List of ports to expose from the container. Exposing a port here gives
    * the system additional information about the network connections a
    * container uses, but is primarily informational. Not specifying a port
    * here DOES NOT prevent that port from being exposed. Any port which is
    * listening on the default &quot;0.0.0.0&quot; address inside a container
    * will be accessible from the network. Cannot be updated. +optional
    */
  var ports: js.UndefOr[js.Array[Schema$ContainerPort]] = js.native
  /**
    * Periodic probe of container service readiness. Container will be removed
    * from service endpoints if the probe fails. Cannot be updated. More info:
    * https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes
    * +optional
    */
  var readinessProbe: js.UndefOr[Schema$Probe] = js.native
  /**
    * Compute Resources required by this container. Cannot be updated. More
    * info:
    * https://kubernetes.io/docs/concepts/storage/persistent-volumes#resources
    * +optional
    */
  var resources: js.UndefOr[Schema$ResourceRequirements] = js.native
  /**
    * Security options the pod should run with. More info:
    * https://kubernetes.io/docs/concepts/policy/security-context/ More info:
    * https://kubernetes.io/docs/tasks/configure-pod-container/security-context/
    * +optional
    */
  var securityContext: js.UndefOr[Schema$SecurityContext] = js.native
  /**
    * Whether this container should allocate a buffer for stdin in the
    * container runtime. If this is not set, reads from stdin in the container
    * will always result in EOF. Default is false. +optional
    */
  var stdin: js.UndefOr[Boolean] = js.native
  /**
    * Whether the container runtime should close the stdin channel after it has
    * been opened by a single attach. When stdin is true the stdin stream will
    * remain open across multiple attach sessions. If stdinOnce is set to true,
    * stdin is opened on container start, is empty until the first client
    * attaches to stdin, and then remains open and accepts data until the
    * client disconnects, at which time stdin is closed and remains closed
    * until the container is restarted. If this flag is false, a container
    * processes that reads from stdin will never receive an EOF. Default is
    * false +optional
    */
  var stdinOnce: js.UndefOr[Boolean] = js.native
  /**
    * Optional: Path at which the file to which the container&#39;s termination
    * message will be written is mounted into the container&#39;s filesystem.
    * Message written is intended to be brief final status, such as an
    * assertion failure message. Will be truncated by the node if greater than
    * 4096 bytes. The total message length across all containers will be
    * limited to 12kb. Defaults to /dev/termination-log. Cannot be updated.
    * +optional
    */
  var terminationMessagePath: js.UndefOr[String] = js.native
  /**
    * Indicate how the termination message should be populated. File will use
    * the contents of terminationMessagePath to populate the container status
    * message on both success and failure. FallbackToLogsOnError will use the
    * last chunk of container log output if the termination message file is
    * empty and the container exited with an error. The log output is limited
    * to 2048 bytes or 80 lines, whichever is smaller. Defaults to File. Cannot
    * be updated. +optional
    */
  var terminationMessagePolicy: js.UndefOr[String] = js.native
  /**
    * Whether this container should allocate a TTY for itself, also requires
    * &#39;stdin&#39; to be true. Default is false. +optional
    */
  var tty: js.UndefOr[Boolean] = js.native
  /**
    * volumeDevices is the list of block devices to be used by the container.
    * This is an alpha feature and may change in the future. +optional
    */
  var volumeDevices: js.UndefOr[js.Array[Schema$VolumeDevice]] = js.native
  /**
    * Pod volumes to mount into the container&#39;s filesystem. Cannot be
    * updated. +optional
    */
  var volumeMounts: js.UndefOr[js.Array[Schema$VolumeMount]] = js.native
  /**
    * Container&#39;s working directory. If not specified, the container
    * runtime&#39;s default will be used, which might be configured in the
    * container image. Cannot be updated. +optional
    */
  var workingDir: js.UndefOr[String] = js.native
}

object Schema$Container {
  @scala.inline
  def apply(
    args: js.Array[String] = null,
    command: js.Array[String] = null,
    env: js.Array[Schema$EnvVar] = null,
    envFrom: js.Array[Schema$EnvFromSource] = null,
    image: String = null,
    imagePullPolicy: String = null,
    lifecycle: Schema$Lifecycle = null,
    livenessProbe: Schema$Probe = null,
    name: String = null,
    ports: js.Array[Schema$ContainerPort] = null,
    readinessProbe: Schema$Probe = null,
    resources: Schema$ResourceRequirements = null,
    securityContext: Schema$SecurityContext = null,
    stdin: js.UndefOr[Boolean] = js.undefined,
    stdinOnce: js.UndefOr[Boolean] = js.undefined,
    terminationMessagePath: String = null,
    terminationMessagePolicy: String = null,
    tty: js.UndefOr[Boolean] = js.undefined,
    volumeDevices: js.Array[Schema$VolumeDevice] = null,
    volumeMounts: js.Array[Schema$VolumeMount] = null,
    workingDir: String = null
  ): Schema$Container = {
    val __obj = js.Dynamic.literal()
    if (args != null) __obj.updateDynamic("args")(args.asInstanceOf[js.Any])
    if (command != null) __obj.updateDynamic("command")(command.asInstanceOf[js.Any])
    if (env != null) __obj.updateDynamic("env")(env.asInstanceOf[js.Any])
    if (envFrom != null) __obj.updateDynamic("envFrom")(envFrom.asInstanceOf[js.Any])
    if (image != null) __obj.updateDynamic("image")(image.asInstanceOf[js.Any])
    if (imagePullPolicy != null) __obj.updateDynamic("imagePullPolicy")(imagePullPolicy.asInstanceOf[js.Any])
    if (lifecycle != null) __obj.updateDynamic("lifecycle")(lifecycle.asInstanceOf[js.Any])
    if (livenessProbe != null) __obj.updateDynamic("livenessProbe")(livenessProbe.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (ports != null) __obj.updateDynamic("ports")(ports.asInstanceOf[js.Any])
    if (readinessProbe != null) __obj.updateDynamic("readinessProbe")(readinessProbe.asInstanceOf[js.Any])
    if (resources != null) __obj.updateDynamic("resources")(resources.asInstanceOf[js.Any])
    if (securityContext != null) __obj.updateDynamic("securityContext")(securityContext.asInstanceOf[js.Any])
    if (!js.isUndefined(stdin)) __obj.updateDynamic("stdin")(stdin.asInstanceOf[js.Any])
    if (!js.isUndefined(stdinOnce)) __obj.updateDynamic("stdinOnce")(stdinOnce.asInstanceOf[js.Any])
    if (terminationMessagePath != null) __obj.updateDynamic("terminationMessagePath")(terminationMessagePath.asInstanceOf[js.Any])
    if (terminationMessagePolicy != null) __obj.updateDynamic("terminationMessagePolicy")(terminationMessagePolicy.asInstanceOf[js.Any])
    if (!js.isUndefined(tty)) __obj.updateDynamic("tty")(tty.asInstanceOf[js.Any])
    if (volumeDevices != null) __obj.updateDynamic("volumeDevices")(volumeDevices.asInstanceOf[js.Any])
    if (volumeMounts != null) __obj.updateDynamic("volumeMounts")(volumeMounts.asInstanceOf[js.Any])
    if (workingDir != null) __obj.updateDynamic("workingDir")(workingDir.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Container]
  }
}

