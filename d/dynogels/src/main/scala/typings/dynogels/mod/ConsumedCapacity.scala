package typings.dynogels.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConsumedCapacity extends js.Object {
  var CapacityUnits: Double
  var TableName: String
}

object ConsumedCapacity {
  @scala.inline
  def apply(CapacityUnits: Double, TableName: String): ConsumedCapacity = {
    val __obj = js.Dynamic.literal(CapacityUnits = CapacityUnits.asInstanceOf[js.Any], TableName = TableName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConsumedCapacity]
  }
}

