package typings
package dynogelsLib.dynogelsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConsumedCapacity extends js.Object {
  var CapacityUnits: scala.Double
  var TableName: java.lang.String
}

object ConsumedCapacity {
  @scala.inline
  def apply(CapacityUnits: scala.Double, TableName: java.lang.String): ConsumedCapacity = {
    val __obj = js.Dynamic.literal(CapacityUnits = CapacityUnits, TableName = TableName)
  
    __obj.asInstanceOf[ConsumedCapacity]
  }
}

