package typings.elasticsearch.elasticsearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExplainResponseDetails extends js.Object {
  var description: String
  var details: js.Array[ExplainResponseDetails]
  var value: Double
}

object ExplainResponseDetails {
  @scala.inline
  def apply(description: String, details: js.Array[ExplainResponseDetails], value: Double): ExplainResponseDetails = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ExplainResponseDetails]
  }
}

