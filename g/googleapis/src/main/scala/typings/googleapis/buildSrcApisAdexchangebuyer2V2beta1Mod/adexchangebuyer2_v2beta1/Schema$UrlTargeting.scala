package typings.googleapis.buildSrcApisAdexchangebuyer2V2beta1Mod.adexchangebuyer2_v2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a list of targeted and excluded URLs (e.g., google.com). For
  * Private Auction and AdX Preferred Deals, URLs are either included or
  * excluded. For Programmatic Guaranteed and Preferred Deals, this doesn&#39;t
  * apply.
  */
@js.native
trait Schema$UrlTargeting extends js.Object {
  /**
    * A list of URLs to be excluded.
    */
  var excludedUrls: js.UndefOr[js.Array[String]] = js.native
  /**
    * A list of URLs to be included.
    */
  var targetedUrls: js.UndefOr[js.Array[String]] = js.native
}

object Schema$UrlTargeting {
  @scala.inline
  def apply(excludedUrls: js.Array[String] = null, targetedUrls: js.Array[String] = null): Schema$UrlTargeting = {
    val __obj = js.Dynamic.literal()
    if (excludedUrls != null) __obj.updateDynamic("excludedUrls")(excludedUrls.asInstanceOf[js.Any])
    if (targetedUrls != null) __obj.updateDynamic("targetedUrls")(targetedUrls.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$UrlTargeting]
  }
}

