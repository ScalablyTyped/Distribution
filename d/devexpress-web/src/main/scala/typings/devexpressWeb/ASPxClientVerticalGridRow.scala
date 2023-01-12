package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A client grid row.
  */
trait ASPxClientVerticalGridRow
  extends StObject
     with ASPxClientGridColumnBase {
  
  /**
    * Gets the name of the database field assigned to the current row.
    */
  var fieldName: String
  
  /**
    * Gets the row's position within the collection.
    */
  var index: Double
  
  /**
    * Gets the name that uniquely identifies the row.
    */
  var name: String
  
  /**
    * Gets whether the row is visible.
    */
  var visible: Boolean
}
object ASPxClientVerticalGridRow {
  
  inline def apply(fieldName: String, index: Double, name: String, visible: Boolean): ASPxClientVerticalGridRow = {
    val __obj = js.Dynamic.literal(fieldName = fieldName.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientVerticalGridRow]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ASPxClientVerticalGridRow] (val x: Self) extends AnyVal {
    
    inline def setFieldName(value: String): Self = StObject.set(x, "fieldName", value.asInstanceOf[js.Any])
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
  }
}
