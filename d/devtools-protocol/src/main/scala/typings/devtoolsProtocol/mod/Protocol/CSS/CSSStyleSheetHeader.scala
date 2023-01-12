package typings.devtoolsProtocol.mod.Protocol.CSS

import typings.devtoolsProtocol.mod.Protocol.DOM.BackendNodeId
import typings.devtoolsProtocol.mod.Protocol.Page.FrameId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CSSStyleSheetHeader extends StObject {
  
  /**
    * Denotes whether the stylesheet is disabled.
    */
  var disabled: Boolean
  
  /**
    * Column offset of the end of the stylesheet within the resource (zero based).
    */
  var endColumn: Double
  
  /**
    * Line offset of the end of the stylesheet within the resource (zero based).
    */
  var endLine: Double
  
  /**
    * Owner frame identifier.
    */
  var frameId: FrameId
  
  /**
    * Whether the sourceURL field value comes from the sourceURL comment.
    */
  var hasSourceURL: js.UndefOr[Boolean] = js.undefined
  
  /**
    * True if this stylesheet is created through new CSSStyleSheet() or imported as a
    * CSS module script.
    */
  var isConstructed: Boolean
  
  /**
    * Whether this stylesheet is created for STYLE tag by parser. This flag is not set for
    * document.written STYLE tags.
    */
  var isInline: Boolean
  
  /**
    * Whether this stylesheet is mutable. Inline stylesheets become mutable
    * after they have been modified via CSSOM API.
    * <link> element's stylesheets become mutable only if DevTools modifies them.
    * Constructed stylesheets (new CSSStyleSheet()) are mutable immediately after creation.
    */
  var isMutable: Boolean
  
  /**
    * Size of the content (in characters).
    */
  var length: Double
  
  /**
    * Stylesheet origin.
    */
  var origin: StyleSheetOrigin
  
  /**
    * The backend id for the owner node of the stylesheet.
    */
  var ownerNode: js.UndefOr[BackendNodeId] = js.undefined
  
  /**
    * URL of source map associated with the stylesheet (if any).
    */
  var sourceMapURL: js.UndefOr[String] = js.undefined
  
  /**
    * Stylesheet resource URL. Empty if this is a constructed stylesheet created using
    * new CSSStyleSheet() (but non-empty if this is a constructed sylesheet imported
    * as a CSS module script).
    */
  var sourceURL: String
  
  /**
    * Column offset of the stylesheet within the resource (zero based).
    */
  var startColumn: Double
  
  /**
    * Line offset of the stylesheet within the resource (zero based).
    */
  var startLine: Double
  
  /**
    * The stylesheet identifier.
    */
  var styleSheetId: StyleSheetId
  
  /**
    * Stylesheet title.
    */
  var title: String
}
object CSSStyleSheetHeader {
  
  inline def apply(
    disabled: Boolean,
    endColumn: Double,
    endLine: Double,
    frameId: FrameId,
    isConstructed: Boolean,
    isInline: Boolean,
    isMutable: Boolean,
    length: Double,
    origin: StyleSheetOrigin,
    sourceURL: String,
    startColumn: Double,
    startLine: Double,
    styleSheetId: StyleSheetId,
    title: String
  ): CSSStyleSheetHeader = {
    val __obj = js.Dynamic.literal(disabled = disabled.asInstanceOf[js.Any], endColumn = endColumn.asInstanceOf[js.Any], endLine = endLine.asInstanceOf[js.Any], frameId = frameId.asInstanceOf[js.Any], isConstructed = isConstructed.asInstanceOf[js.Any], isInline = isInline.asInstanceOf[js.Any], isMutable = isMutable.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], origin = origin.asInstanceOf[js.Any], sourceURL = sourceURL.asInstanceOf[js.Any], startColumn = startColumn.asInstanceOf[js.Any], startLine = startLine.asInstanceOf[js.Any], styleSheetId = styleSheetId.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[CSSStyleSheetHeader]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CSSStyleSheetHeader] (val x: Self) extends AnyVal {
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setEndColumn(value: Double): Self = StObject.set(x, "endColumn", value.asInstanceOf[js.Any])
    
    inline def setEndLine(value: Double): Self = StObject.set(x, "endLine", value.asInstanceOf[js.Any])
    
    inline def setFrameId(value: FrameId): Self = StObject.set(x, "frameId", value.asInstanceOf[js.Any])
    
    inline def setHasSourceURL(value: Boolean): Self = StObject.set(x, "hasSourceURL", value.asInstanceOf[js.Any])
    
    inline def setHasSourceURLUndefined: Self = StObject.set(x, "hasSourceURL", js.undefined)
    
    inline def setIsConstructed(value: Boolean): Self = StObject.set(x, "isConstructed", value.asInstanceOf[js.Any])
    
    inline def setIsInline(value: Boolean): Self = StObject.set(x, "isInline", value.asInstanceOf[js.Any])
    
    inline def setIsMutable(value: Boolean): Self = StObject.set(x, "isMutable", value.asInstanceOf[js.Any])
    
    inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    inline def setOrigin(value: StyleSheetOrigin): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
    
    inline def setOwnerNode(value: BackendNodeId): Self = StObject.set(x, "ownerNode", value.asInstanceOf[js.Any])
    
    inline def setOwnerNodeUndefined: Self = StObject.set(x, "ownerNode", js.undefined)
    
    inline def setSourceMapURL(value: String): Self = StObject.set(x, "sourceMapURL", value.asInstanceOf[js.Any])
    
    inline def setSourceMapURLUndefined: Self = StObject.set(x, "sourceMapURL", js.undefined)
    
    inline def setSourceURL(value: String): Self = StObject.set(x, "sourceURL", value.asInstanceOf[js.Any])
    
    inline def setStartColumn(value: Double): Self = StObject.set(x, "startColumn", value.asInstanceOf[js.Any])
    
    inline def setStartLine(value: Double): Self = StObject.set(x, "startLine", value.asInstanceOf[js.Any])
    
    inline def setStyleSheetId(value: StyleSheetId): Self = StObject.set(x, "styleSheetId", value.asInstanceOf[js.Any])
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
  }
}
