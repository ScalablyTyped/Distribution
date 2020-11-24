package typings.draftJs.mod.Draft.Model.Encoding

import typings.draftJs.mod.Draft.Model.Constants.DraftInlineStyleType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A plain object representation of an inline style range.
  */
@js.native
trait RawDraftInlineStyleRange extends js.Object {
  
  var length: Double = js.native
  
  var offset: Double = js.native
  
  var style: DraftInlineStyleType = js.native
}
object RawDraftInlineStyleRange {
  
  @scala.inline
  def apply(length: Double, offset: Double, style: DraftInlineStyleType): RawDraftInlineStyleRange = {
    val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any])
    __obj.asInstanceOf[RawDraftInlineStyleRange]
  }
  
  @scala.inline
  implicit class RawDraftInlineStyleRangeOps[Self <: RawDraftInlineStyleRange] (val x: Self) extends AnyVal {
    
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
    def setLength(value: Double): Self = this.set("length", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffset(value: Double): Self = this.set("offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyle(value: DraftInlineStyleType): Self = this.set("style", value.asInstanceOf[js.Any])
  }
}
