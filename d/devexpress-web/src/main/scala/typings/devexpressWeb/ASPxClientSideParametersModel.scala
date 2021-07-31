package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ASPxClientSideParametersModel extends StObject {
  
  def serializeParameters(): Unit
  
  def submit(): Unit
  
  var tabInfo: ASPxClientDocumentPreviewTab
}
object ASPxClientSideParametersModel {
  
  @scala.inline
  def apply(serializeParameters: () => Unit, submit: () => Unit, tabInfo: ASPxClientDocumentPreviewTab): ASPxClientSideParametersModel = {
    val __obj = js.Dynamic.literal(serializeParameters = js.Any.fromFunction0(serializeParameters), submit = js.Any.fromFunction0(submit), tabInfo = tabInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientSideParametersModel]
  }
  
  @scala.inline
  implicit class ASPxClientSideParametersModelMutableBuilder[Self <: ASPxClientSideParametersModel] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSerializeParameters(value: () => Unit): Self = StObject.set(x, "serializeParameters", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSubmit(value: () => Unit): Self = StObject.set(x, "submit", js.Any.fromFunction0(value))
    
    @scala.inline
    def setTabInfo(value: ASPxClientDocumentPreviewTab): Self = StObject.set(x, "tabInfo", value.asInstanceOf[js.Any])
  }
}
