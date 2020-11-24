package typings.firefoxWebextBrowser.browser.omnibox

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The style ranges for the description, as provided by the extension. */
@js.native
trait DefaultSuggestResultDescriptionStyles extends js.Object {
  
  var length: js.UndefOr[Double] = js.native
  
  var offset: Double = js.native
  
  /** The style type */
  var `type`: DescriptionStyleType = js.native
}
object DefaultSuggestResultDescriptionStyles {
  
  @scala.inline
  def apply(offset: Double, `type`: DescriptionStyleType): DefaultSuggestResultDescriptionStyles = {
    val __obj = js.Dynamic.literal(offset = offset.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultSuggestResultDescriptionStyles]
  }
  
  @scala.inline
  implicit class DefaultSuggestResultDescriptionStylesOps[Self <: DefaultSuggestResultDescriptionStyles] (val x: Self) extends AnyVal {
    
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
    def setOffset(value: Double): Self = this.set("offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: DescriptionStyleType): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLength(value: Double): Self = this.set("length", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLength: Self = this.set("length", js.undefined)
  }
}
