package typings.fundamentalReact

import typings.fundamentalReact.anon.FunctionComponentListFoot
import typings.fundamentalReact.anon.FunctionComponentListHead
import typings.fundamentalReact.anon.FunctionComponentListIcon
import typings.fundamentalReact.anon.FunctionComponentListItem
import typings.fundamentalReact.anon.FunctionComponentListSele
import typings.fundamentalReact.anon.FunctionComponentListText
import typings.fundamentalReact.anon.PartialListProps
import typings.fundamentalReact.anon.WeakValidationMapListProp
import typings.fundamentalReact.fundamentalReactNumbers.`2`
import typings.fundamentalReact.fundamentalReactNumbers.`3`
import typings.fundamentalReact.fundamentalReactNumbers.`4`
import typings.fundamentalReact.fundamentalReactNumbers.`5`
import typings.fundamentalReact.fundamentalReactNumbers.`6`
import typings.fundamentalReact.fundamentalReactStrings.List
import typings.fundamentalReact.iconMod.IconGlyph
import typings.react.mod.HTMLAttributes
import typings.react.mod.PropsWithChildren
import typings.react.mod.ReactElement
import typings.react.mod.Ref
import typings.react.mod.SyntheticEvent
import typings.react.mod.ValidationMap
import typings.react.mod.global.JSX.Element
import typings.std.Event
import typings.std.HTMLAnchorElement
import typings.std.HTMLInputElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object listMod {
  
  /* Inlined react.react.FunctionComponent<fundamental-react.fundamental-react/lib/List/List.ListProps> & {  displayName :'List',   Footer :react.react.FunctionComponent<fundamental-react.fundamental-react/lib/List/List.ListFooterProps> & {  displayName :'List.Footer'},   Header :react.react.FunctionComponent<fundamental-react.fundamental-react/lib/List/List.ListHeaderProps> & {  displayName :'List.Header'},   Selection :react.react.FunctionComponent<fundamental-react.fundamental-react/lib/List/List.ListSelectionProps> & {  displayName :'List.Selection'},   Icon :react.react.FunctionComponent<fundamental-react.fundamental-react/lib/List/List.ListIconProps> & {  displayName :'List.Icon'},   Item :react.react.FunctionComponent<fundamental-react.fundamental-react/lib/List/List.ListItemProps> & {  displayName :'List.Item'},   Text :react.react.FunctionComponent<fundamental-react.fundamental-react/lib/List/List.ListTextProps> & {  displayName :'List.Text'}} */
  object default {
    
    @scala.inline
    def apply(props: PropsWithChildren[ListProps]): ReactElement | Null = ^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any]).asInstanceOf[ReactElement | Null]
    @scala.inline
    def apply(props: PropsWithChildren[ListProps], context: js.Any): ReactElement | Null = (^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[ReactElement | Null]
    
    @JSImport("fundamental-react/lib/List/List", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("fundamental-react/lib/List/List", "default.Footer")
    @js.native
    def Footer: FunctionComponentListFoot = js.native
    @scala.inline
    def Footer_=(x: FunctionComponentListFoot): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Footer")(x.asInstanceOf[js.Any])
    
    @JSImport("fundamental-react/lib/List/List", "default.Header")
    @js.native
    def Header: FunctionComponentListHead = js.native
    @scala.inline
    def Header_=(x: FunctionComponentListHead): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Header")(x.asInstanceOf[js.Any])
    
    @JSImport("fundamental-react/lib/List/List", "default.Icon")
    @js.native
    def Icon: FunctionComponentListIcon = js.native
    @scala.inline
    def Icon_=(x: FunctionComponentListIcon): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Icon")(x.asInstanceOf[js.Any])
    
    @JSImport("fundamental-react/lib/List/List", "default.Item")
    @js.native
    def Item: FunctionComponentListItem = js.native
    @scala.inline
    def Item_=(x: FunctionComponentListItem): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Item")(x.asInstanceOf[js.Any])
    
    @JSImport("fundamental-react/lib/List/List", "default.Selection")
    @js.native
    def Selection: FunctionComponentListSele = js.native
    @scala.inline
    def Selection_=(x: FunctionComponentListSele): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Selection")(x.asInstanceOf[js.Any])
    
    @JSImport("fundamental-react/lib/List/List", "default.Text")
    @js.native
    def Text: FunctionComponentListText = js.native
    @scala.inline
    def Text_=(x: FunctionComponentListText): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Text")(x.asInstanceOf[js.Any])
    
    @JSImport("fundamental-react/lib/List/List", "default.contextTypes")
    @js.native
    def contextTypes: js.UndefOr[ValidationMap[js.Any]] = js.native
    @scala.inline
    def contextTypes_=(x: js.UndefOr[ValidationMap[js.Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextTypes")(x.asInstanceOf[js.Any])
    
    @JSImport("fundamental-react/lib/List/List", "default.defaultProps")
    @js.native
    def defaultProps: js.UndefOr[PartialListProps] = js.native
    @scala.inline
    def defaultProps_=(x: js.UndefOr[PartialListProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("fundamental-react/lib/List/List", "default.displayName")
    @js.native
    def displayName: js.UndefOr[List | String] = js.native
    @scala.inline
    def displayName_=(x: js.UndefOr[List | String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
    
    @JSImport("fundamental-react/lib/List/List", "default.propTypes")
    @js.native
    def propTypes: js.UndefOr[WeakValidationMapListProp] = js.native
    @scala.inline
    def propTypes_=(x: js.UndefOr[WeakValidationMapListProp]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
  }
  
  trait ListFooterProps extends StObject {
    
    var className: js.UndefOr[String] = js.undefined
  }
  object ListFooterProps {
    
    @scala.inline
    def apply(): ListFooterProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ListFooterProps]
    }
    
    @scala.inline
    implicit class ListFooterPropsMutableBuilder[Self <: ListFooterProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    }
  }
  
  trait ListHeaderProps extends StObject {
    
    var className: js.UndefOr[String] = js.undefined
  }
  object ListHeaderProps {
    
    @scala.inline
    def apply(): ListHeaderProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ListHeaderProps]
    }
    
    @scala.inline
    implicit class ListHeaderPropsMutableBuilder[Self <: ListHeaderProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    }
  }
  
  trait ListIconProps extends StObject {
    
    var className: js.UndefOr[String] = js.undefined
    
    var glyph: IconGlyph
  }
  object ListIconProps {
    
    @scala.inline
    implicit class ListIconPropsMutableBuilder[Self <: ListIconProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setGlyph(value: IconGlyph): Self = StObject.set(x, "glyph", value.asInstanceOf[js.Any])
    }
  }
  
  trait ListItemProps extends StObject {
    
    var className: js.UndefOr[String] = js.undefined
    
    var onClick: js.UndefOr[js.Function1[/* repeated */ js.Any, js.Any]] = js.undefined
    
    var selected: js.UndefOr[Boolean] = js.undefined
  }
  object ListItemProps {
    
    @scala.inline
    def apply(): ListItemProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ListItemProps]
    }
    
    @scala.inline
    implicit class ListItemPropsMutableBuilder[Self <: ListItemProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setOnClick(value: /* repeated */ js.Any => js.Any): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      @scala.inline
      def setSelected(value: Boolean): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
    }
  }
  
  trait ListProps
    extends StObject
       with HTMLAttributes[HTMLAnchorElement] {
    
    var compact: js.UndefOr[Boolean] = js.undefined
    
    var disableStyles: js.UndefOr[Boolean] = js.undefined
    
    var footer: js.UndefOr[String | Element] = js.undefined
    
    var header: js.UndefOr[String | Element] = js.undefined
    
    var level: js.UndefOr[`2` | `3` | `4` | `5` | `6`] = js.undefined
    
    var navigation: js.UndefOr[Boolean] = js.undefined
    
    var noBorder: js.UndefOr[Boolean] = js.undefined
    
    var partialNavigation: js.UndefOr[Boolean] = js.undefined
    
    var ref: js.UndefOr[Ref[HTMLAnchorElement]] = js.undefined
    
    var selectable: js.UndefOr[Boolean] = js.undefined
  }
  object ListProps {
    
    @scala.inline
    def apply(): ListProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ListProps]
    }
    
    @scala.inline
    implicit class ListPropsMutableBuilder[Self <: ListProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCompact(value: Boolean): Self = StObject.set(x, "compact", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCompactUndefined: Self = StObject.set(x, "compact", js.undefined)
      
      @scala.inline
      def setDisableStyles(value: Boolean): Self = StObject.set(x, "disableStyles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableStylesUndefined: Self = StObject.set(x, "disableStyles", js.undefined)
      
      @scala.inline
      def setFooter(value: String | Element): Self = StObject.set(x, "footer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFooterUndefined: Self = StObject.set(x, "footer", js.undefined)
      
      @scala.inline
      def setHeader(value: String | Element): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
      
      @scala.inline
      def setLevel(value: `2` | `3` | `4` | `5` | `6`): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
      
      @scala.inline
      def setNavigation(value: Boolean): Self = StObject.set(x, "navigation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNavigationUndefined: Self = StObject.set(x, "navigation", js.undefined)
      
      @scala.inline
      def setNoBorder(value: Boolean): Self = StObject.set(x, "noBorder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoBorderUndefined: Self = StObject.set(x, "noBorder", js.undefined)
      
      @scala.inline
      def setPartialNavigation(value: Boolean): Self = StObject.set(x, "partialNavigation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPartialNavigationUndefined: Self = StObject.set(x, "partialNavigation", js.undefined)
      
      @scala.inline
      def setRef(value: Ref[HTMLAnchorElement]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRefFunction1(value: /* instance */ HTMLAnchorElement | Null => Unit): Self = StObject.set(x, "ref", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRefNull: Self = StObject.set(x, "ref", null)
      
      @scala.inline
      def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
      
      @scala.inline
      def setSelectable(value: Boolean): Self = StObject.set(x, "selectable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectableUndefined: Self = StObject.set(x, "selectable", js.undefined)
    }
  }
  
  trait ListSelectionProps extends StObject {
    
    var checkBoxAriaLabel: String
    
    var className: js.UndefOr[String] = js.undefined
    
    var onChange: js.UndefOr[
        js.Function2[
          /* event */ SyntheticEvent[HTMLInputElement, Event], 
          /* checkedState */ Boolean, 
          Unit
        ]
      ] = js.undefined
    
    var selected: js.UndefOr[Boolean] = js.undefined
  }
  object ListSelectionProps {
    
    @scala.inline
    def apply(checkBoxAriaLabel: String): ListSelectionProps = {
      val __obj = js.Dynamic.literal(checkBoxAriaLabel = checkBoxAriaLabel.asInstanceOf[js.Any])
      __obj.asInstanceOf[ListSelectionProps]
    }
    
    @scala.inline
    implicit class ListSelectionPropsMutableBuilder[Self <: ListSelectionProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCheckBoxAriaLabel(value: String): Self = StObject.set(x, "checkBoxAriaLabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setOnChange(value: (/* event */ SyntheticEvent[HTMLInputElement, Event], /* checkedState */ Boolean) => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      @scala.inline
      def setSelected(value: Boolean): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
    }
  }
  
  trait ListTextProps extends StObject {
    
    var className: js.UndefOr[String] = js.undefined
    
    var noWrap: js.UndefOr[Boolean] = js.undefined
    
    var secondary: js.UndefOr[Boolean] = js.undefined
  }
  object ListTextProps {
    
    @scala.inline
    def apply(): ListTextProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ListTextProps]
    }
    
    @scala.inline
    implicit class ListTextPropsMutableBuilder[Self <: ListTextProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setNoWrap(value: Boolean): Self = StObject.set(x, "noWrap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoWrapUndefined: Self = StObject.set(x, "noWrap", js.undefined)
      
      @scala.inline
      def setSecondary(value: Boolean): Self = StObject.set(x, "secondary", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecondaryUndefined: Self = StObject.set(x, "secondary", js.undefined)
    }
  }
}
