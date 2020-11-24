package typings.draftConvert.mod

import typings.draftConvert.anon.Data
import typings.draftConvert.anon.Entity
import typings.draftConvert.draftConvertBooleans.`false`
import typings.draftJs.mod.Draft.Model.Constants.DraftBlockType
import typings.draftJs.mod.Draft.Model.Constants.DraftInlineStyleType
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IConvertFromHTMLConfig extends js.Object {
  
  // Block styles:
  var htmlToBlock: js.UndefOr[
    js.Function2[/* nodeName */ String, /* node */ HTMLElement, DraftBlockType | Data | `false`]
  ] = js.native
  
  // Html entities
  var htmlToEntity: js.UndefOr[
    js.Function6[
      /* nodeName */ String, 
      /* node */ HTMLElement, 
      /* createEntity */ js.Function3[/* type */ String, /* mutability */ String, /* data */ js.Object, EntityKey], 
      /* getEntity */ js.Function1[
        /* key */ EntityKey, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Entity */ _
      ], 
      /* mergeEntityData */ js.Function2[/* key */ String, /* data */ js.Object, Unit], 
      /* replaceEntityData */ js.Function2[/* key */ String, /* data */ js.Object, Unit], 
      Unit
    ]
  ] = js.native
  
  // Inline styles:
  var htmlToStyle: js.UndefOr[
    js.Function2[/* nodeName */ String, /* node */ HTMLElement, DraftInlineStyleType]
  ] = js.native
  
  // Text entities
  var textToEntity: js.UndefOr[
    js.Function5[
      /* text */ String, 
      /* createEntity */ js.Function3[/* type */ String, /* mutability */ String, /* data */ js.Object, EntityKey], 
      /* getEntity */ js.Function1[
        /* key */ EntityKey, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Entity */ _
      ], 
      /* mergeEntityData */ js.Function2[/* key */ String, /* data */ js.Object, Unit], 
      /* replaceEntityData */ js.Function2[/* key */ String, /* data */ js.Object, Unit], 
      js.Array[Entity]
    ]
  ] = js.native
}
object IConvertFromHTMLConfig {
  
  @scala.inline
  def apply(): IConvertFromHTMLConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IConvertFromHTMLConfig]
  }
  
  @scala.inline
  implicit class IConvertFromHTMLConfigOps[Self <: IConvertFromHTMLConfig] (val x: Self) extends AnyVal {
    
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
    def setHtmlToBlock(value: (/* nodeName */ String, /* node */ HTMLElement) => DraftBlockType | Data | `false`): Self = this.set("htmlToBlock", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteHtmlToBlock: Self = this.set("htmlToBlock", js.undefined)
    
    @scala.inline
    def setHtmlToEntity(
      value: (/* nodeName */ String, /* node */ HTMLElement, /* createEntity */ js.Function3[/* type */ String, /* mutability */ String, /* data */ js.Object, EntityKey], /* getEntity */ js.Function1[
          /* key */ EntityKey, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Entity */ _
        ], /* mergeEntityData */ js.Function2[/* key */ String, /* data */ js.Object, Unit], /* replaceEntityData */ js.Function2[/* key */ String, /* data */ js.Object, Unit]) => Unit
    ): Self = this.set("htmlToEntity", js.Any.fromFunction6(value))
    
    @scala.inline
    def deleteHtmlToEntity: Self = this.set("htmlToEntity", js.undefined)
    
    @scala.inline
    def setHtmlToStyle(value: (/* nodeName */ String, /* node */ HTMLElement) => DraftInlineStyleType): Self = this.set("htmlToStyle", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteHtmlToStyle: Self = this.set("htmlToStyle", js.undefined)
    
    @scala.inline
    def setTextToEntity(
      value: (/* text */ String, /* createEntity */ js.Function3[/* type */ String, /* mutability */ String, /* data */ js.Object, EntityKey], /* getEntity */ js.Function1[
          /* key */ EntityKey, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Entity */ _
        ], /* mergeEntityData */ js.Function2[/* key */ String, /* data */ js.Object, Unit], /* replaceEntityData */ js.Function2[/* key */ String, /* data */ js.Object, Unit]) => js.Array[Entity]
    ): Self = this.set("textToEntity", js.Any.fromFunction5(value))
    
    @scala.inline
    def deleteTextToEntity: Self = this.set("textToEntity", js.undefined)
  }
}
