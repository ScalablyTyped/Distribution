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
import typings.devextreme.devextremeStrings.deleteColumn
import typings.devextreme.devextremeStrings.deleteRow
import typings.devextreme.devextremeStrings.deleteTable
import typings.devextreme.devextremeStrings.font
import typings.devextreme.devextremeStrings.header
import typings.devextreme.devextremeStrings.image
import typings.devextreme.devextremeStrings.increaseIndent
import typings.devextreme.devextremeStrings.insertColumnLeft
import typings.devextreme.devextremeStrings.insertColumnRight
import typings.devextreme.devextremeStrings.insertRowAbove
import typings.devextreme.devextremeStrings.insertRowBelow
import typings.devextreme.devextremeStrings.insertTable
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
import typings.devextreme.mod.global.JQuery
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait dxHtmlEditorToolbar extends js.Object {
  
  /**
    * [descr:dxHtmlEditorToolbar.container]
    */
  var container: js.UndefOr[String | Element | JQuery] = js.native
  
  /**
    * [descr:dxHtmlEditorToolbar.items]
    */
  var items: js.UndefOr[
    js.Array[
      dxHtmlEditorToolbarItem | background | bold | color | font | italic | link | image | size | strike | subscript | superscript | underline | blockquote | header | increaseIndent | decreaseIndent | orderedList | bulletList | alignLeft | alignCenter | alignRight | alignJustify | codeBlock | variable | separator | undo | redo | clear | insertTable | insertRowAbove | insertRowBelow | insertColumnLeft | insertColumnRight | deleteColumn | deleteRow | deleteTable
    ]
  ] = js.native
  
  /**
    * [descr:dxHtmlEditorToolbar.multiline]
    */
  var multiline: js.UndefOr[Boolean] = js.native
}
object dxHtmlEditorToolbar {
  
  @scala.inline
  def apply(): dxHtmlEditorToolbar = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxHtmlEditorToolbar]
  }
  
  @scala.inline
  implicit class dxHtmlEditorToolbarOps[Self <: dxHtmlEditorToolbar] (val x: Self) extends AnyVal {
    
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
    def setContainer(value: String | Element | JQuery): Self = this.set("container", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContainer: Self = this.set("container", js.undefined)
    
    @scala.inline
    def setItemsVarargs(
      value: (dxHtmlEditorToolbarItem | background | bold | color | font | italic | link | image | size | strike | subscript | superscript | underline | blockquote | header | increaseIndent | decreaseIndent | orderedList | bulletList | alignLeft | alignCenter | alignRight | alignJustify | codeBlock | variable | separator | undo | redo | clear | insertTable | insertRowAbove | insertRowBelow | insertColumnLeft | insertColumnRight | deleteColumn | deleteRow | deleteTable)*
    ): Self = this.set("items", js.Array(value :_*))
    
    @scala.inline
    def setItems(
      value: js.Array[
          dxHtmlEditorToolbarItem | background | bold | color | font | italic | link | image | size | strike | subscript | superscript | underline | blockquote | header | increaseIndent | decreaseIndent | orderedList | bulletList | alignLeft | alignCenter | alignRight | alignJustify | codeBlock | variable | separator | undo | redo | clear | insertTable | insertRowAbove | insertRowBelow | insertColumnLeft | insertColumnRight | deleteColumn | deleteRow | deleteTable
        ]
    ): Self = this.set("items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItems: Self = this.set("items", js.undefined)
    
    @scala.inline
    def setMultiline(value: Boolean): Self = this.set("multiline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMultiline: Self = this.set("multiline", js.undefined)
  }
}
