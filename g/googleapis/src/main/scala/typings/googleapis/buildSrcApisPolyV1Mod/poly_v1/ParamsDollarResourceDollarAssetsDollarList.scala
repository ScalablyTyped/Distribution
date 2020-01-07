package typings.googleapis.buildSrcApisPolyV1Mod.poly_v1

import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.Compute
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.JWT
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.OAuth2Client
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsDollarResourceDollarAssetsDollarList extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * Filter assets based on the specified category. Supported values are:
    * `animals`, `architecture`, `art`, `food`, `nature`, `objects`, `people`,
    * `scenes`, `technology`, and `transport`.
    */
  var category: js.UndefOr[String] = js.native
  /**
    * Return only assets that have been curated by the Poly team.
    */
  var curated: js.UndefOr[Boolean] = js.native
  /**
    * Return only assets with the matching format. Acceptable values are:
    * `BLOCKS`, `FBX`, `GLTF`, `GLTF2`, `OBJ`, `TILT`.
    */
  var format: js.UndefOr[String] = js.native
  /**
    * One or more search terms to be matched against all text that Poly has
    * indexed for assets, which includes display_name, description, and tags.
    * Multiple keywords should be separated by spaces.
    */
  var keywords: js.UndefOr[String] = js.native
  /**
    * Returns assets that are of the specified complexity or less. Defaults to
    * COMPLEX. For example, a request for MEDIUM assets also includes SIMPLE
    * assets.
    */
  var maxComplexity: js.UndefOr[String] = js.native
  /**
    * Specifies an ordering for assets. Acceptable values are: `BEST`,
    * `NEWEST`, `OLDEST`. Defaults to `BEST`, which ranks assets based on a
    * combination of popularity and other features.
    */
  var orderBy: js.UndefOr[String] = js.native
  /**
    * The maximum number of assets to be returned. This value must be between
    * `1` and `100`. Defaults to `20`.
    */
  var pageSize: js.UndefOr[Double] = js.native
  /**
    * Specifies a continuation token from a previous search whose results were
    * split into multiple pages. To get the next page, submit the same request
    * specifying the value from next_page_token.
    */
  var pageToken: js.UndefOr[String] = js.native
}

