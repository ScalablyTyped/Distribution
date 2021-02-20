package typings.draftConvert

import org.scalablytyped.runtime.StringDictionary
import typings.draftConvert.anon.Data
import typings.draftConvert.anon.Entity
import typings.draftConvert.draftConvertBooleans.`false`
import typings.draftJs.mod.ContentBlock
import typings.draftJs.mod.ContentState
import typings.draftJs.mod.Draft.Model.Constants.DraftBlockType
import typings.draftJs.mod.Draft.Model.Constants.DraftInlineStyleType
import typings.draftJs.mod.Draft.Model.Encoding.RawDraftEntity
import typings.react.mod.ReactNode
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("draft-convert", "convertFromHTML")
  @js.native
  def convertFromHTML(config: IConvertFromHTMLConfig): htmlConverter = js.native
  
  @JSImport("draft-convert", "convertToHTML")
  @js.native
  def convertToHTML(config: IConvertToHTMLConfig): ContentStateConverter = js.native
  
  type ContentStateConverter = js.Function1[/* contentState */ ContentState, String]
  
  type EntityKey = String
  
  @js.native
  trait IConvertFromHTMLConfig extends StObject {
    
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
    implicit class IConvertFromHTMLConfigMutableBuilder[Self <: IConvertFromHTMLConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHtmlToBlock(value: (/* nodeName */ String, /* node */ HTMLElement) => DraftBlockType | Data | `false`): Self = StObject.set(x, "htmlToBlock", js.Any.fromFunction2(value))
      
      @scala.inline
      def setHtmlToBlockUndefined: Self = StObject.set(x, "htmlToBlock", js.undefined)
      
      @scala.inline
      def setHtmlToEntity(
        value: (/* nodeName */ String, /* node */ HTMLElement, /* createEntity */ js.Function3[/* type */ String, /* mutability */ String, /* data */ js.Object, EntityKey], /* getEntity */ js.Function1[
              /* key */ EntityKey, 
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Entity */ _
            ], /* mergeEntityData */ js.Function2[/* key */ String, /* data */ js.Object, Unit], /* replaceEntityData */ js.Function2[/* key */ String, /* data */ js.Object, Unit]) => Unit
      ): Self = StObject.set(x, "htmlToEntity", js.Any.fromFunction6(value))
      
      @scala.inline
      def setHtmlToEntityUndefined: Self = StObject.set(x, "htmlToEntity", js.undefined)
      
      @scala.inline
      def setHtmlToStyle(value: (/* nodeName */ String, /* node */ HTMLElement) => DraftInlineStyleType): Self = StObject.set(x, "htmlToStyle", js.Any.fromFunction2(value))
      
      @scala.inline
      def setHtmlToStyleUndefined: Self = StObject.set(x, "htmlToStyle", js.undefined)
      
      @scala.inline
      def setTextToEntity(
        value: (/* text */ String, /* createEntity */ js.Function3[/* type */ String, /* mutability */ String, /* data */ js.Object, EntityKey], /* getEntity */ js.Function1[
              /* key */ EntityKey, 
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Entity */ _
            ], /* mergeEntityData */ js.Function2[/* key */ String, /* data */ js.Object, Unit], /* replaceEntityData */ js.Function2[/* key */ String, /* data */ js.Object, Unit]) => js.Array[Entity]
      ): Self = StObject.set(x, "textToEntity", js.Any.fromFunction5(value))
      
      @scala.inline
      def setTextToEntityUndefined: Self = StObject.set(x, "textToEntity", js.undefined)
    }
  }
  
  @js.native
  trait IConvertToHTMLConfig extends StObject {
    
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
    implicit class IConvertToHTMLConfigMutableBuilder[Self <: IConvertToHTMLConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBlockToHTML(value: /* block */ ContentBlock => Tag): Self = StObject.set(x, "blockToHTML", js.Any.fromFunction1(value))
      
      @scala.inline
      def setBlockToHTMLUndefined: Self = StObject.set(x, "blockToHTML", js.undefined)
      
      @scala.inline
      def setEntityToHTML(value: (/* entity */ RawDraftEntity[StringDictionary[_]], /* originalText */ String) => Tag): Self = StObject.set(x, "entityToHTML", js.Any.fromFunction2(value))
      
      @scala.inline
      def setEntityToHTMLUndefined: Self = StObject.set(x, "entityToHTML", js.undefined)
      
      @scala.inline
      def setStyleToHTML(value: /* style */ DraftInlineStyleType => Tag | Unit): Self = StObject.set(x, "styleToHTML", js.Any.fromFunction1(value))
      
      @scala.inline
      def setStyleToHTMLUndefined: Self = StObject.set(x, "styleToHTML", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.react.mod.ReactNode
    - typings.draftConvert.anon.Empty
    - typings.draftConvert.anon.Element
  */
  type Tag = _Tag | ReactNode
  
  trait _Tag extends StObject
  object _Tag {
    
    @scala.inline
    def Element(): typings.draftConvert.anon.Element = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.draftConvert.anon.Element]
    }
    
    @scala.inline
    def Empty(end: String, start: String): typings.draftConvert.anon.Empty = {
      val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.draftConvert.anon.Empty]
    }
  }
  
  type htmlConverter = js.Function1[/* html */ String, ContentState]
}
