package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a client column.
  */
@js.native
trait ASPxClientCardViewColumn extends ASPxClientGridColumnBase {
  
  /**
    * Gets the name of the database field assigned to the current column.
    */
  var fieldName: String = js.native
  
  /**
    * Gets the column's position within the collection.
    */
  var index: Double = js.native
  
  /**
    * Gets the name that uniquely identifies the column.
    */
  var name: String = js.native
  
  /**
    * Gets whether the column is visible.
    */
  var visible: Boolean = js.native
}
object ASPxClientCardViewColumn {
  
  @scala.inline
  def apply(fieldName: String, index: Double, name: String, visible: Boolean): ASPxClientCardViewColumn = {
    val __obj = js.Dynamic.literal(fieldName = fieldName.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientCardViewColumn]
  }
  
  @scala.inline
  implicit class ASPxClientCardViewColumnMutableBuilder[Self <: ASPxClientCardViewColumn] (val x: Self) extends AnyVal {
    
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
