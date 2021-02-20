package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientCardView.BatchEditCardValidating event.
  */
@js.native
trait ASPxClientCardViewBatchEditCardValidatingEventArgs extends ASPxClientEventArgs {
  
  /**
    * Provides validation information of a card currently being validated.
    */
  var validationInfo: js.Any = js.native
  
  /**
    * Gets the processed card's visible index.
    */
  var visibleIndex: Double = js.native
}
object ASPxClientCardViewBatchEditCardValidatingEventArgs {
  
  @scala.inline
  def apply(validationInfo: js.Any, visibleIndex: Double): ASPxClientCardViewBatchEditCardValidatingEventArgs = {
    val __obj = js.Dynamic.literal(validationInfo = validationInfo.asInstanceOf[js.Any], visibleIndex = visibleIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientCardViewBatchEditCardValidatingEventArgs]
  }
  
  @scala.inline
  implicit class ASPxClientCardViewBatchEditCardValidatingEventArgsMutableBuilder[Self <: ASPxClientCardViewBatchEditCardValidatingEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setValidationInfo(value: js.Any): Self = StObject.set(x, "validationInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibleIndex(value: Double): Self = StObject.set(x, "visibleIndex", value.asInstanceOf[js.Any])
  }
}
