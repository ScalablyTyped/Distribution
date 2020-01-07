package typings.googleapis.buildSrcApisDigitalassetlinksV1Mod.digitalassetlinks_v1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/digitalassetlinks/v1", "digitalassetlinks_v1.Resource$Assetlinks")
@js.native
class Resource$Assetlinks protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * digitalassetlinks.assetlinks.check
    * @desc Determines whether the specified (directional) relationship exists
    * between the specified source and target assets.  The relation describes
    * the intent of the link between the two assets as claimed by the source
    * asset.  An example for such relationships is the delegation of privileges
    * or permissions.  This command is most often used by infrastructure
    * systems to check preconditions for an action.  For example, a client may
    * want to know if it is OK to send a web URL to a particular mobile app
    * instead. The client can check for the relevant asset link from the
    * website to the mobile app to decide if the operation should be allowed.
    * A note about security: if you specify a secure asset as the source, such
    * as an HTTPS website or an Android app, the API will ensure that any
    * statements used to generate the response have been made in a secure way
    * by the owner of that asset.  Conversely, if the source asset is an
    * insecure HTTP website (that is, the URL starts with `http://` instead of
    * `https://`), the API cannot verify its statements securely, and it is not
    * possible to ensure that the website's statements have not been altered by
    * a third party.  For more information, see the [Digital Asset Links
    * technical design
    * specification](https://github.com/google/digitalassetlinks/blob/master/well-known/details.md).
    * @alias digitalassetlinks.assetlinks.check
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.relation Query string for the relation.  We identify relations with strings of the format `<kind>/<detail>`, where `<kind>` must be one of a set of pre-defined purpose categories, and `<detail>` is a free-form lowercase alphanumeric string that describes the specific use case of the statement.  Refer to [our API documentation](/digital-asset-links/v1/relation-strings) for the current list of supported relations.  For a query to match an asset link, both the query's and the asset link's relation strings must match exactly.  Example: A query with relation `delegate_permission/common.handle_all_urls` matches an asset link with relation `delegate_permission/common.handle_all_urls`.
    * @param {string=} params.source.androidApp.certificate.sha256Fingerprint The uppercase SHA-265 fingerprint of the certificate.  From the PEM  certificate, it can be acquired like this:      $ keytool -printcert -file $CERTFILE | grep SHA256:     SHA256: 14:6D:E9:83:C5:73:06:50:D8:EE:B9:95:2F:34:FC:64:16:A0:83: \         42:E6:1D:BE:A8:8A:04:96:B2:3F:CF:44:E5  or like this:      $ openssl x509 -in $CERTFILE -noout -fingerprint -sha256     SHA256 Fingerprint=14:6D:E9:83:C5:73:06:50:D8:EE:B9:95:2F:34:FC:64: \         16:A0:83:42:E6:1D:BE:A8:8A:04:96:B2:3F:CF:44:E5  In this example, the contents of this field would be `14:6D:E9:83:C5:73: 06:50:D8:EE:B9:95:2F:34:FC:64:16:A0:83:42:E6:1D:BE:A8:8A:04:96:B2:3F:CF: 44:E5`.  If these tools are not available to you, you can convert the PEM certificate into the DER format, compute the SHA-256 hash of that string and represent the result as a hexstring (that is, uppercase hexadecimal representations of each octet, separated by colons).
    * @param {string=} params.source.androidApp.packageName Android App assets are naturally identified by their Java package name. For example, the Google Maps app uses the package name `com.google.android.apps.maps`. REQUIRED
    * @param {string=} params.source.web.site Web assets are identified by a URL that contains only the scheme, hostname and port parts.  The format is      http[s]://<hostname>[:<port>]  Hostnames must be fully qualified: they must end in a single period ("`.`").  Only the schemes "http" and "https" are currently allowed.  Port numbers are given as a decimal number, and they must be omitted if the standard port numbers are used: 80 for http and 443 for https.  We call this limited URL the "site".  All URLs that share the same scheme, hostname and port are considered to be a part of the site and thus belong to the web asset.  Example: the asset with the site `https://www.google.com` contains all these URLs:    *   `https://www.google.com/`   *   `https://www.google.com:443/`   *   `https://www.google.com/foo`   *   `https://www.google.com/foo?bar`   *   `https://www.google.com/foo#bar`   *   `https://user@password:www.google.com/`  But it does not contain these URLs:    *   `http://www.google.com/`       (wrong scheme)   *   `https://google.com/`          (hostname does not match)   *   `https://www.google.com:444/`  (port does not match) REQUIRED
    * @param {string=} params.target.androidApp.certificate.sha256Fingerprint The uppercase SHA-265 fingerprint of the certificate.  From the PEM  certificate, it can be acquired like this:      $ keytool -printcert -file $CERTFILE | grep SHA256:     SHA256: 14:6D:E9:83:C5:73:06:50:D8:EE:B9:95:2F:34:FC:64:16:A0:83: \         42:E6:1D:BE:A8:8A:04:96:B2:3F:CF:44:E5  or like this:      $ openssl x509 -in $CERTFILE -noout -fingerprint -sha256     SHA256 Fingerprint=14:6D:E9:83:C5:73:06:50:D8:EE:B9:95:2F:34:FC:64: \         16:A0:83:42:E6:1D:BE:A8:8A:04:96:B2:3F:CF:44:E5  In this example, the contents of this field would be `14:6D:E9:83:C5:73: 06:50:D8:EE:B9:95:2F:34:FC:64:16:A0:83:42:E6:1D:BE:A8:8A:04:96:B2:3F:CF: 44:E5`.  If these tools are not available to you, you can convert the PEM certificate into the DER format, compute the SHA-256 hash of that string and represent the result as a hexstring (that is, uppercase hexadecimal representations of each octet, separated by colons).
    * @param {string=} params.target.androidApp.packageName Android App assets are naturally identified by their Java package name. For example, the Google Maps app uses the package name `com.google.android.apps.maps`. REQUIRED
    * @param {string=} params.target.web.site Web assets are identified by a URL that contains only the scheme, hostname and port parts.  The format is      http[s]://<hostname>[:<port>]  Hostnames must be fully qualified: they must end in a single period ("`.`").  Only the schemes "http" and "https" are currently allowed.  Port numbers are given as a decimal number, and they must be omitted if the standard port numbers are used: 80 for http and 443 for https.  We call this limited URL the "site".  All URLs that share the same scheme, hostname and port are considered to be a part of the site and thus belong to the web asset.  Example: the asset with the site `https://www.google.com` contains all these URLs:    *   `https://www.google.com/`   *   `https://www.google.com:443/`   *   `https://www.google.com/foo`   *   `https://www.google.com/foo?bar`   *   `https://www.google.com/foo#bar`   *   `https://user@password:www.google.com/`  But it does not contain these URLs:    *   `http://www.google.com/`       (wrong scheme)   *   `https://google.com/`          (hostname does not match)   *   `https://www.google.com:444/`  (port does not match) REQUIRED
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def check(): GaxiosPromise[Schema$CheckResponse] = js.native
  def check(callback: BodyResponseCallback[Schema$CheckResponse]): Unit = js.native
  def check(params: ParamsDollarResourceDollarAssetlinksDollarCheck): GaxiosPromise[Schema$CheckResponse] = js.native
  def check(
    params: ParamsDollarResourceDollarAssetlinksDollarCheck,
    callback: BodyResponseCallback[Schema$CheckResponse]
  ): Unit = js.native
  def check(
    params: ParamsDollarResourceDollarAssetlinksDollarCheck,
    options: BodyResponseCallback[Schema$CheckResponse],
    callback: BodyResponseCallback[Schema$CheckResponse]
  ): Unit = js.native
  def check(params: ParamsDollarResourceDollarAssetlinksDollarCheck, options: MethodOptions): GaxiosPromise[Schema$CheckResponse] = js.native
  def check(
    params: ParamsDollarResourceDollarAssetlinksDollarCheck,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$CheckResponse]
  ): Unit = js.native
}

