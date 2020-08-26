package typings.gapiClientDiscovery.gapi.client.discovery

import org.scalablytyped.runtime.TopLevel
import typings.gapiClientDiscovery.anon.Oauth2
import typings.gapiClientDiscovery.anon.X16
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RestDescription extends js.Object {
  /** Authentication information. */
  var auth: js.UndefOr[Oauth2] = js.native
  /** [DEPRECATED] The base path for REST requests. */
  var basePath: js.UndefOr[String] = js.native
  /** [DEPRECATED] The base URL for REST requests. */
  var baseUrl: js.UndefOr[String] = js.native
  /** The path for REST batch requests. */
  var batchPath: js.UndefOr[String] = js.native
  /** Indicates how the API name should be capitalized and split into various parts. Useful for generating pretty class names. */
  var canonicalName: js.UndefOr[String] = js.native
  /** The description of this API. */
  var description: js.UndefOr[String] = js.native
  /** Indicate the version of the Discovery API used to generate this doc. */
  var discoveryVersion: js.UndefOr[String] = js.native
  /** A link to human readable documentation for the API. */
  var documentationLink: js.UndefOr[String] = js.native
  /** The ETag for this response. */
  var etag: js.UndefOr[String] = js.native
  /** Enable exponential backoff for suitable methods in the generated clients. */
  var exponentialBackoffDefault: js.UndefOr[Boolean] = js.native
  /** A list of supported features for this API. */
  var features: js.UndefOr[js.Array[String]] = js.native
  /** Links to 16x16 and 32x32 icons representing the API. */
  var icons: js.UndefOr[X16] = js.native
  /** The ID of this API. */
  var id: js.UndefOr[String] = js.native
  /** The kind for this response. */
  var kind: js.UndefOr[String] = js.native
  /** Labels for the status of this API, such as labs or deprecated. */
  var labels: js.UndefOr[js.Array[String]] = js.native
  /** API-level methods for this API. */
  var methods: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: gapi.client.discovery.gapi.client.discovery.RestMethod}
    */ typings.gapiClientDiscovery.gapiClientDiscoveryStrings.RestDescription with TopLevel[js.Any]
  ] = js.native
  /** The name of this API. */
  var name: js.UndefOr[String] = js.native
  /**
    * The domain of the owner of this API. Together with the ownerName and a packagePath values, this can be used to generate a library for this API which
    * would have a unique fully qualified name.
    */
  var ownerDomain: js.UndefOr[String] = js.native
  /** The name of the owner of this API. See ownerDomain. */
  var ownerName: js.UndefOr[String] = js.native
  /** The package of the owner of this API. See ownerDomain. */
  var packagePath: js.UndefOr[String] = js.native
  /** Common parameters that apply across all apis. */
  var parameters: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: gapi.client.discovery.gapi.client.discovery.JsonSchema}
    */ typings.gapiClientDiscovery.gapiClientDiscoveryStrings.RestDescription with TopLevel[js.Any]
  ] = js.native
  /** The protocol described by this document. */
  var protocol: js.UndefOr[String] = js.native
  /** The resources in this API. */
  var resources: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: gapi.client.discovery.gapi.client.discovery.RestResource}
    */ typings.gapiClientDiscovery.gapiClientDiscoveryStrings.RestDescription with TopLevel[js.Any]
  ] = js.native
  /** The version of this API. */
  var revision: js.UndefOr[String] = js.native
  /** The root URL under which all API services live. */
  var rootUrl: js.UndefOr[String] = js.native
  /** The schemas for this API. */
  var schemas: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: gapi.client.discovery.gapi.client.discovery.JsonSchema}
    */ typings.gapiClientDiscovery.gapiClientDiscoveryStrings.RestDescription with TopLevel[js.Any]
  ] = js.native
  /** The base path for all REST requests. */
  var servicePath: js.UndefOr[String] = js.native
  /** The title of this API. */
  var title: js.UndefOr[String] = js.native
  /** The version of this API. */
  var version: js.UndefOr[String] = js.native
  var version_module: js.UndefOr[Boolean] = js.native
}

