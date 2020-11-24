package typings.devtoolsProtocol.mod.Protocol.CSS

import typings.devtoolsProtocol.devtoolsProtocolStrings.importRule
import typings.devtoolsProtocol.devtoolsProtocolStrings.inlineSheet
import typings.devtoolsProtocol.devtoolsProtocolStrings.linkedSheet
import typings.devtoolsProtocol.devtoolsProtocolStrings.mediaRule
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CSSMedia extends js.Object {
  
  /**
    * Array of media queries.
    */
  var mediaList: js.UndefOr[js.Array[MediaQuery]] = js.native
  
  /**
    * The associated rule (@media or @import) header range in the enclosing stylesheet (if
    * available).
    */
  var range: js.UndefOr[SourceRange] = js.native
  
  /**
    * Source of the media query: "mediaRule" if specified by a @media rule, "importRule" if
    * specified by an @import rule, "linkedSheet" if specified by a "media" attribute in a linked
    * stylesheet's LINK tag, "inlineSheet" if specified by a "media" attribute in an inline
    * stylesheet's STYLE tag. (CSSMediaSource enum)
    */
  var source: mediaRule | importRule | linkedSheet | inlineSheet = js.native
  
  /**
    * URL of the document containing the media query description.
    */
  var sourceURL: js.UndefOr[String] = js.native
  
  /**
    * Identifier of the stylesheet containing this object (if exists).
    */
  var styleSheetId: js.UndefOr[StyleSheetId] = js.native
  
  /**
    * Media query text.
    */
  var text: String = js.native
}
object CSSMedia {
  
  @scala.inline
  def apply(source: mediaRule | importRule | linkedSheet | inlineSheet, text: String): CSSMedia = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[CSSMedia]
  }
  
  @scala.inline
  implicit class CSSMediaOps[Self <: CSSMedia] (val x: Self) extends AnyVal {
    
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
    def setSource(value: mediaRule | importRule | linkedSheet | inlineSheet): Self = this.set("source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMediaListVarargs(value: MediaQuery*): Self = this.set("mediaList", js.Array(value :_*))
    
    @scala.inline
    def setMediaList(value: js.Array[MediaQuery]): Self = this.set("mediaList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMediaList: Self = this.set("mediaList", js.undefined)
    
    @scala.inline
    def setRange(value: SourceRange): Self = this.set("range", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRange: Self = this.set("range", js.undefined)
    
    @scala.inline
    def setSourceURL(value: String): Self = this.set("sourceURL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourceURL: Self = this.set("sourceURL", js.undefined)
    
    @scala.inline
    def setStyleSheetId(value: StyleSheetId): Self = this.set("styleSheetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyleSheetId: Self = this.set("styleSheetId", js.undefined)
  }
}
