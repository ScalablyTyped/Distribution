package typings.firefoxDashWebextDashBrowser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_IncludeBlocked extends js.Object {
  /** Include sites that the user has blocked from appearing on the Firefox new tab. */
  var includeBlocked: js.UndefOr[Boolean] = js.undefined
  /** Include sites favicon if available. */
  var includeFavicon: js.UndefOr[Boolean] = js.undefined
  /** The number of top sites to return, defaults to the value used by Firefox */
  var limit: js.UndefOr[Double] = js.undefined
  /** Limit the result to a single top site link per domain */
  var onePerDomain: js.UndefOr[Boolean] = js.undefined
  /** @deprecated Please use the other options to tune the results received from topSites. */
  var providers: js.UndefOr[js.Array[String]] = js.undefined
}

object Anon_IncludeBlocked {
  @scala.inline
  def apply(
    includeBlocked: js.UndefOr[Boolean] = js.undefined,
    includeFavicon: js.UndefOr[Boolean] = js.undefined,
    limit: Int | Double = null,
    onePerDomain: js.UndefOr[Boolean] = js.undefined,
    providers: js.Array[String] = null
  ): Anon_IncludeBlocked = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(includeBlocked)) __obj.updateDynamic("includeBlocked")(includeBlocked)
    if (!js.isUndefined(includeFavicon)) __obj.updateDynamic("includeFavicon")(includeFavicon)
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    if (!js.isUndefined(onePerDomain)) __obj.updateDynamic("onePerDomain")(onePerDomain)
    if (providers != null) __obj.updateDynamic("providers")(providers)
    __obj.asInstanceOf[Anon_IncludeBlocked]
  }
}

