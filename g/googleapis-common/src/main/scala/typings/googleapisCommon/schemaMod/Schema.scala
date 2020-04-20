package typings.googleapisCommon.schemaMod

import typings.googleapisCommon.AnonOauth2
import typings.googleapisCommon.AnonX16
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Schema extends js.Object {
  var auth: AnonOauth2
  var basePath: String
  var baseUrl: String
  var batchPath: String
  var description: String
  var discoveryRestUrl: String
  var discoveryVersion: String
  var documentationLink: String
  var etag: String
  var icons: AnonX16
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
    auth: AnonOauth2,
    basePath: String,
    baseUrl: String,
    batchPath: String,
    description: String,
    discoveryRestUrl: String,
    discoveryVersion: String,
    documentationLink: String,
    etag: String,
    icons: AnonX16,
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
}

