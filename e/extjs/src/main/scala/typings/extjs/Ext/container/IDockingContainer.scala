package typings.extjs.Ext.container

import typings.extjs.Ext.Array
import typings.extjs.Ext.IBase
import typings.extjs.Ext.IComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDockingContainer extends IBase {
  /** [Method] Adds docked item s to the container
    * @param component Object/Object[] The Component or array of components to add. The components must include a 'dock' parameter on each component to indicate where it should be docked ('top', 'right', 'bottom', 'left').
    * @param pos Number The index at which the Component will be added
    * @returns Ext.Component[] The added components.
    */
  var addDocked: js.UndefOr[
    js.Function2[/* component */ js.UndefOr[js.Any], /* pos */ js.UndefOr[Double], Array]
  ] = js.native
  /** [Config Option] (Object) */
  var defaultDockWeights: js.UndefOr[js.Any] = js.native
  /** [Method] Finds a docked component by id itemId or position
    * @param comp String/Number The id, itemId or position of the docked component (see getComponent for details)
    * @returns Ext.Component The docked component (if found)
    */
  var getDockedComponent: js.UndefOr[js.Function1[/* comp */ js.UndefOr[js.Any], IComponent]] = js.native
  /** [Method] Retrieves an array of all currently docked Components
    * @param selector String A ComponentQuery selector string to filter the returned items.
    * @param beforeBody Boolean An optional flag to limit the set of items to only those before the body (true) or after the body (false). All components are returned by default.
    * @returns Ext.Component[] The array of docked components meeting the specified criteria.
    */
  var getDockedItems: js.UndefOr[
    js.Function2[/* selector */ js.UndefOr[String], /* beforeBody */ js.UndefOr[Boolean], Array]
  ] = js.native
  /** [Method] Inserts docked item s to the panel at the indicated position
    * @param pos Number The index at which the Component will be inserted
    * @param component Object/Object[] The Component or array of components to add. The components must include a 'dock' paramater on each component to indicate where it should be docked ('top', 'right', 'bottom', 'left').
    */
  var insertDocked: js.UndefOr[
    js.Function2[/* pos */ js.UndefOr[Double], /* component */ js.UndefOr[js.Any], Unit]
  ] = js.native
  /** [Method] Invoked after a docked item is added to the Panel
    * @param component Ext.Component
    */
  var onDockedAdd: js.UndefOr[js.Function1[/* component */ js.UndefOr[IComponent], Unit]] = js.native
  /** [Method] Invoked after a docked item is removed from the Panel
    * @param component Ext.Component
    */
  var onDockedRemove: js.UndefOr[js.Function1[/* component */ js.UndefOr[IComponent], Unit]] = js.native
  /** [Method] Removes the docked item from the panel
    * @param item Ext.Component The Component to remove.
    * @param autoDestroy Boolean Destroy the component after removal.
    */
  var removeDocked: js.UndefOr[
    js.Function2[/* item */ js.UndefOr[IComponent], /* autoDestroy */ js.UndefOr[Boolean], Unit]
  ] = js.native
}

object IDockingContainer {
  @scala.inline
  def apply(): IDockingContainer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDockingContainer]
  }
  @scala.inline
  implicit class IDockingContainerOps[Self <: IDockingContainer] (val x: Self) extends AnyVal {
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
    def setAddDocked(value: (/* component */ js.UndefOr[js.Any], /* pos */ js.UndefOr[Double]) => Array): Self = this.set("addDocked", js.Any.fromFunction2(value))
    @scala.inline
    def deleteAddDocked: Self = this.set("addDocked", js.undefined)
    @scala.inline
    def setDefaultDockWeights(value: js.Any): Self = this.set("defaultDockWeights", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultDockWeights: Self = this.set("defaultDockWeights", js.undefined)
    @scala.inline
    def setGetDockedComponent(value: /* comp */ js.UndefOr[js.Any] => IComponent): Self = this.set("getDockedComponent", js.Any.fromFunction1(value))
    @scala.inline
    def deleteGetDockedComponent: Self = this.set("getDockedComponent", js.undefined)
    @scala.inline
    def setGetDockedItems(value: (/* selector */ js.UndefOr[String], /* beforeBody */ js.UndefOr[Boolean]) => Array): Self = this.set("getDockedItems", js.Any.fromFunction2(value))
    @scala.inline
    def deleteGetDockedItems: Self = this.set("getDockedItems", js.undefined)
    @scala.inline
    def setInsertDocked(value: (/* pos */ js.UndefOr[Double], /* component */ js.UndefOr[js.Any]) => Unit): Self = this.set("insertDocked", js.Any.fromFunction2(value))
    @scala.inline
    def deleteInsertDocked: Self = this.set("insertDocked", js.undefined)
    @scala.inline
    def setOnDockedAdd(value: /* component */ js.UndefOr[IComponent] => Unit): Self = this.set("onDockedAdd", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnDockedAdd: Self = this.set("onDockedAdd", js.undefined)
    @scala.inline
    def setOnDockedRemove(value: /* component */ js.UndefOr[IComponent] => Unit): Self = this.set("onDockedRemove", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnDockedRemove: Self = this.set("onDockedRemove", js.undefined)
    @scala.inline
    def setRemoveDocked(value: (/* item */ js.UndefOr[IComponent], /* autoDestroy */ js.UndefOr[Boolean]) => Unit): Self = this.set("removeDocked", js.Any.fromFunction2(value))
    @scala.inline
    def deleteRemoveDocked: Self = this.set("removeDocked", js.undefined)
  }
  
}

