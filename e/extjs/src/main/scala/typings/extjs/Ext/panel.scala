package typings.extjs.Ext

import typings.extjs.Ext.data.IStore
import typings.extjs.Ext.dd.IDragSource
import typings.extjs.Ext.selection.IModel
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object panel {
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.extjs.Ext.IClass because Already inherited
  - typings.extjs.Ext.IBase because Already inherited
  - typings.extjs.Ext.container.IDockingContainer because var conflicts: alias, alternateClassName, callOverridden, callParent, callSuper, config, extend, getInitialConfig, inheritableStatics, initConfig, mixins, requires, self, singleton, statics, uses. Inlined defaultDockWeights, addDocked, getDockedComponent, getDockedItems, insertDocked, onDockedAdd, onDockedRemove, removeDocked */ @js.native
  trait IAbstractPanel
    extends typings.extjs.Ext.container.IContainer {
    
    /** [Method] Adds a CSS class to the body element
      * @param cls String The class to add
      * @returns Ext.panel.Panel this
      */
    var addBodyCls: js.UndefOr[
        js.Function1[/* cls */ js.UndefOr[java.lang.String], typings.extjs.Ext.panel.IPanel]
      ] = js.native
    
    /** [Method] Adds docked item s to the container
      * @param component Object/Object[] The Component or array of components to add. The components must include a 'dock' parameter on each component to indicate where it should be docked ('top', 'right', 'bottom', 'left').
      * @param pos Number The index at which the Component will be added
      * @returns Ext.Component[] The added components.
      */
    var addDocked: js.UndefOr[js.Function2[js.UndefOr[js.Any], js.UndefOr[Double], Array]] = js.native
    
    /** [Method] inherit docs
      * @param cls Object
      */
    @JSName("addUIClsToElement")
    var addUIClsToElement_IAbstractPanel: js.UndefOr[js.Function1[/* cls */ js.UndefOr[js.Any], Unit]] = js.native
    
    /** [Property] (Ext.dom.Element) */
    var body: js.UndefOr[typings.extjs.Ext.dom.IElement] = js.native
    
    /** [Config Option] (Boolean) */
    var bodyBorder: js.UndefOr[Boolean] = js.native
    
    /** [Config Option] (String/String[]) */
    var bodyCls: js.UndefOr[js.Any] = js.native
    
    /** [Config Option] (Number/String) */
    var bodyPadding: js.UndefOr[js.Any] = js.native
    
    /** [Config Option] (String/Object/Function) */
    var bodyStyle: js.UndefOr[js.Any] = js.native
    
    /** [Config Option] (Object) */
    var defaultDockWeights: js.UndefOr[js.Any] = js.native
    
    /** [Config Option] (Object/Object[]) */
    var dockedItems: js.UndefOr[js.Any] = js.native
    
    /** [Method] Finds a docked component by id itemId or position
      * @param comp String/Number The id, itemId or position of the docked component (see getComponent for details)
      * @returns Ext.Component The docked component (if found)
      */
    var getDockedComponent: js.UndefOr[js.Function1[js.UndefOr[js.Any], IComponent]] = js.native
    
    /** [Method] Retrieves an array of all currently docked Components
      * @param selector String A ComponentQuery selector string to filter the returned items.
      * @param beforeBody Boolean An optional flag to limit the set of items to only those before the body (true) or after the body (false). All components are returned by default.
      * @returns Ext.Component[] The array of docked components meeting the specified criteria.
      */
    var getDockedItems: js.UndefOr[js.Function2[js.UndefOr[java.lang.String], js.UndefOr[Boolean], Array]] = js.native
    
    /** [Method] Inserts docked item s to the panel at the indicated position
      * @param pos Number The index at which the Component will be inserted
      * @param component Object/Object[] The Component or array of components to add. The components must include a 'dock' paramater on each component to indicate where it should be docked ('top', 'right', 'bottom', 'left').
      */
    var insertDocked: js.UndefOr[js.Function2[js.UndefOr[Double], js.UndefOr[js.Any], Unit]] = js.native
    
    /** [Property] (Boolean) */
    var isPanel: js.UndefOr[Boolean] = js.native
    
    /** [Method] Invoked after a docked item is added to the Panel
      * @param component Ext.Component
      */
    var onDockedAdd: js.UndefOr[js.Function1[js.UndefOr[IComponent], Unit]] = js.native
    
    /** [Method] Invoked after a docked item is removed from the Panel
      * @param component Ext.Component
      */
    var onDockedRemove: js.UndefOr[js.Function1[js.UndefOr[IComponent], Unit]] = js.native
    
    /** [Method] Removes a CSS class from the body element
      * @param cls String The class to remove
      * @returns Ext.panel.Panel this
      */
    var removeBodyCls: js.UndefOr[
        js.Function1[/* cls */ js.UndefOr[java.lang.String], typings.extjs.Ext.panel.IPanel]
      ] = js.native
    
    /** [Method] Removes the docked item from the panel
      * @param item Ext.Component The Component to remove.
      * @param autoDestroy Boolean Destroy the component after removal.
      */
    var removeDocked: js.UndefOr[js.Function2[js.UndefOr[IComponent], js.UndefOr[Boolean], Unit]] = js.native
    
    /** [Method] inherit docs
      * @param cls Object
      */
    @JSName("removeUIClsFromElement")
    var removeUIClsFromElement_IAbstractPanel: js.UndefOr[js.Function1[/* cls */ js.UndefOr[js.Any], Unit]] = js.native
    
    /** [Method] Sets the body style according to the passed parameters
      * @param style Mixed A full style specification string, or object, or the name of a style property to set.
      * @param value String If the first param was a style property name, the style property value.
      * @returns Ext.panel.Panel this
      */
    var setBodyStyle: js.UndefOr[
        js.Function2[
          /* style */ js.UndefOr[js.Any], 
          /* value */ js.UndefOr[java.lang.String], 
          typings.extjs.Ext.panel.IPanel
        ]
      ] = js.native
    
    /** [Config Option] (Boolean/Number) */
    var shrinkWrapDock: js.UndefOr[js.Any] = js.native
  }
  object IAbstractPanel {
    
    @scala.inline
    def apply(): IAbstractPanel = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IAbstractPanel]
    }
    
    @scala.inline
    implicit class IAbstractPanelMutableBuilder[Self <: IAbstractPanel] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddBodyCls(value: /* cls */ js.UndefOr[java.lang.String] => typings.extjs.Ext.panel.IPanel): Self = StObject.set(x, "addBodyCls", js.Any.fromFunction1(value))
      
      @scala.inline
      def setAddBodyClsUndefined: Self = StObject.set(x, "addBodyCls", js.undefined)
      
      @scala.inline
      def setAddDocked(value: (js.UndefOr[js.Any], js.UndefOr[Double]) => Array): Self = StObject.set(x, "addDocked", js.Any.fromFunction2(value))
      
      @scala.inline
      def setAddDockedUndefined: Self = StObject.set(x, "addDocked", js.undefined)
      
      @scala.inline
      def setAddUIClsToElement(value: /* cls */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "addUIClsToElement", js.Any.fromFunction1(value))
      
      @scala.inline
      def setAddUIClsToElementUndefined: Self = StObject.set(x, "addUIClsToElement", js.undefined)
      
      @scala.inline
      def setBody(value: typings.extjs.Ext.dom.IElement): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBodyBorder(value: Boolean): Self = StObject.set(x, "bodyBorder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBodyBorderUndefined: Self = StObject.set(x, "bodyBorder", js.undefined)
      
      @scala.inline
      def setBodyCls(value: js.Any): Self = StObject.set(x, "bodyCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBodyClsUndefined: Self = StObject.set(x, "bodyCls", js.undefined)
      
      @scala.inline
      def setBodyPadding(value: js.Any): Self = StObject.set(x, "bodyPadding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBodyPaddingUndefined: Self = StObject.set(x, "bodyPadding", js.undefined)
      
      @scala.inline
      def setBodyStyle(value: js.Any): Self = StObject.set(x, "bodyStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBodyStyleUndefined: Self = StObject.set(x, "bodyStyle", js.undefined)
      
      @scala.inline
      def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
      
      @scala.inline
      def setDefaultDockWeights(value: js.Any): Self = StObject.set(x, "defaultDockWeights", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultDockWeightsUndefined: Self = StObject.set(x, "defaultDockWeights", js.undefined)
      
      @scala.inline
      def setDockedItems(value: js.Any): Self = StObject.set(x, "dockedItems", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDockedItemsUndefined: Self = StObject.set(x, "dockedItems", js.undefined)
      
      @scala.inline
      def setGetDockedComponent(value: js.UndefOr[js.Any] => IComponent): Self = StObject.set(x, "getDockedComponent", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetDockedComponentUndefined: Self = StObject.set(x, "getDockedComponent", js.undefined)
      
      @scala.inline
      def setGetDockedItems(value: (js.UndefOr[java.lang.String], js.UndefOr[Boolean]) => Array): Self = StObject.set(x, "getDockedItems", js.Any.fromFunction2(value))
      
      @scala.inline
      def setGetDockedItemsUndefined: Self = StObject.set(x, "getDockedItems", js.undefined)
      
      @scala.inline
      def setInsertDocked(value: (js.UndefOr[Double], js.UndefOr[js.Any]) => Unit): Self = StObject.set(x, "insertDocked", js.Any.fromFunction2(value))
      
      @scala.inline
      def setInsertDockedUndefined: Self = StObject.set(x, "insertDocked", js.undefined)
      
      @scala.inline
      def setIsPanel(value: Boolean): Self = StObject.set(x, "isPanel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsPanelUndefined: Self = StObject.set(x, "isPanel", js.undefined)
      
      @scala.inline
      def setOnDockedAdd(value: js.UndefOr[IComponent] => Unit): Self = StObject.set(x, "onDockedAdd", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnDockedAddUndefined: Self = StObject.set(x, "onDockedAdd", js.undefined)
      
      @scala.inline
      def setOnDockedRemove(value: js.UndefOr[IComponent] => Unit): Self = StObject.set(x, "onDockedRemove", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnDockedRemoveUndefined: Self = StObject.set(x, "onDockedRemove", js.undefined)
      
      @scala.inline
      def setRemoveBodyCls(value: /* cls */ js.UndefOr[java.lang.String] => typings.extjs.Ext.panel.IPanel): Self = StObject.set(x, "removeBodyCls", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRemoveBodyClsUndefined: Self = StObject.set(x, "removeBodyCls", js.undefined)
      
      @scala.inline
      def setRemoveDocked(value: (js.UndefOr[IComponent], js.UndefOr[Boolean]) => Unit): Self = StObject.set(x, "removeDocked", js.Any.fromFunction2(value))
      
      @scala.inline
      def setRemoveDockedUndefined: Self = StObject.set(x, "removeDocked", js.undefined)
      
      @scala.inline
      def setRemoveUIClsFromElement(value: /* cls */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "removeUIClsFromElement", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRemoveUIClsFromElementUndefined: Self = StObject.set(x, "removeUIClsFromElement", js.undefined)
      
      @scala.inline
      def setSetBodyStyle(
        value: (/* style */ js.UndefOr[js.Any], /* value */ js.UndefOr[java.lang.String]) => typings.extjs.Ext.panel.IPanel
      ): Self = StObject.set(x, "setBodyStyle", js.Any.fromFunction2(value))
      
      @scala.inline
      def setSetBodyStyleUndefined: Self = StObject.set(x, "setBodyStyle", js.undefined)
      
      @scala.inline
      def setShrinkWrapDock(value: js.Any): Self = StObject.set(x, "shrinkWrapDock", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShrinkWrapDockUndefined: Self = StObject.set(x, "shrinkWrapDock", js.undefined)
    }
  }
  
  @js.native
  trait IDD extends IDragSource {
    
    /** [Method] Returns a reference to the actual element to drag
      * @param e Object
      * @returns HTMLElement the html element
      */
    @JSName("getDragEl")
    var getDragEl_IDD: js.UndefOr[js.Function1[/* e */ js.UndefOr[js.Any], HTMLElement]] = js.native
  }
  object IDD {
    
    @scala.inline
    def apply(): IDD = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IDD]
    }
    
    @scala.inline
    implicit class IDDMutableBuilder[Self <: IDD] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetDragEl(value: /* e */ js.UndefOr[js.Any] => HTMLElement): Self = StObject.set(x, "getDragEl", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetDragElUndefined: Self = StObject.set(x, "getDragEl", js.undefined)
    }
  }
  
  @js.native
  trait IHeader
    extends typings.extjs.Ext.container.IContainer {
    
    /** [Method] Add a tool to the header
      * @param tool Object
      */
    var addTool: js.UndefOr[js.Function1[/* tool */ js.UndefOr[js.Any], Unit]] = js.native
    
    /** [Method] inherit docs
      * @param cls Object
      */
    @JSName("addUIClsToElement")
    var addUIClsToElement_IHeader: js.UndefOr[js.Function1[/* cls */ js.UndefOr[js.Any], Unit]] = js.native
    
    /** [Method] Invoked after the Container has laid out and rendered if necessary its child Components  */
    @JSName("afterLayout")
    var afterLayout_IHeader: js.UndefOr[js.Function0[Unit]] = js.native
    
    /** [Method] Gets the tools for this header
      * @returns Ext.panel.Tool[] The tools
      */
    var getTools: js.UndefOr[js.Function0[Array]] = js.native
    
    /** [Config Option] (Number/String) */
    var glyph: js.UndefOr[js.Any] = js.native
    
    /** [Config Option] (String) */
    var icon: js.UndefOr[java.lang.String] = js.native
    
    /** [Config Option] (String) */
    var iconCls: js.UndefOr[java.lang.String] = js.native
    
    /** [Property] (Boolean) */
    var isHeader: js.UndefOr[Boolean] = js.native
    
    /** [Method] Set up the tools lt tool type gt link in the owning Panel
      * @param component Object
      * @param index Object
      */
    @JSName("onAdd")
    var onAdd_IHeader: js.UndefOr[
        js.Function2[/* component */ js.UndefOr[js.Any], /* index */ js.UndefOr[js.Any], Unit]
      ] = js.native
    
    /** [Method] inherit docs
      * @param cls Object
      */
    @JSName("removeUIClsFromElement")
    var removeUIClsFromElement_IHeader: js.UndefOr[js.Function1[/* cls */ js.UndefOr[js.Any], Unit]] = js.native
    
    /** [Method] Sets glyph that provides the icon image for this header
      * @param glyph Number/String the numeric charCode or string charCode/font-family. This parameter expects a format consistent with that of glyph
      */
    var setGlyph: js.UndefOr[js.Function1[/* glyph */ js.UndefOr[js.Any], Unit]] = js.native
    
    /** [Method] Sets the image path that provides the icon image for this header
      * @param icon String The new icon path
      */
    var setIcon: js.UndefOr[js.Function1[/* icon */ js.UndefOr[java.lang.String], Unit]] = js.native
    
    /** [Method] Sets the CSS class that provides the icon image for this header
      * @param cls String The new CSS class name
      */
    var setIconCls: js.UndefOr[js.Function1[/* cls */ js.UndefOr[java.lang.String], Unit]] = js.native
    
    /** [Method] Sets the title of the header
      * @param title String The title to be set
      */
    var setTitle: js.UndefOr[js.Function1[/* title */ js.UndefOr[java.lang.String], Unit]] = js.native
    
    /** [Config Option] (String) */
    var title: js.UndefOr[java.lang.String] = js.native
    
    /** [Config Option] (String) */
    var titleAlign: js.UndefOr[java.lang.String] = js.native
    
    /** [Config Option] (Number) */
    var titlePosition: js.UndefOr[Double] = js.native
  }
  object IHeader {
    
    @scala.inline
    def apply(): IHeader = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IHeader]
    }
    
    @scala.inline
    implicit class IHeaderMutableBuilder[Self <: IHeader] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddTool(value: /* tool */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "addTool", js.Any.fromFunction1(value))
      
      @scala.inline
      def setAddToolUndefined: Self = StObject.set(x, "addTool", js.undefined)
      
      @scala.inline
      def setAddUIClsToElement(value: /* cls */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "addUIClsToElement", js.Any.fromFunction1(value))
      
      @scala.inline
      def setAddUIClsToElementUndefined: Self = StObject.set(x, "addUIClsToElement", js.undefined)
      
      @scala.inline
      def setAfterLayout(value: () => Unit): Self = StObject.set(x, "afterLayout", js.Any.fromFunction0(value))
      
      @scala.inline
      def setAfterLayoutUndefined: Self = StObject.set(x, "afterLayout", js.undefined)
      
      @scala.inline
      def setGetTools(value: () => Array): Self = StObject.set(x, "getTools", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetToolsUndefined: Self = StObject.set(x, "getTools", js.undefined)
      
      @scala.inline
      def setGlyph(value: js.Any): Self = StObject.set(x, "glyph", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGlyphUndefined: Self = StObject.set(x, "glyph", js.undefined)
      
      @scala.inline
      def setIcon(value: java.lang.String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconCls(value: java.lang.String): Self = StObject.set(x, "iconCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconClsUndefined: Self = StObject.set(x, "iconCls", js.undefined)
      
      @scala.inline
      def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      @scala.inline
      def setIsHeader(value: Boolean): Self = StObject.set(x, "isHeader", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsHeaderUndefined: Self = StObject.set(x, "isHeader", js.undefined)
      
      @scala.inline
      def setOnAdd(value: (/* component */ js.UndefOr[js.Any], /* index */ js.UndefOr[js.Any]) => Unit): Self = StObject.set(x, "onAdd", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnAddUndefined: Self = StObject.set(x, "onAdd", js.undefined)
      
      @scala.inline
      def setRemoveUIClsFromElement(value: /* cls */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "removeUIClsFromElement", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRemoveUIClsFromElementUndefined: Self = StObject.set(x, "removeUIClsFromElement", js.undefined)
      
      @scala.inline
      def setSetGlyph(value: /* glyph */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "setGlyph", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetGlyphUndefined: Self = StObject.set(x, "setGlyph", js.undefined)
      
      @scala.inline
      def setSetIcon(value: /* icon */ js.UndefOr[java.lang.String] => Unit): Self = StObject.set(x, "setIcon", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetIconCls(value: /* cls */ js.UndefOr[java.lang.String] => Unit): Self = StObject.set(x, "setIconCls", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetIconClsUndefined: Self = StObject.set(x, "setIconCls", js.undefined)
      
      @scala.inline
      def setSetIconUndefined: Self = StObject.set(x, "setIcon", js.undefined)
      
      @scala.inline
      def setSetTitle(value: /* title */ js.UndefOr[java.lang.String] => Unit): Self = StObject.set(x, "setTitle", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetTitleUndefined: Self = StObject.set(x, "setTitle", js.undefined)
      
      @scala.inline
      def setTitle(value: java.lang.String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleAlign(value: java.lang.String): Self = StObject.set(x, "titleAlign", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleAlignUndefined: Self = StObject.set(x, "titleAlign", js.undefined)
      
      @scala.inline
      def setTitlePosition(value: Double): Self = StObject.set(x, "titlePosition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitlePositionUndefined: Self = StObject.set(x, "titlePosition", js.undefined)
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
  
  @js.native
  trait IPanel extends IAbstractPanel {
    
    /** [Method] Add tools to this panel
      * @param tools Object[]/Ext.panel.Tool[] The tools to add
      */
    var addTool: js.UndefOr[js.Function1[/* tools */ js.UndefOr[js.Any], Unit]] = js.native
    
    /** [Method] Invoked after the Panel is Collapsed
      * @param animated Boolean
      */
    var afterCollapse: js.UndefOr[js.Function1[/* animated */ js.UndefOr[Boolean], Unit]] = js.native
    
    /** [Method] Invoked after the Panel is Expanded
      * @param animated Boolean
      */
    var afterExpand: js.UndefOr[js.Function1[/* animated */ js.UndefOr[Boolean], Unit]] = js.native
    
    /** [Config Option] (Boolean) */
    var animCollapse: js.UndefOr[Boolean] = js.native
    
    /** [Config Option] (Object/Object[]) */
    var bbar: js.UndefOr[js.Any] = js.native
    
    /** [Config Option] (String) */
    var buttonAlign: js.UndefOr[java.lang.String] = js.native
    
    /** [Config Option] (Object/Object[]) */
    var buttons: js.UndefOr[js.Any] = js.native
    
    /** [Config Option] (Boolean) */
    var closable: js.UndefOr[Boolean] = js.native
    
    /** [Method] Closes the Panel  */
    var close: js.UndefOr[js.Function0[Unit]] = js.native
    
    /** [Config Option] (String) */
    var closeAction: js.UndefOr[java.lang.String] = js.native
    
    /** [Method] Collapses the panel body so that the body becomes hidden
      * @param direction String The direction to collapse towards. Must be one of  Ext.Component.DIRECTION_TOP Ext.Component.DIRECTION_RIGHT Ext.Component.DIRECTION_BOTTOM Ext.Component.DIRECTION_LEFT Defaults to collapseDirection.
      * @param animate Boolean True to animate the transition, else false (defaults to the value of the animCollapse panel config). May also be specified as the animation duration in milliseconds.
      * @returns Ext.panel.Panel this
      */
    var collapse: js.UndefOr[
        js.Function2[
          /* direction */ js.UndefOr[java.lang.String], 
          /* animate */ js.UndefOr[Boolean], 
          this.type
        ]
      ] = js.native
    
    /** [Config Option] (String) */
    var collapseDirection: js.UndefOr[java.lang.String] = js.native
    
    /** [Config Option] (Boolean) */
    var collapseFirst: js.UndefOr[Boolean] = js.native
    
    /** [Config Option] (String) */
    var collapseMode: js.UndefOr[java.lang.String] = js.native
    
    /** [Config Option] (Boolean) */
    var collapsed: js.UndefOr[Boolean] = js.native
    
    /** [Config Option] (String) */
    var collapsedCls: js.UndefOr[java.lang.String] = js.native
    
    /** [Config Option] (Boolean) */
    var collapsible: js.UndefOr[Boolean] = js.native
    
    /** [Config Option] (Boolean) */
    var constrainHeader: js.UndefOr[Boolean] = js.native
    
    /** [Method] converts a collapsdDir into an anchor argument for Element slideIn overridden in rtl mode to switch l and r
      * @param collapseDir Object
      */
    var convertCollapseDir: js.UndefOr[js.Function1[/* collapseDir */ js.UndefOr[js.Any], Unit]] = js.native
    
    /** [Property] (Ext.dd.DragSource/Ext.util.ComponentDragger) */
    var dd: js.UndefOr[js.Any] = js.native
    
    /** [Method] Expands the panel body so that it becomes visible
      * @param animate Boolean True to animate the transition, else false (defaults to the value of the animCollapse panel config). May also be specified as the animation duration in milliseconds.
      * @returns Ext.panel.Panel this
      */
    var expand: js.UndefOr[js.Function1[/* animate */ js.UndefOr[Boolean], this.type]] = js.native
    
    /** [Config Option] (Object/Object[]) */
    var fbar: js.UndefOr[js.Any] = js.native
    
    /** [Config Option] (Boolean) */
    var floatable: js.UndefOr[Boolean] = js.native
    
    /** [Config Option] (Boolean) */
    var frameHeader: js.UndefOr[Boolean] = js.native
    
    /** [Method] Returns the current collapsed state of the panel
      * @returns Boolean/String False when not collapsed, otherwise the value of collapseDirection.
      */
    var getCollapsed: js.UndefOr[js.Function0[_]] = js.native
    
    /** [Method] Gets the Header for this panel  */
    var getHeader: js.UndefOr[js.Function0[Unit]] = js.native
    
    /** [Config Option] (Number/String) */
    var glyph: js.UndefOr[js.Any] = js.native
    
    /** [Config Option] (Boolean/Object) */
    var header: js.UndefOr[js.Any] = js.native
    
    /** [Config Option] (String) */
    var headerOverCls: js.UndefOr[java.lang.String] = js.native
    
    /** [Config Option] (String) */
    var headerPosition: js.UndefOr[java.lang.String] = js.native
    
    /** [Config Option] (Boolean) */
    var hideCollapseTool: js.UndefOr[Boolean] = js.native
    
    /** [Config Option] (String) */
    var icon: js.UndefOr[java.lang.String] = js.native
    
    /** [Config Option] (String) */
    var iconCls: js.UndefOr[java.lang.String] = js.native
    
    /** [Method] Returns true if this component is visible
      * @param deep Object
      * @returns Boolean true if this component is visible, false otherwise.
      */
    @JSName("isVisible")
    var isVisible_IPanel: js.UndefOr[js.Function1[/* deep */ js.UndefOr[js.Any], Boolean]] = js.native
    
    /** [Config Option] (Object/Object[]) */
    var lbar: js.UndefOr[js.Any] = js.native
    
    /** [Config Option] (Boolean) */
    var manageHeight: js.UndefOr[Boolean] = js.native
    
    /** [Config Option] (Number) */
    var minButtonWidth: js.UndefOr[Double] = js.native
    
    /** [Method] Possibly animates down to a target element  */
    @JSName("onHide")
    var onHide_IPanel: js.UndefOr[js.Function0[Unit]] = js.native
    
    /** [Method] Method to manage awareness of when components are removed from their respective Container firing a removed event
      * @param destroying Object
      */
    @JSName("onRemoved")
    var onRemoved_IPanel: js.UndefOr[js.Function1[/* destroying */ js.UndefOr[js.Any], Unit]] = js.native
    
    /** [Method] Allows addition of behavior to the show operation  */
    @JSName("onShow")
    var onShow_IPanel: js.UndefOr[js.Function0[Unit]] = js.native
    
    /** [Config Option] (Boolean) */
    var overlapHeader: js.UndefOr[Boolean] = js.native
    
    /** [Config Option] (Ext.Component/Object) */
    var placeholder: js.UndefOr[js.Any] = js.native
    
    /** [Config Option] (Number) */
    var placeholderCollapseHideMode: js.UndefOr[Double] = js.native
    
    /** [Config Option] (Boolean) */
    var preventHeader: js.UndefOr[Boolean] = js.native
    
    /** [Config Option] (Object/Object[]) */
    var rbar: js.UndefOr[js.Any] = js.native
    
    /** [Method]
      * @param border Object
      * @param targetEl Object
      */
    @JSName("setBorder")
    var setBorder_IPanel: js.UndefOr[
        js.Function2[/* border */ js.UndefOr[js.Any], /* targetEl */ js.UndefOr[js.Any], Unit]
      ] = js.native
    
    /** [Method] Set the glyph for the panel s header
      * @param newGlyph Number/String The new glyph This parameter expects a format consistent with that of glyph
      */
    var setGlyph: js.UndefOr[js.Function1[/* newGlyph */ js.UndefOr[js.Any], Unit]] = js.native
    
    /** [Method] Set the icon for the panel s header
      * @param newIcon String The new icon path
      */
    var setIcon: js.UndefOr[js.Function1[/* newIcon */ js.UndefOr[java.lang.String], Unit]] = js.native
    
    /** [Method] Set the iconCls for the panel s header
      * @param newIconCls String The new CSS class name
      */
    var setIconCls: js.UndefOr[js.Function1[/* newIconCls */ js.UndefOr[java.lang.String], Unit]] = js.native
    
    /** [Method] Set a title for the panel s header
      * @param newTitle String
      */
    var setTitle: js.UndefOr[js.Function1[/* newTitle */ js.UndefOr[java.lang.String], Unit]] = js.native
    
    /** [Method] Sets the UI for the component
      * @param ui Object
      */
    @JSName("setUI")
    var setUI_IPanel: js.UndefOr[js.Function1[/* ui */ js.UndefOr[js.Any], Unit]] = js.native
    
    /** [Config Option] (Boolean) */
    var simpleDrag: js.UndefOr[Boolean] = js.native
    
    /** [Config Option] (Object/Object[]) */
    var tbar: js.UndefOr[js.Any] = js.native
    
    /** [Config Option] (String) */
    var title: js.UndefOr[java.lang.String] = js.native
    
    /** [Config Option] (String) */
    var titleAlign: js.UndefOr[java.lang.String] = js.native
    
    /** [Config Option] (Boolean) */
    var titleCollapse: js.UndefOr[Boolean] = js.native
    
    /** [Method] Shortcut for performing an expand or collapse based on the current state of the panel
      * @returns Ext.panel.Panel this
      */
    var toggleCollapse: js.UndefOr[js.Function0[this.type]] = js.native
    
    /** [Config Option] (Object[]/Ext.panel.Tool[]) */
    var tools: js.UndefOr[js.Any] = js.native
  }
  object IPanel {
    
    @scala.inline
    def apply(): typings.extjs.Ext.panel.IPanel = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.extjs.Ext.panel.IPanel]
    }
    
    @scala.inline
    implicit class IPanelMutableBuilder[Self <: typings.extjs.Ext.panel.IPanel] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddTool(value: /* tools */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "addTool", js.Any.fromFunction1(value))
      
      @scala.inline
      def setAddToolUndefined: Self = StObject.set(x, "addTool", js.undefined)
      
      @scala.inline
      def setAfterCollapse(value: /* animated */ js.UndefOr[Boolean] => Unit): Self = StObject.set(x, "afterCollapse", js.Any.fromFunction1(value))
      
      @scala.inline
      def setAfterCollapseUndefined: Self = StObject.set(x, "afterCollapse", js.undefined)
      
      @scala.inline
      def setAfterExpand(value: /* animated */ js.UndefOr[Boolean] => Unit): Self = StObject.set(x, "afterExpand", js.Any.fromFunction1(value))
      
      @scala.inline
      def setAfterExpandUndefined: Self = StObject.set(x, "afterExpand", js.undefined)
      
      @scala.inline
      def setAnimCollapse(value: Boolean): Self = StObject.set(x, "animCollapse", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnimCollapseUndefined: Self = StObject.set(x, "animCollapse", js.undefined)
      
      @scala.inline
      def setBbar(value: js.Any): Self = StObject.set(x, "bbar", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBbarUndefined: Self = StObject.set(x, "bbar", js.undefined)
      
      @scala.inline
      def setButtonAlign(value: java.lang.String): Self = StObject.set(x, "buttonAlign", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setButtonAlignUndefined: Self = StObject.set(x, "buttonAlign", js.undefined)
      
      @scala.inline
      def setButtons(value: js.Any): Self = StObject.set(x, "buttons", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setButtonsUndefined: Self = StObject.set(x, "buttons", js.undefined)
      
      @scala.inline
      def setClosable(value: Boolean): Self = StObject.set(x, "closable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClosableUndefined: Self = StObject.set(x, "closable", js.undefined)
      
      @scala.inline
      def setClose(value: () => Unit): Self = StObject.set(x, "close", js.Any.fromFunction0(value))
      
      @scala.inline
      def setCloseAction(value: java.lang.String): Self = StObject.set(x, "closeAction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCloseActionUndefined: Self = StObject.set(x, "closeAction", js.undefined)
      
      @scala.inline
      def setCloseUndefined: Self = StObject.set(x, "close", js.undefined)
      
      @scala.inline
      def setCollapse(
        value: (/* direction */ js.UndefOr[java.lang.String], /* animate */ js.UndefOr[Boolean]) => typings.extjs.Ext.panel.IPanel
      ): Self = StObject.set(x, "collapse", js.Any.fromFunction2(value))
      
      @scala.inline
      def setCollapseDirection(value: java.lang.String): Self = StObject.set(x, "collapseDirection", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCollapseDirectionUndefined: Self = StObject.set(x, "collapseDirection", js.undefined)
      
      @scala.inline
      def setCollapseFirst(value: Boolean): Self = StObject.set(x, "collapseFirst", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCollapseFirstUndefined: Self = StObject.set(x, "collapseFirst", js.undefined)
      
      @scala.inline
      def setCollapseMode(value: java.lang.String): Self = StObject.set(x, "collapseMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCollapseModeUndefined: Self = StObject.set(x, "collapseMode", js.undefined)
      
      @scala.inline
      def setCollapseUndefined: Self = StObject.set(x, "collapse", js.undefined)
      
      @scala.inline
      def setCollapsed(value: Boolean): Self = StObject.set(x, "collapsed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCollapsedCls(value: java.lang.String): Self = StObject.set(x, "collapsedCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCollapsedClsUndefined: Self = StObject.set(x, "collapsedCls", js.undefined)
      
      @scala.inline
      def setCollapsedUndefined: Self = StObject.set(x, "collapsed", js.undefined)
      
      @scala.inline
      def setCollapsible(value: Boolean): Self = StObject.set(x, "collapsible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCollapsibleUndefined: Self = StObject.set(x, "collapsible", js.undefined)
      
      @scala.inline
      def setConstrainHeader(value: Boolean): Self = StObject.set(x, "constrainHeader", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConstrainHeaderUndefined: Self = StObject.set(x, "constrainHeader", js.undefined)
      
      @scala.inline
      def setConvertCollapseDir(value: /* collapseDir */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "convertCollapseDir", js.Any.fromFunction1(value))
      
      @scala.inline
      def setConvertCollapseDirUndefined: Self = StObject.set(x, "convertCollapseDir", js.undefined)
      
      @scala.inline
      def setDd(value: js.Any): Self = StObject.set(x, "dd", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDdUndefined: Self = StObject.set(x, "dd", js.undefined)
      
      @scala.inline
      def setExpand(value: /* animate */ js.UndefOr[Boolean] => typings.extjs.Ext.panel.IPanel): Self = StObject.set(x, "expand", js.Any.fromFunction1(value))
      
      @scala.inline
      def setExpandUndefined: Self = StObject.set(x, "expand", js.undefined)
      
      @scala.inline
      def setFbar(value: js.Any): Self = StObject.set(x, "fbar", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFbarUndefined: Self = StObject.set(x, "fbar", js.undefined)
      
      @scala.inline
      def setFloatable(value: Boolean): Self = StObject.set(x, "floatable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFloatableUndefined: Self = StObject.set(x, "floatable", js.undefined)
      
      @scala.inline
      def setFrameHeader(value: Boolean): Self = StObject.set(x, "frameHeader", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFrameHeaderUndefined: Self = StObject.set(x, "frameHeader", js.undefined)
      
      @scala.inline
      def setGetCollapsed(value: () => _): Self = StObject.set(x, "getCollapsed", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetCollapsedUndefined: Self = StObject.set(x, "getCollapsed", js.undefined)
      
      @scala.inline
      def setGetHeader(value: () => Unit): Self = StObject.set(x, "getHeader", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetHeaderUndefined: Self = StObject.set(x, "getHeader", js.undefined)
      
      @scala.inline
      def setGlyph(value: js.Any): Self = StObject.set(x, "glyph", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGlyphUndefined: Self = StObject.set(x, "glyph", js.undefined)
      
      @scala.inline
      def setHeader(value: js.Any): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderOverCls(value: java.lang.String): Self = StObject.set(x, "headerOverCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderOverClsUndefined: Self = StObject.set(x, "headerOverCls", js.undefined)
      
      @scala.inline
      def setHeaderPosition(value: java.lang.String): Self = StObject.set(x, "headerPosition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderPositionUndefined: Self = StObject.set(x, "headerPosition", js.undefined)
      
      @scala.inline
      def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
      
      @scala.inline
      def setHideCollapseTool(value: Boolean): Self = StObject.set(x, "hideCollapseTool", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHideCollapseToolUndefined: Self = StObject.set(x, "hideCollapseTool", js.undefined)
      
      @scala.inline
      def setIcon(value: java.lang.String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconCls(value: java.lang.String): Self = StObject.set(x, "iconCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconClsUndefined: Self = StObject.set(x, "iconCls", js.undefined)
      
      @scala.inline
      def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      @scala.inline
      def setIsVisible(value: /* deep */ js.UndefOr[js.Any] => Boolean): Self = StObject.set(x, "isVisible", js.Any.fromFunction1(value))
      
      @scala.inline
      def setIsVisibleUndefined: Self = StObject.set(x, "isVisible", js.undefined)
      
      @scala.inline
      def setLbar(value: js.Any): Self = StObject.set(x, "lbar", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLbarUndefined: Self = StObject.set(x, "lbar", js.undefined)
      
      @scala.inline
      def setManageHeight(value: Boolean): Self = StObject.set(x, "manageHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setManageHeightUndefined: Self = StObject.set(x, "manageHeight", js.undefined)
      
      @scala.inline
      def setMinButtonWidth(value: Double): Self = StObject.set(x, "minButtonWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinButtonWidthUndefined: Self = StObject.set(x, "minButtonWidth", js.undefined)
      
      @scala.inline
      def setOnHide(value: () => Unit): Self = StObject.set(x, "onHide", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnHideUndefined: Self = StObject.set(x, "onHide", js.undefined)
      
      @scala.inline
      def setOnRemoved(value: /* destroying */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "onRemoved", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnRemovedUndefined: Self = StObject.set(x, "onRemoved", js.undefined)
      
      @scala.inline
      def setOnShow(value: () => Unit): Self = StObject.set(x, "onShow", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnShowUndefined: Self = StObject.set(x, "onShow", js.undefined)
      
      @scala.inline
      def setOverlapHeader(value: Boolean): Self = StObject.set(x, "overlapHeader", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverlapHeaderUndefined: Self = StObject.set(x, "overlapHeader", js.undefined)
      
      @scala.inline
      def setPlaceholder(value: js.Any): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlaceholderCollapseHideMode(value: Double): Self = StObject.set(x, "placeholderCollapseHideMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlaceholderCollapseHideModeUndefined: Self = StObject.set(x, "placeholderCollapseHideMode", js.undefined)
      
      @scala.inline
      def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
      
      @scala.inline
      def setPreventHeader(value: Boolean): Self = StObject.set(x, "preventHeader", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreventHeaderUndefined: Self = StObject.set(x, "preventHeader", js.undefined)
      
      @scala.inline
      def setRbar(value: js.Any): Self = StObject.set(x, "rbar", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRbarUndefined: Self = StObject.set(x, "rbar", js.undefined)
      
      @scala.inline
      def setSetBorder(value: (/* border */ js.UndefOr[js.Any], /* targetEl */ js.UndefOr[js.Any]) => Unit): Self = StObject.set(x, "setBorder", js.Any.fromFunction2(value))
      
      @scala.inline
      def setSetBorderUndefined: Self = StObject.set(x, "setBorder", js.undefined)
      
      @scala.inline
      def setSetGlyph(value: /* newGlyph */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "setGlyph", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetGlyphUndefined: Self = StObject.set(x, "setGlyph", js.undefined)
      
      @scala.inline
      def setSetIcon(value: /* newIcon */ js.UndefOr[java.lang.String] => Unit): Self = StObject.set(x, "setIcon", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetIconCls(value: /* newIconCls */ js.UndefOr[java.lang.String] => Unit): Self = StObject.set(x, "setIconCls", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetIconClsUndefined: Self = StObject.set(x, "setIconCls", js.undefined)
      
      @scala.inline
      def setSetIconUndefined: Self = StObject.set(x, "setIcon", js.undefined)
      
      @scala.inline
      def setSetTitle(value: /* newTitle */ js.UndefOr[java.lang.String] => Unit): Self = StObject.set(x, "setTitle", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetTitleUndefined: Self = StObject.set(x, "setTitle", js.undefined)
      
      @scala.inline
      def setSetUI(value: /* ui */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "setUI", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetUIUndefined: Self = StObject.set(x, "setUI", js.undefined)
      
      @scala.inline
      def setSimpleDrag(value: Boolean): Self = StObject.set(x, "simpleDrag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSimpleDragUndefined: Self = StObject.set(x, "simpleDrag", js.undefined)
      
      @scala.inline
      def setTbar(value: js.Any): Self = StObject.set(x, "tbar", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTbarUndefined: Self = StObject.set(x, "tbar", js.undefined)
      
      @scala.inline
      def setTitle(value: java.lang.String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleAlign(value: java.lang.String): Self = StObject.set(x, "titleAlign", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleAlignUndefined: Self = StObject.set(x, "titleAlign", js.undefined)
      
      @scala.inline
      def setTitleCollapse(value: Boolean): Self = StObject.set(x, "titleCollapse", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleCollapseUndefined: Self = StObject.set(x, "titleCollapse", js.undefined)
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      @scala.inline
      def setToggleCollapse(value: () => typings.extjs.Ext.panel.IPanel): Self = StObject.set(x, "toggleCollapse", js.Any.fromFunction0(value))
      
      @scala.inline
      def setToggleCollapseUndefined: Self = StObject.set(x, "toggleCollapse", js.undefined)
      
      @scala.inline
      def setTools(value: js.Any): Self = StObject.set(x, "tools", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToolsUndefined: Self = StObject.set(x, "tools", js.undefined)
    }
  }
  
  @js.native
  trait IProxy extends IBase {
    
    /** [Method] Gets the proxy s element
      * @returns Ext.Element The proxy's element
      */
    var getEl: js.UndefOr[js.Function0[IElement]] = js.native
    
    /** [Method] Gets the proxy s ghost Panel
      * @returns Ext.panel.Panel The proxy's ghost Panel
      */
    var getGhost: js.UndefOr[js.Function0[typings.extjs.Ext.panel.IPanel]] = js.native
    
    /** [Method] Gets the proxy element
      * @returns Ext.Element The proxy's element
      */
    var getProxy: js.UndefOr[js.Function0[IElement]] = js.native
    
    /** [Method] Hides the proxy */
    var hide: js.UndefOr[js.Function0[Unit]] = js.native
    
    /** [Config Option] (Boolean) */
    var insertProxy: js.UndefOr[Boolean] = js.native
    
    /** [Config Option] (Boolean) */
    var moveOnDrag: js.UndefOr[Boolean] = js.native
    
    /** [Method] Moves the proxy to a different position in the DOM
      * @param parentNode HTMLElement The proxy's parent DOM node
      * @param before HTMLElement The sibling node before which the proxy should be inserted. Defaults to the parent's last child if not specified.
      */
    var moveProxy: js.UndefOr[
        js.Function2[/* parentNode */ js.UndefOr[HTMLElement], /* before */ js.UndefOr[HTMLElement], Unit]
      ] = js.native
    
    /** [Property] (Ext.panel.Panel) */
    var panel: js.UndefOr[typings.extjs.Ext.panel.IPanel] = js.native
    
    /** [Method] Shows the proxy */
    var show: js.UndefOr[js.Function0[Unit]] = js.native
  }
  object IProxy {
    
    @scala.inline
    def apply(): IProxy = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IProxy]
    }
    
    @scala.inline
    implicit class IProxyMutableBuilder[Self <: IProxy] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetEl(value: () => IElement): Self = StObject.set(x, "getEl", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetElUndefined: Self = StObject.set(x, "getEl", js.undefined)
      
      @scala.inline
      def setGetGhost(value: () => typings.extjs.Ext.panel.IPanel): Self = StObject.set(x, "getGhost", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetGhostUndefined: Self = StObject.set(x, "getGhost", js.undefined)
      
      @scala.inline
      def setGetProxy(value: () => IElement): Self = StObject.set(x, "getProxy", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetProxyUndefined: Self = StObject.set(x, "getProxy", js.undefined)
      
      @scala.inline
      def setHide(value: () => Unit): Self = StObject.set(x, "hide", js.Any.fromFunction0(value))
      
      @scala.inline
      def setHideUndefined: Self = StObject.set(x, "hide", js.undefined)
      
      @scala.inline
      def setInsertProxy(value: Boolean): Self = StObject.set(x, "insertProxy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInsertProxyUndefined: Self = StObject.set(x, "insertProxy", js.undefined)
      
      @scala.inline
      def setMoveOnDrag(value: Boolean): Self = StObject.set(x, "moveOnDrag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMoveOnDragUndefined: Self = StObject.set(x, "moveOnDrag", js.undefined)
      
      @scala.inline
      def setMoveProxy(value: (/* parentNode */ js.UndefOr[HTMLElement], /* before */ js.UndefOr[HTMLElement]) => Unit): Self = StObject.set(x, "moveProxy", js.Any.fromFunction2(value))
      
      @scala.inline
      def setMoveProxyUndefined: Self = StObject.set(x, "moveProxy", js.undefined)
      
      @scala.inline
      def setPanel(value: typings.extjs.Ext.panel.IPanel): Self = StObject.set(x, "panel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPanelUndefined: Self = StObject.set(x, "panel", js.undefined)
      
      @scala.inline
      def setShow(value: () => Unit): Self = StObject.set(x, "show", js.Any.fromFunction0(value))
      
      @scala.inline
      def setShowUndefined: Self = StObject.set(x, "show", js.undefined)
    }
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.extjs.Ext.IClass because Already inherited
  - typings.extjs.Ext.IBase because Already inherited
  - typings.extjs.Ext.grid.locking.ILockable because var conflicts: alias, alternateClassName, callOverridden, callParent, callSuper, config, extend, getInitialConfig, inheritableStatics, initConfig, mixins, requires, self, singleton, statics, uses. Inlined lockedGridConfig, lockedViewConfig, normalGridConfig, normalViewConfig, scrollDelta, subGridXType, syncRowHeight, syncRowHeights */ @js.native
  trait ITable
    extends typings.extjs.Ext.panel.IPanel {
    
    /** [Method] Invoked after the Panel is Collapsed  */
    @JSName("afterCollapse")
    var afterCollapse_ITable: js.UndefOr[js.Function0[Unit]] = js.native
    
    /** [Method] Invoked after the Panel is Expanded  */
    @JSName("afterExpand")
    var afterExpand_ITable: js.UndefOr[js.Function0[Unit]] = js.native
    
    /** [Config Option] (Boolean) */
    var allowDeselect: js.UndefOr[Boolean] = js.native
    
    /** [Config Option] (Boolean) */
    var columnLines: js.UndefOr[Boolean] = js.native
    
    /** [Config Option] (Ext.grid.column.Column[]/Object) */
    var columns: js.UndefOr[js.Any] = js.native
    
    /** [Config Option] (Boolean) */
    var deferRowRender: js.UndefOr[Boolean] = js.native
    
    /** [Method] This method is obsolete in 4 1  */
    var determineScrollbars: js.UndefOr[js.Function0[Unit]] = js.native
    
    /** [Config Option] (Boolean) */
    var disableSelection: js.UndefOr[Boolean] = js.native
    
    /** [Config Option] (String) */
    var emptyText: js.UndefOr[java.lang.String] = js.native
    
    /** [Config Option] (Boolean) */
    var enableColumnHide: js.UndefOr[Boolean] = js.native
    
    /** [Config Option] (Boolean) */
    var enableColumnMove: js.UndefOr[Boolean] = js.native
    
    /** [Config Option] (Boolean) */
    var enableColumnResize: js.UndefOr[Boolean] = js.native
    
    /** [Config Option] (Boolean) */
    var enableLocking: js.UndefOr[Boolean] = js.native
    
    /** [Config Option] (Ext.grid.feature.Feature[]/Object[]/Ext.enums.Feature[]) */
    var features: js.UndefOr[js.Any] = js.native
    
    /** [Config Option] (Boolean) */
    var forceFit: js.UndefOr[Boolean] = js.native
    
    /** [Method] Returns the selection model being used and creates it via the configuration if it has not been created already
      * @returns Ext.selection.Model selModel
      */
    var getSelectionModel: js.UndefOr[js.Function0[IModel]] = js.native
    
    /** [Method] Returns the store associated with this Panel
      * @returns Ext.data.Store The store
      */
    var getStore: js.UndefOr[js.Function0[IStore]] = js.native
    
    /** [Method] Gets the view for this panel
      * @returns Ext.view.Table
      */
    var getView: js.UndefOr[js.Function0[this.type]] = js.native
    
    /** [Property] (Boolean) */
    var hasView: js.UndefOr[Boolean] = js.native
    
    /** [Config Option] (Boolean) */
    var hideHeaders: js.UndefOr[Boolean] = js.native
    
    /** [Method] This method is obsolete in 4 1  */
    var invalidateScroller: js.UndefOr[js.Function0[Unit]] = js.native
    
    /** [Config Option] (Object) */
    var lockedGridConfig: js.UndefOr[js.Any] = js.native
    
    /** [Config Option] (Object) */
    var lockedViewConfig: js.UndefOr[js.Any] = js.native
    
    /** [Config Option] (Boolean) */
    var multiSelect: js.UndefOr[Boolean] = js.native
    
    /** [Config Option] (Object) */
    var normalGridConfig: js.UndefOr[js.Any] = js.native
    
    /** [Config Option] (Object) */
    var normalViewConfig: js.UndefOr[js.Any] = js.native
    
    /** [Property] (Boolean) */
    var optimizedColumnMove: js.UndefOr[Boolean] = js.native
    
    /** [Config Option] (Boolean) */
    var rowLines: js.UndefOr[Boolean] = js.native
    
    /** [Config Option] (String/Boolean) */
    var scroll: js.UndefOr[js.Any] = js.native
    
    /** [Config Option] (Number) */
    var scrollDelta: js.UndefOr[Double] = js.native
    
    /** [Config Option] (Boolean) */
    var sealedColumns: js.UndefOr[Boolean] = js.native
    
    /** [Config Option] (Ext.selection.Model/Object) */
    var selModel: js.UndefOr[js.Any] = js.native
    
    /** [Config Option] (String) */
    var selType: js.UndefOr[java.lang.String] = js.native
    
    /** [Config Option] (Boolean) */
    var simpleSelect: js.UndefOr[Boolean] = js.native
    
    /** [Config Option] (Boolean) */
    var sortableColumns: js.UndefOr[Boolean] = js.native
    
    /** [Config Option] (Ext.data.Store) */
    var store: js.UndefOr[IStore] = js.native
    
    /** [Config Option] (String) */
    var subGridXType: js.UndefOr[java.lang.String] = js.native
    
    /** [Config Option] (Boolean) */
    var syncRowHeight: js.UndefOr[Boolean] = js.native
    
    /** [Method] Synchronizes the row heights between the locked and non locked portion of the grid for each row  */
    var syncRowHeights: js.UndefOr[js.Function0[Unit]] = js.native
    
    /** [Config Option] (Object) */
    var verticalScroller: js.UndefOr[js.Any] = js.native
    
    /** [Config Option] (Ext.view.Table) */
    var view: js.UndefOr[typings.extjs.Ext.view.ITable] = js.native
    
    /** [Config Option] (Object) */
    var viewConfig: js.UndefOr[js.Any] = js.native
    
    /** [Config Option] (String) */
    var viewType: js.UndefOr[java.lang.String] = js.native
  }
  object ITable {
    
    @scala.inline
    def apply(): ITable = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ITable]
    }
    
    @scala.inline
    implicit class ITableMutableBuilder[Self <: ITable] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAfterCollapse(value: () => Unit): Self = StObject.set(x, "afterCollapse", js.Any.fromFunction0(value))
      
      @scala.inline
      def setAfterCollapseUndefined: Self = StObject.set(x, "afterCollapse", js.undefined)
      
      @scala.inline
      def setAfterExpand(value: () => Unit): Self = StObject.set(x, "afterExpand", js.Any.fromFunction0(value))
      
      @scala.inline
      def setAfterExpandUndefined: Self = StObject.set(x, "afterExpand", js.undefined)
      
      @scala.inline
      def setAllowDeselect(value: Boolean): Self = StObject.set(x, "allowDeselect", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowDeselectUndefined: Self = StObject.set(x, "allowDeselect", js.undefined)
      
      @scala.inline
      def setColumnLines(value: Boolean): Self = StObject.set(x, "columnLines", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColumnLinesUndefined: Self = StObject.set(x, "columnLines", js.undefined)
      
      @scala.inline
      def setColumns(value: js.Any): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
      
      @scala.inline
      def setDeferRowRender(value: Boolean): Self = StObject.set(x, "deferRowRender", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeferRowRenderUndefined: Self = StObject.set(x, "deferRowRender", js.undefined)
      
      @scala.inline
      def setDetermineScrollbars(value: () => Unit): Self = StObject.set(x, "determineScrollbars", js.Any.fromFunction0(value))
      
      @scala.inline
      def setDetermineScrollbarsUndefined: Self = StObject.set(x, "determineScrollbars", js.undefined)
      
      @scala.inline
      def setDisableSelection(value: Boolean): Self = StObject.set(x, "disableSelection", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableSelectionUndefined: Self = StObject.set(x, "disableSelection", js.undefined)
      
      @scala.inline
      def setEmptyText(value: java.lang.String): Self = StObject.set(x, "emptyText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEmptyTextUndefined: Self = StObject.set(x, "emptyText", js.undefined)
      
      @scala.inline
      def setEnableColumnHide(value: Boolean): Self = StObject.set(x, "enableColumnHide", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableColumnHideUndefined: Self = StObject.set(x, "enableColumnHide", js.undefined)
      
      @scala.inline
      def setEnableColumnMove(value: Boolean): Self = StObject.set(x, "enableColumnMove", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableColumnMoveUndefined: Self = StObject.set(x, "enableColumnMove", js.undefined)
      
      @scala.inline
      def setEnableColumnResize(value: Boolean): Self = StObject.set(x, "enableColumnResize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableColumnResizeUndefined: Self = StObject.set(x, "enableColumnResize", js.undefined)
      
      @scala.inline
      def setEnableLocking(value: Boolean): Self = StObject.set(x, "enableLocking", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableLockingUndefined: Self = StObject.set(x, "enableLocking", js.undefined)
      
      @scala.inline
      def setFeatures(value: js.Any): Self = StObject.set(x, "features", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFeaturesUndefined: Self = StObject.set(x, "features", js.undefined)
      
      @scala.inline
      def setForceFit(value: Boolean): Self = StObject.set(x, "forceFit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setForceFitUndefined: Self = StObject.set(x, "forceFit", js.undefined)
      
      @scala.inline
      def setGetSelectionModel(value: () => IModel): Self = StObject.set(x, "getSelectionModel", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetSelectionModelUndefined: Self = StObject.set(x, "getSelectionModel", js.undefined)
      
      @scala.inline
      def setGetStore(value: () => IStore): Self = StObject.set(x, "getStore", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetStoreUndefined: Self = StObject.set(x, "getStore", js.undefined)
      
      @scala.inline
      def setGetView(value: () => ITable): Self = StObject.set(x, "getView", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetViewUndefined: Self = StObject.set(x, "getView", js.undefined)
      
      @scala.inline
      def setHasView(value: Boolean): Self = StObject.set(x, "hasView", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHasViewUndefined: Self = StObject.set(x, "hasView", js.undefined)
      
      @scala.inline
      def setHideHeaders(value: Boolean): Self = StObject.set(x, "hideHeaders", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHideHeadersUndefined: Self = StObject.set(x, "hideHeaders", js.undefined)
      
      @scala.inline
      def setInvalidateScroller(value: () => Unit): Self = StObject.set(x, "invalidateScroller", js.Any.fromFunction0(value))
      
      @scala.inline
      def setInvalidateScrollerUndefined: Self = StObject.set(x, "invalidateScroller", js.undefined)
      
      @scala.inline
      def setLockedGridConfig(value: js.Any): Self = StObject.set(x, "lockedGridConfig", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLockedGridConfigUndefined: Self = StObject.set(x, "lockedGridConfig", js.undefined)
      
      @scala.inline
      def setLockedViewConfig(value: js.Any): Self = StObject.set(x, "lockedViewConfig", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLockedViewConfigUndefined: Self = StObject.set(x, "lockedViewConfig", js.undefined)
      
      @scala.inline
      def setMultiSelect(value: Boolean): Self = StObject.set(x, "multiSelect", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMultiSelectUndefined: Self = StObject.set(x, "multiSelect", js.undefined)
      
      @scala.inline
      def setNormalGridConfig(value: js.Any): Self = StObject.set(x, "normalGridConfig", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNormalGridConfigUndefined: Self = StObject.set(x, "normalGridConfig", js.undefined)
      
      @scala.inline
      def setNormalViewConfig(value: js.Any): Self = StObject.set(x, "normalViewConfig", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNormalViewConfigUndefined: Self = StObject.set(x, "normalViewConfig", js.undefined)
      
      @scala.inline
      def setOptimizedColumnMove(value: Boolean): Self = StObject.set(x, "optimizedColumnMove", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptimizedColumnMoveUndefined: Self = StObject.set(x, "optimizedColumnMove", js.undefined)
      
      @scala.inline
      def setRowLines(value: Boolean): Self = StObject.set(x, "rowLines", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRowLinesUndefined: Self = StObject.set(x, "rowLines", js.undefined)
      
      @scala.inline
      def setScroll(value: js.Any): Self = StObject.set(x, "scroll", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScrollDelta(value: Double): Self = StObject.set(x, "scrollDelta", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScrollDeltaUndefined: Self = StObject.set(x, "scrollDelta", js.undefined)
      
      @scala.inline
      def setScrollUndefined: Self = StObject.set(x, "scroll", js.undefined)
      
      @scala.inline
      def setSealedColumns(value: Boolean): Self = StObject.set(x, "sealedColumns", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSealedColumnsUndefined: Self = StObject.set(x, "sealedColumns", js.undefined)
      
      @scala.inline
      def setSelModel(value: js.Any): Self = StObject.set(x, "selModel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelModelUndefined: Self = StObject.set(x, "selModel", js.undefined)
      
      @scala.inline
      def setSelType(value: java.lang.String): Self = StObject.set(x, "selType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelTypeUndefined: Self = StObject.set(x, "selType", js.undefined)
      
      @scala.inline
      def setSimpleSelect(value: Boolean): Self = StObject.set(x, "simpleSelect", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSimpleSelectUndefined: Self = StObject.set(x, "simpleSelect", js.undefined)
      
      @scala.inline
      def setSortableColumns(value: Boolean): Self = StObject.set(x, "sortableColumns", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSortableColumnsUndefined: Self = StObject.set(x, "sortableColumns", js.undefined)
      
      @scala.inline
      def setStore(value: IStore): Self = StObject.set(x, "store", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStoreUndefined: Self = StObject.set(x, "store", js.undefined)
      
      @scala.inline
      def setSubGridXType(value: java.lang.String): Self = StObject.set(x, "subGridXType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubGridXTypeUndefined: Self = StObject.set(x, "subGridXType", js.undefined)
      
      @scala.inline
      def setSyncRowHeight(value: Boolean): Self = StObject.set(x, "syncRowHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSyncRowHeightUndefined: Self = StObject.set(x, "syncRowHeight", js.undefined)
      
      @scala.inline
      def setSyncRowHeights(value: () => Unit): Self = StObject.set(x, "syncRowHeights", js.Any.fromFunction0(value))
      
      @scala.inline
      def setSyncRowHeightsUndefined: Self = StObject.set(x, "syncRowHeights", js.undefined)
      
      @scala.inline
      def setVerticalScroller(value: js.Any): Self = StObject.set(x, "verticalScroller", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVerticalScrollerUndefined: Self = StObject.set(x, "verticalScroller", js.undefined)
      
      @scala.inline
      def setView(value: typings.extjs.Ext.view.ITable): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setViewConfig(value: js.Any): Self = StObject.set(x, "viewConfig", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setViewConfigUndefined: Self = StObject.set(x, "viewConfig", js.undefined)
      
      @scala.inline
      def setViewType(value: java.lang.String): Self = StObject.set(x, "viewType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setViewTypeUndefined: Self = StObject.set(x, "viewType", js.undefined)
      
      @scala.inline
      def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
    }
  }
  
  @js.native
  trait ITool extends IComponent {
    
    /** [Config Option] (Function) */
    var callback: js.UndefOr[js.Any] = js.native
    
    /** [Config Option] (Function) */
    var handler: js.UndefOr[js.Any] = js.native
    
    /** [Property] (Boolean) */
    var isTool: js.UndefOr[Boolean] = js.native
    
    /** [Config Option] (Object) */
    var scope: js.UndefOr[js.Any] = js.native
    
    /** [Method] Sets the type of the tool
      * @param type String The new type. See the type config.
      * @returns Ext.panel.Tool this
      */
    var setType: js.UndefOr[js.Function1[/* type */ js.UndefOr[java.lang.String], this.type]] = js.native
    
    /** [Config Option] (Boolean) */
    var stopEvent: js.UndefOr[Boolean] = js.native
    
    /** [Config Option] (Ext.Component) */
    var toolOwner: js.UndefOr[IComponent] = js.native
    
    /** [Config Option] (String/Object) */
    var tooltip: js.UndefOr[js.Any] = js.native
    
    /** [Config Option] (String) */
    var tooltipType: js.UndefOr[java.lang.String] = js.native
    
    /** [Config Option] (String) */
    var `type`: js.UndefOr[java.lang.String] = js.native
  }
  object ITool {
    
    @scala.inline
    def apply(): ITool = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ITool]
    }
    
    @scala.inline
    implicit class IToolMutableBuilder[Self <: ITool] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCallback(value: js.Any): Self = StObject.set(x, "callback", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
      
      @scala.inline
      def setHandler(value: js.Any): Self = StObject.set(x, "handler", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHandlerUndefined: Self = StObject.set(x, "handler", js.undefined)
      
      @scala.inline
      def setIsTool(value: Boolean): Self = StObject.set(x, "isTool", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsToolUndefined: Self = StObject.set(x, "isTool", js.undefined)
      
      @scala.inline
      def setScope(value: js.Any): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
      
      @scala.inline
      def setSetType(value: /* type */ js.UndefOr[java.lang.String] => ITool): Self = StObject.set(x, "setType", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetTypeUndefined: Self = StObject.set(x, "setType", js.undefined)
      
      @scala.inline
      def setStopEvent(value: Boolean): Self = StObject.set(x, "stopEvent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStopEventUndefined: Self = StObject.set(x, "stopEvent", js.undefined)
      
      @scala.inline
      def setToolOwner(value: IComponent): Self = StObject.set(x, "toolOwner", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToolOwnerUndefined: Self = StObject.set(x, "toolOwner", js.undefined)
      
      @scala.inline
      def setTooltip(value: js.Any): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTooltipType(value: java.lang.String): Self = StObject.set(x, "tooltipType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTooltipTypeUndefined: Self = StObject.set(x, "tooltipType", js.undefined)
      
      @scala.inline
      def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
      
      @scala.inline
      def setType(value: java.lang.String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
}
