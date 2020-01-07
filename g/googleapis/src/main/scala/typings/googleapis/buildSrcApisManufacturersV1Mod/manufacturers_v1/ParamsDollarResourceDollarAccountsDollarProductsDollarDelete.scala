package typings.googleapis.buildSrcApisManufacturersV1Mod.manufacturers_v1

import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.Compute
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.JWT
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.OAuth2Client
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsDollarResourceDollarAccountsDollarProductsDollarDelete extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * Name in the format `{target_country}:{content_language}:{product_id}`.
    * `target_country`   - The target country of the product as a CLDR
    * territory                      code (for example, US). `content_language`
    * - The content language of the product as a two-letter ISO 639-1 language
    * code (for example, en).  `product_id`     -   The ID of the product. For
    * more information, see
    * https://support.google.com/manufacturers/answer/6124116#id.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Parent ID in the format `accounts/{account_id}`.  `account_id` - The ID
    * of the Manufacturer Center account.
    */
  var parent: js.UndefOr[String] = js.native
}

