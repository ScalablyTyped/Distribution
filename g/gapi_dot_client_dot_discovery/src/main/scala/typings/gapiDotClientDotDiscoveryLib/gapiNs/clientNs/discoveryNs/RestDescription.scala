package typings
package gapiDotClientDotDiscoveryLib.gapiNs.clientNs.discoveryNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RestDescription extends js.Object {
  /** Authentication information. */
  var auth: js.UndefOr[gapiDotClientDotDiscoveryLib.Anon_Oauth2] = js.undefined
  /** [DEPRECATED] The base path for REST requests. */
  var basePath: js.UndefOr[java.lang.String] = js.undefined
  /** [DEPRECATED] The base URL for REST requests. */
  var baseUrl: js.UndefOr[java.lang.String] = js.undefined
  /** The path for REST batch requests. */
  var batchPath: js.UndefOr[java.lang.String] = js.undefined
  /** Indicates how the API name should be capitalized and split into various parts. Useful for generating pretty class names. */
  var canonicalName: js.UndefOr[java.lang.String] = js.undefined
  /** The description of this API. */
  var description: js.UndefOr[java.lang.String] = js.undefined
  /** Indicate the version of the Discovery API used to generate this doc. */
  var discoveryVersion: js.UndefOr[java.lang.String] = js.undefined
  /** A link to human readable documentation for the API. */
  var documentationLink: js.UndefOr[java.lang.String] = js.undefined
  /** The ETag for this response. */
  var etag: js.UndefOr[java.lang.String] = js.undefined
  /** Enable exponential backoff for suitable methods in the generated clients. */
  var exponentialBackoffDefault: js.UndefOr[scala.Boolean] = js.undefined
  /** A list of supported features for this API. */
  var features: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** Links to 16x16 and 32x32 icons representing the API. */
  var icons: js.UndefOr[gapiDotClientDotDiscoveryLib.Anon_X16] = js.undefined
  /** The ID of this API. */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /** The kind for this response. */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** Labels for the status of this API, such as labs or deprecated. */
  var labels: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** API-level methods for this API. */
  var methods: js.UndefOr[stdLib.Record[java.lang.String, RestMethod]] = js.undefined
  /** The name of this API. */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The domain of the owner of this API. Together with the ownerName and a packagePath values, this can be used to generate a library for this API which
    * would have a unique fully qualified name.
    */
  var ownerDomain: js.UndefOr[java.lang.String] = js.undefined
  /** The name of the owner of this API. See ownerDomain. */
  var ownerName: js.UndefOr[java.lang.String] = js.undefined
  /** The package of the owner of this API. See ownerDomain. */
  var packagePath: js.UndefOr[java.lang.String] = js.undefined
  /** Common parameters that apply across all apis. */
  var parameters: js.UndefOr[stdLib.Record[java.lang.String, JsonSchema]] = js.undefined
  /** The protocol described by this document. */
  var protocol: js.UndefOr[java.lang.String] = js.undefined
  /** The resources in this API. */
  var resources: js.UndefOr[stdLib.Record[java.lang.String, RestResource]] = js.undefined
  /** The version of this API. */
  var revision: js.UndefOr[java.lang.String] = js.undefined
  /** The root URL under which all API services live. */
  var rootUrl: js.UndefOr[java.lang.String] = js.undefined
  /** The schemas for this API. */
  var schemas: js.UndefOr[stdLib.Record[java.lang.String, JsonSchema]] = js.undefined
  /** The base path for all REST requests. */
  var servicePath: js.UndefOr[java.lang.String] = js.undefined
  /** The title of this API. */
  var title: js.UndefOr[java.lang.String] = js.undefined
  /** The version of this API. */
  var version: js.UndefOr[java.lang.String] = js.undefined
  var version_module: js.UndefOr[scala.Boolean] = js.undefined
}

