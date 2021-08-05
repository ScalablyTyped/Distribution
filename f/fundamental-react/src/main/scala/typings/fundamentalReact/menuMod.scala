package typings.fundamentalReact

import org.scalablytyped.runtime.StringDictionary
import typings.fundamentalReact.anon.FunctionComponentMenuGrou
import typings.fundamentalReact.anon.FunctionComponentMenuItem
import typings.fundamentalReact.anon.FunctionComponentMenuList
import typings.fundamentalReact.anon.PartialMenuProps
import typings.fundamentalReact.anon.WeakValidationMapMenuProp
import typings.fundamentalReact.fundamentalReactNumbers.`2`
import typings.fundamentalReact.fundamentalReactNumbers.`3`
import typings.fundamentalReact.fundamentalReactNumbers.`4`
import typings.fundamentalReact.fundamentalReactNumbers.`5`
import typings.fundamentalReact.fundamentalReactNumbers.`6`
import typings.fundamentalReact.fundamentalReactStrings.Menu
import typings.react.mod.HTMLAttributes
import typings.react.mod.PropsWithChildren
import typings.react.mod.ReactElement
import typings.react.mod.ValidationMap
import typings.std.HTMLButtonElement
import typings.std.HTMLDivElement
import typings.std.HTMLElement
import typings.std.HTMLLIElement
import typings.std.HTMLUListElement
import typings.std.MouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object menuMod {
  
  /* Inlined react.react.FunctionComponent<fundamental-react.fundamental-react/lib/Menu/Menu.MenuProps> & {  displayName :'Menu',   Group :react.react.FunctionComponent<fundamental-react.fundamental-react/lib/Menu/Menu.MenuGroupProps> & {  displayName :'Menu.Group'},   Item :react.react.FunctionComponent<fundamental-react.fundamental-react/lib/Menu/Menu.MenuItemProps> & {  displayName :'Menu.Item'},   List :react.react.FunctionComponent<fundamental-react.fundamental-react/lib/Menu/Menu.MenuListProps> & {  displayName :'Menu.List'}} */
  object default {
    
    inline def apply(props: PropsWithChildren[MenuProps]): ReactElement | Null = ^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any]).asInstanceOf[ReactElement | Null]
    inline def apply(props: PropsWithChildren[MenuProps], context: js.Any): ReactElement | Null = (^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[ReactElement | Null]
    
    @JSImport("fundamental-react/lib/Menu/Menu", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("fundamental-react/lib/Menu/Menu", "default.Group")
    @js.native
    def Group: FunctionComponentMenuGrou = js.native
    inline def Group_=(x: FunctionComponentMenuGrou): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Group")(x.asInstanceOf[js.Any])
    
    @JSImport("fundamental-react/lib/Menu/Menu", "default.Item")
    @js.native
    def Item: FunctionComponentMenuItem = js.native
    inline def Item_=(x: FunctionComponentMenuItem): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Item")(x.asInstanceOf[js.Any])
    
    @JSImport("fundamental-react/lib/Menu/Menu", "default.List")
    @js.native
    def List: FunctionComponentMenuList = js.native
    inline def List_=(x: FunctionComponentMenuList): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("List")(x.asInstanceOf[js.Any])
    
    @JSImport("fundamental-react/lib/Menu/Menu", "default.contextTypes")
    @js.native
    def contextTypes: js.UndefOr[ValidationMap[js.Any]] = js.native
    inline def contextTypes_=(x: js.UndefOr[ValidationMap[js.Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextTypes")(x.asInstanceOf[js.Any])
    
    @JSImport("fundamental-react/lib/Menu/Menu", "default.defaultProps")
    @js.native
    def defaultProps: js.UndefOr[PartialMenuProps] = js.native
    inline def defaultProps_=(x: js.UndefOr[PartialMenuProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("fundamental-react/lib/Menu/Menu", "default.displayName")
    @js.native
    def displayName: js.UndefOr[Menu | String] = js.native
    inline def displayName_=(x: js.UndefOr[Menu | String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
    
    @JSImport("fundamental-react/lib/Menu/Menu", "default.propTypes")
    @js.native
    def propTypes: js.UndefOr[WeakValidationMapMenuProp] = js.native
    inline def propTypes_=(x: js.UndefOr[WeakValidationMapMenuProp]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
  }
  
  trait MenuGroupProps
    extends StObject
       with HTMLAttributes[HTMLDivElement] {
    
    var headingLevel: js.UndefOr[`2` | `3` | `4` | `5` | `6`] = js.undefined
    
    var titleProps: js.UndefOr[StringDictionary[js.Any]] = js.undefined
    
    @JSName("title")
    var title_MenuGroupProps: String
  }
  object MenuGroupProps {
    
    inline def apply(title: String): MenuGroupProps = {
      val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[MenuGroupProps]
    }
    
    extension [Self <: MenuGroupProps](x: Self) {
      
      inline def setHeadingLevel(value: `2` | `3` | `4` | `5` | `6`): Self = StObject.set(x, "headingLevel", value.asInstanceOf[js.Any])
      
      inline def setHeadingLevelUndefined: Self = StObject.set(x, "headingLevel", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleProps(value: StringDictionary[js.Any]): Self = StObject.set(x, "titleProps", value.asInstanceOf[js.Any])
      
      inline def setTitlePropsUndefined: Self = StObject.set(x, "titleProps", js.undefined)
    }
  }
  
  trait MenuItemProps
    extends StObject
       with HTMLAttributes[HTMLLIElement] {
    
    var active: js.UndefOr[Boolean] = js.undefined
    
    var addonAfter: js.UndefOr[String] = js.undefined
    
    var addonBefore: js.UndefOr[String] = js.undefined
    
    var addonProps: js.UndefOr[js.Any] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var isLink: js.UndefOr[Boolean] = js.undefined
    
    @JSName("onClick")
    var onClick_MenuItemProps: js.UndefOr[
        js.Function1[/* event */ typings.react.mod.MouseEvent[HTMLButtonElement, MouseEvent], Unit]
      ] = js.undefined
    
    var selected: js.UndefOr[Boolean] = js.undefined
    
    var separator: js.UndefOr[Boolean] = js.undefined
    
    var url: js.UndefOr[String] = js.undefined
    
    var urlProps: js.UndefOr[js.Any] = js.undefined
  }
  object MenuItemProps {
    
    inline def apply(): MenuItemProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MenuItemProps]
    }
    
    extension [Self <: MenuItemProps](x: Self) {
      
      inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      inline def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
      
      inline def setAddonAfter(value: String): Self = StObject.set(x, "addonAfter", value.asInstanceOf[js.Any])
      
      inline def setAddonAfterUndefined: Self = StObject.set(x, "addonAfter", js.undefined)
      
      inline def setAddonBefore(value: String): Self = StObject.set(x, "addonBefore", value.asInstanceOf[js.Any])
      
      inline def setAddonBeforeUndefined: Self = StObject.set(x, "addonBefore", js.undefined)
      
      inline def setAddonProps(value: js.Any): Self = StObject.set(x, "addonProps", value.asInstanceOf[js.Any])
      
      inline def setAddonPropsUndefined: Self = StObject.set(x, "addonProps", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setIsLink(value: Boolean): Self = StObject.set(x, "isLink", value.asInstanceOf[js.Any])
      
      inline def setIsLinkUndefined: Self = StObject.set(x, "isLink", js.undefined)
      
      inline def setOnClick(value: /* event */ typings.react.mod.MouseEvent[HTMLButtonElement, MouseEvent] => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      inline def setSelected(value: Boolean): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
      
      inline def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
      
      inline def setSeparator(value: Boolean): Self = StObject.set(x, "separator", value.asInstanceOf[js.Any])
      
      inline def setSeparatorUndefined: Self = StObject.set(x, "separator", js.undefined)
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUrlProps(value: js.Any): Self = StObject.set(x, "urlProps", value.asInstanceOf[js.Any])
      
      inline def setUrlPropsUndefined: Self = StObject.set(x, "urlProps", js.undefined)
      
      inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    }
  }
  
  trait MenuListProps
    extends StObject
       with HTMLAttributes[HTMLUListElement] {
    
    var addonBefore: js.UndefOr[Boolean] = js.undefined
    
    var separated: js.UndefOr[Boolean] = js.undefined
  }
  object MenuListProps {
    
    inline def apply(): MenuListProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MenuListProps]
    }
    
    extension [Self <: MenuListProps](x: Self) {
      
      inline def setAddonBefore(value: Boolean): Self = StObject.set(x, "addonBefore", value.asInstanceOf[js.Any])
      
      inline def setAddonBeforeUndefined: Self = StObject.set(x, "addonBefore", js.undefined)
      
      inline def setSeparated(value: Boolean): Self = StObject.set(x, "separated", value.asInstanceOf[js.Any])
      
      inline def setSeparatedUndefined: Self = StObject.set(x, "separated", js.undefined)
    }
  }
  
  trait MenuProps
    extends StObject
       with HTMLAttributes[HTMLElement] {
    
    var addonBefore: js.UndefOr[Boolean] = js.undefined
    
    var disableStyles: js.UndefOr[Boolean] = js.undefined
  }
  object MenuProps {
    
    inline def apply(): MenuProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MenuProps]
    }
    
    extension [Self <: MenuProps](x: Self) {
      
      inline def setAddonBefore(value: Boolean): Self = StObject.set(x, "addonBefore", value.asInstanceOf[js.Any])
      
      inline def setAddonBeforeUndefined: Self = StObject.set(x, "addonBefore", js.undefined)
      
      inline def setDisableStyles(value: Boolean): Self = StObject.set(x, "disableStyles", value.asInstanceOf[js.Any])
      
      inline def setDisableStylesUndefined: Self = StObject.set(x, "disableStyles", js.undefined)
    }
  }
}
