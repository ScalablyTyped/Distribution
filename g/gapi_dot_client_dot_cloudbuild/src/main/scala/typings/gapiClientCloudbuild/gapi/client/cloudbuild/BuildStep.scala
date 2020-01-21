package typings.gapiClientCloudbuild.gapi.client.cloudbuild

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BuildStep extends js.Object {
  /**
    * A list of arguments that will be presented to the step when it is started.
    *
    * If the image used to run the step's container has an entrypoint, these args
    * will be used as arguments to that entrypoint. If the image does not define
    * an entrypoint, the first element in args will be used as the entrypoint,
    * and the remainder will be used as arguments.
    */
  var args: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * Working directory (relative to project source root) to use when running
    * this operation's container.
    */
  var dir: js.UndefOr[String] = js.undefined
  /**
    * Optional entrypoint to be used instead of the build step image's default
    * If unset, the image's default will be used.
    */
  var entrypoint: js.UndefOr[String] = js.undefined
  /**
    * A list of environment variable definitions to be used when running a step.
    *
    * The elements are of the form "KEY=VALUE" for the environment variable "KEY"
    * being given the value "VALUE".
    */
  var env: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * Optional unique identifier for this build step, used in wait_for to
    * reference this build step as a dependency.
    */
  var id: js.UndefOr[String] = js.undefined
  /**
    * The name of the container image that will run this particular build step.
    *
    * If the image is already available in the host's Docker daemon's cache, it
    * will be run directly. If not, the host will attempt to pull the image
    * first, using the builder service account's credentials if necessary.
    *
    * The Docker daemon's cache will already have the latest versions of all of
    * the officially supported build steps
    * ([https://github.com/GoogleCloudPlatform/cloud-builders](https://github.com/GoogleCloudPlatform/cloud-builders)).
    * The Docker daemon will also have cached many of the layers for some popular
    * images, like "ubuntu", "debian", but they will be refreshed at the time you
    * attempt to use them.
    *
    * If you built an image in a previous build step, it will be stored in the
    * host's Docker daemon's cache and is available to use as the name for a
    * later build step.
    */
  var name: js.UndefOr[String] = js.undefined
  /**
    * A list of environment variables which are encrypted using a Cloud KMS
    * crypto key. These values must be specified in the build's secrets.
    */
  var secretEnv: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * List of volumes to mount into the build step.
    *
    * Each volume will be created as an empty volume prior to execution of the
    * build step. Upon completion of the build, volumes and their contents will
    * be discarded.
    *
    * Using a named volume in only one step is not valid as it is indicative
    * of a mis-configured build request.
    */
  var volumes: js.UndefOr[js.Array[Volume]] = js.undefined
  /**
    * The ID(s) of the step(s) that this build step depends on.
    * This build step will not start until all the build steps in wait_for
    * have completed successfully. If wait_for is empty, this build step will
    * start when all previous build steps in the Build.Steps list have completed
    * successfully.
    */
  var waitFor: js.UndefOr[js.Array[String]] = js.undefined
}

object BuildStep {
  @scala.inline
  def apply(
    args: js.Array[String] = null,
    dir: String = null,
    entrypoint: String = null,
    env: js.Array[String] = null,
    id: String = null,
    name: String = null,
    secretEnv: js.Array[String] = null,
    volumes: js.Array[Volume] = null,
    waitFor: js.Array[String] = null
  ): BuildStep = {
    val __obj = js.Dynamic.literal()
    if (args != null) __obj.updateDynamic("args")(args.asInstanceOf[js.Any])
    if (dir != null) __obj.updateDynamic("dir")(dir.asInstanceOf[js.Any])
    if (entrypoint != null) __obj.updateDynamic("entrypoint")(entrypoint.asInstanceOf[js.Any])
    if (env != null) __obj.updateDynamic("env")(env.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (secretEnv != null) __obj.updateDynamic("secretEnv")(secretEnv.asInstanceOf[js.Any])
    if (volumes != null) __obj.updateDynamic("volumes")(volumes.asInstanceOf[js.Any])
    if (waitFor != null) __obj.updateDynamic("waitFor")(waitFor.asInstanceOf[js.Any])
    __obj.asInstanceOf[BuildStep]
  }
}

