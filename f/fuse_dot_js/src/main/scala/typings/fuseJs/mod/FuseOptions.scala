package typings.fuseJs.mod

import typings.fuseJs.anon.Name
import typings.fuseJs.anon.Score
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FuseOptions[T] extends js.Object {
  var caseSensitive: js.UndefOr[Boolean] = js.undefined
  var distance: js.UndefOr[Double] = js.undefined
  var findAllMatches: js.UndefOr[Boolean] = js.undefined
  var getFn: js.UndefOr[js.Function2[/* obj */ js.Any, /* path */ String, _]] = js.undefined
  var id: js.UndefOr[/* keyof T */ String] = js.undefined
  var includeMatches: js.UndefOr[Boolean] = js.undefined
  var includeScore: js.UndefOr[Boolean] = js.undefined
  var keys: js.UndefOr[js.Array[Name[T] | (/* keyof T */ String)]] = js.undefined
  var location: js.UndefOr[Double] = js.undefined
  var matchAllTokens: js.UndefOr[Boolean] = js.undefined
  var maxPatternLength: js.UndefOr[Double] = js.undefined
  var minMatchCharLength: js.UndefOr[Double] = js.undefined
  var shouldSort: js.UndefOr[Boolean] = js.undefined
  var sortFn: js.UndefOr[js.Function2[/* a */ Score, /* b */ Score, Double]] = js.undefined
  var threshold: js.UndefOr[Double] = js.undefined
  var tokenSeparator: js.UndefOr[RegExp] = js.undefined
  var tokenize: js.UndefOr[Boolean] = js.undefined
  var verbose: js.UndefOr[Boolean] = js.undefined
}

object FuseOptions {
  @scala.inline
  def apply[T](
    caseSensitive: js.UndefOr[Boolean] = js.undefined,
    distance: js.UndefOr[Double] = js.undefined,
    findAllMatches: js.UndefOr[Boolean] = js.undefined,
    getFn: (/* obj */ js.Any, /* path */ String) => _ = null,
    id: /* keyof T */ String = null,
    includeMatches: js.UndefOr[Boolean] = js.undefined,
    includeScore: js.UndefOr[Boolean] = js.undefined,
    keys: js.Array[Name[T] | (/* keyof T */ String)] = null,
    location: js.UndefOr[Double] = js.undefined,
    matchAllTokens: js.UndefOr[Boolean] = js.undefined,
    maxPatternLength: js.UndefOr[Double] = js.undefined,
    minMatchCharLength: js.UndefOr[Double] = js.undefined,
    shouldSort: js.UndefOr[Boolean] = js.undefined,
    sortFn: (/* a */ Score, /* b */ Score) => Double = null,
    threshold: js.UndefOr[Double] = js.undefined,
    tokenSeparator: RegExp = null,
    tokenize: js.UndefOr[Boolean] = js.undefined,
    verbose: js.UndefOr[Boolean] = js.undefined
  ): FuseOptions[T] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(caseSensitive)) __obj.updateDynamic("caseSensitive")(caseSensitive.get.asInstanceOf[js.Any])
    if (!js.isUndefined(distance)) __obj.updateDynamic("distance")(distance.get.asInstanceOf[js.Any])
    if (!js.isUndefined(findAllMatches)) __obj.updateDynamic("findAllMatches")(findAllMatches.get.asInstanceOf[js.Any])
    if (getFn != null) __obj.updateDynamic("getFn")(js.Any.fromFunction2(getFn))
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (!js.isUndefined(includeMatches)) __obj.updateDynamic("includeMatches")(includeMatches.get.asInstanceOf[js.Any])
    if (!js.isUndefined(includeScore)) __obj.updateDynamic("includeScore")(includeScore.get.asInstanceOf[js.Any])
    if (keys != null) __obj.updateDynamic("keys")(keys.asInstanceOf[js.Any])
    if (!js.isUndefined(location)) __obj.updateDynamic("location")(location.get.asInstanceOf[js.Any])
    if (!js.isUndefined(matchAllTokens)) __obj.updateDynamic("matchAllTokens")(matchAllTokens.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxPatternLength)) __obj.updateDynamic("maxPatternLength")(maxPatternLength.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minMatchCharLength)) __obj.updateDynamic("minMatchCharLength")(minMatchCharLength.get.asInstanceOf[js.Any])
    if (!js.isUndefined(shouldSort)) __obj.updateDynamic("shouldSort")(shouldSort.get.asInstanceOf[js.Any])
    if (sortFn != null) __obj.updateDynamic("sortFn")(js.Any.fromFunction2(sortFn))
    if (!js.isUndefined(threshold)) __obj.updateDynamic("threshold")(threshold.get.asInstanceOf[js.Any])
    if (tokenSeparator != null) __obj.updateDynamic("tokenSeparator")(tokenSeparator.asInstanceOf[js.Any])
    if (!js.isUndefined(tokenize)) __obj.updateDynamic("tokenize")(tokenize.get.asInstanceOf[js.Any])
    if (!js.isUndefined(verbose)) __obj.updateDynamic("verbose")(verbose.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[FuseOptions[T]]
  }
}

