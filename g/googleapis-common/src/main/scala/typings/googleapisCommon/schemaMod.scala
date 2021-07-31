package typings.googleapisCommon

import org.scalablytyped.runtime.StringDictionary
import typings.googleapisCommon.anon.Fragment
import typings.googleapisCommon.anon.Oauth2
import typings.googleapisCommon.anon.Protocols
import typings.googleapisCommon.anon.Ref
import typings.googleapisCommon.anon.X16
import typings.googleapisCommon.googleapisCommonStrings.int32
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object schemaMod {
  
  trait FragmentResponse extends StObject {
    
    var codeFragment: StringDictionary[Fragment]
  }
  object FragmentResponse {
    
    @scala.inline
    def apply(codeFragment: StringDictionary[Fragment]): FragmentResponse = {
      val __obj = js.Dynamic.literal(codeFragment = codeFragment.asInstanceOf[js.Any])
      __obj.asInstanceOf[FragmentResponse]
    }
    
    @scala.inline
    implicit class FragmentResponseMutableBuilder[Self <: FragmentResponse] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCodeFragment(value: StringDictionary[Fragment]): Self = StObject.set(x, "codeFragment", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.googleapisCommon.googleapisCommonStrings.GET
    - typings.googleapisCommon.googleapisCommonStrings.PATCH
    - typings.googleapisCommon.googleapisCommonStrings.PUT
  */
  trait HttpMethod extends StObject
  object HttpMethod {
    
    @scala.inline
    def GET: typings.googleapisCommon.googleapisCommonStrings.GET = "GET".asInstanceOf[typings.googleapisCommon.googleapisCommonStrings.GET]
    
    @scala.inline
    def PATCH: typings.googleapisCommon.googleapisCommonStrings.PATCH = "PATCH".asInstanceOf[typings.googleapisCommon.googleapisCommonStrings.PATCH]
    
    @scala.inline
    def PUT: typings.googleapisCommon.googleapisCommonStrings.PUT = "PUT".asInstanceOf[typings.googleapisCommon.googleapisCommonStrings.PUT]
  }
  
  type ParameterFormat = int32
  
  trait Schema extends StObject {
    
    var auth: Oauth2
    
    var basePath: String
    
    var baseUrl: String
    
    var batchPath: String
    
    var description: String
    
    var discoveryRestUrl: String
    
    var discoveryVersion: String
    
    var documentationLink: String
    
    var etag: String
    
    var icons: X16
    
    var id: String
    
    var kind: String
    
    var methods: SchemaMethods
    
    var name: String
    
    var ownerDomain: String
    
    var ownerName: String
    
    var parameters: SchemaParameters
    
    var protocol: String
    
    var resources: SchemaResources
    
    var revision: String
    
    var rootUrl: String
    
    var schemas: SchemaItems
    
    var servicePath: String
    
    var title: String
    
    var version: String
  }
  object Schema {
    
    @scala.inline
    def apply(
      auth: Oauth2,
      basePath: String,
      baseUrl: String,
      batchPath: String,
      description: String,
      discoveryRestUrl: String,
      discoveryVersion: String,
      documentationLink: String,
      etag: String,
      icons: X16,
      id: String,
      kind: String,
      methods: SchemaMethods,
      name: String,
      ownerDomain: String,
      ownerName: String,
      parameters: SchemaParameters,
      protocol: String,
      resources: SchemaResources,
      revision: String,
      rootUrl: String,
      schemas: SchemaItems,
      servicePath: String,
      title: String,
      version: String
    ): Schema = {
      val __obj = js.Dynamic.literal(auth = auth.asInstanceOf[js.Any], basePath = basePath.asInstanceOf[js.Any], baseUrl = baseUrl.asInstanceOf[js.Any], batchPath = batchPath.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], discoveryRestUrl = discoveryRestUrl.asInstanceOf[js.Any], discoveryVersion = discoveryVersion.asInstanceOf[js.Any], documentationLink = documentationLink.asInstanceOf[js.Any], etag = etag.asInstanceOf[js.Any], icons = icons.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], methods = methods.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], ownerDomain = ownerDomain.asInstanceOf[js.Any], ownerName = ownerName.asInstanceOf[js.Any], parameters = parameters.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any], resources = resources.asInstanceOf[js.Any], revision = revision.asInstanceOf[js.Any], rootUrl = rootUrl.asInstanceOf[js.Any], schemas = schemas.asInstanceOf[js.Any], servicePath = servicePath.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[Schema]
    }
    
    @scala.inline
    implicit class SchemaMutableBuilder[Self <: Schema] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAuth(value: Oauth2): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBasePath(value: String): Self = StObject.set(x, "basePath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBaseUrl(value: String): Self = StObject.set(x, "baseUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBatchPath(value: String): Self = StObject.set(x, "batchPath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDiscoveryRestUrl(value: String): Self = StObject.set(x, "discoveryRestUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDiscoveryVersion(value: String): Self = StObject.set(x, "discoveryVersion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDocumentationLink(value: String): Self = StObject.set(x, "documentationLink", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIcons(value: X16): Self = StObject.set(x, "icons", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMethods(value: SchemaMethods): Self = StObject.set(x, "methods", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOwnerDomain(value: String): Self = StObject.set(x, "ownerDomain", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOwnerName(value: String): Self = StObject.set(x, "ownerName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParameters(value: SchemaParameters): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProtocol(value: String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResources(value: SchemaResources): Self = StObject.set(x, "resources", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRevision(value: String): Self = StObject.set(x, "revision", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRootUrl(value: String): Self = StObject.set(x, "rootUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSchemas(value: SchemaItems): Self = StObject.set(x, "schemas", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setServicePath(value: String): Self = StObject.set(x, "servicePath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
  
  trait SchemaItem extends StObject {
    
    var default: js.UndefOr[String] = js.undefined
    
    @JSName("$ref")
    var $ref: js.UndefOr[String] = js.undefined
    
    var additionalProperties: js.UndefOr[StringDictionary[SchemaItem]] = js.undefined
    
    var description: js.UndefOr[String] = js.undefined
    
    var format: js.UndefOr[ParameterFormat] = js.undefined
    
    var id: js.UndefOr[String] = js.undefined
    
    var items: js.UndefOr[StringDictionary[SchemaItem]] = js.undefined
    
    var properties: js.UndefOr[StringDictionary[SchemaItem]] = js.undefined
    
    var `type`: js.UndefOr[SchemaType] = js.undefined
  }
  object SchemaItem {
    
    @scala.inline
    def apply(): SchemaItem = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SchemaItem]
    }
    
    @scala.inline
    implicit class SchemaItemMutableBuilder[Self <: SchemaItem] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set$ref(value: String): Self = StObject.set(x, "$ref", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set$refUndefined: Self = StObject.set(x, "$ref", js.undefined)
      
      @scala.inline
      def setAdditionalProperties(value: StringDictionary[SchemaItem]): Self = StObject.set(x, "additionalProperties", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAdditionalPropertiesUndefined: Self = StObject.set(x, "additionalProperties", js.undefined)
      
      @scala.inline
      def setDefault(value: String): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
      
      @scala.inline
      def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setFormat(value: ParameterFormat): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setItems(value: StringDictionary[SchemaItem]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
      
      @scala.inline
      def setProperties(value: StringDictionary[SchemaItem]): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
      
      @scala.inline
      def setType(value: SchemaType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  type SchemaItems = StringDictionary[SchemaItem]
  
  trait SchemaMethod extends StObject {
    
    var description: String
    
    var fragment: String
    
    var httpMethod: HttpMethod
    
    var id: String
    
    var mediaUpload: Protocols
    
    var parameterOrder: js.UndefOr[js.Array[String]] = js.undefined
    
    var parameters: js.UndefOr[StringDictionary[SchemaParameter]] = js.undefined
    
    var path: String
    
    var request: Ref
    
    var response: Ref
    
    var sampleUrl: String
    
    var scopes: js.Array[String]
  }
  object SchemaMethod {
    
    @scala.inline
    def apply(
      description: String,
      fragment: String,
      httpMethod: HttpMethod,
      id: String,
      mediaUpload: Protocols,
      path: String,
      request: Ref,
      response: Ref,
      sampleUrl: String,
      scopes: js.Array[String]
    ): SchemaMethod = {
      val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], fragment = fragment.asInstanceOf[js.Any], httpMethod = httpMethod.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], mediaUpload = mediaUpload.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any], sampleUrl = sampleUrl.asInstanceOf[js.Any], scopes = scopes.asInstanceOf[js.Any])
      __obj.asInstanceOf[SchemaMethod]
    }
    
    @scala.inline
    implicit class SchemaMethodMutableBuilder[Self <: SchemaMethod] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFragment(value: String): Self = StObject.set(x, "fragment", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHttpMethod(value: HttpMethod): Self = StObject.set(x, "httpMethod", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMediaUpload(value: Protocols): Self = StObject.set(x, "mediaUpload", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParameterOrder(value: js.Array[String]): Self = StObject.set(x, "parameterOrder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParameterOrderUndefined: Self = StObject.set(x, "parameterOrder", js.undefined)
      
      @scala.inline
      def setParameterOrderVarargs(value: String*): Self = StObject.set(x, "parameterOrder", js.Array(value :_*))
      
      @scala.inline
      def setParameters(value: StringDictionary[SchemaParameter]): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequest(value: Ref): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResponse(value: Ref): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSampleUrl(value: String): Self = StObject.set(x, "sampleUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScopes(value: js.Array[String]): Self = StObject.set(x, "scopes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScopesVarargs(value: String*): Self = StObject.set(x, "scopes", js.Array(value :_*))
    }
  }
  
  type SchemaMethods = StringDictionary[SchemaMethod]
  
  trait SchemaParameter extends StObject {
    
    var default: String
    
    var description: String
    
    var `enum`: js.Array[String]
    
    var enumDescription: js.Array[String]
    
    var format: ParameterFormat
    
    var location: String
    
    var required: Boolean
    
    var `type`: SchemaType
  }
  object SchemaParameter {
    
    @scala.inline
    def apply(
      default: String,
      description: String,
      `enum`: js.Array[String],
      enumDescription: js.Array[String],
      format: ParameterFormat,
      location: String,
      required: Boolean,
      `type`: SchemaType
    ): SchemaParameter = {
      val __obj = js.Dynamic.literal(default = default.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], enumDescription = enumDescription.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], required = required.asInstanceOf[js.Any])
      __obj.updateDynamic("enum")(`enum`.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[SchemaParameter]
    }
    
    @scala.inline
    implicit class SchemaParameterMutableBuilder[Self <: SchemaParameter] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDefault(value: String): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnum(value: js.Array[String]): Self = StObject.set(x, "enum", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnumDescription(value: js.Array[String]): Self = StObject.set(x, "enumDescription", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnumDescriptionVarargs(value: String*): Self = StObject.set(x, "enumDescription", js.Array(value :_*))
      
      @scala.inline
      def setEnumVarargs(value: String*): Self = StObject.set(x, "enum", js.Array(value :_*))
      
      @scala.inline
      def setFormat(value: ParameterFormat): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: SchemaType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  type SchemaParameters = StringDictionary[SchemaParameter]
  
  trait SchemaResource extends StObject {
    
    var methods: js.UndefOr[SchemaMethods] = js.undefined
    
    var resources: js.UndefOr[SchemaResources] = js.undefined
  }
  object SchemaResource {
    
    @scala.inline
    def apply(): SchemaResource = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SchemaResource]
    }
    
    @scala.inline
    implicit class SchemaResourceMutableBuilder[Self <: SchemaResource] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMethods(value: SchemaMethods): Self = StObject.set(x, "methods", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMethodsUndefined: Self = StObject.set(x, "methods", js.undefined)
      
      @scala.inline
      def setResources(value: SchemaResources): Self = StObject.set(x, "resources", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResourcesUndefined: Self = StObject.set(x, "resources", js.undefined)
    }
  }
  
  type SchemaResources = StringDictionary[SchemaResource]
  
  /* Rewritten from type alias, can be one of: 
    - typings.googleapisCommon.googleapisCommonStrings.`object`
    - typings.googleapisCommon.googleapisCommonStrings.integer
    - typings.googleapisCommon.googleapisCommonStrings.string
    - typings.googleapisCommon.googleapisCommonStrings.array
    - typings.googleapisCommon.googleapisCommonStrings.boolean
  */
  trait SchemaType extends StObject
  object SchemaType {
    
    @scala.inline
    def array: typings.googleapisCommon.googleapisCommonStrings.array = "array".asInstanceOf[typings.googleapisCommon.googleapisCommonStrings.array]
    
    @scala.inline
    def boolean: typings.googleapisCommon.googleapisCommonStrings.boolean = "boolean".asInstanceOf[typings.googleapisCommon.googleapisCommonStrings.boolean]
    
    @scala.inline
    def integer: typings.googleapisCommon.googleapisCommonStrings.integer = "integer".asInstanceOf[typings.googleapisCommon.googleapisCommonStrings.integer]
    
    @scala.inline
    def `object`: typings.googleapisCommon.googleapisCommonStrings.`object` = "object".asInstanceOf[typings.googleapisCommon.googleapisCommonStrings.`object`]
    
    @scala.inline
    def string: typings.googleapisCommon.googleapisCommonStrings.string = "string".asInstanceOf[typings.googleapisCommon.googleapisCommonStrings.string]
  }
  
  trait Schemas extends StObject {
    
    var discoveryVersion: String
    
    var items: js.Array[Schema]
    
    var kind: String
  }
  object Schemas {
    
    @scala.inline
    def apply(discoveryVersion: String, items: js.Array[Schema], kind: String): Schemas = {
      val __obj = js.Dynamic.literal(discoveryVersion = discoveryVersion.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any])
      __obj.asInstanceOf[Schemas]
    }
    
    @scala.inline
    implicit class SchemasMutableBuilder[Self <: Schemas] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDiscoveryVersion(value: String): Self = StObject.set(x, "discoveryVersion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItems(value: js.Array[Schema]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemsVarargs(value: Schema*): Self = StObject.set(x, "items", js.Array(value :_*))
      
      @scala.inline
      def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    }
  }
}
