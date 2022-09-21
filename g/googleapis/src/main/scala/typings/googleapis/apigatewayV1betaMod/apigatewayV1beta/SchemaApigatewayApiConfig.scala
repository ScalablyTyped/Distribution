package typings.googleapis.apigatewayV1betaMod.apigatewayV1beta

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaApigatewayApiConfig extends StObject {
  
  /**
    * Output only. Created time.
    */
  var createTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. Display name.
    */
  var displayName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Immutable. Gateway specific configuration.
    */
  var gatewayConfig: js.UndefOr[SchemaApigatewayGatewayConfig] = js.undefined
  
  /**
    * Immutable. The Google Cloud IAM Service Account that Gateways serving this config should use to authenticate to other services. This may either be the Service Account's email (`{ACCOUNT_ID\}@{PROJECT\}.iam.gserviceaccount.com`) or its full resource name (`projects/{PROJECT\}/accounts/{UNIQUE_ID\}`). This is most often used when the service is a GCP resource such as a Cloud Run Service or an IAP-secured service.
    */
  var gatewayServiceAccount: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. gRPC service definition files. If specified, openapi_documents must not be included.
    */
  var grpcServices: js.UndefOr[js.Array[SchemaApigatewayApiConfigGrpcServiceDefinition]] = js.undefined
  
  /**
    * Optional. Resource labels to represent user-provided metadata. Refer to cloud documentation on labels for more details. https://cloud.google.com/compute/docs/labeling-resources
    */
  var labels: js.UndefOr[StringDictionary[String] | Null] = js.undefined
  
  /**
    * Optional. Service Configuration files. At least one must be included when using gRPC service definitions. See https://cloud.google.com/endpoints/docs/grpc/grpc-service-config#service_configuration_overview for the expected file contents. If multiple files are specified, the files are merged with the following rules: * All singular scalar fields are merged using "last one wins" semantics in the order of the files uploaded. * Repeated fields are concatenated. * Singular embedded messages are merged using these rules for nested fields.
    */
  var managedServiceConfigs: js.UndefOr[js.Array[SchemaApigatewayApiConfigFile]] = js.undefined
  
  /**
    * Output only. Resource name of the API Config. Format: projects/{project\}/locations/global/apis/{api\}/configs/{api_config\}
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. OpenAPI specification documents. If specified, grpc_services and managed_service_configs must not be included.
    */
  var openapiDocuments: js.UndefOr[js.Array[SchemaApigatewayApiConfigOpenApiDocument]] = js.undefined
  
  /**
    * Output only. The ID of the associated Service Config ( https://cloud.google.com/service-infrastructure/docs/glossary#config).
    */
  var serviceConfigId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. State of the API Config.
    */
  var state: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Updated time.
    */
  var updateTime: js.UndefOr[String | Null] = js.undefined
}
object SchemaApigatewayApiConfig {
  
  inline def apply(): SchemaApigatewayApiConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaApigatewayApiConfig]
  }
  
  extension [Self <: SchemaApigatewayApiConfig](x: Self) {
    
    inline def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeNull: Self = StObject.set(x, "createTime", null)
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setGatewayConfig(value: SchemaApigatewayGatewayConfig): Self = StObject.set(x, "gatewayConfig", value.asInstanceOf[js.Any])
    
    inline def setGatewayConfigUndefined: Self = StObject.set(x, "gatewayConfig", js.undefined)
    
    inline def setGatewayServiceAccount(value: String): Self = StObject.set(x, "gatewayServiceAccount", value.asInstanceOf[js.Any])
    
    inline def setGatewayServiceAccountNull: Self = StObject.set(x, "gatewayServiceAccount", null)
    
    inline def setGatewayServiceAccountUndefined: Self = StObject.set(x, "gatewayServiceAccount", js.undefined)
    
    inline def setGrpcServices(value: js.Array[SchemaApigatewayApiConfigGrpcServiceDefinition]): Self = StObject.set(x, "grpcServices", value.asInstanceOf[js.Any])
    
    inline def setGrpcServicesUndefined: Self = StObject.set(x, "grpcServices", js.undefined)
    
    inline def setGrpcServicesVarargs(value: SchemaApigatewayApiConfigGrpcServiceDefinition*): Self = StObject.set(x, "grpcServices", js.Array(value*))
    
    inline def setLabels(value: StringDictionary[String]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsNull: Self = StObject.set(x, "labels", null)
    
    inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    inline def setManagedServiceConfigs(value: js.Array[SchemaApigatewayApiConfigFile]): Self = StObject.set(x, "managedServiceConfigs", value.asInstanceOf[js.Any])
    
    inline def setManagedServiceConfigsUndefined: Self = StObject.set(x, "managedServiceConfigs", js.undefined)
    
    inline def setManagedServiceConfigsVarargs(value: SchemaApigatewayApiConfigFile*): Self = StObject.set(x, "managedServiceConfigs", js.Array(value*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOpenapiDocuments(value: js.Array[SchemaApigatewayApiConfigOpenApiDocument]): Self = StObject.set(x, "openapiDocuments", value.asInstanceOf[js.Any])
    
    inline def setOpenapiDocumentsUndefined: Self = StObject.set(x, "openapiDocuments", js.undefined)
    
    inline def setOpenapiDocumentsVarargs(value: SchemaApigatewayApiConfigOpenApiDocument*): Self = StObject.set(x, "openapiDocuments", js.Array(value*))
    
    inline def setServiceConfigId(value: String): Self = StObject.set(x, "serviceConfigId", value.asInstanceOf[js.Any])
    
    inline def setServiceConfigIdNull: Self = StObject.set(x, "serviceConfigId", null)
    
    inline def setServiceConfigIdUndefined: Self = StObject.set(x, "serviceConfigId", js.undefined)
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateNull: Self = StObject.set(x, "state", null)
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    inline def setUpdateTime(value: String): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
    
    inline def setUpdateTimeNull: Self = StObject.set(x, "updateTime", null)
    
    inline def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
  }
}
