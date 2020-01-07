package typings.googleapis.buildSrcApisAdexchangebuyer2V2beta1Mod.adexchangebuyer2_v2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The serving context for this restriction.
  */
@js.native
trait Schema$ServingContext extends js.Object {
  /**
    * Matches all contexts.
    */
  var all: js.UndefOr[String] = js.native
  /**
    * Matches impressions for a particular app type.
    */
  var appType: js.UndefOr[Schema$AppContext] = js.native
  /**
    * Matches impressions for a particular auction type.
    */
  var auctionType: js.UndefOr[Schema$AuctionContext] = js.native
  /**
    * Matches impressions coming from users *or* publishers in a specific
    * location.
    */
  var location: js.UndefOr[Schema$LocationContext] = js.native
  /**
    * Matches impressions coming from a particular platform.
    */
  var platform: js.UndefOr[Schema$PlatformContext] = js.native
  /**
    * Matches impressions for a particular security type.
    */
  var securityType: js.UndefOr[Schema$SecurityContext] = js.native
}

object Schema$ServingContext {
  @scala.inline
  def apply(
    all: String = null,
    appType: Schema$AppContext = null,
    auctionType: Schema$AuctionContext = null,
    location: Schema$LocationContext = null,
    platform: Schema$PlatformContext = null,
    securityType: Schema$SecurityContext = null
  ): Schema$ServingContext = {
    val __obj = js.Dynamic.literal()
    if (all != null) __obj.updateDynamic("all")(all.asInstanceOf[js.Any])
    if (appType != null) __obj.updateDynamic("appType")(appType.asInstanceOf[js.Any])
    if (auctionType != null) __obj.updateDynamic("auctionType")(auctionType.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    if (platform != null) __obj.updateDynamic("platform")(platform.asInstanceOf[js.Any])
    if (securityType != null) __obj.updateDynamic("securityType")(securityType.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ServingContext]
  }
}

