package typings.extjs.Ext.panel

import typings.extjs.Ext.Array
import typings.extjs.Ext.IComponent
import typings.extjs.Ext.container.IContainer
import typings.extjs.Ext.dom.IElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.extjs.Ext.IClass because Already inherited
- typings.extjs.Ext.IBase because Already inherited
- typings.extjs.Ext.container.IDockingContainer because var conflicts: alias, alternateClassName, callOverridden, callParent, callSuper, config, extend, getInitialConfig, inheritableStatics, initConfig, mixins, requires, self, singleton, statics, uses. Inlined defaultDockWeights, addDocked, getDockedComponent, getDockedItems, insertDocked, onDockedAdd, onDockedRemove, removeDocked */ @js.native
trait IAbstractPanel extends IContainer {
  
  /** [Method] Adds a CSS class to the body element
    * @param cls String The class to add
    * @returns Ext.panel.Panel this
    */
  var addBodyCls: js.UndefOr[js.Function1[/* cls */ js.UndefOr[String], IPanel]] = js.native
  
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
  var body: js.UndefOr[IElement] = js.native
  
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
  var getDockedItems: js.UndefOr[js.Function2[js.UndefOr[String], js.UndefOr[Boolean], Array]] = js.native
  
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
  var removeBodyCls: js.UndefOr[js.Function1[/* cls */ js.UndefOr[String], IPanel]] = js.native
  
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
    js.Function2[/* style */ js.UndefOr[js.Any], /* value */ js.UndefOr[String], IPanel]
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
  implicit class IAbstractPanelOps[Self <: IAbstractPanel] (val x: Self) extends AnyVal {
    
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
    def setAddBodyCls(value: /* cls */ js.UndefOr[String] => IPanel): Self = this.set("addBodyCls", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteAddBodyCls: Self = this.set("addBodyCls", js.undefined)
    
    @scala.inline
    def setAddDocked(value: (js.UndefOr[js.Any], js.UndefOr[Double]) => Array): Self = this.set("addDocked", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteAddDocked: Self = this.set("addDocked", js.undefined)
    
    @scala.inline
    def setAddUIClsToElement(value: /* cls */ js.UndefOr[js.Any] => Unit): Self = this.set("addUIClsToElement", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteAddUIClsToElement: Self = this.set("addUIClsToElement", js.undefined)
    
    @scala.inline
    def setBody(value: IElement): Self = this.set("body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBody: Self = this.set("body", js.undefined)
    
    @scala.inline
    def setBodyBorder(value: Boolean): Self = this.set("bodyBorder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBodyBorder: Self = this.set("bodyBorder", js.undefined)
    
    @scala.inline
    def setBodyCls(value: js.Any): Self = this.set("bodyCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBodyCls: Self = this.set("bodyCls", js.undefined)
    
    @scala.inline
    def setBodyPadding(value: js.Any): Self = this.set("bodyPadding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBodyPadding: Self = this.set("bodyPadding", js.undefined)
    
    @scala.inline
    def setBodyStyle(value: js.Any): Self = this.set("bodyStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBodyStyle: Self = this.set("bodyStyle", js.undefined)
    
    @scala.inline
    def setDefaultDockWeights(value: js.Any): Self = this.set("defaultDockWeights", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultDockWeights: Self = this.set("defaultDockWeights", js.undefined)
    
    @scala.inline
    def setDockedItems(value: js.Any): Self = this.set("dockedItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDockedItems: Self = this.set("dockedItems", js.undefined)
    
    @scala.inline
    def setGetDockedComponent(value: js.UndefOr[js.Any] => IComponent): Self = this.set("getDockedComponent", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteGetDockedComponent: Self = this.set("getDockedComponent", js.undefined)
    
    @scala.inline
    def setGetDockedItems(value: (js.UndefOr[String], js.UndefOr[Boolean]) => Array): Self = this.set("getDockedItems", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteGetDockedItems: Self = this.set("getDockedItems", js.undefined)
    
    @scala.inline
    def setInsertDocked(value: (js.UndefOr[Double], js.UndefOr[js.Any]) => Unit): Self = this.set("insertDocked", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteInsertDocked: Self = this.set("insertDocked", js.undefined)
    
    @scala.inline
    def setIsPanel(value: Boolean): Self = this.set("isPanel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsPanel: Self = this.set("isPanel", js.undefined)
    
    @scala.inline
    def setOnDockedAdd(value: js.UndefOr[IComponent] => Unit): Self = this.set("onDockedAdd", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnDockedAdd: Self = this.set("onDockedAdd", js.undefined)
    
    @scala.inline
    def setOnDockedRemove(value: js.UndefOr[IComponent] => Unit): Self = this.set("onDockedRemove", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnDockedRemove: Self = this.set("onDockedRemove", js.undefined)
    
    @scala.inline
    def setRemoveBodyCls(value: /* cls */ js.UndefOr[String] => IPanel): Self = this.set("removeBodyCls", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteRemoveBodyCls: Self = this.set("removeBodyCls", js.undefined)
    
    @scala.inline
    def setRemoveDocked(value: (js.UndefOr[IComponent], js.UndefOr[Boolean]) => Unit): Self = this.set("removeDocked", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteRemoveDocked: Self = this.set("removeDocked", js.undefined)
    
    @scala.inline
    def setRemoveUIClsFromElement(value: /* cls */ js.UndefOr[js.Any] => Unit): Self = this.set("removeUIClsFromElement", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteRemoveUIClsFromElement: Self = this.set("removeUIClsFromElement", js.undefined)
    
    @scala.inline
    def setSetBodyStyle(value: (/* style */ js.UndefOr[js.Any], /* value */ js.UndefOr[String]) => IPanel): Self = this.set("setBodyStyle", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteSetBodyStyle: Self = this.set("setBodyStyle", js.undefined)
    
    @scala.inline
    def setShrinkWrapDock(value: js.Any): Self = this.set("shrinkWrapDock", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShrinkWrapDock: Self = this.set("shrinkWrapDock", js.undefined)
  }
}
