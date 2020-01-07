package typings.googleapis.buildSrcApisCloudsearchV1Mod.cloudsearch_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$QueryInterpretation extends js.Object {
  var interpretationType: js.UndefOr[String] = js.native
  /**
    * The interpretation of the query used in search. For example, query
    * &quot;email from john&quot; will be interpreted as &quot;from:john
    * source:mail&quot;
    */
  var interpretedQuery: js.UndefOr[String] = js.native
}

object Schema$QueryInterpretation {
  @scala.inline
  def apply(interpretationType: String = null, interpretedQuery: String = null): Schema$QueryInterpretation = {
    val __obj = js.Dynamic.literal()
    if (interpretationType != null) __obj.updateDynamic("interpretationType")(interpretationType.asInstanceOf[js.Any])
    if (interpretedQuery != null) __obj.updateDynamic("interpretedQuery")(interpretedQuery.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$QueryInterpretation]
  }
}

