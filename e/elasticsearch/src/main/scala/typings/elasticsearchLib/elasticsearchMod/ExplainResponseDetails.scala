package typings
package elasticsearchLib.elasticsearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExplainResponseDetails extends js.Object {
  var description: java.lang.String
  var details: js.Array[ExplainResponseDetails]
  var value: scala.Double
}

object ExplainResponseDetails {
  @scala.inline
  def apply(description: java.lang.String, details: js.Array[ExplainResponseDetails], value: scala.Double): ExplainResponseDetails = {
    val __obj = js.Dynamic.literal(description = description, details = details, value = value)
  
    __obj.asInstanceOf[ExplainResponseDetails]
  }
}

