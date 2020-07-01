package typings.googleapis.alphaMod.computeAlpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * HttpRouteRuleMatch criteria for a request&#39;s query parameter.
  */
@js.native
trait SchemaHttpQueryParameterMatch extends js.Object {
  /**
    * The queryParameterMatch matches if the value of the parameter exactly
    * matches the contents of exactMatch. Only one of presentMatch, exactMatch
    * and regexMatch must be set.
    */
  var exactMatch: js.UndefOr[String] = js.native
  /**
    * The name of the query parameter to match. The query parameter must exist
    * in the request, in the absence of which the request match fails.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Specifies that the queryParameterMatch matches if the request contains
    * the query parameter, irrespective of whether the parameter has a value or
    * not. Only one of presentMatch, exactMatch and regexMatch must be set.
    */
  var presentMatch: js.UndefOr[Boolean] = js.native
  /**
    * The queryParameterMatch matches if the value of the parameter matches the
    * regular expression specified by regexMatch. For the regular expression
    * grammar, please see en.cppreference.com/w/cpp/regex/ecmascript  Only one
    * of presentMatch, exactMatch and regexMatch must be set.
    */
  var regexMatch: js.UndefOr[String] = js.native
}

object SchemaHttpQueryParameterMatch {
  @scala.inline
  def apply(
    exactMatch: String = null,
    name: String = null,
    presentMatch: js.UndefOr[Boolean] = js.undefined,
    regexMatch: String = null
  ): SchemaHttpQueryParameterMatch = {
    val __obj = js.Dynamic.literal()
    if (exactMatch != null) __obj.updateDynamic("exactMatch")(exactMatch.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(presentMatch)) __obj.updateDynamic("presentMatch")(presentMatch.get.asInstanceOf[js.Any])
    if (regexMatch != null) __obj.updateDynamic("regexMatch")(regexMatch.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaHttpQueryParameterMatch]
  }
}

