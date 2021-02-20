package typings.facebookJsSdk.facebook

import typings.facebookJsSdk.facebookJsSdkStrings.share
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ShareDialogParams extends DialogParams {
  
  var hashtag: js.UndefOr[String] = js.native
  
  var href: String = js.native
  
  var method: share = js.native
  
  var mobile_iframe: js.UndefOr[Boolean] = js.native
  
  var quote: js.UndefOr[String] = js.native
}
object ShareDialogParams {
  
  @scala.inline
  def apply(href: String, method: share): ShareDialogParams = {
    val __obj = js.Dynamic.literal(href = href.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShareDialogParams]
  }
  
  @scala.inline
  implicit class ShareDialogParamsMutableBuilder[Self <: ShareDialogParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHashtag(value: String): Self = StObject.set(x, "hashtag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHashtagUndefined: Self = StObject.set(x, "hashtag", js.undefined)
    
    @scala.inline
    def setHref(value: String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMethod(value: share): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMobile_iframe(value: Boolean): Self = StObject.set(x, "mobile_iframe", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMobile_iframeUndefined: Self = StObject.set(x, "mobile_iframe", js.undefined)
    
    @scala.inline
    def setQuote(value: String): Self = StObject.set(x, "quote", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuoteUndefined: Self = StObject.set(x, "quote", js.undefined)
  }
}
