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
import typings.devextreme.devextremeStrings.header
import typings.devextreme.devextremeStrings.image
import typings.devextreme.devextremeStrings.increaseIndent
import typings.devextreme.devextremeStrings.italic
import typings.devextreme.devextremeStrings.link
import typings.devextreme.devextremeStrings.orderedList
import typings.devextreme.devextremeStrings.redo
import typings.devextreme.devextremeStrings.separator
import typings.devextreme.devextremeStrings.strike
import typings.devextreme.devextremeStrings.subscript
import typings.devextreme.devextremeStrings.superscript
import typings.devextreme.devextremeStrings.underline
import typings.devextreme.devextremeStrings.undo
import typings.devextreme.devextremeStrings.variable
import typings.devextreme.mod._Global_.JQuery
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait dxHtmlEditorToolbar extends js.Object {
  /** @name dxHtmlEditorToolbar.container */
  var container: js.UndefOr[String | Element | JQuery] = js.undefined
  /** @name dxHtmlEditorToolbar.items */
  var items: js.UndefOr[
    js.Array[
      dxHtmlEditorToolbarItem | background | bold | color | italic | link | image | strike | subscript | superscript | underline | blockquote | header | increaseIndent | decreaseIndent | orderedList | bulletList | alignLeft | alignCenter | alignRight | alignJustify | codeBlock | variable | separator | undo | redo | clear
    ]
  ] = js.undefined
}

object dxHtmlEditorToolbar {
  @scala.inline
  def apply(
    container: String | Element | JQuery = null,
    items: js.Array[
      dxHtmlEditorToolbarItem | background | bold | color | italic | link | image | strike | subscript | superscript | underline | blockquote | header | increaseIndent | decreaseIndent | orderedList | bulletList | alignLeft | alignCenter | alignRight | alignJustify | codeBlock | variable | separator | undo | redo | clear
    ] = null
  ): dxHtmlEditorToolbar = {
    val __obj = js.Dynamic.literal()
    if (container != null) __obj.updateDynamic("container")(container.asInstanceOf[js.Any])
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    __obj.asInstanceOf[dxHtmlEditorToolbar]
  }
}

