package typings.googleapis.cloudfunctionsV1Mod.cloudfunctionsV1

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Describes a Cloud Function that contains user computation executed in
  * response to an event. It encapsulate function and triggers configurations.
  * LINT.IfChange
  */
@js.native
trait SchemaCloudFunction extends js.Object {
  /**
    * The amount of memory in MB available for a function. Defaults to 256MB.
    */
  var availableMemoryMb: js.UndefOr[Double] = js.native
  /**
    * User-provided description of a function.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * The name of the function (as defined in source code) that will be
    * executed. Defaults to the resource name suffix, if not specified. For
    * backward compatibility, if function with given name is not found, then
    * the system will try to use function named &quot;function&quot;. For
    * Node.js this is name of a function exported by the module specified in
    * `source_location`.
    */
  var entryPoint: js.UndefOr[String] = js.native
  /**
    * Environment variables that shall be available during function execution.
    */
  var environmentVariables: js.UndefOr[StringDictionary[String]] = js.native
  /**
    * A source that fires events in response to a condition in another service.
    */
  var eventTrigger: js.UndefOr[SchemaEventTrigger] = js.native
  /**
    * An HTTPS endpoint type of source that can be triggered via URL.
    */
  var httpsTrigger: js.UndefOr[SchemaHttpsTrigger] = js.native
  /**
    * Labels associated with this Cloud Function.
    */
  var labels: js.UndefOr[StringDictionary[String]] = js.native
  /**
    * The limit on the maximum number of function instances that may coexist at
    * a given time. This feature is currently in alpha, available only for
    * whitelisted users.
    */
  var maxInstances: js.UndefOr[Double] = js.native
  /**
    * A user-defined name of the function. Function names must be unique
    * globally and match pattern `projects/x/locations/x/functions/x
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The VPC Network that this cloud function can connect to. It can be either
    * the fully-qualified URI, or the short name of the network resource. If
    * the short network name is used, the network must belong to the same
    * project. Otherwise, it must belong to a project within the same
    * organization. The format of this field is either
    * `projects/{project}/global/networks/{network}` or `{network}`, where
    * {project} is a project id where the network is defined, and {network} is
    * the short name of the network.  This field is mutually exclusive with
    * `vpc_connector` and will be replaced by it.  See [the VPC
    * documentation](https://cloud.google.com/compute/docs/vpc) for more
    * information on connecting Cloud projects.  This feature is currently in
    * alpha, available only for whitelisted users.
    */
  var network: js.UndefOr[String] = js.native
  /**
    * The runtime in which the function is going to run. Example values
    * include: `go111`: for Go 1.11 `nodejs6`: for Node.js 6 `nodejs8`: for
    * Node.js 8 `nodejs10`: for Node.js 10 `python37`: for Python 3.7 `ruby25`:
    * for Ruby 2.5  If empty, defaults to `nodejs6`.
    */
  var runtime: js.UndefOr[String] = js.native
  /**
    * The email of the function&#39;s service account. If empty, defaults to
    * {project_id}@appspot.gserviceaccount.com.
    */
  var serviceAccountEmail: js.UndefOr[String] = js.native
  /**
    * The Google Cloud Storage URL, starting with gs://, pointing to the zip
    * archive which contains the function.
    */
  var sourceArchiveUrl: js.UndefOr[String] = js.native
  /**
    * **Beta Feature**  The source repository where a function is hosted.
    */
  var sourceRepository: js.UndefOr[SchemaSourceRepository] = js.native
  /**
    * The Google Cloud Storage signed URL used for source uploading, generated
    * by google.cloud.functions.v1.GenerateUploadUrl
    */
  var sourceUploadUrl: js.UndefOr[String] = js.native
  /**
    * Output only. Status of the function deployment.
    */
  var status: js.UndefOr[String] = js.native
  /**
    * The function execution timeout. Execution is considered failed and can be
    * terminated if the function is not completed at the end of the timeout
    * period. Defaults to 60 seconds.
    */
  var timeout: js.UndefOr[String] = js.native
  /**
    * Output only. The last update timestamp of a Cloud Function.
    */
  var updateTime: js.UndefOr[String] = js.native
  /**
    * Output only. The version identifier of the Cloud Function. Each
    * deployment attempt results in a new version of a function being created.
    */
  var versionId: js.UndefOr[String] = js.native
  /**
    * The VPC Network Connector that this cloud function can connect to. It can
    * be either the fully-qualified URI, or the short name of the network
    * connector resource. The format of this field is
    * `projects/x/locations/x/connectors/x  This field is mutually exclusive
    * with `network` field and will eventually replace it.  See [the VPC
    * documentation](https://cloud.google.com/compute/docs/vpc) for more
    * information on connecting Cloud projects.  This feature is currently in
    * alpha, available only for whitelisted users.
    */
  var vpcConnector: js.UndefOr[String] = js.native
}

object SchemaCloudFunction {
  @scala.inline
  def apply(
    availableMemoryMb: js.UndefOr[Double] = js.undefined,
    description: String = null,
    entryPoint: String = null,
    environmentVariables: StringDictionary[String] = null,
    eventTrigger: SchemaEventTrigger = null,
    httpsTrigger: SchemaHttpsTrigger = null,
    labels: StringDictionary[String] = null,
    maxInstances: js.UndefOr[Double] = js.undefined,
    name: String = null,
    network: String = null,
    runtime: String = null,
    serviceAccountEmail: String = null,
    sourceArchiveUrl: String = null,
    sourceRepository: SchemaSourceRepository = null,
    sourceUploadUrl: String = null,
    status: String = null,
    timeout: String = null,
    updateTime: String = null,
    versionId: String = null,
    vpcConnector: String = null
  ): SchemaCloudFunction = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(availableMemoryMb)) __obj.updateDynamic("availableMemoryMb")(availableMemoryMb.get.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (entryPoint != null) __obj.updateDynamic("entryPoint")(entryPoint.asInstanceOf[js.Any])
    if (environmentVariables != null) __obj.updateDynamic("environmentVariables")(environmentVariables.asInstanceOf[js.Any])
    if (eventTrigger != null) __obj.updateDynamic("eventTrigger")(eventTrigger.asInstanceOf[js.Any])
    if (httpsTrigger != null) __obj.updateDynamic("httpsTrigger")(httpsTrigger.asInstanceOf[js.Any])
    if (labels != null) __obj.updateDynamic("labels")(labels.asInstanceOf[js.Any])
    if (!js.isUndefined(maxInstances)) __obj.updateDynamic("maxInstances")(maxInstances.get.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (network != null) __obj.updateDynamic("network")(network.asInstanceOf[js.Any])
    if (runtime != null) __obj.updateDynamic("runtime")(runtime.asInstanceOf[js.Any])
    if (serviceAccountEmail != null) __obj.updateDynamic("serviceAccountEmail")(serviceAccountEmail.asInstanceOf[js.Any])
    if (sourceArchiveUrl != null) __obj.updateDynamic("sourceArchiveUrl")(sourceArchiveUrl.asInstanceOf[js.Any])
    if (sourceRepository != null) __obj.updateDynamic("sourceRepository")(sourceRepository.asInstanceOf[js.Any])
    if (sourceUploadUrl != null) __obj.updateDynamic("sourceUploadUrl")(sourceUploadUrl.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (updateTime != null) __obj.updateDynamic("updateTime")(updateTime.asInstanceOf[js.Any])
    if (versionId != null) __obj.updateDynamic("versionId")(versionId.asInstanceOf[js.Any])
    if (vpcConnector != null) __obj.updateDynamic("vpcConnector")(vpcConnector.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaCloudFunction]
  }
}

