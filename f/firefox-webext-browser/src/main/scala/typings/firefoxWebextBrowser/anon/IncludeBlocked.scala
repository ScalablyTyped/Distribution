package typings.firefoxWebextBrowser.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IncludeBlocked extends js.Object {
  /** Include sites that the user has blocked from appearing on the Firefox new tab. */
  var includeBlocked: js.UndefOr[Boolean] = js.undefined
  /** Include sites favicon if available. */
  var includeFavicon: js.UndefOr[Boolean] = js.undefined
  /** Include sites that the user has pinned on the Firefox new tab. */
  var includePinned: js.UndefOr[Boolean] = js.undefined
  /** Include search shortcuts appearing on the Firefox new tab. */
  var includeSearchShortcuts: js.UndefOr[Boolean] = js.undefined
  /** The number of top sites to return, defaults to the value used by Firefox */
  var limit: js.UndefOr[Double] = js.undefined
  /**
    * Return the sites that exactly appear on the user's new-tab page. When true, all other options are ignored
    * except limit and includeFavicon.
    */
  var newtab: js.UndefOr[Boolean] = js.undefined
  /** Limit the result to a single top site link per domain */
  var onePerDomain: js.UndefOr[Boolean] = js.undefined
  /** @deprecated Please use the other options to tune the results received from topSites. */
  var providers: js.UndefOr[js.Array[String]] = js.undefined
}

object IncludeBlocked {
  @scala.inline
  def apply(
    includeBlocked: js.UndefOr[Boolean] = js.undefined,
    includeFavicon: js.UndefOr[Boolean] = js.undefined,
    includePinned: js.UndefOr[Boolean] = js.undefined,
    includeSearchShortcuts: js.UndefOr[Boolean] = js.undefined,
    limit: js.UndefOr[Double] = js.undefined,
    newtab: js.UndefOr[Boolean] = js.undefined,
    onePerDomain: js.UndefOr[Boolean] = js.undefined,
    providers: js.Array[String] = null
  ): IncludeBlocked = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(includeBlocked)) __obj.updateDynamic("includeBlocked")(includeBlocked.get.asInstanceOf[js.Any])
    if (!js.isUndefined(includeFavicon)) __obj.updateDynamic("includeFavicon")(includeFavicon.get.asInstanceOf[js.Any])
    if (!js.isUndefined(includePinned)) __obj.updateDynamic("includePinned")(includePinned.get.asInstanceOf[js.Any])
    if (!js.isUndefined(includeSearchShortcuts)) __obj.updateDynamic("includeSearchShortcuts")(includeSearchShortcuts.get.asInstanceOf[js.Any])
    if (!js.isUndefined(limit)) __obj.updateDynamic("limit")(limit.get.asInstanceOf[js.Any])
    if (!js.isUndefined(newtab)) __obj.updateDynamic("newtab")(newtab.get.asInstanceOf[js.Any])
    if (!js.isUndefined(onePerDomain)) __obj.updateDynamic("onePerDomain")(onePerDomain.get.asInstanceOf[js.Any])
    if (providers != null) __obj.updateDynamic("providers")(providers.asInstanceOf[js.Any])
    __obj.asInstanceOf[IncludeBlocked]
  }
}

