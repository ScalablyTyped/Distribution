package typings.googleapis.cloudfunctionsV1Mod.cloudfunctionsV1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaCloudFunction extends StObject {
  
  /**
    * The amount of memory in MB available for a function. Defaults to 256MB.
    */
  var availableMemoryMb: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Build environment variables that shall be available during build time.
    */
  var buildEnvironmentVariables: js.UndefOr[StringDictionary[String] | Null] = js.undefined
  
  /**
    * Output only. The Cloud Build ID of the latest successful deployment of the function.
    */
  var buildId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The Cloud Build Name of the function deployment. `projects//locations//builds/`.
    */
  var buildName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Name of the Cloud Build Custom Worker Pool that should be used to build the function. The format of this field is `projects/{project\}/locations/{region\}/workerPools/{workerPool\}` where `{project\}` and `{region\}` are the project id and region respectively where the worker pool is defined and `{workerPool\}` is the short name of the worker pool. If the project id is not the same as the function, then the Cloud Functions Service Agent (`service-@gcf-admin-robot.iam.gserviceaccount.com`) must be granted the role Cloud Build Custom Workers Builder (`roles/cloudbuild.customworkers.builder`) in the project.
    */
  var buildWorkerPool: js.UndefOr[String | Null] = js.undefined
  
  /**
    * User-provided description of a function.
    */
  var description: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Docker Registry to use for this deployment. If `docker_repository` field is specified, this field will be automatically set as `ARTIFACT_REGISTRY`. If unspecified, it currently defaults to `CONTAINER_REGISTRY`. This field may be overridden by the backend for eligible deployments.
    */
  var dockerRegistry: js.UndefOr[String | Null] = js.undefined
  
  /**
    * User managed repository created in Artifact Registry optionally with a customer managed encryption key. If specified, deployments will use Artifact Registry. If unspecified and the deployment is eligible to use Artifact Registry, GCF will create and use a repository named 'gcf-artifacts' for every deployed region. This is the repository to which the function docker image will be pushed after it is built by Cloud Build. It must match the pattern `projects/{project\}/locations/{location\}/repositories/{repository\}`. Cross-project repositories are not supported. Cross-location repositories are not supported. Repository format must be 'DOCKER'.
    */
  var dockerRepository: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The name of the function (as defined in source code) that will be executed. Defaults to the resource name suffix, if not specified. For backward compatibility, if function with given name is not found, then the system will try to use function named "function". For Node.js this is name of a function exported by the module specified in `source_location`.
    */
  var entryPoint: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Environment variables that shall be available during function execution.
    */
  var environmentVariables: js.UndefOr[StringDictionary[String] | Null] = js.undefined
  
  /**
    * A source that fires events in response to a condition in another service.
    */
  var eventTrigger: js.UndefOr[SchemaEventTrigger] = js.undefined
  
  /**
    * An HTTPS endpoint type of source that can be triggered via URL.
    */
  var httpsTrigger: js.UndefOr[SchemaHttpsTrigger] = js.undefined
  
  /**
    * The ingress settings for the function, controlling what traffic can reach it.
    */
  var ingressSettings: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Resource name of a KMS crypto key (managed by the user) used to encrypt/decrypt function resources. It must match the pattern `projects/{project\}/locations/{location\}/keyRings/{key_ring\}/cryptoKeys/{crypto_key\}`. If specified, you must also provide an artifact registry repository using the `docker_repository` field that was created with the same KMS crypto key. The following service accounts need to be granted the role 'Cloud KMS CryptoKey Encrypter/Decrypter (roles/cloudkms.cryptoKeyEncrypterDecrypter)' on the Key/KeyRing/Project/Organization (least access preferred). 1. Google Cloud Functions service account (service-{project_number\}@gcf-admin-robot.iam.gserviceaccount.com) - Required to protect the function's image. 2. Google Storage service account (service-{project_number\}@gs-project-accounts.iam.gserviceaccount.com) - Required to protect the function's source code. If this service account does not exist, deploying a function without a KMS key or retrieving the service agent name provisions it. For more information, see https://cloud.google.com/storage/docs/projects#service-agents and https://cloud.google.com/storage/docs/getting-service-agent#gsutil. Google Cloud Functions delegates access to service agents to protect function resources in internal projects that are not accessible by the end user.
    */
  var kmsKeyName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Labels associated with this Cloud Function.
    */
  var labels: js.UndefOr[StringDictionary[String] | Null] = js.undefined
  
  /**
    * The limit on the maximum number of function instances that may coexist at a given time. In some cases, such as rapid traffic surges, Cloud Functions may, for a short period of time, create more instances than the specified max instances limit. If your function cannot tolerate this temporary behavior, you may want to factor in a safety margin and set a lower max instances value than your function can tolerate. See the [Max Instances](https://cloud.google.com/functions/docs/max-instances) Guide for more details.
    */
  var maxInstances: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * A lower bound for the number function instances that may coexist at a given time.
    */
  var minInstances: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * A user-defined name of the function. Function names must be unique globally and match pattern `projects/x/locations/x/functions/x`
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The VPC Network that this cloud function can connect to. It can be either the fully-qualified URI, or the short name of the network resource. If the short network name is used, the network must belong to the same project. Otherwise, it must belong to a project within the same organization. The format of this field is either `projects/{project\}/global/networks/{network\}` or `{network\}`, where `{project\}` is a project id where the network is defined, and `{network\}` is the short name of the network. This field is mutually exclusive with `vpc_connector` and will be replaced by it. See [the VPC documentation](https://cloud.google.com/compute/docs/vpc) for more information on connecting Cloud projects.
    */
  var network: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The runtime in which to run the function. Required when deploying a new function, optional when updating an existing function. For a complete list of possible choices, see the [`gcloud` command reference](https://cloud.google.com/sdk/gcloud/reference/functions/deploy#--runtime).
    */
  var runtime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Secret environment variables configuration.
    */
  var secretEnvironmentVariables: js.UndefOr[js.Array[SchemaSecretEnvVar]] = js.undefined
  
  /**
    * Secret volumes configuration.
    */
  var secretVolumes: js.UndefOr[js.Array[SchemaSecretVolume]] = js.undefined
  
  /**
    * The email of the function's service account. If empty, defaults to `{project_id\}@appspot.gserviceaccount.com`.
    */
  var serviceAccountEmail: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The Google Cloud Storage URL, starting with `gs://`, pointing to the zip archive which contains the function.
    */
  var sourceArchiveUrl: js.UndefOr[String | Null] = js.undefined
  
  /**
    * **Beta Feature** The source repository where a function is hosted.
    */
  var sourceRepository: js.UndefOr[SchemaSourceRepository] = js.undefined
  
  /**
    * Input only. An identifier for Firebase function sources. Disclaimer: This field is only supported for Firebase function deployments.
    */
  var sourceToken: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The Google Cloud Storage signed URL used for source uploading, generated by calling [google.cloud.functions.v1.GenerateUploadUrl]. The signature is validated on write methods (Create, Update) The signature is stripped from the Function object on read methods (Get, List)
    */
  var sourceUploadUrl: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Status of the function deployment.
    */
  var status: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The function execution timeout. Execution is considered failed and can be terminated if the function is not completed at the end of the timeout period. Defaults to 60 seconds.
    */
  var timeout: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The last update timestamp of a Cloud Function.
    */
  var updateTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The version identifier of the Cloud Function. Each deployment attempt results in a new version of a function being created.
    */
  var versionId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The VPC Network Connector that this cloud function can connect to. It can be either the fully-qualified URI, or the short name of the network connector resource. The format of this field is `projects/x/locations/x/connectors/x` This field is mutually exclusive with `network` field and will eventually replace it. See [the VPC documentation](https://cloud.google.com/compute/docs/vpc) for more information on connecting Cloud projects.
    */
  var vpcConnector: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The egress settings for the connector, controlling what traffic is diverted through it.
    */
  var vpcConnectorEgressSettings: js.UndefOr[String | Null] = js.undefined
}
object SchemaCloudFunction {
  
  inline def apply(): SchemaCloudFunction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCloudFunction]
  }
  
  extension [Self <: SchemaCloudFunction](x: Self) {
    
    inline def setAvailableMemoryMb(value: Double): Self = StObject.set(x, "availableMemoryMb", value.asInstanceOf[js.Any])
    
    inline def setAvailableMemoryMbNull: Self = StObject.set(x, "availableMemoryMb", null)
    
    inline def setAvailableMemoryMbUndefined: Self = StObject.set(x, "availableMemoryMb", js.undefined)
    
    inline def setBuildEnvironmentVariables(value: StringDictionary[String]): Self = StObject.set(x, "buildEnvironmentVariables", value.asInstanceOf[js.Any])
    
    inline def setBuildEnvironmentVariablesNull: Self = StObject.set(x, "buildEnvironmentVariables", null)
    
    inline def setBuildEnvironmentVariablesUndefined: Self = StObject.set(x, "buildEnvironmentVariables", js.undefined)
    
    inline def setBuildId(value: String): Self = StObject.set(x, "buildId", value.asInstanceOf[js.Any])
    
    inline def setBuildIdNull: Self = StObject.set(x, "buildId", null)
    
    inline def setBuildIdUndefined: Self = StObject.set(x, "buildId", js.undefined)
    
    inline def setBuildName(value: String): Self = StObject.set(x, "buildName", value.asInstanceOf[js.Any])
    
    inline def setBuildNameNull: Self = StObject.set(x, "buildName", null)
    
    inline def setBuildNameUndefined: Self = StObject.set(x, "buildName", js.undefined)
    
    inline def setBuildWorkerPool(value: String): Self = StObject.set(x, "buildWorkerPool", value.asInstanceOf[js.Any])
    
    inline def setBuildWorkerPoolNull: Self = StObject.set(x, "buildWorkerPool", null)
    
    inline def setBuildWorkerPoolUndefined: Self = StObject.set(x, "buildWorkerPool", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDockerRegistry(value: String): Self = StObject.set(x, "dockerRegistry", value.asInstanceOf[js.Any])
    
    inline def setDockerRegistryNull: Self = StObject.set(x, "dockerRegistry", null)
    
    inline def setDockerRegistryUndefined: Self = StObject.set(x, "dockerRegistry", js.undefined)
    
    inline def setDockerRepository(value: String): Self = StObject.set(x, "dockerRepository", value.asInstanceOf[js.Any])
    
    inline def setDockerRepositoryNull: Self = StObject.set(x, "dockerRepository", null)
    
    inline def setDockerRepositoryUndefined: Self = StObject.set(x, "dockerRepository", js.undefined)
    
    inline def setEntryPoint(value: String): Self = StObject.set(x, "entryPoint", value.asInstanceOf[js.Any])
    
    inline def setEntryPointNull: Self = StObject.set(x, "entryPoint", null)
    
    inline def setEntryPointUndefined: Self = StObject.set(x, "entryPoint", js.undefined)
    
    inline def setEnvironmentVariables(value: StringDictionary[String]): Self = StObject.set(x, "environmentVariables", value.asInstanceOf[js.Any])
    
    inline def setEnvironmentVariablesNull: Self = StObject.set(x, "environmentVariables", null)
    
    inline def setEnvironmentVariablesUndefined: Self = StObject.set(x, "environmentVariables", js.undefined)
    
    inline def setEventTrigger(value: SchemaEventTrigger): Self = StObject.set(x, "eventTrigger", value.asInstanceOf[js.Any])
    
    inline def setEventTriggerUndefined: Self = StObject.set(x, "eventTrigger", js.undefined)
    
    inline def setHttpsTrigger(value: SchemaHttpsTrigger): Self = StObject.set(x, "httpsTrigger", value.asInstanceOf[js.Any])
    
    inline def setHttpsTriggerUndefined: Self = StObject.set(x, "httpsTrigger", js.undefined)
    
    inline def setIngressSettings(value: String): Self = StObject.set(x, "ingressSettings", value.asInstanceOf[js.Any])
    
    inline def setIngressSettingsNull: Self = StObject.set(x, "ingressSettings", null)
    
    inline def setIngressSettingsUndefined: Self = StObject.set(x, "ingressSettings", js.undefined)
    
    inline def setKmsKeyName(value: String): Self = StObject.set(x, "kmsKeyName", value.asInstanceOf[js.Any])
    
    inline def setKmsKeyNameNull: Self = StObject.set(x, "kmsKeyName", null)
    
    inline def setKmsKeyNameUndefined: Self = StObject.set(x, "kmsKeyName", js.undefined)
    
    inline def setLabels(value: StringDictionary[String]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsNull: Self = StObject.set(x, "labels", null)
    
    inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    inline def setMaxInstances(value: Double): Self = StObject.set(x, "maxInstances", value.asInstanceOf[js.Any])
    
    inline def setMaxInstancesNull: Self = StObject.set(x, "maxInstances", null)
    
    inline def setMaxInstancesUndefined: Self = StObject.set(x, "maxInstances", js.undefined)
    
    inline def setMinInstances(value: Double): Self = StObject.set(x, "minInstances", value.asInstanceOf[js.Any])
    
    inline def setMinInstancesNull: Self = StObject.set(x, "minInstances", null)
    
    inline def setMinInstancesUndefined: Self = StObject.set(x, "minInstances", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNetwork(value: String): Self = StObject.set(x, "network", value.asInstanceOf[js.Any])
    
    inline def setNetworkNull: Self = StObject.set(x, "network", null)
    
    inline def setNetworkUndefined: Self = StObject.set(x, "network", js.undefined)
    
    inline def setRuntime(value: String): Self = StObject.set(x, "runtime", value.asInstanceOf[js.Any])
    
    inline def setRuntimeNull: Self = StObject.set(x, "runtime", null)
    
    inline def setRuntimeUndefined: Self = StObject.set(x, "runtime", js.undefined)
    
    inline def setSecretEnvironmentVariables(value: js.Array[SchemaSecretEnvVar]): Self = StObject.set(x, "secretEnvironmentVariables", value.asInstanceOf[js.Any])
    
    inline def setSecretEnvironmentVariablesUndefined: Self = StObject.set(x, "secretEnvironmentVariables", js.undefined)
    
    inline def setSecretEnvironmentVariablesVarargs(value: SchemaSecretEnvVar*): Self = StObject.set(x, "secretEnvironmentVariables", js.Array(value*))
    
    inline def setSecretVolumes(value: js.Array[SchemaSecretVolume]): Self = StObject.set(x, "secretVolumes", value.asInstanceOf[js.Any])
    
    inline def setSecretVolumesUndefined: Self = StObject.set(x, "secretVolumes", js.undefined)
    
    inline def setSecretVolumesVarargs(value: SchemaSecretVolume*): Self = StObject.set(x, "secretVolumes", js.Array(value*))
    
    inline def setServiceAccountEmail(value: String): Self = StObject.set(x, "serviceAccountEmail", value.asInstanceOf[js.Any])
    
    inline def setServiceAccountEmailNull: Self = StObject.set(x, "serviceAccountEmail", null)
    
    inline def setServiceAccountEmailUndefined: Self = StObject.set(x, "serviceAccountEmail", js.undefined)
    
    inline def setSourceArchiveUrl(value: String): Self = StObject.set(x, "sourceArchiveUrl", value.asInstanceOf[js.Any])
    
    inline def setSourceArchiveUrlNull: Self = StObject.set(x, "sourceArchiveUrl", null)
    
    inline def setSourceArchiveUrlUndefined: Self = StObject.set(x, "sourceArchiveUrl", js.undefined)
    
    inline def setSourceRepository(value: SchemaSourceRepository): Self = StObject.set(x, "sourceRepository", value.asInstanceOf[js.Any])
    
    inline def setSourceRepositoryUndefined: Self = StObject.set(x, "sourceRepository", js.undefined)
    
    inline def setSourceToken(value: String): Self = StObject.set(x, "sourceToken", value.asInstanceOf[js.Any])
    
    inline def setSourceTokenNull: Self = StObject.set(x, "sourceToken", null)
    
    inline def setSourceTokenUndefined: Self = StObject.set(x, "sourceToken", js.undefined)
    
    inline def setSourceUploadUrl(value: String): Self = StObject.set(x, "sourceUploadUrl", value.asInstanceOf[js.Any])
    
    inline def setSourceUploadUrlNull: Self = StObject.set(x, "sourceUploadUrl", null)
    
    inline def setSourceUploadUrlUndefined: Self = StObject.set(x, "sourceUploadUrl", js.undefined)
    
    inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusNull: Self = StObject.set(x, "status", null)
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setTimeout(value: String): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutNull: Self = StObject.set(x, "timeout", null)
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    
    inline def setUpdateTime(value: String): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
    
    inline def setUpdateTimeNull: Self = StObject.set(x, "updateTime", null)
    
    inline def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
    
    inline def setVersionId(value: String): Self = StObject.set(x, "versionId", value.asInstanceOf[js.Any])
    
    inline def setVersionIdNull: Self = StObject.set(x, "versionId", null)
    
    inline def setVersionIdUndefined: Self = StObject.set(x, "versionId", js.undefined)
    
    inline def setVpcConnector(value: String): Self = StObject.set(x, "vpcConnector", value.asInstanceOf[js.Any])
    
    inline def setVpcConnectorEgressSettings(value: String): Self = StObject.set(x, "vpcConnectorEgressSettings", value.asInstanceOf[js.Any])
    
    inline def setVpcConnectorEgressSettingsNull: Self = StObject.set(x, "vpcConnectorEgressSettings", null)
    
    inline def setVpcConnectorEgressSettingsUndefined: Self = StObject.set(x, "vpcConnectorEgressSettings", js.undefined)
    
    inline def setVpcConnectorNull: Self = StObject.set(x, "vpcConnector", null)
    
    inline def setVpcConnectorUndefined: Self = StObject.set(x, "vpcConnector", js.undefined)
  }
}
