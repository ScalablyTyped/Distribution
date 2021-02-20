package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientGridView.ColumnMoving event.
  */
@js.native
trait ASPxClientGridViewColumnMovingEventArgs extends ASPxClientEventArgs {
  
  /**
    * Gets or sets whether a column is allowed to be moved.
    */
  var allow: Boolean = js.native
  
  /**
    * Gets the target column, before or after which the source column will be inserted (if dropped).
    */
  var destinationColumn: ASPxClientGridViewColumn = js.native
  
  /**
    * Gets whether the source column will be inserted before the target column (if dropped).
    */
  var isDropBefore: Boolean = js.native
  
  /**
    * Gets whether the source column is currently over the Group Panel.
    */
  var isGroupPanel: Boolean = js.native
  
  /**
    * Gets the column currently being dragged by an end-user.
    */
  var sourceColumn: ASPxClientGridViewColumn = js.native
}
object ASPxClientGridViewColumnMovingEventArgs {
  
  @scala.inline
  def apply(
    allow: Boolean,
    destinationColumn: ASPxClientGridViewColumn,
    isDropBefore: Boolean,
    isGroupPanel: Boolean,
    sourceColumn: ASPxClientGridViewColumn
  ): ASPxClientGridViewColumnMovingEventArgs = {
    val __obj = js.Dynamic.literal(allow = allow.asInstanceOf[js.Any], destinationColumn = destinationColumn.asInstanceOf[js.Any], isDropBefore = isDropBefore.asInstanceOf[js.Any], isGroupPanel = isGroupPanel.asInstanceOf[js.Any], sourceColumn = sourceColumn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientGridViewColumnMovingEventArgs]
  }
  
  @scala.inline
  implicit class ASPxClientGridViewColumnMovingEventArgsMutableBuilder[Self <: ASPxClientGridViewColumnMovingEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllow(value: Boolean): Self = StObject.set(x, "allow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestinationColumn(value: ASPxClientGridViewColumn): Self = StObject.set(x, "destinationColumn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsDropBefore(value: Boolean): Self = StObject.set(x, "isDropBefore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsGroupPanel(value: Boolean): Self = StObject.set(x, "isGroupPanel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceColumn(value: ASPxClientGridViewColumn): Self = StObject.set(x, "sourceColumn", value.asInstanceOf[js.Any])
  }
}
