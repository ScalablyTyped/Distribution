package typings.draftJs.mod.Draft.Model.Encoding

import org.scalablytyped.runtime.StringDictionary
import typings.draftJs.mod.Draft.Model.Constants.DraftBlockType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A plain object representation of a ContentBlock, with all style and entity
  * attribution repackaged as range objects.
  */
@js.native
trait RawDraftContentBlock extends js.Object {
  
  var data: js.UndefOr[StringDictionary[js.Any]] = js.native
  
  var depth: Double = js.native
  
  var entityRanges: js.Array[RawDraftEntityRange] = js.native
  
  var inlineStyleRanges: js.Array[RawDraftInlineStyleRange] = js.native
  
  var key: String = js.native
  
  var text: String = js.native
  
  var `type`: DraftBlockType = js.native
}
object RawDraftContentBlock {
  
  @scala.inline
  def apply(
    depth: Double,
    entityRanges: js.Array[RawDraftEntityRange],
    inlineStyleRanges: js.Array[RawDraftInlineStyleRange],
    key: String,
    text: String,
    `type`: DraftBlockType
  ): RawDraftContentBlock = {
    val __obj = js.Dynamic.literal(depth = depth.asInstanceOf[js.Any], entityRanges = entityRanges.asInstanceOf[js.Any], inlineStyleRanges = inlineStyleRanges.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RawDraftContentBlock]
  }
  
  @scala.inline
  implicit class RawDraftContentBlockOps[Self <: RawDraftContentBlock] (val x: Self) extends AnyVal {
    
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
    def setDepth(value: Double): Self = this.set("depth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntityRangesVarargs(value: RawDraftEntityRange*): Self = this.set("entityRanges", js.Array(value :_*))
    
    @scala.inline
    def setEntityRanges(value: js.Array[RawDraftEntityRange]): Self = this.set("entityRanges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInlineStyleRangesVarargs(value: RawDraftInlineStyleRange*): Self = this.set("inlineStyleRanges", js.Array(value :_*))
    
    @scala.inline
    def setInlineStyleRanges(value: js.Array[RawDraftInlineStyleRange]): Self = this.set("inlineStyleRanges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: DraftBlockType): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setData(value: StringDictionary[js.Any]): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
  }
}
