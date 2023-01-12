package typings.facebookJsSdk.facebook

import typings.facebookJsSdk.facebookJsSdkStrings.async
import typings.facebookJsSdk.facebookJsSdkStrings.iframe
import typings.facebookJsSdk.facebookJsSdkStrings.page
import typings.facebookJsSdk.facebookJsSdkStrings.popup
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

////////////////////////
//
//  DIALOGS
//
////////////////////////
trait DialogParams extends StObject {
  
  var app_id: js.UndefOr[String] = js.undefined
  
  var display: js.UndefOr[page | iframe | async | popup] = js.undefined
  
  var redirect_uri: js.UndefOr[String] = js.undefined
}
object DialogParams {
  
  inline def apply(): DialogParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DialogParams]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DialogParams] (val x: Self) extends AnyVal {
    
    inline def setApp_id(value: String): Self = StObject.set(x, "app_id", value.asInstanceOf[js.Any])
    
    inline def setApp_idUndefined: Self = StObject.set(x, "app_id", js.undefined)
    
    inline def setDisplay(value: page | iframe | async | popup): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
    
    inline def setDisplayUndefined: Self = StObject.set(x, "display", js.undefined)
    
    inline def setRedirect_uri(value: String): Self = StObject.set(x, "redirect_uri", value.asInstanceOf[js.Any])
    
    inline def setRedirect_uriUndefined: Self = StObject.set(x, "redirect_uri", js.undefined)
  }
}
