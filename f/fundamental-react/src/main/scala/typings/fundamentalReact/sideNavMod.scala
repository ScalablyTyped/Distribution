package typings.fundamentalReact

import typings.fundamentalReact.anon.Href
import typings.fundamentalReact.anon.PartialSideNavListItemPro
import typings.fundamentalReact.anon.PartialSideNavListProps
import typings.fundamentalReact.anon.WeakValidationMapSideNavL
import typings.fundamentalReact.anon.WeakValidationMapSideNavLAbout
import typings.fundamentalReact.fundamentalReactStrings.SideNavDotList
import typings.fundamentalReact.fundamentalReactStrings.SideNavDotListItem
import typings.fundamentalReact.iconMod.IconGlyph
import typings.react.mod.Component
import typings.react.mod.ComponentState
import typings.react.mod.Context
import typings.react.mod.GetDerivedStateFromError
import typings.react.mod.GetDerivedStateFromProps
import typings.react.mod.HTMLAttributes
import typings.react.mod.ValidationMap
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sideNavMod {
  
  @JSImport("fundamental-react/lib/SideNavigation/SideNav", JSImport.Default)
  @js.native
  open class default ()
    extends Component[SideNavProps, js.Object, Any]
  object default {
    
    @JSImport("fundamental-react/lib/SideNavigation/SideNav", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("fundamental-react/lib/SideNavigation/SideNav", "default.List")
    @js.native
    open class List protected () extends Component[SideNavListProps, ComponentState, Any] {
      def this(props: SideNavListProps) = this()
      def this(props: SideNavListProps, context: Any) = this()
    }
    /* static member */
    /* Inlined react.react.ComponentClass<fundamental-react.fundamental-react/lib/SideNavigation/SideNav.SideNavListProps, react.react.ComponentState> & {  displayName :'SideNav.List'} */
    object List {
      
      @JSImport("fundamental-react/lib/SideNavigation/SideNav", "default.List")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("fundamental-react/lib/SideNavigation/SideNav", "default.List.childContextTypes")
      @js.native
      def childContextTypes: js.UndefOr[ValidationMap[Any]] = js.native
      inline def childContextTypes_=(x: js.UndefOr[ValidationMap[Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("childContextTypes")(x.asInstanceOf[js.Any])
      
      @JSImport("fundamental-react/lib/SideNavigation/SideNav", "default.List.contextType")
      @js.native
      def contextType: js.UndefOr[Context[Any]] = js.native
      inline def contextType_=(x: js.UndefOr[Context[Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextType")(x.asInstanceOf[js.Any])
      
      @JSImport("fundamental-react/lib/SideNavigation/SideNav", "default.List.contextTypes")
      @js.native
      def contextTypes: js.UndefOr[ValidationMap[Any]] = js.native
      inline def contextTypes_=(x: js.UndefOr[ValidationMap[Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextTypes")(x.asInstanceOf[js.Any])
      
      @JSImport("fundamental-react/lib/SideNavigation/SideNav", "default.List.defaultProps")
      @js.native
      def defaultProps: js.UndefOr[PartialSideNavListProps] = js.native
      inline def defaultProps_=(x: js.UndefOr[PartialSideNavListProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
      
      @JSImport("fundamental-react/lib/SideNavigation/SideNav", "default.List.displayName")
      @js.native
      def displayName: js.UndefOr[SideNavDotList | String] = js.native
      inline def displayName_=(x: js.UndefOr[SideNavDotList | String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
      
      @JSImport("fundamental-react/lib/SideNavigation/SideNav", "default.List.getDerivedStateFromError")
      @js.native
      def getDerivedStateFromError: js.UndefOr[GetDerivedStateFromError[SideNavListProps, ComponentState]] = js.native
      inline def getDerivedStateFromError_=(x: js.UndefOr[GetDerivedStateFromError[SideNavListProps, ComponentState]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getDerivedStateFromError")(x.asInstanceOf[js.Any])
      
      @JSImport("fundamental-react/lib/SideNavigation/SideNav", "default.List.getDerivedStateFromProps")
      @js.native
      def getDerivedStateFromProps: js.UndefOr[GetDerivedStateFromProps[SideNavListProps, ComponentState]] = js.native
      inline def getDerivedStateFromProps_=(x: js.UndefOr[GetDerivedStateFromProps[SideNavListProps, ComponentState]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getDerivedStateFromProps")(x.asInstanceOf[js.Any])
      
      @JSImport("fundamental-react/lib/SideNavigation/SideNav", "default.List.propTypes")
      @js.native
      def propTypes: js.UndefOr[WeakValidationMapSideNavL] = js.native
      inline def propTypes_=(x: js.UndefOr[WeakValidationMapSideNavL]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("fundamental-react/lib/SideNavigation/SideNav", "default.ListItem")
    @js.native
    open class ListItem protected () extends Component[SideNavListItemProps, ComponentState, Any] {
      def this(props: SideNavListItemProps) = this()
      def this(props: SideNavListItemProps, context: Any) = this()
    }
    /* static member */
    /* Inlined react.react.ComponentClass<fundamental-react.fundamental-react/lib/SideNavigation/SideNav.SideNavListItemProps, react.react.ComponentState> & {  displayName :'SideNav.ListItem'} */
    object ListItem {
      
      @JSImport("fundamental-react/lib/SideNavigation/SideNav", "default.ListItem")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("fundamental-react/lib/SideNavigation/SideNav", "default.ListItem.childContextTypes")
      @js.native
      def childContextTypes: js.UndefOr[ValidationMap[Any]] = js.native
      inline def childContextTypes_=(x: js.UndefOr[ValidationMap[Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("childContextTypes")(x.asInstanceOf[js.Any])
      
      @JSImport("fundamental-react/lib/SideNavigation/SideNav", "default.ListItem.contextType")
      @js.native
      def contextType: js.UndefOr[Context[Any]] = js.native
      inline def contextType_=(x: js.UndefOr[Context[Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextType")(x.asInstanceOf[js.Any])
      
      @JSImport("fundamental-react/lib/SideNavigation/SideNav", "default.ListItem.contextTypes")
      @js.native
      def contextTypes: js.UndefOr[ValidationMap[Any]] = js.native
      inline def contextTypes_=(x: js.UndefOr[ValidationMap[Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextTypes")(x.asInstanceOf[js.Any])
      
      @JSImport("fundamental-react/lib/SideNavigation/SideNav", "default.ListItem.defaultProps")
      @js.native
      def defaultProps: js.UndefOr[PartialSideNavListItemPro] = js.native
      inline def defaultProps_=(x: js.UndefOr[PartialSideNavListItemPro]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
      
      @JSImport("fundamental-react/lib/SideNavigation/SideNav", "default.ListItem.displayName")
      @js.native
      def displayName: js.UndefOr[SideNavDotListItem | String] = js.native
      inline def displayName_=(x: js.UndefOr[SideNavDotListItem | String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
      
      @JSImport("fundamental-react/lib/SideNavigation/SideNav", "default.ListItem.getDerivedStateFromError")
      @js.native
      def getDerivedStateFromError: js.UndefOr[GetDerivedStateFromError[SideNavListItemProps, ComponentState]] = js.native
      inline def getDerivedStateFromError_=(x: js.UndefOr[GetDerivedStateFromError[SideNavListItemProps, ComponentState]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getDerivedStateFromError")(x.asInstanceOf[js.Any])
      
      @JSImport("fundamental-react/lib/SideNavigation/SideNav", "default.ListItem.getDerivedStateFromProps")
      @js.native
      def getDerivedStateFromProps: js.UndefOr[GetDerivedStateFromProps[SideNavListItemProps, ComponentState]] = js.native
      inline def getDerivedStateFromProps_=(x: js.UndefOr[GetDerivedStateFromProps[SideNavListItemProps, ComponentState]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getDerivedStateFromProps")(x.asInstanceOf[js.Any])
      
      @JSImport("fundamental-react/lib/SideNavigation/SideNav", "default.ListItem.propTypes")
      @js.native
      def propTypes: js.UndefOr[WeakValidationMapSideNavLAbout] = js.native
      inline def propTypes_=(x: js.UndefOr[WeakValidationMapSideNavLAbout]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
    }
    
    /* static member */
    @JSImport("fundamental-react/lib/SideNavigation/SideNav", "default.displayName")
    @js.native
    def displayName: typings.fundamentalReact.fundamentalReactStrings.SideNav = js.native
    inline def displayName_=(x: typings.fundamentalReact.fundamentalReactStrings.SideNav): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
  
  type SideNav = Component[SideNavProps, js.Object, Any]
  
  trait SideNavListItemProps
    extends StObject
       with HTMLAttributes[Element] {
    
    var condensed: js.UndefOr[Boolean] = js.undefined
    
    var expandSubmenuLabel: js.UndefOr[String] = js.undefined
    
    var expanded: js.UndefOr[Boolean] = js.undefined
    
    var glyph: js.UndefOr[IconGlyph] = js.undefined
    
    var isSubItem: js.UndefOr[Boolean] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    @JSName("onClick")
    var onClick_SideNavListItemProps: js.UndefOr[js.Function1[/* repeated */ Any, Any]] = js.undefined
    
    var onItemSelect: js.UndefOr[js.Function1[/* repeated */ Any, Any]] = js.undefined
    
    var selected: js.UndefOr[Boolean] = js.undefined
    
    var selectedId: js.UndefOr[String] = js.undefined
    
    var url: js.UndefOr[String] = js.undefined
  }
  object SideNavListItemProps {
    
    inline def apply(): SideNavListItemProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SideNavListItemProps]
    }
    
    extension [Self <: SideNavListItemProps](x: Self) {
      
      inline def setCondensed(value: Boolean): Self = StObject.set(x, "condensed", value.asInstanceOf[js.Any])
      
      inline def setCondensedUndefined: Self = StObject.set(x, "condensed", js.undefined)
      
      inline def setExpandSubmenuLabel(value: String): Self = StObject.set(x, "expandSubmenuLabel", value.asInstanceOf[js.Any])
      
      inline def setExpandSubmenuLabelUndefined: Self = StObject.set(x, "expandSubmenuLabel", js.undefined)
      
      inline def setExpanded(value: Boolean): Self = StObject.set(x, "expanded", value.asInstanceOf[js.Any])
      
      inline def setExpandedUndefined: Self = StObject.set(x, "expanded", js.undefined)
      
      inline def setGlyph(value: IconGlyph): Self = StObject.set(x, "glyph", value.asInstanceOf[js.Any])
      
      inline def setGlyphUndefined: Self = StObject.set(x, "glyph", js.undefined)
      
      inline def setIsSubItem(value: Boolean): Self = StObject.set(x, "isSubItem", value.asInstanceOf[js.Any])
      
      inline def setIsSubItemUndefined: Self = StObject.set(x, "isSubItem", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setOnClick(value: /* repeated */ Any => Any): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      inline def setOnItemSelect(value: /* repeated */ Any => Any): Self = StObject.set(x, "onItemSelect", js.Any.fromFunction1(value))
      
      inline def setOnItemSelectUndefined: Self = StObject.set(x, "onItemSelect", js.undefined)
      
      inline def setSelected(value: Boolean): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
      
      inline def setSelectedId(value: String): Self = StObject.set(x, "selectedId", value.asInstanceOf[js.Any])
      
      inline def setSelectedIdUndefined: Self = StObject.set(x, "selectedId", js.undefined)
      
      inline def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    }
  }
  
  trait SideNavListProps
    extends StObject
       with HTMLAttributes[Element] {
    
    var compact: js.UndefOr[Boolean] = js.undefined
    
    var condensed: js.UndefOr[Boolean] = js.undefined
    
    var groupLabel: js.UndefOr[String] = js.undefined
    
    var hasParent: js.UndefOr[Boolean] = js.undefined
    
    var isUtility: js.UndefOr[Boolean] = js.undefined
    
    var level: js.UndefOr[Double] = js.undefined
    
    var onItemSelect: js.UndefOr[js.Function1[/* repeated */ Any, Any]] = js.undefined
    
    var open: js.UndefOr[Boolean] = js.undefined
    
    var selectedId: js.UndefOr[String] = js.undefined
    
    var titleProps: js.UndefOr[Any] = js.undefined
  }
  object SideNavListProps {
    
    inline def apply(): SideNavListProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SideNavListProps]
    }
    
    extension [Self <: SideNavListProps](x: Self) {
      
      inline def setCompact(value: Boolean): Self = StObject.set(x, "compact", value.asInstanceOf[js.Any])
      
      inline def setCompactUndefined: Self = StObject.set(x, "compact", js.undefined)
      
      inline def setCondensed(value: Boolean): Self = StObject.set(x, "condensed", value.asInstanceOf[js.Any])
      
      inline def setCondensedUndefined: Self = StObject.set(x, "condensed", js.undefined)
      
      inline def setGroupLabel(value: String): Self = StObject.set(x, "groupLabel", value.asInstanceOf[js.Any])
      
      inline def setGroupLabelUndefined: Self = StObject.set(x, "groupLabel", js.undefined)
      
      inline def setHasParent(value: Boolean): Self = StObject.set(x, "hasParent", value.asInstanceOf[js.Any])
      
      inline def setHasParentUndefined: Self = StObject.set(x, "hasParent", js.undefined)
      
      inline def setIsUtility(value: Boolean): Self = StObject.set(x, "isUtility", value.asInstanceOf[js.Any])
      
      inline def setIsUtilityUndefined: Self = StObject.set(x, "isUtility", js.undefined)
      
      inline def setLevel(value: Double): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
      
      inline def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
      
      inline def setOnItemSelect(value: /* repeated */ Any => Any): Self = StObject.set(x, "onItemSelect", js.Any.fromFunction1(value))
      
      inline def setOnItemSelectUndefined: Self = StObject.set(x, "onItemSelect", js.undefined)
      
      inline def setOpen(value: Boolean): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
      
      inline def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
      
      inline def setSelectedId(value: String): Self = StObject.set(x, "selectedId", value.asInstanceOf[js.Any])
      
      inline def setSelectedIdUndefined: Self = StObject.set(x, "selectedId", js.undefined)
      
      inline def setTitleProps(value: Any): Self = StObject.set(x, "titleProps", value.asInstanceOf[js.Any])
      
      inline def setTitlePropsUndefined: Self = StObject.set(x, "titleProps", js.undefined)
    }
  }
  
  trait SideNavProps
    extends StObject
       with HTMLAttributes[Element] {
    
    var compact: js.UndefOr[Boolean] = js.undefined
    
    var condensed: js.UndefOr[Boolean] = js.undefined
    
    var disableStyles: js.UndefOr[Boolean] = js.undefined
    
    var onItemSelect: js.UndefOr[js.Function2[/* e */ Any, /* id */ Any, Unit]] = js.undefined
    
    var selectedId: js.UndefOr[String] = js.undefined
    
    var skipLink: js.UndefOr[Href] = js.undefined
  }
  object SideNavProps {
    
    inline def apply(): SideNavProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SideNavProps]
    }
    
    extension [Self <: SideNavProps](x: Self) {
      
      inline def setCompact(value: Boolean): Self = StObject.set(x, "compact", value.asInstanceOf[js.Any])
      
      inline def setCompactUndefined: Self = StObject.set(x, "compact", js.undefined)
      
      inline def setCondensed(value: Boolean): Self = StObject.set(x, "condensed", value.asInstanceOf[js.Any])
      
      inline def setCondensedUndefined: Self = StObject.set(x, "condensed", js.undefined)
      
      inline def setDisableStyles(value: Boolean): Self = StObject.set(x, "disableStyles", value.asInstanceOf[js.Any])
      
      inline def setDisableStylesUndefined: Self = StObject.set(x, "disableStyles", js.undefined)
      
      inline def setOnItemSelect(value: (/* e */ Any, /* id */ Any) => Unit): Self = StObject.set(x, "onItemSelect", js.Any.fromFunction2(value))
      
      inline def setOnItemSelectUndefined: Self = StObject.set(x, "onItemSelect", js.undefined)
      
      inline def setSelectedId(value: String): Self = StObject.set(x, "selectedId", value.asInstanceOf[js.Any])
      
      inline def setSelectedIdUndefined: Self = StObject.set(x, "selectedId", js.undefined)
      
      inline def setSkipLink(value: Href): Self = StObject.set(x, "skipLink", value.asInstanceOf[js.Any])
      
      inline def setSkipLinkUndefined: Self = StObject.set(x, "skipLink", js.undefined)
    }
  }
}
