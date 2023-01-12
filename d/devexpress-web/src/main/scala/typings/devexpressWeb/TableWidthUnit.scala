package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains settings defining the table width's measurement units and value.
  */
trait TableWidthUnit extends StObject {
  
  /**
    * Gets or sets the unit type for the table width.
    */
  var `type`: TableWidthUnitType
  
  /**
    * Gets or sets the table width value in twips.
    */
  var value: Double
}
object TableWidthUnit {
  
  inline def apply(`type`: TableWidthUnitType, value: Double): TableWidthUnit = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableWidthUnit]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TableWidthUnit] (val x: Self) extends AnyVal {
    
    inline def setType(value: TableWidthUnitType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
