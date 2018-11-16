package typings
package gapiDotClientDotAdexchangebuyer2Lib.gapiNs.clientNs.adexchangebuyer2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ServingContext extends js.Object {
  /** Matches all contexts. */
  var all: js.UndefOr[java.lang.String] = js.undefined
  /** Matches impressions for a particular app type. */
  var appType: js.UndefOr[AppContext] = js.undefined
  /** Matches impressions for a particular auction type. */
  var auctionType: js.UndefOr[AuctionContext] = js.undefined
  /**
               * Matches impressions coming from users &#42;or&#42; publishers in a specific
               * location.
               */
  var location: js.UndefOr[LocationContext] = js.undefined
  /** Matches impressions coming from a particular platform. */
  var platform: js.UndefOr[PlatformContext] = js.undefined
  /** Matches impressions for a particular security type. */
  var securityType: js.UndefOr[SecurityContext] = js.undefined
}

