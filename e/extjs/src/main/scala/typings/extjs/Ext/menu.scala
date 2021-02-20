package typings.extjs.Ext

import typings.extjs.Ext.picker.IColor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object menu {
  
  @js.native
  trait ICheckItem extends IItem {
    
    /** [Config Option] (Boolean) */
    var checkChangeDisabled: js.UndefOr[Boolean] = js.native
    
    /** [Config Option] (Function) */
    var checkHandler: js.UndefOr[js.Any] = js.native
    
    /** [Config Option] (Boolean) */
    var checked: js.UndefOr[Boolean] = js.native
    
    /** [Config Option] (String) */
    var checkedCls: js.UndefOr[java.lang.String] = js.native
    
    /** [Method] Disables just the checkbox functionality of this menu Item  */
    var disableCheckChange: js.UndefOr[js.Function0[Unit]] = js.native
    
    /** [Method] Reenables the checkbox functionality of this menu item after having been disabled by disableCheckChange */
    var enableCheckChange: js.UndefOr[js.Function0[Unit]] = js.native
    
    /** [Config Option] (String) */
    var group: js.UndefOr[java.lang.String] = js.native
    
    /** [Config Option] (String) */
    var groupCls: js.UndefOr[java.lang.String] = js.native
    
    /** [Config Option] (Object) */
    var scope: js.UndefOr[js.Any] = js.native
    
    /** [Method] Sets the checked state of the item
      * @param checked Boolean True to check, false to uncheck
      * @param suppressEvents Boolean True to prevent firing the checkchange events.
      */
    var setChecked: js.UndefOr[
        js.Function2[/* checked */ js.UndefOr[Boolean], /* suppressEvents */ js.UndefOr[Boolean], Unit]
      ] = js.native
    
    /** [Config Option] (String) */
    var uncheckedCls: js.UndefOr[java.lang.String] = js.native
  }
  object ICheckItem {
    
    @scala.inline
    def apply(): ICheckItem = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ICheckItem]
    }
    
    @scala.inline
    implicit class ICheckItemMutableBuilder[Self <: ICheckItem] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCheckChangeDisabled(value: Boolean): Self = StObject.set(x, "checkChangeDisabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCheckChangeDisabledUndefined: Self = StObject.set(x, "checkChangeDisabled", js.undefined)
      
      @scala.inline
      def setCheckHandler(value: js.Any): Self = StObject.set(x, "checkHandler", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCheckHandlerUndefined: Self = StObject.set(x, "checkHandler", js.undefined)
      
      @scala.inline
      def setChecked(value: Boolean): Self = StObject.set(x, "checked", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCheckedCls(value: java.lang.String): Self = StObject.set(x, "checkedCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCheckedClsUndefined: Self = StObject.set(x, "checkedCls", js.undefined)
      
      @scala.inline
      def setCheckedUndefined: Self = StObject.set(x, "checked", js.undefined)
      
      @scala.inline
      def setDisableCheckChange(value: () => Unit): Self = StObject.set(x, "disableCheckChange", js.Any.fromFunction0(value))
      
      @scala.inline
      def setDisableCheckChangeUndefined: Self = StObject.set(x, "disableCheckChange", js.undefined)
      
      @scala.inline
      def setEnableCheckChange(value: () => Unit): Self = StObject.set(x, "enableCheckChange", js.Any.fromFunction0(value))
      
      @scala.inline
      def setEnableCheckChangeUndefined: Self = StObject.set(x, "enableCheckChange", js.undefined)
      
      @scala.inline
      def setGroup(value: java.lang.String): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGroupCls(value: java.lang.String): Self = StObject.set(x, "groupCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGroupClsUndefined: Self = StObject.set(x, "groupCls", js.undefined)
      
      @scala.inline
      def setGroupUndefined: Self = StObject.set(x, "group", js.undefined)
      
      @scala.inline
      def setScope(value: js.Any): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
      
      @scala.inline
      def setSetChecked(value: (/* checked */ js.UndefOr[Boolean], /* suppressEvents */ js.UndefOr[Boolean]) => Unit): Self = StObject.set(x, "setChecked", js.Any.fromFunction2(value))
      
      @scala.inline
      def setSetCheckedUndefined: Self = StObject.set(x, "setChecked", js.undefined)
      
      @scala.inline
      def setUncheckedCls(value: java.lang.String): Self = StObject.set(x, "uncheckedCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUncheckedClsUndefined: Self = StObject.set(x, "uncheckedCls", js.undefined)
    }
  }
  
  @js.native
  trait IColorPicker extends IMenu {
    
    /** [Config Option] (Boolean) */
    var hideOnClick: js.UndefOr[Boolean] = js.native
    
    /** [Property] (Ext.picker.Color) */
    var picker: js.UndefOr[IColor] = js.native
    
    /** [Config Option] (String) */
    var pickerId: js.UndefOr[java.lang.String] = js.native
  }
  object IColorPicker {
    
    @scala.inline
    def apply(): IColorPicker = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IColorPicker]
    }
    
    @scala.inline
    implicit class IColorPickerMutableBuilder[Self <: IColorPicker] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHideOnClick(value: Boolean): Self = StObject.set(x, "hideOnClick", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHideOnClickUndefined: Self = StObject.set(x, "hideOnClick", js.undefined)
      
      @scala.inline
      def setPicker(value: IColor): Self = StObject.set(x, "picker", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPickerId(value: java.lang.String): Self = StObject.set(x, "pickerId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPickerIdUndefined: Self = StObject.set(x, "pickerId", js.undefined)
      
      @scala.inline
      def setPickerUndefined: Self = StObject.set(x, "picker", js.undefined)
    }
  }
  
  @js.native
  trait IDatePicker extends IMenu {
    
    /** [Config Option] (Boolean) */
    var hideOnClick: js.UndefOr[Boolean] = js.native
    
    /** [Property] (Ext.picker.Date) */
    var picker: js.UndefOr[typings.extjs.Ext.picker.IDate] = js.native
    
    /** [Config Option] (String) */
    var pickerId: js.UndefOr[java.lang.String] = js.native
  }
  object IDatePicker {
    
    @scala.inline
    def apply(): typings.extjs.Ext.menu.IDatePicker = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.extjs.Ext.menu.IDatePicker]
    }
    
    @scala.inline
    implicit class IDatePickerMutableBuilder[Self <: typings.extjs.Ext.menu.IDatePicker] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHideOnClick(value: Boolean): Self = StObject.set(x, "hideOnClick", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHideOnClickUndefined: Self = StObject.set(x, "hideOnClick", js.undefined)
      
      @scala.inline
      def setPicker(value: typings.extjs.Ext.picker.IDate): Self = StObject.set(x, "picker", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPickerId(value: java.lang.String): Self = StObject.set(x, "pickerId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPickerIdUndefined: Self = StObject.set(x, "pickerId", js.undefined)
      
      @scala.inline
      def setPickerUndefined: Self = StObject.set(x, "picker", js.undefined)
    }
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.extjs.Ext.IClass because Already inherited
  - typings.extjs.Ext.IBase because Already inherited
  - typings.extjs.Ext.IQueryable because var conflicts: alias, alternateClassName, callOverridden, callParent, callSuper, config, extend, getInitialConfig, inheritableStatics, initConfig, mixins, requires, self, singleton, statics, uses. Inlined child, down, query, queryBy, queryById */ @js.native
  trait IItem extends IComponent {
    
    /** [Property] (Boolean) */
    var activated: js.UndefOr[Boolean] = js.native
    
    /** [Config Option] (String) */
    var activeCls: js.UndefOr[java.lang.String] = js.native
    
    /** [Config Option] (Boolean) */
    var canActivate: js.UndefOr[Boolean] = js.native
    
    /** [Method] Retrieves the first direct child of this container which matches the passed selector or component
      * @param selector String/Ext.Component An Ext.ComponentQuery selector. If no selector is specified, the first child will be returned.
      * @returns Object Ext.Component The matching child Ext.Component (or null if no match was found).
      */
    var child: js.UndefOr[js.Function1[js.UndefOr[js.Any], _]] = js.native
    
    /** [Config Option] (Number) */
    var clickHideDelay: js.UndefOr[Double] = js.native
    
    /** [Config Option] (Boolean) */
    var destroyMenu: js.UndefOr[Boolean] = js.native
    
    /** [Method] Retrieves the first descendant of this container which matches the passed selector
      * @param selector String/Ext.Component An Ext.ComponentQuery selector or Ext.Component. If no selector is specified, the first child will be returned.
      * @returns Object Ext.Component The matching descendant Ext.Component (or null if no match was found).
      */
    var down: js.UndefOr[js.Function1[js.UndefOr[js.Any], _]] = js.native
    
    /** [Config Option] (Number/String) */
    var glyph: js.UndefOr[js.Any] = js.native
    
    /** [Config Option] (Function) */
    var handler: js.UndefOr[js.Any] = js.native
    
    /** [Config Option] (Boolean) */
    var hideOnClick: js.UndefOr[Boolean] = js.native
    
    /** [Config Option] (String) */
    var href: js.UndefOr[java.lang.String] = js.native
    
    /** [Config Option] (String) */
    var hrefTarget: js.UndefOr[java.lang.String] = js.native
    
    /** [Config Option] (String) */
    var icon: js.UndefOr[java.lang.String] = js.native
    
    /** [Config Option] (String) */
    var iconCls: js.UndefOr[java.lang.String] = js.native
    
    /** [Config Option] (Ext.menu.Menu/Object) */
    var menu: js.UndefOr[js.Any] = js.native
    
    /** [Config Option] (String) */
    var menuAlign: js.UndefOr[java.lang.String] = js.native
    
    /** [Config Option] (Number) */
    var menuExpandDelay: js.UndefOr[Double] = js.native
    
    /** [Config Option] (Number) */
    var menuHideDelay: js.UndefOr[Double] = js.native
    
    /** [Method] Method to manage awareness of when components are removed from their respective Container firing a removed event  */
    @JSName("onRemoved")
    var onRemoved_IItem: js.UndefOr[js.Function0[Unit]] = js.native
    
    /** [Method] Template method called when this Component s DOM structure is created  */
    @JSName("onRender")
    var onRender_IItem: js.UndefOr[js.Function0[Unit]] = js.native
    
    /** [Property] (Ext.menu.Menu) */
    var parentMenu: js.UndefOr[IMenu] = js.native
    
    /** [Config Option] (Boolean) */
    var plain: js.UndefOr[Boolean] = js.native
    
    /** [Method] Retrieves all descendant components which match the passed selector
      * @param selector String Selector complying to an Ext.ComponentQuery selector. If no selector is specified all items will be returned.
      * @returns Ext.Component[] Components which matched the selector
      */
    var query: js.UndefOr[js.Function1[js.UndefOr[java.lang.String], Array]] = js.native
    
    /** [Method] Retrieves all descendant components which match the passed function
      * @param fn Function The matcher function. It will be called with a single argument, the component being tested.
      * @param scope Object The scope in which to run the function. If not specified, it will default to the active component.
      * @returns Ext.Component[] Components matched by the passed function
      */
    var queryBy: js.UndefOr[js.Function2[js.UndefOr[js.Any], js.UndefOr[js.Any], Array]] = js.native
    
    /** [Method] Finds a component at any level under this container matching the id itemId
      * @param id String The id to find
      * @returns Ext.Component The matching id, null if not found
      */
    var queryById: js.UndefOr[js.Function1[js.UndefOr[java.lang.String], IComponent]] = js.native
    
    /** [Method] Sets the click handler of this item
      * @param fn Function The handler function
      * @param scope Object The scope of the handler function
      */
    var setHandler: js.UndefOr[js.Function2[/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], Unit]] = js.native
    
    /** [Method] Sets the icon on this item
      * @param icon String The new icon
      */
    var setIcon: js.UndefOr[js.Function1[/* icon */ js.UndefOr[java.lang.String], Unit]] = js.native
    
    /** [Method] Sets the iconCls of this item
      * @param iconCls String The CSS class to set to iconCls
      */
    var setIconCls: js.UndefOr[js.Function1[/* iconCls */ js.UndefOr[java.lang.String], Unit]] = js.native
    
    /** [Method] Set a child menu for this item
      * @param menu Ext.menu.Menu/Object A menu, or menu configuration. null may be passed to remove the menu.
      * @param destroyMenu Boolean True to destroy any existing menu. False to prevent destruction. If not specified, the destroyMenu configuration will be used.
      */
    var setMenu: js.UndefOr[
        js.Function2[/* menu */ js.UndefOr[js.Any], /* destroyMenu */ js.UndefOr[Boolean], Unit]
      ] = js.native
    
    /** [Method] Sets the text of this item
      * @param text String The text
      */
    var setText: js.UndefOr[js.Function1[/* text */ js.UndefOr[java.lang.String], Unit]] = js.native
    
    /** [Method] Sets the tooltip for this menu item
      * @param tooltip String/Object This may be:  String : A string to be used as innerHTML (html tags are accepted) to show in a tooltip Object : A configuration object for Ext.tip.QuickTipManager.register.
      * @returns Ext.menu.Item this
      */
    var setTooltip: js.UndefOr[js.Function1[/* tooltip */ js.UndefOr[js.Any], this.type]] = js.native
    
    /** [Config Option] (String) */
    var text: js.UndefOr[java.lang.String] = js.native
    
    /** [Config Option] (String/Object) */
    var tooltip: js.UndefOr[js.Any] = js.native
    
    /** [Config Option] (String) */
    var tooltipType: js.UndefOr[java.lang.String] = js.native
  }
  object IItem {
    
    @scala.inline
    def apply(): IItem = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IItem]
    }
    
    @scala.inline
    implicit class IItemMutableBuilder[Self <: IItem] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActivated(value: Boolean): Self = StObject.set(x, "activated", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActivatedUndefined: Self = StObject.set(x, "activated", js.undefined)
      
      @scala.inline
      def setActiveCls(value: java.lang.String): Self = StObject.set(x, "activeCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActiveClsUndefined: Self = StObject.set(x, "activeCls", js.undefined)
      
      @scala.inline
      def setCanActivate(value: Boolean): Self = StObject.set(x, "canActivate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCanActivateUndefined: Self = StObject.set(x, "canActivate", js.undefined)
      
      @scala.inline
      def setChild(value: js.UndefOr[js.Any] => _): Self = StObject.set(x, "child", js.Any.fromFunction1(value))
      
      @scala.inline
      def setChildUndefined: Self = StObject.set(x, "child", js.undefined)
      
      @scala.inline
      def setClickHideDelay(value: Double): Self = StObject.set(x, "clickHideDelay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClickHideDelayUndefined: Self = StObject.set(x, "clickHideDelay", js.undefined)
      
      @scala.inline
      def setDestroyMenu(value: Boolean): Self = StObject.set(x, "destroyMenu", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDestroyMenuUndefined: Self = StObject.set(x, "destroyMenu", js.undefined)
      
      @scala.inline
      def setDown(value: js.UndefOr[js.Any] => _): Self = StObject.set(x, "down", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDownUndefined: Self = StObject.set(x, "down", js.undefined)
      
      @scala.inline
      def setGlyph(value: js.Any): Self = StObject.set(x, "glyph", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGlyphUndefined: Self = StObject.set(x, "glyph", js.undefined)
      
      @scala.inline
      def setHandler(value: js.Any): Self = StObject.set(x, "handler", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHandlerUndefined: Self = StObject.set(x, "handler", js.undefined)
      
      @scala.inline
      def setHideOnClick(value: Boolean): Self = StObject.set(x, "hideOnClick", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHideOnClickUndefined: Self = StObject.set(x, "hideOnClick", js.undefined)
      
      @scala.inline
      def setHref(value: java.lang.String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHrefTarget(value: java.lang.String): Self = StObject.set(x, "hrefTarget", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHrefTargetUndefined: Self = StObject.set(x, "hrefTarget", js.undefined)
      
      @scala.inline
      def setHrefUndefined: Self = StObject.set(x, "href", js.undefined)
      
      @scala.inline
      def setIcon(value: java.lang.String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconCls(value: java.lang.String): Self = StObject.set(x, "iconCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconClsUndefined: Self = StObject.set(x, "iconCls", js.undefined)
      
      @scala.inline
      def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      @scala.inline
      def setMenu(value: js.Any): Self = StObject.set(x, "menu", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMenuAlign(value: java.lang.String): Self = StObject.set(x, "menuAlign", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMenuAlignUndefined: Self = StObject.set(x, "menuAlign", js.undefined)
      
      @scala.inline
      def setMenuExpandDelay(value: Double): Self = StObject.set(x, "menuExpandDelay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMenuExpandDelayUndefined: Self = StObject.set(x, "menuExpandDelay", js.undefined)
      
      @scala.inline
      def setMenuHideDelay(value: Double): Self = StObject.set(x, "menuHideDelay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMenuHideDelayUndefined: Self = StObject.set(x, "menuHideDelay", js.undefined)
      
      @scala.inline
      def setMenuUndefined: Self = StObject.set(x, "menu", js.undefined)
      
      @scala.inline
      def setOnRemoved(value: () => Unit): Self = StObject.set(x, "onRemoved", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnRemovedUndefined: Self = StObject.set(x, "onRemoved", js.undefined)
      
      @scala.inline
      def setOnRender(value: () => Unit): Self = StObject.set(x, "onRender", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnRenderUndefined: Self = StObject.set(x, "onRender", js.undefined)
      
      @scala.inline
      def setParentMenu(value: IMenu): Self = StObject.set(x, "parentMenu", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParentMenuUndefined: Self = StObject.set(x, "parentMenu", js.undefined)
      
      @scala.inline
      def setPlain(value: Boolean): Self = StObject.set(x, "plain", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlainUndefined: Self = StObject.set(x, "plain", js.undefined)
      
      @scala.inline
      def setQuery(value: js.UndefOr[java.lang.String] => Array): Self = StObject.set(x, "query", js.Any.fromFunction1(value))
      
      @scala.inline
      def setQueryBy(value: (js.UndefOr[js.Any], js.UndefOr[js.Any]) => Array): Self = StObject.set(x, "queryBy", js.Any.fromFunction2(value))
      
      @scala.inline
      def setQueryById(value: js.UndefOr[java.lang.String] => IComponent): Self = StObject.set(x, "queryById", js.Any.fromFunction1(value))
      
      @scala.inline
      def setQueryByIdUndefined: Self = StObject.set(x, "queryById", js.undefined)
      
      @scala.inline
      def setQueryByUndefined: Self = StObject.set(x, "queryBy", js.undefined)
      
      @scala.inline
      def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
      
      @scala.inline
      def setSetHandler(value: (/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit): Self = StObject.set(x, "setHandler", js.Any.fromFunction2(value))
      
      @scala.inline
      def setSetHandlerUndefined: Self = StObject.set(x, "setHandler", js.undefined)
      
      @scala.inline
      def setSetIcon(value: /* icon */ js.UndefOr[java.lang.String] => Unit): Self = StObject.set(x, "setIcon", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetIconCls(value: /* iconCls */ js.UndefOr[java.lang.String] => Unit): Self = StObject.set(x, "setIconCls", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetIconClsUndefined: Self = StObject.set(x, "setIconCls", js.undefined)
      
      @scala.inline
      def setSetIconUndefined: Self = StObject.set(x, "setIcon", js.undefined)
      
      @scala.inline
      def setSetMenu(value: (/* menu */ js.UndefOr[js.Any], /* destroyMenu */ js.UndefOr[Boolean]) => Unit): Self = StObject.set(x, "setMenu", js.Any.fromFunction2(value))
      
      @scala.inline
      def setSetMenuUndefined: Self = StObject.set(x, "setMenu", js.undefined)
      
      @scala.inline
      def setSetText(value: /* text */ js.UndefOr[java.lang.String] => Unit): Self = StObject.set(x, "setText", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetTextUndefined: Self = StObject.set(x, "setText", js.undefined)
      
      @scala.inline
      def setSetTooltip(value: /* tooltip */ js.UndefOr[js.Any] => IItem): Self = StObject.set(x, "setTooltip", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetTooltipUndefined: Self = StObject.set(x, "setTooltip", js.undefined)
      
      @scala.inline
      def setText(value: java.lang.String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      
      @scala.inline
      def setTooltip(value: js.Any): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTooltipType(value: java.lang.String): Self = StObject.set(x, "tooltipType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTooltipTypeUndefined: Self = StObject.set(x, "tooltipType", js.undefined)
      
      @scala.inline
      def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
    }
  }
  
  type IKeyNav = typings.extjs.Ext.util.IKeyNav
  
  type IManager = IBase
  
  @js.native
  trait IMenu
    extends typings.extjs.Ext.panel.IPanel {
    
    /** [Method] Invoked after the Component is shown after onShow is called */
    @JSName("afterShow")
    var afterShow_IMenu: js.UndefOr[js.Function0[Unit]] = js.native
    
    /** [Config Option] (Boolean) */
    var allowOtherMenus: js.UndefOr[Boolean] = js.native
    
    /** [Method] Returns whether a menu item can be activated or not
      * @param item Object
      * @returns Boolean
      */
    var canActivateItem: js.UndefOr[js.Function1[/* item */ js.UndefOr[js.Any], Boolean]] = js.native
    
    /** [Method] Deactivates the current active item on the menu if one exists
      * @param andBlurFocusedItem Object
      */
    var deactivateActiveItem: js.UndefOr[js.Function1[/* andBlurFocusedItem */ js.UndefOr[js.Any], Unit]] = js.native
    
    /** [Config Option] (Boolean) */
    var enableKeyNav: js.UndefOr[Boolean] = js.native
    
    /** [Method] Hides this Component setting it to invisible using the configured hideMode
      * @returns Ext.Component this
      */
    @JSName("hide")
    var hide_IMenu: js.UndefOr[js.Function0[IComponent]] = js.native
    
    /** [Config Option] (Boolean) */
    var ignoreParentClicks: js.UndefOr[Boolean] = js.native
    
    /** [Property] (Boolean) */
    var isMenu: js.UndefOr[Boolean] = js.native
    
    /** [Method] Menus are never contained and must not ascertain their visibility from the ancestor hierarchy
      * @returns Boolean true if this component is visible, false otherwise.
      */
    @JSName("isVisible")
    var isVisible_IMenu: js.UndefOr[js.Function0[Boolean]] = js.native
    
    /** [Property] (Ext.menu.Menu) */
    var parentMenu: js.UndefOr[IMenu] = js.native
    
    /** [Config Option] (Boolean) */
    var plain: js.UndefOr[Boolean] = js.native
    
    /** [Method] Shows this component by the specified Component or Element
      * @param cmp Object
      * @param pos Object
      * @param off Object
      * @returns Ext.Component this
      */
    @JSName("showBy")
    var showBy_IMenu: js.UndefOr[
        js.Function3[
          /* cmp */ js.UndefOr[js.Any], 
          /* pos */ js.UndefOr[js.Any], 
          /* off */ js.UndefOr[js.Any], 
          IComponent
        ]
      ] = js.native
    
    /** [Config Option] (Boolean) */
    var showSeparator: js.UndefOr[Boolean] = js.native
  }
  object IMenu {
    
    @scala.inline
    def apply(): IMenu = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IMenu]
    }
    
    @scala.inline
    implicit class IMenuMutableBuilder[Self <: IMenu] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAfterShow(value: () => Unit): Self = StObject.set(x, "afterShow", js.Any.fromFunction0(value))
      
      @scala.inline
      def setAfterShowUndefined: Self = StObject.set(x, "afterShow", js.undefined)
      
      @scala.inline
      def setAllowOtherMenus(value: Boolean): Self = StObject.set(x, "allowOtherMenus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowOtherMenusUndefined: Self = StObject.set(x, "allowOtherMenus", js.undefined)
      
      @scala.inline
      def setCanActivateItem(value: /* item */ js.UndefOr[js.Any] => Boolean): Self = StObject.set(x, "canActivateItem", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCanActivateItemUndefined: Self = StObject.set(x, "canActivateItem", js.undefined)
      
      @scala.inline
      def setDeactivateActiveItem(value: /* andBlurFocusedItem */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "deactivateActiveItem", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDeactivateActiveItemUndefined: Self = StObject.set(x, "deactivateActiveItem", js.undefined)
      
      @scala.inline
      def setEnableKeyNav(value: Boolean): Self = StObject.set(x, "enableKeyNav", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableKeyNavUndefined: Self = StObject.set(x, "enableKeyNav", js.undefined)
      
      @scala.inline
      def setHide(value: () => IComponent): Self = StObject.set(x, "hide", js.Any.fromFunction0(value))
      
      @scala.inline
      def setHideUndefined: Self = StObject.set(x, "hide", js.undefined)
      
      @scala.inline
      def setIgnoreParentClicks(value: Boolean): Self = StObject.set(x, "ignoreParentClicks", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIgnoreParentClicksUndefined: Self = StObject.set(x, "ignoreParentClicks", js.undefined)
      
      @scala.inline
      def setIsMenu(value: Boolean): Self = StObject.set(x, "isMenu", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsMenuUndefined: Self = StObject.set(x, "isMenu", js.undefined)
      
      @scala.inline
      def setIsVisible(value: () => Boolean): Self = StObject.set(x, "isVisible", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsVisibleUndefined: Self = StObject.set(x, "isVisible", js.undefined)
      
      @scala.inline
      def setParentMenu(value: IMenu): Self = StObject.set(x, "parentMenu", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParentMenuUndefined: Self = StObject.set(x, "parentMenu", js.undefined)
      
      @scala.inline
      def setPlain(value: Boolean): Self = StObject.set(x, "plain", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlainUndefined: Self = StObject.set(x, "plain", js.undefined)
      
      @scala.inline
      def setShowBy(
        value: (/* cmp */ js.UndefOr[js.Any], /* pos */ js.UndefOr[js.Any], /* off */ js.UndefOr[js.Any]) => IComponent
      ): Self = StObject.set(x, "showBy", js.Any.fromFunction3(value))
      
      @scala.inline
      def setShowByUndefined: Self = StObject.set(x, "showBy", js.undefined)
      
      @scala.inline
      def setShowSeparator(value: Boolean): Self = StObject.set(x, "showSeparator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowSeparatorUndefined: Self = StObject.set(x, "showSeparator", js.undefined)
    }
  }
  
  type IMenuMgr = IBase
  
  @js.native
  trait ISeparator extends IItem {
    
    /** [Config Option] (String) */
    var separatorCls: js.UndefOr[java.lang.String] = js.native
  }
  object ISeparator {
    
    @scala.inline
    def apply(): ISeparator = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ISeparator]
    }
    
    @scala.inline
    implicit class ISeparatorMutableBuilder[Self <: ISeparator] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSeparatorCls(value: java.lang.String): Self = StObject.set(x, "separatorCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSeparatorClsUndefined: Self = StObject.set(x, "separatorCls", js.undefined)
    }
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.extjs.Ext.IClass because Already inherited
  - typings.extjs.Ext.IBase because Already inherited
  - typings.extjs.Ext.IQueryable because var conflicts: alias, alternateClassName, callOverridden, callParent, callSuper, config, extend, getInitialConfig, inheritableStatics, initConfig, mixins, requires, self, singleton, statics, uses. Inlined child, down, query, queryBy, queryById */ @js.native
  trait ITextItem extends IComponent {
    
    /** [Property] (Boolean) */
    var activated: js.UndefOr[Boolean] = js.native
    
    /** [Config Option] (String) */
    var activeCls: js.UndefOr[java.lang.String] = js.native
    
    /** [Config Option] (Boolean) */
    var canActivate: js.UndefOr[Boolean] = js.native
    
    /** [Method] Retrieves the first direct child of this container which matches the passed selector or component
      * @param selector String/Ext.Component An Ext.ComponentQuery selector. If no selector is specified, the first child will be returned.
      * @returns Object Ext.Component The matching child Ext.Component (or null if no match was found).
      */
    var child: js.UndefOr[js.Function1[js.UndefOr[js.Any], _]] = js.native
    
    /** [Config Option] (Number) */
    var clickHideDelay: js.UndefOr[Double] = js.native
    
    /** [Config Option] (Boolean) */
    var destroyMenu: js.UndefOr[Boolean] = js.native
    
    /** [Method] Retrieves the first descendant of this container which matches the passed selector
      * @param selector String/Ext.Component An Ext.ComponentQuery selector or Ext.Component. If no selector is specified, the first child will be returned.
      * @returns Object Ext.Component The matching descendant Ext.Component (or null if no match was found).
      */
    var down: js.UndefOr[js.Function1[js.UndefOr[js.Any], _]] = js.native
    
    /** [Config Option] (Number/String) */
    var glyph: js.UndefOr[js.Any] = js.native
    
    /** [Config Option] (Function) */
    var handler: js.UndefOr[js.Any] = js.native
    
    /** [Config Option] (Boolean) */
    var hideOnClick: js.UndefOr[Boolean] = js.native
    
    /** [Config Option] (String) */
    var href: js.UndefOr[java.lang.String] = js.native
    
    /** [Config Option] (String) */
    var hrefTarget: js.UndefOr[java.lang.String] = js.native
    
    /** [Config Option] (String) */
    var icon: js.UndefOr[java.lang.String] = js.native
    
    /** [Config Option] (String) */
    var iconCls: js.UndefOr[java.lang.String] = js.native
    
    /** [Config Option] (Ext.menu.Menu/Object) */
    var menu: js.UndefOr[js.Any] = js.native
    
    /** [Config Option] (String) */
    var menuAlign: js.UndefOr[java.lang.String] = js.native
    
    /** [Config Option] (Number) */
    var menuExpandDelay: js.UndefOr[Double] = js.native
    
    /** [Config Option] (Number) */
    var menuHideDelay: js.UndefOr[Double] = js.native
    
    /** [Method] Method to manage awareness of when components are removed from their respective Container firing a removed event  */
    @JSName("onRemoved")
    var onRemoved_ITextItem: js.UndefOr[js.Function0[Unit]] = js.native
    
    /** [Method] Template method called when this Component s DOM structure is created  */
    @JSName("onRender")
    var onRender_ITextItem: js.UndefOr[js.Function0[Unit]] = js.native
    
    /** [Property] (Ext.menu.Menu) */
    var parentMenu: js.UndefOr[IMenu] = js.native
    
    /** [Config Option] (Boolean) */
    var plain: js.UndefOr[Boolean] = js.native
    
    /** [Method] Retrieves all descendant components which match the passed selector
      * @param selector String Selector complying to an Ext.ComponentQuery selector. If no selector is specified all items will be returned.
      * @returns Ext.Component[] Components which matched the selector
      */
    var query: js.UndefOr[js.Function1[js.UndefOr[java.lang.String], Array]] = js.native
    
    /** [Method] Retrieves all descendant components which match the passed function
      * @param fn Function The matcher function. It will be called with a single argument, the component being tested.
      * @param scope Object The scope in which to run the function. If not specified, it will default to the active component.
      * @returns Ext.Component[] Components matched by the passed function
      */
    var queryBy: js.UndefOr[js.Function2[js.UndefOr[js.Any], js.UndefOr[js.Any], Array]] = js.native
    
    /** [Method] Finds a component at any level under this container matching the id itemId
      * @param id String The id to find
      * @returns Ext.Component The matching id, null if not found
      */
    var queryById: js.UndefOr[js.Function1[js.UndefOr[java.lang.String], IComponent]] = js.native
    
    /** [Method] Sets the click handler of this item
      * @param fn Function The handler function
      * @param scope Object The scope of the handler function
      */
    var setHandler: js.UndefOr[js.Function2[/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], Unit]] = js.native
    
    /** [Method] Sets the icon on this item
      * @param icon String The new icon
      */
    var setIcon: js.UndefOr[js.Function1[/* icon */ js.UndefOr[java.lang.String], Unit]] = js.native
    
    /** [Method] Sets the iconCls of this item
      * @param iconCls String The CSS class to set to iconCls
      */
    var setIconCls: js.UndefOr[js.Function1[/* iconCls */ js.UndefOr[java.lang.String], Unit]] = js.native
    
    /** [Method] Set a child menu for this item
      * @param menu Ext.menu.Menu/Object A menu, or menu configuration. null may be passed to remove the menu.
      * @param destroyMenu Boolean True to destroy any existing menu. False to prevent destruction. If not specified, the destroyMenu configuration will be used.
      */
    var setMenu: js.UndefOr[
        js.Function2[/* menu */ js.UndefOr[js.Any], /* destroyMenu */ js.UndefOr[Boolean], Unit]
      ] = js.native
    
    /** [Method] Sets the text of this item
      * @param text String The text
      */
    var setText: js.UndefOr[js.Function1[/* text */ js.UndefOr[java.lang.String], Unit]] = js.native
    
    /** [Method] Sets the tooltip for this menu item
      * @param tooltip String/Object This may be:  String : A string to be used as innerHTML (html tags are accepted) to show in a tooltip Object : A configuration object for Ext.tip.QuickTipManager.register.
      * @returns Ext.menu.Item this
      */
    var setTooltip: js.UndefOr[js.Function1[/* tooltip */ js.UndefOr[js.Any], IItem]] = js.native
    
    /** [Config Option] (String) */
    var text: js.UndefOr[java.lang.String] = js.native
    
    /** [Config Option] (String/Object) */
    var tooltip: js.UndefOr[js.Any] = js.native
    
    /** [Config Option] (String) */
    var tooltipType: js.UndefOr[java.lang.String] = js.native
  }
  object ITextItem {
    
    @scala.inline
    def apply(): ITextItem = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ITextItem]
    }
    
    @scala.inline
    implicit class ITextItemMutableBuilder[Self <: ITextItem] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActivated(value: Boolean): Self = StObject.set(x, "activated", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActivatedUndefined: Self = StObject.set(x, "activated", js.undefined)
      
      @scala.inline
      def setActiveCls(value: java.lang.String): Self = StObject.set(x, "activeCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActiveClsUndefined: Self = StObject.set(x, "activeCls", js.undefined)
      
      @scala.inline
      def setCanActivate(value: Boolean): Self = StObject.set(x, "canActivate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCanActivateUndefined: Self = StObject.set(x, "canActivate", js.undefined)
      
      @scala.inline
      def setChild(value: js.UndefOr[js.Any] => _): Self = StObject.set(x, "child", js.Any.fromFunction1(value))
      
      @scala.inline
      def setChildUndefined: Self = StObject.set(x, "child", js.undefined)
      
      @scala.inline
      def setClickHideDelay(value: Double): Self = StObject.set(x, "clickHideDelay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClickHideDelayUndefined: Self = StObject.set(x, "clickHideDelay", js.undefined)
      
      @scala.inline
      def setDestroyMenu(value: Boolean): Self = StObject.set(x, "destroyMenu", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDestroyMenuUndefined: Self = StObject.set(x, "destroyMenu", js.undefined)
      
      @scala.inline
      def setDown(value: js.UndefOr[js.Any] => _): Self = StObject.set(x, "down", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDownUndefined: Self = StObject.set(x, "down", js.undefined)
      
      @scala.inline
      def setGlyph(value: js.Any): Self = StObject.set(x, "glyph", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGlyphUndefined: Self = StObject.set(x, "glyph", js.undefined)
      
      @scala.inline
      def setHandler(value: js.Any): Self = StObject.set(x, "handler", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHandlerUndefined: Self = StObject.set(x, "handler", js.undefined)
      
      @scala.inline
      def setHideOnClick(value: Boolean): Self = StObject.set(x, "hideOnClick", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHideOnClickUndefined: Self = StObject.set(x, "hideOnClick", js.undefined)
      
      @scala.inline
      def setHref(value: java.lang.String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHrefTarget(value: java.lang.String): Self = StObject.set(x, "hrefTarget", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHrefTargetUndefined: Self = StObject.set(x, "hrefTarget", js.undefined)
      
      @scala.inline
      def setHrefUndefined: Self = StObject.set(x, "href", js.undefined)
      
      @scala.inline
      def setIcon(value: java.lang.String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconCls(value: java.lang.String): Self = StObject.set(x, "iconCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconClsUndefined: Self = StObject.set(x, "iconCls", js.undefined)
      
      @scala.inline
      def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      @scala.inline
      def setMenu(value: js.Any): Self = StObject.set(x, "menu", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMenuAlign(value: java.lang.String): Self = StObject.set(x, "menuAlign", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMenuAlignUndefined: Self = StObject.set(x, "menuAlign", js.undefined)
      
      @scala.inline
      def setMenuExpandDelay(value: Double): Self = StObject.set(x, "menuExpandDelay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMenuExpandDelayUndefined: Self = StObject.set(x, "menuExpandDelay", js.undefined)
      
      @scala.inline
      def setMenuHideDelay(value: Double): Self = StObject.set(x, "menuHideDelay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMenuHideDelayUndefined: Self = StObject.set(x, "menuHideDelay", js.undefined)
      
      @scala.inline
      def setMenuUndefined: Self = StObject.set(x, "menu", js.undefined)
      
      @scala.inline
      def setOnRemoved(value: () => Unit): Self = StObject.set(x, "onRemoved", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnRemovedUndefined: Self = StObject.set(x, "onRemoved", js.undefined)
      
      @scala.inline
      def setOnRender(value: () => Unit): Self = StObject.set(x, "onRender", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnRenderUndefined: Self = StObject.set(x, "onRender", js.undefined)
      
      @scala.inline
      def setParentMenu(value: IMenu): Self = StObject.set(x, "parentMenu", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParentMenuUndefined: Self = StObject.set(x, "parentMenu", js.undefined)
      
      @scala.inline
      def setPlain(value: Boolean): Self = StObject.set(x, "plain", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlainUndefined: Self = StObject.set(x, "plain", js.undefined)
      
      @scala.inline
      def setQuery(value: js.UndefOr[java.lang.String] => Array): Self = StObject.set(x, "query", js.Any.fromFunction1(value))
      
      @scala.inline
      def setQueryBy(value: (js.UndefOr[js.Any], js.UndefOr[js.Any]) => Array): Self = StObject.set(x, "queryBy", js.Any.fromFunction2(value))
      
      @scala.inline
      def setQueryById(value: js.UndefOr[java.lang.String] => IComponent): Self = StObject.set(x, "queryById", js.Any.fromFunction1(value))
      
      @scala.inline
      def setQueryByIdUndefined: Self = StObject.set(x, "queryById", js.undefined)
      
      @scala.inline
      def setQueryByUndefined: Self = StObject.set(x, "queryBy", js.undefined)
      
      @scala.inline
      def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
      
      @scala.inline
      def setSetHandler(value: (/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit): Self = StObject.set(x, "setHandler", js.Any.fromFunction2(value))
      
      @scala.inline
      def setSetHandlerUndefined: Self = StObject.set(x, "setHandler", js.undefined)
      
      @scala.inline
      def setSetIcon(value: /* icon */ js.UndefOr[java.lang.String] => Unit): Self = StObject.set(x, "setIcon", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetIconCls(value: /* iconCls */ js.UndefOr[java.lang.String] => Unit): Self = StObject.set(x, "setIconCls", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetIconClsUndefined: Self = StObject.set(x, "setIconCls", js.undefined)
      
      @scala.inline
      def setSetIconUndefined: Self = StObject.set(x, "setIcon", js.undefined)
      
      @scala.inline
      def setSetMenu(value: (/* menu */ js.UndefOr[js.Any], /* destroyMenu */ js.UndefOr[Boolean]) => Unit): Self = StObject.set(x, "setMenu", js.Any.fromFunction2(value))
      
      @scala.inline
      def setSetMenuUndefined: Self = StObject.set(x, "setMenu", js.undefined)
      
      @scala.inline
      def setSetText(value: /* text */ js.UndefOr[java.lang.String] => Unit): Self = StObject.set(x, "setText", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetTextUndefined: Self = StObject.set(x, "setText", js.undefined)
      
      @scala.inline
      def setSetTooltip(value: /* tooltip */ js.UndefOr[js.Any] => IItem): Self = StObject.set(x, "setTooltip", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetTooltipUndefined: Self = StObject.set(x, "setTooltip", js.undefined)
      
      @scala.inline
      def setText(value: java.lang.String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      
      @scala.inline
      def setTooltip(value: js.Any): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTooltipType(value: java.lang.String): Self = StObject.set(x, "tooltipType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTooltipTypeUndefined: Self = StObject.set(x, "tooltipType", js.undefined)
      
      @scala.inline
      def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
    }
  }
  
  @js.native
  trait Manager extends StObject
  
  @js.native
  trait MenuMgr extends StObject
}
