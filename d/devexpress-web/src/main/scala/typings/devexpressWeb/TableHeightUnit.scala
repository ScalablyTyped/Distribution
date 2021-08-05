package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains settings defining the table height's measurement units and value.
  */
trait TableHeightUnit extends StObject {
  
  /**
    * Gets or sets the unit type for the table height.
    */
  var `type`: TableHeightUnitType
  
  /**
    * Gets or sets the table height value in twips.
    */
  var value: Double
}
object TableHeightUnit {
  
  inline def apply(`type`: TableHeightUnitType, value: Double): TableHeightUnit = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableHeightUnit]
  }
  
  extension [Self <: TableHeightUnit](x: Self) {
    
    inline def setType(value: TableHeightUnitType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
