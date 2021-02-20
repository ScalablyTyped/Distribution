package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A client grid row.
  */
@js.native
trait ASPxClientVerticalGridRow extends ASPxClientGridColumnBase {
  
  /**
    * Gets the name of the database field assigned to the current row.
    */
  var fieldName: String = js.native
  
  /**
    * Gets the row's position within the collection.
    */
  var index: Double = js.native
  
  /**
    * Gets the name that uniquely identifies the row.
    */
  var name: String = js.native
  
  /**
    * Gets whether the row is visible.
    */
  var visible: Boolean = js.native
}
object ASPxClientVerticalGridRow {
  
  @scala.inline
  def apply(fieldName: String, index: Double, name: String, visible: Boolean): ASPxClientVerticalGridRow = {
    val __obj = js.Dynamic.literal(fieldName = fieldName.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientVerticalGridRow]
  }
  
  @scala.inline
  implicit class ASPxClientVerticalGridRowMutableBuilder[Self <: ASPxClientVerticalGridRow] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFieldName(value: String): Self = StObject.set(x, "fieldName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
  }
}
