package typings.gapiClientAdexchangebuyer2.gapi.client.adexchangebuyer2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServingContext extends js.Object {
  /** Matches all contexts. */
  var all: js.UndefOr[String] = js.native
  /** Matches impressions for a particular app type. */
  var appType: js.UndefOr[AppContext] = js.native
  /** Matches impressions for a particular auction type. */
  var auctionType: js.UndefOr[AuctionContext] = js.native
  /**
    * Matches impressions coming from users &#42;or&#42; publishers in a specific
    * location.
    */
  var location: js.UndefOr[LocationContext] = js.native
  /** Matches impressions coming from a particular platform. */
  var platform: js.UndefOr[PlatformContext] = js.native
  /** Matches impressions for a particular security type. */
  var securityType: js.UndefOr[SecurityContext] = js.native
}

object ServingContext {
  @scala.inline
  def apply(): ServingContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServingContext]
  }
  @scala.inline
  implicit class ServingContextOps[Self <: ServingContext] (val x: Self) extends AnyVal {
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
    def setAll(value: String): Self = this.set("all", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAll: Self = this.set("all", js.undefined)
    @scala.inline
    def setAppType(value: AppContext): Self = this.set("appType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAppType: Self = this.set("appType", js.undefined)
    @scala.inline
    def setAuctionType(value: AuctionContext): Self = this.set("auctionType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuctionType: Self = this.set("auctionType", js.undefined)
    @scala.inline
    def setLocation(value: LocationContext): Self = this.set("location", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocation: Self = this.set("location", js.undefined)
    @scala.inline
    def setPlatform(value: PlatformContext): Self = this.set("platform", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlatform: Self = this.set("platform", js.undefined)
    @scala.inline
    def setSecurityType(value: SecurityContext): Self = this.set("securityType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSecurityType: Self = this.set("securityType", js.undefined)
  }
  
}

