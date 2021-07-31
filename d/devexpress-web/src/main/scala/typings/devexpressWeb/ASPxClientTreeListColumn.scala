package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a client column.
  */
trait ASPxClientTreeListColumn extends StObject {
  
  /**
    * Gets the name of the database field assigned to the current column.
    */
  var fieldName: String
  
  /**
    * Gets the column's position within the collection.
    */
  var index: Double
  
  /**
    * Gets the name that uniquely identifies the column.
    */
  var name: String
}
object ASPxClientTreeListColumn {
  
  @scala.inline
  def apply(fieldName: String, index: Double, name: String): ASPxClientTreeListColumn = {
    val __obj = js.Dynamic.literal(fieldName = fieldName.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientTreeListColumn]
  }
  
  @scala.inline
  implicit class ASPxClientTreeListColumnMutableBuilder[Self <: ASPxClientTreeListColumn] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFieldName(value: String): Self = StObject.set(x, "fieldName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
