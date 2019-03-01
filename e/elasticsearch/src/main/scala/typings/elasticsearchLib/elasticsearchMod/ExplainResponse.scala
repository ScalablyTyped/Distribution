package typings
package elasticsearchLib.elasticsearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExplainResponse extends js.Object {
  var _id: java.lang.String
  var _index: java.lang.String
  var _type: java.lang.String
  var explanation: ExplainResponseDetails
  var matched: scala.Boolean
}

object ExplainResponse {
  @scala.inline
  def apply(
    _id: java.lang.String,
    _index: java.lang.String,
    _type: java.lang.String,
    explanation: ExplainResponseDetails,
    matched: scala.Boolean
  ): ExplainResponse = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("_id")(_id)
    __obj.updateDynamic("_index")(_index)
    __obj.updateDynamic("_type")(_type)
    __obj.updateDynamic("explanation")(explanation)
    __obj.updateDynamic("matched")(matched)
    __obj.asInstanceOf[ExplainResponse]
  }
}

