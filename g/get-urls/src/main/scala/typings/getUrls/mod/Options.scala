package typings.getUrls.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options
  extends typings.normalizeUrl.mod.Options {
  /**
  		Exclude URLs that match URLs in the given array.
  		@default []
  		*/
  val exclude: js.UndefOr[js.Array[String]] = js.native
  /**
  		Extract URLs that appear as query parameters in the found URLs.
  		@default false
  		*/
  val extractFromQueryString: js.UndefOr[Boolean] = js.native
  /**
  		Require URLs to have a scheme or leading `www.` to be considered an URL. When `false`, matches against a list of valid TLDs, so it will match URLs like `unicorn.education`.
  		Does not affect URLs in query parameters if using the `extractFromQueryString` option.
  		@default true
  		*/
  val requireSchemeOrWww: js.UndefOr[Boolean] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
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
    def setExcludeVarargs(value: String*): Self = this.set("exclude", js.Array(value :_*))
    @scala.inline
    def setExclude(value: js.Array[String]): Self = this.set("exclude", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExclude: Self = this.set("exclude", js.undefined)
    @scala.inline
    def setExtractFromQueryString(value: Boolean): Self = this.set("extractFromQueryString", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExtractFromQueryString: Self = this.set("extractFromQueryString", js.undefined)
    @scala.inline
    def setRequireSchemeOrWww(value: Boolean): Self = this.set("requireSchemeOrWww", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequireSchemeOrWww: Self = this.set("requireSchemeOrWww", js.undefined)
  }
  
}

