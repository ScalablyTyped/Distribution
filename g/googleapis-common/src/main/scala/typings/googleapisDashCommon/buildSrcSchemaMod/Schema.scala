package typings.googleapisDashCommon.buildSrcSchemaMod

import typings.googleapisDashCommon.Anon_Oauth2
import typings.googleapisDashCommon.Anon_X16
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Schema extends js.Object {
  var auth: Anon_Oauth2
  var basePath: String
  var baseUrl: String
  var batchPath: String
  var description: String
  var discoveryRestUrl: String
  var discoveryVersion: String
  var documentationLink: String
  var etag: String
  var icons: Anon_X16
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
    auth: Anon_Oauth2,
    basePath: String,
    baseUrl: String,
    batchPath: String,
    description: String,
    discoveryRestUrl: String,
    discoveryVersion: String,
    documentationLink: String,
    etag: String,
    icons: Anon_X16,
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
    val __obj = js.Dynamic.literal(auth = auth, basePath = basePath, baseUrl = baseUrl, batchPath = batchPath, description = description, discoveryRestUrl = discoveryRestUrl, discoveryVersion = discoveryVersion, documentationLink = documentationLink, etag = etag, icons = icons, id = id, kind = kind, methods = methods, name = name, ownerDomain = ownerDomain, ownerName = ownerName, parameters = parameters, protocol = protocol, resources = resources, revision = revision, rootUrl = rootUrl, schemas = schemas, servicePath = servicePath, title = title, version = version)
  
    __obj.asInstanceOf[Schema]
  }
}

