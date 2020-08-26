package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.devextremeStrings.alignCenter
import typings.devextreme.devextremeStrings.alignJustify
import typings.devextreme.devextremeStrings.alignLeft
import typings.devextreme.devextremeStrings.alignRight
import typings.devextreme.devextremeStrings.background
import typings.devextreme.devextremeStrings.blockquote
import typings.devextreme.devextremeStrings.bold
import typings.devextreme.devextremeStrings.bulletList
import typings.devextreme.devextremeStrings.clear
import typings.devextreme.devextremeStrings.codeBlock
import typings.devextreme.devextremeStrings.color
import typings.devextreme.devextremeStrings.decreaseIndent
import typings.devextreme.devextremeStrings.font
import typings.devextreme.devextremeStrings.header
import typings.devextreme.devextremeStrings.image
import typings.devextreme.devextremeStrings.increaseIndent
import typings.devextreme.devextremeStrings.italic
import typings.devextreme.devextremeStrings.link
import typings.devextreme.devextremeStrings.orderedList
import typings.devextreme.devextremeStrings.redo
import typings.devextreme.devextremeStrings.separator
import typings.devextreme.devextremeStrings.size
import typings.devextreme.devextremeStrings.strike
import typings.devextreme.devextremeStrings.subscript
import typings.devextreme.devextremeStrings.superscript
import typings.devextreme.devextremeStrings.underline
import typings.devextreme.devextremeStrings.undo
import typings.devextreme.devextremeStrings.variable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait dxHtmlEditorToolbarItem extends dxToolbarItem {
  /** @name dxHtmlEditorToolbarItem.formatName */
  var formatName: js.UndefOr[
    background | bold | color | font | italic | link | image | size | strike | subscript | superscript | underline | blockquote | header | increaseIndent | decreaseIndent | orderedList | bulletList | alignLeft | alignCenter | alignRight | alignJustify | codeBlock | variable | separator | undo | redo | clear | String
  ] = js.native
  /** @name dxHtmlEditorToolbarItem.formatValues */
  var formatValues: js.UndefOr[js.Array[String | Double | Boolean]] = js.native
}

object dxHtmlEditorToolbarItem {
  @scala.inline
  def apply(): dxHtmlEditorToolbarItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxHtmlEditorToolbarItem]
  }
  @scala.inline
  implicit class dxHtmlEditorToolbarItemOps[Self <: dxHtmlEditorToolbarItem] (val x: Self) extends AnyVal {
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
    def setFormatName(
      value: background | bold | color | font | italic | link | image | size | strike | subscript | superscript | underline | blockquote | header | increaseIndent | decreaseIndent | orderedList | bulletList | alignLeft | alignCenter | alignRight | alignJustify | codeBlock | variable | separator | undo | redo | clear | String
    ): Self = this.set("formatName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormatName: Self = this.set("formatName", js.undefined)
    @scala.inline
    def setFormatValuesVarargs(value: (String | Double | Boolean)*): Self = this.set("formatValues", js.Array(value :_*))
    @scala.inline
    def setFormatValues(value: js.Array[String | Double | Boolean]): Self = this.set("formatValues", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormatValues: Self = this.set("formatValues", js.undefined)
  }
  
}

