package typings.gapiAnalytics

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait View extends StObject {
  
  var accountId: js.UndefOr[String] = js.native
  
  var webPropertyId: js.UndefOr[String] = js.native
  
  var webViewId: js.UndefOr[String] = js.native
}
object View {
  
  @scala.inline
  def apply(): View = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[View]
  }
  
  @scala.inline
  implicit class ViewMutableBuilder[Self <: View] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
    
    @scala.inline
    def setWebPropertyId(value: String): Self = StObject.set(x, "webPropertyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebPropertyIdUndefined: Self = StObject.set(x, "webPropertyId", js.undefined)
    
    @scala.inline
    def setWebViewId(value: String): Self = StObject.set(x, "webViewId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebViewIdUndefined: Self = StObject.set(x, "webViewId", js.undefined)
  }
}
