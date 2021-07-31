package typings.googleapis.cloudfunctionsV1Mod.cloudfunctionsV1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Describes a Cloud Function that contains user computation executed in
  * response to an event. It encapsulate function and triggers configurations.
  * LINT.IfChange
  */
trait SchemaCloudFunction extends StObject {
  
  /**
    * The amount of memory in MB available for a function. Defaults to 256MB.
    */
  var availableMemoryMb: js.UndefOr[Double] = js.undefined
  
  /**
    * User-provided description of a function.
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the function (as defined in source code) that will be
    * executed. Defaults to the resource name suffix, if not specified. For
    * backward compatibility, if function with given name is not found, then
    * the system will try to use function named &quot;function&quot;. For
    * Node.js this is name of a function exported by the module specified in
    * `source_location`.
    */
  var entryPoint: js.UndefOr[String] = js.undefined
  
  /**
    * Environment variables that shall be available during function execution.
    */
  var environmentVariables: js.UndefOr[StringDictionary[String]] = js.undefined
  
  /**
    * A source that fires events in response to a condition in another service.
    */
  var eventTrigger: js.UndefOr[SchemaEventTrigger] = js.undefined
  
  /**
    * An HTTPS endpoint type of source that can be triggered via URL.
    */
  var httpsTrigger: js.UndefOr[SchemaHttpsTrigger] = js.undefined
  
  /**
    * Labels associated with this Cloud Function.
    */
  var labels: js.UndefOr[StringDictionary[String]] = js.undefined
  
  /**
    * The limit on the maximum number of function instances that may coexist at
    * a given time. This feature is currently in alpha, available only for
    * whitelisted users.
    */
  var maxInstances: js.UndefOr[Double] = js.undefined
  
  /**
    * A user-defined name of the function. Function names must be unique
    * globally and match pattern `projects/x/locations/x/functions/x
    */
  var name: js.UndefOr[String] = js.undefined
  
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
  var network: js.UndefOr[String] = js.undefined
  
  /**
    * The runtime in which the function is going to run. Example values
    * include: `go111`: for Go 1.11 `nodejs6`: for Node.js 6 `nodejs8`: for
    * Node.js 8 `nodejs10`: for Node.js 10 `python37`: for Python 3.7 `ruby25`:
    * for Ruby 2.5  If empty, defaults to `nodejs6`.
    */
  var runtime: js.UndefOr[String] = js.undefined
  
  /**
    * The email of the function&#39;s service account. If empty, defaults to
    * {project_id}@appspot.gserviceaccount.com.
    */
  var serviceAccountEmail: js.UndefOr[String] = js.undefined
  
  /**
    * The Google Cloud Storage URL, starting with gs://, pointing to the zip
    * archive which contains the function.
    */
  var sourceArchiveUrl: js.UndefOr[String] = js.undefined
  
  /**
    * **Beta Feature**  The source repository where a function is hosted.
    */
  var sourceRepository: js.UndefOr[SchemaSourceRepository] = js.undefined
  
  /**
    * The Google Cloud Storage signed URL used for source uploading, generated
    * by google.cloud.functions.v1.GenerateUploadUrl
    */
  var sourceUploadUrl: js.UndefOr[String] = js.undefined
  
  /**
    * Output only. Status of the function deployment.
    */
  var status: js.UndefOr[String] = js.undefined
  
  /**
    * The function execution timeout. Execution is considered failed and can be
    * terminated if the function is not completed at the end of the timeout
    * period. Defaults to 60 seconds.
    */
  var timeout: js.UndefOr[String] = js.undefined
  
  /**
    * Output only. The last update timestamp of a Cloud Function.
    */
  var updateTime: js.UndefOr[String] = js.undefined
  
  /**
    * Output only. The version identifier of the Cloud Function. Each
    * deployment attempt results in a new version of a function being created.
    */
  var versionId: js.UndefOr[String] = js.undefined
  
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
  var vpcConnector: js.UndefOr[String] = js.undefined
}
object SchemaCloudFunction {
  
  @scala.inline
  def apply(): SchemaCloudFunction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCloudFunction]
  }
  
  @scala.inline
  implicit class SchemaCloudFunctionMutableBuilder[Self <: SchemaCloudFunction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAvailableMemoryMb(value: Double): Self = StObject.set(x, "availableMemoryMb", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAvailableMemoryMbUndefined: Self = StObject.set(x, "availableMemoryMb", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setEntryPoint(value: String): Self = StObject.set(x, "entryPoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntryPointUndefined: Self = StObject.set(x, "entryPoint", js.undefined)
    
    @scala.inline
    def setEnvironmentVariables(value: StringDictionary[String]): Self = StObject.set(x, "environmentVariables", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnvironmentVariablesUndefined: Self = StObject.set(x, "environmentVariables", js.undefined)
    
    @scala.inline
    def setEventTrigger(value: SchemaEventTrigger): Self = StObject.set(x, "eventTrigger", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventTriggerUndefined: Self = StObject.set(x, "eventTrigger", js.undefined)
    
    @scala.inline
    def setHttpsTrigger(value: SchemaHttpsTrigger): Self = StObject.set(x, "httpsTrigger", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHttpsTriggerUndefined: Self = StObject.set(x, "httpsTrigger", js.undefined)
    
    @scala.inline
    def setLabels(value: StringDictionary[String]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    @scala.inline
    def setMaxInstances(value: Double): Self = StObject.set(x, "maxInstances", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxInstancesUndefined: Self = StObject.set(x, "maxInstances", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setNetwork(value: String): Self = StObject.set(x, "network", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetworkUndefined: Self = StObject.set(x, "network", js.undefined)
    
    @scala.inline
    def setRuntime(value: String): Self = StObject.set(x, "runtime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRuntimeUndefined: Self = StObject.set(x, "runtime", js.undefined)
    
    @scala.inline
    def setServiceAccountEmail(value: String): Self = StObject.set(x, "serviceAccountEmail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceAccountEmailUndefined: Self = StObject.set(x, "serviceAccountEmail", js.undefined)
    
    @scala.inline
    def setSourceArchiveUrl(value: String): Self = StObject.set(x, "sourceArchiveUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceArchiveUrlUndefined: Self = StObject.set(x, "sourceArchiveUrl", js.undefined)
    
    @scala.inline
    def setSourceRepository(value: SchemaSourceRepository): Self = StObject.set(x, "sourceRepository", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceRepositoryUndefined: Self = StObject.set(x, "sourceRepository", js.undefined)
    
    @scala.inline
    def setSourceUploadUrl(value: String): Self = StObject.set(x, "sourceUploadUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceUploadUrlUndefined: Self = StObject.set(x, "sourceUploadUrl", js.undefined)
    
    @scala.inline
    def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    @scala.inline
    def setTimeout(value: String): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    
    @scala.inline
    def setUpdateTime(value: String): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
    
    @scala.inline
    def setVersionId(value: String): Self = StObject.set(x, "versionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionIdUndefined: Self = StObject.set(x, "versionId", js.undefined)
    
    @scala.inline
    def setVpcConnector(value: String): Self = StObject.set(x, "vpcConnector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVpcConnectorUndefined: Self = StObject.set(x, "vpcConnector", js.undefined)
  }
}
