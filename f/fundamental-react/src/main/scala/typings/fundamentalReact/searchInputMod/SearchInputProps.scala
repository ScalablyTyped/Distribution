package typings.fundamentalReact.searchInputMod

import org.scalablytyped.runtime.StringDictionary
import typings.fundamentalReact.anon.Callback
import typings.fundamentalReact.anon.Text
import typings.react.mod.ChangeEvent
import typings.std.HTMLInputElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SearchInputProps
  extends /* x */ StringDictionary[js.Any] {
  
  var className: js.UndefOr[String] = js.native
  
  var compact: js.UndefOr[Boolean] = js.native
  
  var disableStyles: js.UndefOr[Boolean] = js.native
  
  var inShellbar: js.UndefOr[Boolean] = js.native
  
  var inputGroupAddonProps: js.UndefOr[js.Any] = js.native
  
  var inputGroupProps: js.UndefOr[js.Any] = js.native
  
  var inputProps: js.UndefOr[js.Any] = js.native
  
  var listProps: js.UndefOr[js.Any] = js.native
  
  var noSearchBtn: js.UndefOr[Boolean] = js.native
  
  var onChange: js.UndefOr[js.Function1[/* event */ ChangeEvent[HTMLInputElement], Unit]] = js.native
  
  var onEnter: js.UndefOr[js.Function1[/* value */ js.UndefOr[String | Double | js.Array[String]], Unit]] = js.native
  
  var placeholder: js.UndefOr[String] = js.native
  
  var popoverProps: js.UndefOr[js.Any] = js.native
  
  var searchBtnProps: js.UndefOr[js.Any] = js.native
  
  var searchList: js.UndefOr[js.Array[Callback]] = js.native
  
  var validationState: js.UndefOr[Text] = js.native
}
object SearchInputProps {
  
  @scala.inline
  def apply(): SearchInputProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchInputProps]
  }
  
  @scala.inline
  implicit class SearchInputPropsOps[Self <: SearchInputProps] (val x: Self) extends AnyVal {
    
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
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    
    @scala.inline
    def setCompact(value: Boolean): Self = this.set("compact", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCompact: Self = this.set("compact", js.undefined)
    
    @scala.inline
    def setDisableStyles(value: Boolean): Self = this.set("disableStyles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableStyles: Self = this.set("disableStyles", js.undefined)
    
    @scala.inline
    def setInShellbar(value: Boolean): Self = this.set("inShellbar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInShellbar: Self = this.set("inShellbar", js.undefined)
    
    @scala.inline
    def setInputGroupAddonProps(value: js.Any): Self = this.set("inputGroupAddonProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInputGroupAddonProps: Self = this.set("inputGroupAddonProps", js.undefined)
    
    @scala.inline
    def setInputGroupProps(value: js.Any): Self = this.set("inputGroupProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInputGroupProps: Self = this.set("inputGroupProps", js.undefined)
    
    @scala.inline
    def setInputProps(value: js.Any): Self = this.set("inputProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInputProps: Self = this.set("inputProps", js.undefined)
    
    @scala.inline
    def setListProps(value: js.Any): Self = this.set("listProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteListProps: Self = this.set("listProps", js.undefined)
    
    @scala.inline
    def setNoSearchBtn(value: Boolean): Self = this.set("noSearchBtn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNoSearchBtn: Self = this.set("noSearchBtn", js.undefined)
    
    @scala.inline
    def setOnChange(value: /* event */ ChangeEvent[HTMLInputElement] => Unit): Self = this.set("onChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnChange: Self = this.set("onChange", js.undefined)
    
    @scala.inline
    def setOnEnter(value: /* value */ js.UndefOr[String | Double | js.Array[String]] => Unit): Self = this.set("onEnter", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnEnter: Self = this.set("onEnter", js.undefined)
    
    @scala.inline
    def setPlaceholder(value: String): Self = this.set("placeholder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlaceholder: Self = this.set("placeholder", js.undefined)
    
    @scala.inline
    def setPopoverProps(value: js.Any): Self = this.set("popoverProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePopoverProps: Self = this.set("popoverProps", js.undefined)
    
    @scala.inline
    def setSearchBtnProps(value: js.Any): Self = this.set("searchBtnProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSearchBtnProps: Self = this.set("searchBtnProps", js.undefined)
    
    @scala.inline
    def setSearchListVarargs(value: Callback*): Self = this.set("searchList", js.Array(value :_*))
    
    @scala.inline
    def setSearchList(value: js.Array[Callback]): Self = this.set("searchList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSearchList: Self = this.set("searchList", js.undefined)
    
    @scala.inline
    def setValidationState(value: Text): Self = this.set("validationState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValidationState: Self = this.set("validationState", js.undefined)
  }
}
