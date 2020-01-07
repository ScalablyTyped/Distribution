package typings.googleapis.buildSrcApisCloudsearchV1Mod.cloudsearch_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$SpellResult extends js.Object {
  /**
    * The suggested spelling of the query.
    */
  var suggestedQuery: js.UndefOr[String] = js.native
}

object Schema$SpellResult {
  @scala.inline
  def apply(suggestedQuery: String = null): Schema$SpellResult = {
    val __obj = js.Dynamic.literal()
    if (suggestedQuery != null) __obj.updateDynamic("suggestedQuery")(suggestedQuery.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$SpellResult]
  }
}

