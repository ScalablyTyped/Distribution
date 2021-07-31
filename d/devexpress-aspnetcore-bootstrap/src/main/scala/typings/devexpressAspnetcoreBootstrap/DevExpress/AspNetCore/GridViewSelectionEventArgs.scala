package typings.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GridViewSelectionEventArgs
  extends StObject
     with ProcessingModeEventArgs {
  
  val isAllRecordsOnPage: Boolean
  
  val isChangedOnServer: Boolean
  
  val isSelected: Boolean
  
  val visibleIndex: Double
}
object GridViewSelectionEventArgs {
  
  @scala.inline
  def apply(
    isAllRecordsOnPage: Boolean,
    isChangedOnServer: Boolean,
    isSelected: Boolean,
    processOnServer: Boolean,
    sender: Control,
    visibleIndex: Double
  ): GridViewSelectionEventArgs = {
    val __obj = js.Dynamic.literal(isAllRecordsOnPage = isAllRecordsOnPage.asInstanceOf[js.Any], isChangedOnServer = isChangedOnServer.asInstanceOf[js.Any], isSelected = isSelected.asInstanceOf[js.Any], processOnServer = processOnServer.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any], visibleIndex = visibleIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[GridViewSelectionEventArgs]
  }
  
  @scala.inline
  implicit class GridViewSelectionEventArgsMutableBuilder[Self <: GridViewSelectionEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIsAllRecordsOnPage(value: Boolean): Self = StObject.set(x, "isAllRecordsOnPage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsChangedOnServer(value: Boolean): Self = StObject.set(x, "isChangedOnServer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsSelected(value: Boolean): Self = StObject.set(x, "isSelected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibleIndex(value: Double): Self = StObject.set(x, "visibleIndex", value.asInstanceOf[js.Any])
  }
}
