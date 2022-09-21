package typings.devtoolsProtocol.mod.Protocol.CSS

import typings.devtoolsProtocol.devtoolsProtocolStrings.importRule
import typings.devtoolsProtocol.devtoolsProtocolStrings.inlineSheet
import typings.devtoolsProtocol.devtoolsProtocolStrings.linkedSheet
import typings.devtoolsProtocol.devtoolsProtocolStrings.mediaRule
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CSSMedia extends StObject {
  
  /**
    * Array of media queries.
    */
  var mediaList: js.UndefOr[js.Array[MediaQuery]] = js.undefined
  
  /**
    * The associated rule (@media or @import) header range in the enclosing stylesheet (if
    * available).
    */
  var range: js.UndefOr[SourceRange] = js.undefined
  
  /**
    * Source of the media query: "mediaRule" if specified by a @media rule, "importRule" if
    * specified by an @import rule, "linkedSheet" if specified by a "media" attribute in a linked
    * stylesheet's LINK tag, "inlineSheet" if specified by a "media" attribute in an inline
    * stylesheet's STYLE tag. (CSSMediaSource enum)
    */
  var source: mediaRule | importRule | linkedSheet | inlineSheet
  
  /**
    * URL of the document containing the media query description.
    */
  var sourceURL: js.UndefOr[String] = js.undefined
  
  /**
    * Identifier of the stylesheet containing this object (if exists).
    */
  var styleSheetId: js.UndefOr[StyleSheetId] = js.undefined
  
  /**
    * Media query text.
    */
  var text: String
}
object CSSMedia {
  
  inline def apply(source: mediaRule | importRule | linkedSheet | inlineSheet, text: String): CSSMedia = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[CSSMedia]
  }
  
  extension [Self <: CSSMedia](x: Self) {
    
    inline def setMediaList(value: js.Array[MediaQuery]): Self = StObject.set(x, "mediaList", value.asInstanceOf[js.Any])
    
    inline def setMediaListUndefined: Self = StObject.set(x, "mediaList", js.undefined)
    
    inline def setMediaListVarargs(value: MediaQuery*): Self = StObject.set(x, "mediaList", js.Array(value*))
    
    inline def setRange(value: SourceRange): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    inline def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
    
    inline def setSource(value: mediaRule | importRule | linkedSheet | inlineSheet): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceURL(value: String): Self = StObject.set(x, "sourceURL", value.asInstanceOf[js.Any])
    
    inline def setSourceURLUndefined: Self = StObject.set(x, "sourceURL", js.undefined)
    
    inline def setStyleSheetId(value: StyleSheetId): Self = StObject.set(x, "styleSheetId", value.asInstanceOf[js.Any])
    
    inline def setStyleSheetIdUndefined: Self = StObject.set(x, "styleSheetId", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
