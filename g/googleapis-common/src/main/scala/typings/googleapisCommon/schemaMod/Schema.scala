package typings.googleapisCommon.schemaMod

import typings.googleapisCommon.anon.Oauth2
import typings.googleapisCommon.anon.X16
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Schema extends js.Object {
  
  var auth: Oauth2 = js.native
  
  var basePath: String = js.native
  
  var baseUrl: String = js.native
  
  var batchPath: String = js.native
  
  var description: String = js.native
  
  var discoveryRestUrl: String = js.native
  
  var discoveryVersion: String = js.native
  
  var documentationLink: String = js.native
  
  var etag: String = js.native
  
  var icons: X16 = js.native
  
  var id: String = js.native
  
  var kind: String = js.native
  
  var methods: SchemaMethods = js.native
  
  var name: String = js.native
  
  var ownerDomain: String = js.native
  
  var ownerName: String = js.native
  
  var parameters: SchemaParameters = js.native
  
  var protocol: String = js.native
  
  var resources: SchemaResources = js.native
  
  var revision: String = js.native
  
  var rootUrl: String = js.native
  
  var schemas: SchemaItems = js.native
  
  var servicePath: String = js.native
  
  var title: String = js.native
  
  var version: String = js.native
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
  implicit class SchemaOps[Self <: Schema] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAuth(value: Oauth2): Self = this.set("auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBasePath(value: String): Self = this.set("basePath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBaseUrl(value: String): Self = this.set("baseUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBatchPath(value: String): Self = this.set("batchPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDiscoveryRestUrl(value: String): Self = this.set("discoveryRestUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDiscoveryVersion(value: String): Self = this.set("discoveryVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocumentationLink(value: String): Self = this.set("documentationLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEtag(value: String): Self = this.set("etag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIcons(value: X16): Self = this.set("icons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMethods(value: SchemaMethods): Self = this.set("methods", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerDomain(value: String): Self = this.set("ownerDomain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerName(value: String): Self = this.set("ownerName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParameters(value: SchemaParameters): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProtocol(value: String): Self = this.set("protocol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResources(value: SchemaResources): Self = this.set("resources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRevision(value: String): Self = this.set("revision", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRootUrl(value: String): Self = this.set("rootUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchemas(value: SchemaItems): Self = this.set("schemas", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServicePath(value: String): Self = this.set("servicePath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersion(value: String): Self = this.set("version", value.asInstanceOf[js.Any])
  }
}
