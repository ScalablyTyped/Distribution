package typings.facebookJsSdk.facebook

import org.scalablytyped.runtime.StringDictionary
import typings.facebookJsSdk.facebookJsSdkBooleans.`false`
import typings.facebookJsSdk.facebookJsSdkStrings.share_open_graph
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ShareOpenGraphDialogParams extends DialogParams {
  
  var action_properties: StringDictionary[js.Any] = js.native
  
  var action_type: String = js.native
  
  var hashtag: js.UndefOr[String] = js.native
  
  var href: String = js.native
  
  var method: share_open_graph = js.native
  
  var mobile_iframe: js.UndefOr[`false`] = js.native
  
  var quote: js.UndefOr[String] = js.native
}
object ShareOpenGraphDialogParams {
  
  @scala.inline
  def apply(
    action_properties: StringDictionary[js.Any],
    action_type: String,
    href: String,
    method: share_open_graph
  ): ShareOpenGraphDialogParams = {
    val __obj = js.Dynamic.literal(action_properties = action_properties.asInstanceOf[js.Any], action_type = action_type.asInstanceOf[js.Any], href = href.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShareOpenGraphDialogParams]
  }
  
  @scala.inline
  implicit class ShareOpenGraphDialogParamsMutableBuilder[Self <: ShareOpenGraphDialogParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAction_properties(value: StringDictionary[js.Any]): Self = StObject.set(x, "action_properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAction_type(value: String): Self = StObject.set(x, "action_type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHashtag(value: String): Self = StObject.set(x, "hashtag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHashtagUndefined: Self = StObject.set(x, "hashtag", js.undefined)
    
    @scala.inline
    def setHref(value: String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMethod(value: share_open_graph): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMobile_iframe(value: `false`): Self = StObject.set(x, "mobile_iframe", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMobile_iframeUndefined: Self = StObject.set(x, "mobile_iframe", js.undefined)
    
    @scala.inline
    def setQuote(value: String): Self = StObject.set(x, "quote", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuoteUndefined: Self = StObject.set(x, "quote", js.undefined)
  }
}
