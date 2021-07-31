package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientGridView.BatchEditRowValidating event.
  */
trait ASPxClientGridViewBatchEditRowValidatingEventArgs
  extends StObject
     with ASPxClientEventArgs {
  
  /**
    * Gets the row's key.
    */
  var key: js.Any
  
  /**
    * Provides validation information of a row currently being validated.
    */
  var validationInfo: js.Any
  
  /**
    * Gets the processed row's visible index.
    */
  var visibleIndex: Double
}
object ASPxClientGridViewBatchEditRowValidatingEventArgs {
  
  @scala.inline
  def apply(key: js.Any, validationInfo: js.Any, visibleIndex: Double): ASPxClientGridViewBatchEditRowValidatingEventArgs = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], validationInfo = validationInfo.asInstanceOf[js.Any], visibleIndex = visibleIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientGridViewBatchEditRowValidatingEventArgs]
  }
  
  @scala.inline
  implicit class ASPxClientGridViewBatchEditRowValidatingEventArgsMutableBuilder[Self <: ASPxClientGridViewBatchEditRowValidatingEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKey(value: js.Any): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidationInfo(value: js.Any): Self = StObject.set(x, "validationInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibleIndex(value: Double): Self = StObject.set(x, "visibleIndex", value.asInstanceOf[js.Any])
  }
}