object RestDescription {
  @scala.inline
  def apply(): RestDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RestDescription]
  }
  @scala.inline
  implicit class RestDescriptionOps[Self <: RestDescription] (val x: Self) extends AnyVal {
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
    def deleteAuth: Self = this.set("auth", js.undefined)
    @scala.inline
    def setBasePath(value: String): Self = this.set("basePath", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBasePath: Self = this.set("basePath", js.undefined)
    @scala.inline
    def setBaseUrl(value: String): Self = this.set("baseUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBaseUrl: Self = this.set("baseUrl", js.undefined)
    @scala.inline
    def setBatchPath(value: String): Self = this.set("batchPath", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBatchPath: Self = this.set("batchPath", js.undefined)
    @scala.inline
    def setCanonicalName(value: String): Self = this.set("canonicalName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCanonicalName: Self = this.set("canonicalName", js.undefined)
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setDiscoveryVersion(value: String): Self = this.set("discoveryVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDiscoveryVersion: Self = this.set("discoveryVersion", js.undefined)
    @scala.inline
    def setDocumentationLink(value: String): Self = this.set("documentationLink", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDocumentationLink: Self = this.set("documentationLink", js.undefined)
    @scala.inline
    def setEtag(value: String): Self = this.set("etag", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEtag: Self = this.set("etag", js.undefined)
    @scala.inline
    def setExponentialBackoffDefault(value: Boolean): Self = this.set("exponentialBackoffDefault", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExponentialBackoffDefault: Self = this.set("exponentialBackoffDefault", js.undefined)
    @scala.inline
    def setFeaturesVarargs(value: String*): Self = this.set("features", js.Array(value :_*))
    @scala.inline
    def setFeatures(value: js.Array[String]): Self = this.set("features", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFeatures: Self = this.set("features", js.undefined)
    @scala.inline
    def setIcons(value: X16): Self = this.set("icons", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIcons: Self = this.set("icons", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setLabelsVarargs(value: String*): Self = this.set("labels", js.Array(value :_*))
    @scala.inline
    def setLabels(value: js.Array[String]): Self = this.set("labels", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabels: Self = this.set("labels", js.undefined)
    @scala.inline
    def setMethods(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: gapi.client.discovery.gapi.client.discovery.RestMethod}
      */ typings.gapiClientDiscovery.gapiClientDiscoveryStrings.RestDescription with TopLevel[js.Any]
    ): Self = this.set("methods", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMethods: Self = this.set("methods", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setOwnerDomain(value: String): Self = this.set("ownerDomain", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOwnerDomain: Self = this.set("ownerDomain", js.undefined)
    @scala.inline
    def setOwnerName(value: String): Self = this.set("ownerName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOwnerName: Self = this.set("ownerName", js.undefined)
    @scala.inline
    def setPackagePath(value: String): Self = this.set("packagePath", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePackagePath: Self = this.set("packagePath", js.undefined)
    @scala.inline
    def setParameters(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: gapi.client.discovery.gapi.client.discovery.JsonSchema}
      */ typings.gapiClientDiscovery.gapiClientDiscoveryStrings.RestDescription with TopLevel[js.Any]
    ): Self = this.set("parameters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParameters: Self = this.set("parameters", js.undefined)
    @scala.inline
    def setProtocol(value: String): Self = this.set("protocol", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProtocol: Self = this.set("protocol", js.undefined)
    @scala.inline
    def setResources(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: gapi.client.discovery.gapi.client.discovery.RestResource}
      */ typings.gapiClientDiscovery.gapiClientDiscoveryStrings.RestDescription with TopLevel[js.Any]
    ): Self = this.set("resources", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResources: Self = this.set("resources", js.undefined)
    @scala.inline
    def setRevision(value: String): Self = this.set("revision", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRevision: Self = this.set("revision", js.undefined)
    @scala.inline
    def setRootUrl(value: String): Self = this.set("rootUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRootUrl: Self = this.set("rootUrl", js.undefined)
    @scala.inline
    def setSchemas(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: gapi.client.discovery.gapi.client.discovery.JsonSchema}
      */ typings.gapiClientDiscovery.gapiClientDiscoveryStrings.RestDescription with TopLevel[js.Any]
    ): Self = this.set("schemas", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSchemas: Self = this.set("schemas", js.undefined)
    @scala.inline
    def setServicePath(value: String): Self = this.set("servicePath", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteServicePath: Self = this.set("servicePath", js.undefined)
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    @scala.inline
    def setVersion(value: String): Self = this.set("version", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVersion: Self = this.set("version", js.undefined)
    @scala.inline
    def setVersion_module(value: Boolean): Self = this.set("version_module", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVersion_module: Self = this.set("version_module", js.undefined)
  }
  
}

