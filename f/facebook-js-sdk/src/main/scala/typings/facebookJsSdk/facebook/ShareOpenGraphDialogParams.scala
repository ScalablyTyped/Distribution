package typings.facebookJsSdk.facebook

import org.scalablytyped.runtime.StringDictionary
import typings.facebookJsSdk.facebookJsSdkBooleans.`false`
import typings.facebookJsSdk.facebookJsSdkStrings.share_open_graph
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
  implicit class ShareOpenGraphDialogParamsOps[Self <: ShareOpenGraphDialogParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAction_properties(value: StringDictionary[js.Any]): Self = this.set("action_properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAction_type(value: String): Self = this.set("action_type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHref(value: String): Self = this.set("href", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMethod(value: share_open_graph): Self = this.set("method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHashtag(value: String): Self = this.set("hashtag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHashtag: Self = this.set("hashtag", js.undefined)
    
    @scala.inline
    def setMobile_iframe(value: `false`): Self = this.set("mobile_iframe", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMobile_iframe: Self = this.set("mobile_iframe", js.undefined)
    
    @scala.inline
    def setQuote(value: String): Self = this.set("quote", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQuote: Self = this.set("quote", js.undefined)
  }
}
