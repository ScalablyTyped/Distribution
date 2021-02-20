package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A client grid column.
  */
@js.native
trait ASPxClientGridViewColumn extends ASPxClientGridColumnBase {
  
  /**
    * Gets the name of the database field assigned to the current column.
    */
  var fieldName: String = js.native
  
  /** @deprecated Use the name property instead. */
  /**
    * Gets the column's unique identifier.
    */
  var id: String = js.native
  
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
object ASPxClientGridViewColumn {
  
  @scala.inline
  def apply(fieldName: String, id: String, index: Double, name: String, visible: Boolean): ASPxClientGridViewColumn = {
    val __obj = js.Dynamic.literal(fieldName = fieldName.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientGridViewColumn]
  }
  
  @scala.inline
  implicit class ASPxClientGridViewColumnMutableBuilder[Self <: ASPxClientGridViewColumn] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFieldName(value: String): Self = StObject.set(x, "fieldName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
  }
}
