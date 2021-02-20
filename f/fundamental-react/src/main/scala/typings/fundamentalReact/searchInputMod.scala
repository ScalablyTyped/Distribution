package typings.fundamentalReact

import org.scalablytyped.runtime.StringDictionary
import typings.fundamentalReact.anon.Callback
import typings.fundamentalReact.anon.Text
import typings.react.mod.ChangeEvent
import typings.react.mod.Component
import typings.std.HTMLInputElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object searchInputMod {
  
  @JSImport("fundamental-react/lib/SearchInput/SearchInput", JSImport.Default)
  @js.native
  class default ()
    extends Component[SearchInputProps, js.Object, js.Any]
  object default {
    
    @JSImport("fundamental-react/lib/SearchInput/SearchInput", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("fundamental-react/lib/SearchInput/SearchInput", "default.displayName")
    @js.native
    def displayName: typings.fundamentalReact.fundamentalReactStrings.SearchInput = js.native
    @scala.inline
    def displayName_=(x: typings.fundamentalReact.fundamentalReactStrings.SearchInput): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
  
  type SearchInput = Component[SearchInputProps, js.Object, js.Any]
  
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
    implicit class SearchInputPropsMutableBuilder[Self <: SearchInputProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setCompact(value: Boolean): Self = StObject.set(x, "compact", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCompactUndefined: Self = StObject.set(x, "compact", js.undefined)
      
      @scala.inline
      def setDisableStyles(value: Boolean): Self = StObject.set(x, "disableStyles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableStylesUndefined: Self = StObject.set(x, "disableStyles", js.undefined)
      
      @scala.inline
      def setInShellbar(value: Boolean): Self = StObject.set(x, "inShellbar", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInShellbarUndefined: Self = StObject.set(x, "inShellbar", js.undefined)
      
      @scala.inline
      def setInputGroupAddonProps(value: js.Any): Self = StObject.set(x, "inputGroupAddonProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInputGroupAddonPropsUndefined: Self = StObject.set(x, "inputGroupAddonProps", js.undefined)
      
      @scala.inline
      def setInputGroupProps(value: js.Any): Self = StObject.set(x, "inputGroupProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInputGroupPropsUndefined: Self = StObject.set(x, "inputGroupProps", js.undefined)
      
      @scala.inline
      def setInputProps(value: js.Any): Self = StObject.set(x, "inputProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInputPropsUndefined: Self = StObject.set(x, "inputProps", js.undefined)
      
      @scala.inline
      def setListProps(value: js.Any): Self = StObject.set(x, "listProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setListPropsUndefined: Self = StObject.set(x, "listProps", js.undefined)
      
      @scala.inline
      def setNoSearchBtn(value: Boolean): Self = StObject.set(x, "noSearchBtn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoSearchBtnUndefined: Self = StObject.set(x, "noSearchBtn", js.undefined)
      
      @scala.inline
      def setOnChange(value: /* event */ ChangeEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      @scala.inline
      def setOnEnter(value: /* value */ js.UndefOr[String | Double | js.Array[String]] => Unit): Self = StObject.set(x, "onEnter", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnEnterUndefined: Self = StObject.set(x, "onEnter", js.undefined)
      
      @scala.inline
      def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
      
      @scala.inline
      def setPopoverProps(value: js.Any): Self = StObject.set(x, "popoverProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPopoverPropsUndefined: Self = StObject.set(x, "popoverProps", js.undefined)
      
      @scala.inline
      def setSearchBtnProps(value: js.Any): Self = StObject.set(x, "searchBtnProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSearchBtnPropsUndefined: Self = StObject.set(x, "searchBtnProps", js.undefined)
      
      @scala.inline
      def setSearchList(value: js.Array[Callback]): Self = StObject.set(x, "searchList", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSearchListUndefined: Self = StObject.set(x, "searchList", js.undefined)
      
      @scala.inline
      def setSearchListVarargs(value: Callback*): Self = StObject.set(x, "searchList", js.Array(value :_*))
      
      @scala.inline
      def setValidationState(value: Text): Self = StObject.set(x, "validationState", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValidationStateUndefined: Self = StObject.set(x, "validationState", js.undefined)
    }
  }
}
