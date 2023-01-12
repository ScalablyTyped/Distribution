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
  
  inline def apply(serializeParameters: () => Unit, submit: () => Unit, tabInfo: ASPxClientDocumentPreviewTab): ASPxClientSideParametersModel = {
    val __obj = js.Dynamic.literal(serializeParameters = js.Any.fromFunction0(serializeParameters), submit = js.Any.fromFunction0(submit), tabInfo = tabInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientSideParametersModel]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ASPxClientSideParametersModel] (val x: Self) extends AnyVal {
    
    inline def setSerializeParameters(value: () => Unit): Self = StObject.set(x, "serializeParameters", js.Any.fromFunction0(value))
    
    inline def setSubmit(value: () => Unit): Self = StObject.set(x, "submit", js.Any.fromFunction0(value))
    
    inline def setTabInfo(value: ASPxClientDocumentPreviewTab): Self = StObject.set(x, "tabInfo", value.asInstanceOf[js.Any])
  }
}
