package typings.devtoolsProtocol.mod.Protocol.CSS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StyleDeclarationEdit extends js.Object {
  /**
    * The range of the style text in the enclosing stylesheet.
    */
  var range: SourceRange = js.native
  /**
    * The css style sheet identifier.
    */
  var styleSheetId: StyleSheetId = js.native
  /**
    * New style text.
    */
  var text: String = js.native
}

object StyleDeclarationEdit {
  @scala.inline
  def apply(range: SourceRange, styleSheetId: StyleSheetId, text: String): StyleDeclarationEdit = {
    val __obj = js.Dynamic.literal(range = range.asInstanceOf[js.Any], styleSheetId = styleSheetId.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[StyleDeclarationEdit]
  }
  @scala.inline
  implicit class StyleDeclarationEditOps[Self <: StyleDeclarationEdit] (val x: Self) extends AnyVal {
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
    def setRange(value: SourceRange): Self = this.set("range", value.asInstanceOf[js.Any])
    @scala.inline
    def setStyleSheetId(value: StyleSheetId): Self = this.set("styleSheetId", value.asInstanceOf[js.Any])
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
  }
  
}

