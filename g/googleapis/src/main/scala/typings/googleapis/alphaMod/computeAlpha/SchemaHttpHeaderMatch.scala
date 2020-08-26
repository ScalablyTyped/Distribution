package typings.googleapis.alphaMod.computeAlpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * matchRule criteria for request header matches.
  */
@js.native
trait SchemaHttpHeaderMatch extends js.Object {
  /**
    * The value should exactly match contents of exactMatch. Only one of
    * exactMatch, prefixMatch, suffixMatch, regexMatch, presentMatch or
    * rangeMatch must be set.
    */
  var exactMatch: js.UndefOr[String] = js.native
  /**
    * The name of the HTTP header to match. For matching against the HTTP
    * request&#39;s authority, use a headerMatch with the header name
    * &quot;:authority&quot;. For matching a request&#39;s method, use the
    * headerName &quot;:method&quot;.
    */
  var headerName: js.UndefOr[String] = js.native
  /**
    * If set to false, the headerMatch is considered a match if the match
    * criteria above are met. If set to true, the headerMatch is considered a
    * match if the match criteria above are NOT met. The default setting is
    * false.
    */
  var invertMatch: js.UndefOr[Boolean] = js.native
  /**
    * The value of the header must start with the contents of prefixMatch. Only
    * one of exactMatch, prefixMatch, suffixMatch, regexMatch, presentMatch or
    * rangeMatch must be set.
    */
  var prefixMatch: js.UndefOr[String] = js.native
  /**
    * A header with the contents of headerName must exist. The match takes
    * place whether or not the request&#39;s header has a value or not. Only
    * one of exactMatch, prefixMatch, suffixMatch, regexMatch, presentMatch or
    * rangeMatch must be set.
    */
  var presentMatch: js.UndefOr[Boolean] = js.native
  /**
    * The header value must be an integer and its value must be in the range
    * specified in rangeMatch. If the header does not contain an integer,
    * number or is empty, the match fails. For example for a range [-5, 0]   -
    * -3 will match.  - 0 will not match.  - 0.25 will not match.  -
    * -3someString will not match.   Only one of exactMatch, prefixMatch,
    * suffixMatch, regexMatch, presentMatch or rangeMatch must be set.
    */
  var rangeMatch: js.UndefOr[SchemaInt64RangeMatch] = js.native
  /**
    * The value of the header must match the regualar expression specified in
    * regexMatch. For regular expression grammar, please see:
    * en.cppreference.com/w/cpp/regex/ecmascript  For matching against a port
    * specified in the HTTP request, use a headerMatch with headerName set to
    * PORT and a regular expression that satisfies the RFC2616 Host
    * header&#39;s port specifier. Only one of exactMatch, prefixMatch,
    * suffixMatch, regexMatch, presentMatch or rangeMatch must be set.
    */
  var regexMatch: js.UndefOr[String] = js.native
  /**
    * The value of the header must end with the contents of suffixMatch. Only
    * one of exactMatch, prefixMatch, suffixMatch, regexMatch, presentMatch or
    * rangeMatch must be set.
    */
  var suffixMatch: js.UndefOr[String] = js.native
}

object SchemaHttpHeaderMatch {
  @scala.inline
  def apply(): SchemaHttpHeaderMatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaHttpHeaderMatch]
  }
  @scala.inline
  implicit class SchemaHttpHeaderMatchOps[Self <: SchemaHttpHeaderMatch] (val x: Self) extends AnyVal {
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
    def setExactMatch(value: String): Self = this.set("exactMatch", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExactMatch: Self = this.set("exactMatch", js.undefined)
    @scala.inline
    def setHeaderName(value: String): Self = this.set("headerName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaderName: Self = this.set("headerName", js.undefined)
    @scala.inline
    def setInvertMatch(value: Boolean): Self = this.set("invertMatch", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInvertMatch: Self = this.set("invertMatch", js.undefined)
    @scala.inline
    def setPrefixMatch(value: String): Self = this.set("prefixMatch", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrefixMatch: Self = this.set("prefixMatch", js.undefined)
    @scala.inline
    def setPresentMatch(value: Boolean): Self = this.set("presentMatch", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePresentMatch: Self = this.set("presentMatch", js.undefined)
    @scala.inline
    def setRangeMatch(value: SchemaInt64RangeMatch): Self = this.set("rangeMatch", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRangeMatch: Self = this.set("rangeMatch", js.undefined)
    @scala.inline
    def setRegexMatch(value: String): Self = this.set("regexMatch", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRegexMatch: Self = this.set("regexMatch", js.undefined)
    @scala.inline
    def setSuffixMatch(value: String): Self = this.set("suffixMatch", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSuffixMatch: Self = this.set("suffixMatch", js.undefined)
  }
  
}

