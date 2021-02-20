package typings.facebookJsSdk.facebook

import typings.facebookJsSdk.facebookJsSdkStrings.async
import typings.facebookJsSdk.facebookJsSdkStrings.iframe
import typings.facebookJsSdk.facebookJsSdkStrings.page
import typings.facebookJsSdk.facebookJsSdkStrings.popup
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

////////////////////////
//
//  DIALOGS
//
////////////////////////
@js.native
trait DialogParams extends StObject {
  
  var app_id: js.UndefOr[String] = js.native
  
  var display: js.UndefOr[page | iframe | async | popup] = js.native
  
  var redirect_uri: js.UndefOr[String] = js.native
}
object DialogParams {
  
  @scala.inline
  def apply(): DialogParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DialogParams]
  }
  
  @scala.inline
  implicit class DialogParamsMutableBuilder[Self <: DialogParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApp_id(value: String): Self = StObject.set(x, "app_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApp_idUndefined: Self = StObject.set(x, "app_id", js.undefined)
    
    @scala.inline
    def setDisplay(value: page | iframe | async | popup): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayUndefined: Self = StObject.set(x, "display", js.undefined)
    
    @scala.inline
    def setRedirect_uri(value: String): Self = StObject.set(x, "redirect_uri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRedirect_uriUndefined: Self = StObject.set(x, "redirect_uri", js.undefined)
  }
}
