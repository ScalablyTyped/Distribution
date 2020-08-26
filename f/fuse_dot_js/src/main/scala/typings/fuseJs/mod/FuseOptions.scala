package typings.fuseJs.mod

import typings.fuseJs.anon.Name
import typings.fuseJs.anon.Score
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FuseOptions[T] extends js.Object {
  var caseSensitive: js.UndefOr[Boolean] = js.native
  var distance: js.UndefOr[Double] = js.native
  var findAllMatches: js.UndefOr[Boolean] = js.native
  var getFn: js.UndefOr[js.Function2[/* obj */ js.Any, /* path */ String, _]] = js.native
  var id: js.UndefOr[/* keyof T */ String] = js.native
  var includeMatches: js.UndefOr[Boolean] = js.native
  var includeScore: js.UndefOr[Boolean] = js.native
  var keys: js.UndefOr[js.Array[Name[T] | (/* keyof T */ String)]] = js.native
  var location: js.UndefOr[Double] = js.native
  var matchAllTokens: js.UndefOr[Boolean] = js.native
  var maxPatternLength: js.UndefOr[Double] = js.native
  var minMatchCharLength: js.UndefOr[Double] = js.native
  var shouldSort: js.UndefOr[Boolean] = js.native
  var sortFn: js.UndefOr[js.Function2[/* a */ Score, /* b */ Score, Double]] = js.native
  var threshold: js.UndefOr[Double] = js.native
  var tokenSeparator: js.UndefOr[RegExp] = js.native
  var tokenize: js.UndefOr[Boolean] = js.native
  var verbose: js.UndefOr[Boolean] = js.native
}

object FuseOptions {
  @scala.inline
  def apply[T](): FuseOptions[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FuseOptions[T]]
  }
  @scala.inline
  implicit class FuseOptionsOps[Self <: FuseOptions[_], T] (val x: Self with FuseOptions[T]) extends AnyVal {
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
    def setCaseSensitive(value: Boolean): Self = this.set("caseSensitive", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCaseSensitive: Self = this.set("caseSensitive", js.undefined)
    @scala.inline
    def setDistance(value: Double): Self = this.set("distance", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDistance: Self = this.set("distance", js.undefined)
    @scala.inline
    def setFindAllMatches(value: Boolean): Self = this.set("findAllMatches", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFindAllMatches: Self = this.set("findAllMatches", js.undefined)
    @scala.inline
    def setGetFn(value: (/* obj */ js.Any, /* path */ String) => _): Self = this.set("getFn", js.Any.fromFunction2(value))
    @scala.inline
    def deleteGetFn: Self = this.set("getFn", js.undefined)
    @scala.inline
    def setId(value: /* keyof T */ String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setIncludeMatches(value: Boolean): Self = this.set("includeMatches", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIncludeMatches: Self = this.set("includeMatches", js.undefined)
    @scala.inline
    def setIncludeScore(value: Boolean): Self = this.set("includeScore", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIncludeScore: Self = this.set("includeScore", js.undefined)
    @scala.inline
    def setKeysVarargs(value: (Name[T] | (/* keyof T */ String))*): Self = this.set("keys", js.Array(value :_*))
    @scala.inline
    def setKeys(value: js.Array[Name[T] | (/* keyof T */ String)]): Self = this.set("keys", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeys: Self = this.set("keys", js.undefined)
    @scala.inline
    def setLocation(value: Double): Self = this.set("location", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocation: Self = this.set("location", js.undefined)
    @scala.inline
    def setMatchAllTokens(value: Boolean): Self = this.set("matchAllTokens", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMatchAllTokens: Self = this.set("matchAllTokens", js.undefined)
    @scala.inline
    def setMaxPatternLength(value: Double): Self = this.set("maxPatternLength", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxPatternLength: Self = this.set("maxPatternLength", js.undefined)
    @scala.inline
    def setMinMatchCharLength(value: Double): Self = this.set("minMatchCharLength", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinMatchCharLength: Self = this.set("minMatchCharLength", js.undefined)
    @scala.inline
    def setShouldSort(value: Boolean): Self = this.set("shouldSort", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShouldSort: Self = this.set("shouldSort", js.undefined)
    @scala.inline
    def setSortFn(value: (/* a */ Score, /* b */ Score) => Double): Self = this.set("sortFn", js.Any.fromFunction2(value))
    @scala.inline
    def deleteSortFn: Self = this.set("sortFn", js.undefined)
    @scala.inline
    def setThreshold(value: Double): Self = this.set("threshold", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteThreshold: Self = this.set("threshold", js.undefined)
    @scala.inline
    def setTokenSeparator(value: RegExp): Self = this.set("tokenSeparator", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTokenSeparator: Self = this.set("tokenSeparator", js.undefined)
    @scala.inline
    def setTokenize(value: Boolean): Self = this.set("tokenize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTokenize: Self = this.set("tokenize", js.undefined)
    @scala.inline
    def setVerbose(value: Boolean): Self = this.set("verbose", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVerbose: Self = this.set("verbose", js.undefined)
  }
  
}

