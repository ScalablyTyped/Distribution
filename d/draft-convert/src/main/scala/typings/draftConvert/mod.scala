package typings.draftConvert

import org.scalablytyped.runtime.StringDictionary
import typings.draftConvert.anon.Data
import typings.draftConvert.anon.Entity
import typings.draftConvert.draftConvertBooleans.`false`
import typings.draftJs.mod.ContentState
import typings.draftJs.mod.Draft.Model.Constants.DraftBlockType
import typings.draftJs.mod.Draft.Model.Constants.DraftEntityMutability
import typings.draftJs.mod.Draft.Model.Encoding.RawDraftEntity
import typings.draftJs.mod.Draft.Model.Encoding.RawDraftEntityRange
import typings.draftJs.mod.Draft.Model.Encoding.RawDraftInlineStyleRange
import typings.react.mod.ReactNode
import typings.std.HTMLElement
import typings.std.HTMLLinkElement
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("draft-convert", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def convertFromHTML(html: String): ContentState = ^.asInstanceOf[js.Dynamic].applyDynamic("convertFromHTML")(html.asInstanceOf[js.Any]).asInstanceOf[ContentState]
  inline def convertFromHTML[S /* <: StringDictionary[Any] */, B /* <: DraftBlockType */, E /* <: RawDraftEntity[StringDictionary[Any]] */](config: IConvertFromHTMLConfig[S, B, E]): HTMLConverter = ^.asInstanceOf[js.Dynamic].applyDynamic("convertFromHTML")(config.asInstanceOf[js.Any]).asInstanceOf[HTMLConverter]
  
  inline def convertToHTML(contentState: ContentState): String = ^.asInstanceOf[js.Dynamic].applyDynamic("convertToHTML")(contentState.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def convertToHTML[S, B /* <: DraftBlockType */, E /* <: RawDraftEntity[StringDictionary[Any]] */](config: IConvertToHTMLConfig[S, B, E]): ContentStateConverter = ^.asInstanceOf[js.Dynamic].applyDynamic("convertToHTML")(config.asInstanceOf[js.Any]).asInstanceOf[ContentStateConverter]
  
  type ContentStateConverter = js.Function1[/* contentState */ ContentState, String]
  
  type EntityKey = String
  
  type ExtendedHTMLElement[T] = (HTMLElement & T) | (HTMLLinkElement & T)
  
  type HTMLConverter = js.Function1[/* html */ String, ContentState]
  
  trait IConvertFromHTMLConfig[S /* <: StringDictionary[Any] */, B /* <: DraftBlockType */, E /* <: RawDraftEntity[StringDictionary[Any]] */] extends StObject {
    
    // Block styles:
    var htmlToBlock: js.UndefOr[
        js.Function2[
          /* nodeName */ String, 
          /* node */ ExtendedHTMLElement[S], 
          js.UndefOr[B | Data[B] | `false`]
        ]
      ] = js.undefined
    
    // Html entities
    var htmlToEntity: js.UndefOr[
        js.Function6[
          /* nodeName */ String, 
          /* node */ ExtendedHTMLElement[S], 
          /* createEntity */ js.Function3[
            /* import warning: importer.ImportType#apply Failed type conversion: E['type'] */ /* type */ js.Any, 
            /* mutability */ DraftEntityMutability, 
            /* import warning: importer.ImportType#apply Failed type conversion: E['data'] */ /* data */ js.Any, 
            EntityKey
          ], 
          /* getEntity */ js.Function1[
            /* key */ EntityKey, 
            /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Entity */ Any
          ], 
          /* mergeEntityData */ js.Function2[/* key */ String, /* data */ js.Object, Unit], 
          /* replaceEntityData */ js.Function2[/* key */ String, /* data */ js.Object, Unit], 
          js.UndefOr[EntityKey]
        ]
      ] = js.undefined
    
    // Inline styles:
    var htmlToStyle: js.UndefOr[
        js.Function3[
          /* nodeName */ String, 
          /* node */ ExtendedHTMLElement[S], 
          /* currentStyle */ Set[String], 
          Set[String]
        ]
      ] = js.undefined
    
    // Text entities
    var textToEntity: js.UndefOr[
        js.Function5[
          /* text */ String, 
          /* createEntity */ js.Function3[
            /* import warning: importer.ImportType#apply Failed type conversion: E['type'] */ /* type */ js.Any, 
            /* mutability */ DraftEntityMutability, 
            /* import warning: importer.ImportType#apply Failed type conversion: E['data'] */ /* data */ js.Any, 
            EntityKey
          ], 
          /* getEntity */ js.Function1[
            /* key */ EntityKey, 
            /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Entity */ Any
          ], 
          /* mergeEntityData */ js.Function2[/* key */ String, /* data */ js.Object, Unit], 
          /* replaceEntityData */ js.Function2[/* key */ String, /* data */ js.Object, Unit], 
          js.Array[Entity]
        ]
      ] = js.undefined
  }
  object IConvertFromHTMLConfig {
    
    inline def apply[S /* <: StringDictionary[Any] */, B /* <: DraftBlockType */, E /* <: RawDraftEntity[StringDictionary[Any]] */](): IConvertFromHTMLConfig[S, B, E] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IConvertFromHTMLConfig[S, B, E]]
    }
    
    extension [Self <: IConvertFromHTMLConfig[?, ?, ?], S /* <: StringDictionary[Any] */, B /* <: DraftBlockType */, E /* <: RawDraftEntity[StringDictionary[Any]] */](x: Self & (IConvertFromHTMLConfig[S, B, E])) {
      
      inline def setHtmlToBlock(
        value: (/* nodeName */ String, /* node */ ExtendedHTMLElement[S]) => js.UndefOr[B | Data[B] | `false`]
      ): Self = StObject.set(x, "htmlToBlock", js.Any.fromFunction2(value))
      
      inline def setHtmlToBlockUndefined: Self = StObject.set(x, "htmlToBlock", js.undefined)
      
      inline def setHtmlToEntity(
        value: (/* nodeName */ String, /* node */ ExtendedHTMLElement[S], /* createEntity */ js.Function3[
              /* import warning: importer.ImportType#apply Failed type conversion: E['type'] */ /* type */ js.Any, 
              /* mutability */ DraftEntityMutability, 
              /* import warning: importer.ImportType#apply Failed type conversion: E['data'] */ /* data */ js.Any, 
              EntityKey
            ], /* getEntity */ js.Function1[
              /* key */ EntityKey, 
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Entity */ Any
            ], /* mergeEntityData */ js.Function2[/* key */ String, /* data */ js.Object, Unit], /* replaceEntityData */ js.Function2[/* key */ String, /* data */ js.Object, Unit]) => js.UndefOr[EntityKey]
      ): Self = StObject.set(x, "htmlToEntity", js.Any.fromFunction6(value))
      
      inline def setHtmlToEntityUndefined: Self = StObject.set(x, "htmlToEntity", js.undefined)
      
      inline def setHtmlToStyle(
        value: (/* nodeName */ String, /* node */ ExtendedHTMLElement[S], /* currentStyle */ Set[String]) => Set[String]
      ): Self = StObject.set(x, "htmlToStyle", js.Any.fromFunction3(value))
      
      inline def setHtmlToStyleUndefined: Self = StObject.set(x, "htmlToStyle", js.undefined)
      
      inline def setTextToEntity(
        value: (/* text */ String, /* createEntity */ js.Function3[
              /* import warning: importer.ImportType#apply Failed type conversion: E['type'] */ /* type */ js.Any, 
              /* mutability */ DraftEntityMutability, 
              /* import warning: importer.ImportType#apply Failed type conversion: E['data'] */ /* data */ js.Any, 
              EntityKey
            ], /* getEntity */ js.Function1[
              /* key */ EntityKey, 
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Entity */ Any
            ], /* mergeEntityData */ js.Function2[/* key */ String, /* data */ js.Object, Unit], /* replaceEntityData */ js.Function2[/* key */ String, /* data */ js.Object, Unit]) => js.Array[Entity]
      ): Self = StObject.set(x, "textToEntity", js.Any.fromFunction5(value))
      
      inline def setTextToEntityUndefined: Self = StObject.set(x, "textToEntity", js.undefined)
    }
  }
  
  trait IConvertToHTMLConfig[S, B /* <: DraftBlockType */, E /* <: RawDraftEntity[StringDictionary[Any]] */] extends StObject {
    
    // Block styles:
    var blockToHTML: js.UndefOr[js.Function1[/* block */ RawDraftContentBlockWithCustomType[B], Tag]] = js.undefined
    
    // Entity styling:
    var entityToHTML: js.UndefOr[js.Function2[/* entity */ E, /* originalText */ String, Tag]] = js.undefined
    
    // Inline styles:
    var styleToHTML: js.UndefOr[js.Function1[/* style */ S, Tag | Unit]] = js.undefined
  }
  object IConvertToHTMLConfig {
    
    inline def apply[S, B /* <: DraftBlockType */, E /* <: RawDraftEntity[StringDictionary[Any]] */](): IConvertToHTMLConfig[S, B, E] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IConvertToHTMLConfig[S, B, E]]
    }
    
    extension [Self <: IConvertToHTMLConfig[?, ?, ?], S, B /* <: DraftBlockType */, E /* <: RawDraftEntity[StringDictionary[Any]] */](x: Self & (IConvertToHTMLConfig[S, B, E])) {
      
      inline def setBlockToHTML(value: /* block */ RawDraftContentBlockWithCustomType[B] => Tag): Self = StObject.set(x, "blockToHTML", js.Any.fromFunction1(value))
      
      inline def setBlockToHTMLUndefined: Self = StObject.set(x, "blockToHTML", js.undefined)
      
      inline def setEntityToHTML(value: (/* entity */ E, /* originalText */ String) => Tag): Self = StObject.set(x, "entityToHTML", js.Any.fromFunction2(value))
      
      inline def setEntityToHTMLUndefined: Self = StObject.set(x, "entityToHTML", js.undefined)
      
      inline def setStyleToHTML(value: /* style */ S => Tag | Unit): Self = StObject.set(x, "styleToHTML", js.Any.fromFunction1(value))
      
      inline def setStyleToHTMLUndefined: Self = StObject.set(x, "styleToHTML", js.undefined)
    }
  }
  
  /* Inlined std.Omit<draft-js.draft-js.RawDraftContentBlock, 'type'> & {  type :T} */
  trait RawDraftContentBlockWithCustomType[T] extends StObject {
    
    var data: js.UndefOr[StringDictionary[Any]] = js.undefined
    
    var depth: Double
    
    var entityRanges: js.Array[RawDraftEntityRange]
    
    var inlineStyleRanges: js.Array[RawDraftInlineStyleRange]
    
    var key: String
    
    var text: String
    
    var `type`: T
  }
  object RawDraftContentBlockWithCustomType {
    
    inline def apply[T](
      depth: Double,
      entityRanges: js.Array[RawDraftEntityRange],
      inlineStyleRanges: js.Array[RawDraftInlineStyleRange],
      key: String,
      text: String,
      `type`: T
    ): RawDraftContentBlockWithCustomType[T] = {
      val __obj = js.Dynamic.literal(depth = depth.asInstanceOf[js.Any], entityRanges = entityRanges.asInstanceOf[js.Any], inlineStyleRanges = inlineStyleRanges.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[RawDraftContentBlockWithCustomType[T]]
    }
    
    extension [Self <: RawDraftContentBlockWithCustomType[?], T](x: Self & RawDraftContentBlockWithCustomType[T]) {
      
      inline def setData(value: StringDictionary[Any]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setDepth(value: Double): Self = StObject.set(x, "depth", value.asInstanceOf[js.Any])
      
      inline def setEntityRanges(value: js.Array[RawDraftEntityRange]): Self = StObject.set(x, "entityRanges", value.asInstanceOf[js.Any])
      
      inline def setEntityRangesVarargs(value: RawDraftEntityRange*): Self = StObject.set(x, "entityRanges", js.Array(value*))
      
      inline def setInlineStyleRanges(value: js.Array[RawDraftInlineStyleRange]): Self = StObject.set(x, "inlineStyleRanges", value.asInstanceOf[js.Any])
      
      inline def setInlineStyleRangesVarargs(value: RawDraftInlineStyleRange*): Self = StObject.set(x, "inlineStyleRanges", js.Array(value*))
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setType(value: T): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
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
    
    inline def Element(): typings.draftConvert.anon.Element = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.draftConvert.anon.Element]
    }
    
    inline def Empty(end: String, start: String): typings.draftConvert.anon.Empty = {
      val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.draftConvert.anon.Empty]
    }
  }
}
