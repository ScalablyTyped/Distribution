package typings.facebookJsSdk.facebook

import org.scalablytyped.runtime.StringDictionary
import typings.facebookJsSdk.facebookJsSdkBooleans.`false`
import typings.facebookJsSdk.facebookJsSdkStrings.share_open_graph
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ShareOpenGraphDialogParams
  extends StObject
     with DialogParams {
  
  var action_properties: StringDictionary[Any]
  
  var action_type: String
  
  var hashtag: js.UndefOr[String] = js.undefined
  
  var href: String
  
  var method: share_open_graph
  
  var mobile_iframe: js.UndefOr[`false`] = js.undefined
  
  var quote: js.UndefOr[String] = js.undefined
}
object ShareOpenGraphDialogParams {
  
  inline def apply(action_properties: StringDictionary[Any], action_type: String, href: String): ShareOpenGraphDialogParams = {
    val __obj = js.Dynamic.literal(action_properties = action_properties.asInstanceOf[js.Any], action_type = action_type.asInstanceOf[js.Any], href = href.asInstanceOf[js.Any], method = "share_open_graph")
    __obj.asInstanceOf[ShareOpenGraphDialogParams]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ShareOpenGraphDialogParams] (val x: Self) extends AnyVal {
    
    inline def setAction_properties(value: StringDictionary[Any]): Self = StObject.set(x, "action_properties", value.asInstanceOf[js.Any])
    
    inline def setAction_type(value: String): Self = StObject.set(x, "action_type", value.asInstanceOf[js.Any])
    
    inline def setHashtag(value: String): Self = StObject.set(x, "hashtag", value.asInstanceOf[js.Any])
    
    inline def setHashtagUndefined: Self = StObject.set(x, "hashtag", js.undefined)
    
    inline def setHref(value: String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
    
    inline def setMethod(value: share_open_graph): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setMobile_iframe(value: `false`): Self = StObject.set(x, "mobile_iframe", value.asInstanceOf[js.Any])
    
    inline def setMobile_iframeUndefined: Self = StObject.set(x, "mobile_iframe", js.undefined)
    
    inline def setQuote(value: String): Self = StObject.set(x, "quote", value.asInstanceOf[js.Any])
    
    inline def setQuoteUndefined: Self = StObject.set(x, "quote", js.undefined)
  }
}
