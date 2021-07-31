package typings.dynogels.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConsumedCapacity extends StObject {
  
  var CapacityUnits: Double
  
  var TableName: String
}
object ConsumedCapacity {
  
  @scala.inline
  def apply(CapacityUnits: Double, TableName: String): ConsumedCapacity = {
    val __obj = js.Dynamic.literal(CapacityUnits = CapacityUnits.asInstanceOf[js.Any], TableName = TableName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConsumedCapacity]
  }
  
  @scala.inline
  implicit class ConsumedCapacityMutableBuilder[Self <: ConsumedCapacity] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCapacityUnits(value: Double): Self = StObject.set(x, "CapacityUnits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTableName(value: String): Self = StObject.set(x, "TableName", value.asInstanceOf[js.Any])
  }
}
