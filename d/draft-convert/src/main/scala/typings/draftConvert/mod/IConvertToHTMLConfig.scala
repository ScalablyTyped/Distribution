package typings.draftConvert.mod

import org.scalablytyped.runtime.StringDictionary
import typings.draftJs.mod.ContentBlock
import typings.draftJs.mod.Draft.Model.Constants.DraftInlineStyleType
import typings.draftJs.mod.Draft.Model.Encoding.RawDraftEntity
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IConvertToHTMLConfig extends js.Object {
  
  // Block styles:
  var blockToHTML: js.UndefOr[js.Function1[/* block */ ContentBlock, Tag]] = js.native
  
  // Entity styling:
  var entityToHTML: js.UndefOr[
    js.Function2[/* entity */ RawDraftEntity[StringDictionary[_]], /* originalText */ String, Tag]
  ] = js.native
  
  // Inline styles:
  var styleToHTML: js.UndefOr[js.Function1[/* style */ DraftInlineStyleType, Tag | Unit]] = js.native
}
object IConvertToHTMLConfig {
  
  @scala.inline
  def apply(): IConvertToHTMLConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IConvertToHTMLConfig]
  }
  
  @scala.inline
  implicit class IConvertToHTMLConfigOps[Self <: IConvertToHTMLConfig] (val x: Self) extends AnyVal {
    
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
    def setBlockToHTML(value: /* block */ ContentBlock => Tag): Self = this.set("blockToHTML", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteBlockToHTML: Self = this.set("blockToHTML", js.undefined)
    
    @scala.inline
    def setEntityToHTML(value: (/* entity */ RawDraftEntity[StringDictionary[_]], /* originalText */ String) => Tag): Self = this.set("entityToHTML", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteEntityToHTML: Self = this.set("entityToHTML", js.undefined)
    
    @scala.inline
    def setStyleToHTML(value: /* style */ DraftInlineStyleType => Tag | Unit): Self = this.set("styleToHTML", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteStyleToHTML: Self = this.set("styleToHTML", js.undefined)
  }
}
