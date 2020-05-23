package typings.gapiClientDiscovery.gapi.client.discovery

import typings.gapiClientDiscovery.anon.Oauth2
import typings.gapiClientDiscovery.anon.X16
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RestDescription extends js.Object {
  /** Authentication information. */
  var auth: js.UndefOr[Oauth2] = js.undefined
  /** [DEPRECATED] The base path for REST requests. */
  var basePath: js.UndefOr[String] = js.undefined
  /** [DEPRECATED] The base URL for REST requests. */
  var baseUrl: js.UndefOr[String] = js.undefined
  /** The path for REST batch requests. */
  var batchPath: js.UndefOr[String] = js.undefined
  /** Indicates how the API name should be capitalized and split into various parts. Useful for generating pretty class names. */
  var canonicalName: js.UndefOr[String] = js.undefined
  /** The description of this API. */
  var description: js.UndefOr[String] = js.undefined
  /** Indicate the version of the Discovery API used to generate this doc. */
  var discoveryVersion: js.UndefOr[String] = js.undefined
  /** A link to human readable documentation for the API. */
  var documentationLink: js.UndefOr[String] = js.undefined
  /** The ETag for this response. */
  var etag: js.UndefOr[String] = js.undefined
  /** Enable exponential backoff for suitable methods in the generated clients. */
  var exponentialBackoffDefault: js.UndefOr[Boolean] = js.undefined
  /** A list of supported features for this API. */
  var features: js.UndefOr[js.Array[String]] = js.undefined
  /** Links to 16x16 and 32x32 icons representing the API. */
  var icons: js.UndefOr[X16] = js.undefined
  /** The ID of this API. */
  var id: js.UndefOr[String] = js.undefined
  /** The kind for this response. */
  var kind: js.UndefOr[String] = js.undefined
  /** Labels for the status of this API, such as labs or deprecated. */
  var labels: js.UndefOr[js.Array[String]] = js.undefined
  /** API-level methods for this API. */
  var methods: js.UndefOr[Record[String, RestMethod]] = js.undefined
  /** The name of this API. */
  var name: js.UndefOr[String] = js.undefined
  /**
    * The domain of the owner of this API. Together with the ownerName and a packagePath values, this can be used to generate a library for this API which
    * would have a unique fully qualified name.
    */
  var ownerDomain: js.UndefOr[String] = js.undefined
  /** The name of the owner of this API. See ownerDomain. */
  var ownerName: js.UndefOr[String] = js.undefined
  /** The package of the owner of this API. See ownerDomain. */
  var packagePath: js.UndefOr[String] = js.undefined
  /** Common parameters that apply across all apis. */
  var parameters: js.UndefOr[Record[String, JsonSchema]] = js.undefined
  /** The protocol described by this document. */
  var protocol: js.UndefOr[String] = js.undefined
  /** The resources in this API. */
  var resources: js.UndefOr[Record[String, RestResource]] = js.undefined
  /** The version of this API. */
  var revision: js.UndefOr[String] = js.undefined
  /** The root URL under which all API services live. */
  var rootUrl: js.UndefOr[String] = js.undefined
  /** The schemas for this API. */
  var schemas: js.UndefOr[Record[String, JsonSchema]] = js.undefined
  /** The base path for all REST requests. */
  var servicePath: js.UndefOr[String] = js.undefined
  /** The title of this API. */
  var title: js.UndefOr[String] = js.undefined
  /** The version of this API. */
  var version: js.UndefOr[String] = js.undefined
  var version_module: js.UndefOr[Boolean] = js.undefined
}

object RestDescription {
  @scala.inline
  def apply(
    auth: Oauth2 = null,
    basePath: String = null,
    baseUrl: String = null,
    batchPath: String = null,
    canonicalName: String = null,
    description: String = null,
    discoveryVersion: String = null,
    documentationLink: String = null,
    etag: String = null,
    exponentialBackoffDefault: js.UndefOr[Boolean] = js.undefined,
    features: js.Array[String] = null,
    icons: X16 = null,
    id: String = null,
    kind: String = null,
    labels: js.Array[String] = null,
    methods: Record[String, RestMethod] = null,
    name: String = null,
    ownerDomain: String = null,
    ownerName: String = null,
    packagePath: String = null,
    parameters: Record[String, JsonSchema] = null,
    protocol: String = null,
    resources: Record[String, RestResource] = null,
    revision: String = null,
    rootUrl: String = null,
    schemas: Record[String, JsonSchema] = null,
    servicePath: String = null,
    title: String = null,
    version: String = null,
    version_module: js.UndefOr[Boolean] = js.undefined
  ): RestDescription = {
    val __obj = js.Dynamic.literal()
    if (auth != null) __obj.updateDynamic("auth")(auth.asInstanceOf[js.Any])
    if (basePath != null) __obj.updateDynamic("basePath")(basePath.asInstanceOf[js.Any])
    if (baseUrl != null) __obj.updateDynamic("baseUrl")(baseUrl.asInstanceOf[js.Any])
    if (batchPath != null) __obj.updateDynamic("batchPath")(batchPath.asInstanceOf[js.Any])
    if (canonicalName != null) __obj.updateDynamic("canonicalName")(canonicalName.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (discoveryVersion != null) __obj.updateDynamic("discoveryVersion")(discoveryVersion.asInstanceOf[js.Any])
    if (documentationLink != null) __obj.updateDynamic("documentationLink")(documentationLink.asInstanceOf[js.Any])
    if (etag != null) __obj.updateDynamic("etag")(etag.asInstanceOf[js.Any])
    if (!js.isUndefined(exponentialBackoffDefault)) __obj.updateDynamic("exponentialBackoffDefault")(exponentialBackoffDefault.get.asInstanceOf[js.Any])
    if (features != null) __obj.updateDynamic("features")(features.asInstanceOf[js.Any])
    if (icons != null) __obj.updateDynamic("icons")(icons.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (labels != null) __obj.updateDynamic("labels")(labels.asInstanceOf[js.Any])
    if (methods != null) __obj.updateDynamic("methods")(methods.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (ownerDomain != null) __obj.updateDynamic("ownerDomain")(ownerDomain.asInstanceOf[js.Any])
    if (ownerName != null) __obj.updateDynamic("ownerName")(ownerName.asInstanceOf[js.Any])
    if (packagePath != null) __obj.updateDynamic("packagePath")(packagePath.asInstanceOf[js.Any])
    if (parameters != null) __obj.updateDynamic("parameters")(parameters.asInstanceOf[js.Any])
    if (protocol != null) __obj.updateDynamic("protocol")(protocol.asInstanceOf[js.Any])
    if (resources != null) __obj.updateDynamic("resources")(resources.asInstanceOf[js.Any])
    if (revision != null) __obj.updateDynamic("revision")(revision.asInstanceOf[js.Any])
    if (rootUrl != null) __obj.updateDynamic("rootUrl")(rootUrl.asInstanceOf[js.Any])
    if (schemas != null) __obj.updateDynamic("schemas")(schemas.asInstanceOf[js.Any])
    if (servicePath != null) __obj.updateDynamic("servicePath")(servicePath.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    if (!js.isUndefined(version_module)) __obj.updateDynamic("version_module")(version_module.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[RestDescription]
  }
}

