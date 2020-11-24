package typings.dompurify.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SanitizeElementHookEvent extends _HookEvent {
  
  var allowedTags: StringDictionary[Boolean] = js.native
  
  var tagName: String = js.native
}
object SanitizeElementHookEvent {
  
  @scala.inline
  def apply(allowedTags: StringDictionary[Boolean], tagName: String): SanitizeElementHookEvent = {
    val __obj = js.Dynamic.literal(allowedTags = allowedTags.asInstanceOf[js.Any], tagName = tagName.asInstanceOf[js.Any])
    __obj.asInstanceOf[SanitizeElementHookEvent]
  }
  
  @scala.inline
  implicit class SanitizeElementHookEventOps[Self <: SanitizeElementHookEvent] (val x: Self) extends AnyVal {
    
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
    def setAllowedTags(value: StringDictionary[Boolean]): Self = this.set("allowedTags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagName(value: String): Self = this.set("tagName", value.asInstanceOf[js.Any])
  }
}
