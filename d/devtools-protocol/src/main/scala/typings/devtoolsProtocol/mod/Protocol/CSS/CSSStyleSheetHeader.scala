package typings.devtoolsProtocol.mod.Protocol.CSS

import typings.devtoolsProtocol.mod.Protocol.DOM.BackendNodeId
import typings.devtoolsProtocol.mod.Protocol.Page.FrameId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CSSStyleSheetHeader extends js.Object {
  
  /**
    * Denotes whether the stylesheet is disabled.
    */
  var disabled: Boolean = js.native
  
  /**
    * Column offset of the end of the stylesheet within the resource (zero based).
    */
  var endColumn: Double = js.native
  
  /**
    * Line offset of the end of the stylesheet within the resource (zero based).
    */
  var endLine: Double = js.native
  
  /**
    * Owner frame identifier.
    */
  var frameId: FrameId = js.native
  
  /**
    * Whether the sourceURL field value comes from the sourceURL comment.
    */
  var hasSourceURL: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether this stylesheet is a constructed stylesheet (created using new CSSStyleSheet()).
    */
  var isConstructed: Boolean = js.native
  
  /**
    * Whether this stylesheet is created for STYLE tag by parser. This flag is not set for
    * document.written STYLE tags.
    */
  var isInline: Boolean = js.native
  
  /**
    * Whether this stylesheet is mutable. Inline stylesheets become mutable
    * after they have been modified via CSSOM API.
    * <link> element's stylesheets become mutable only if DevTools modifies them.
    * Constructed stylesheets (new CSSStyleSheet()) are mutable immediately after creation.
    */
  var isMutable: Boolean = js.native
  
  /**
    * Size of the content (in characters).
    */
  var length: Double = js.native
  
  /**
    * Stylesheet origin.
    */
  var origin: StyleSheetOrigin = js.native
  
  /**
    * The backend id for the owner node of the stylesheet.
    */
  var ownerNode: js.UndefOr[BackendNodeId] = js.native
  
  /**
    * URL of source map associated with the stylesheet (if any).
    */
  var sourceMapURL: js.UndefOr[String] = js.native
  
  /**
    * Stylesheet resource URL.
    */
  var sourceURL: String = js.native
  
  /**
    * Column offset of the stylesheet within the resource (zero based).
    */
  var startColumn: Double = js.native
  
  /**
    * Line offset of the stylesheet within the resource (zero based).
    */
  var startLine: Double = js.native
  
  /**
    * The stylesheet identifier.
    */
  var styleSheetId: StyleSheetId = js.native
  
  /**
    * Stylesheet title.
    */
  var title: String = js.native
}
object CSSStyleSheetHeader {
  
  @scala.inline
  def apply(
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
  implicit class CSSStyleSheetHeaderOps[Self <: CSSStyleSheetHeader] (val x: Self) extends AnyVal {
    
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
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndColumn(value: Double): Self = this.set("endColumn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndLine(value: Double): Self = this.set("endLine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFrameId(value: FrameId): Self = this.set("frameId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsConstructed(value: Boolean): Self = this.set("isConstructed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsInline(value: Boolean): Self = this.set("isInline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsMutable(value: Boolean): Self = this.set("isMutable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLength(value: Double): Self = this.set("length", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrigin(value: StyleSheetOrigin): Self = this.set("origin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceURL(value: String): Self = this.set("sourceURL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartColumn(value: Double): Self = this.set("startColumn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartLine(value: Double): Self = this.set("startLine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleSheetId(value: StyleSheetId): Self = this.set("styleSheetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasSourceURL(value: Boolean): Self = this.set("hasSourceURL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHasSourceURL: Self = this.set("hasSourceURL", js.undefined)
    
    @scala.inline
    def setOwnerNode(value: BackendNodeId): Self = this.set("ownerNode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOwnerNode: Self = this.set("ownerNode", js.undefined)
    
    @scala.inline
    def setSourceMapURL(value: String): Self = this.set("sourceMapURL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourceMapURL: Self = this.set("sourceMapURL", js.undefined)
  }
}
