package typings.extjs.Ext.button

import typings.extjs.Ext.Array
import typings.extjs.Ext.menu.ICheckItem
import typings.extjs.Ext.menu.IMenu
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICycle extends ISplit {
  /** [Config Option] (Function) */
  var changeHandler: js.UndefOr[js.Any] = js.native
  /** [Config Option] (Number/String) */
  var forceGlyph: js.UndefOr[js.Any] = js.native
  /** [Config Option] (String) */
  var forceIcon: js.UndefOr[String] = js.native
  /** [Method] Gets the currently active menu item
    * @returns Ext.menu.CheckItem The active item
    */
  var getActiveItem: js.UndefOr[js.Function0[ICheckItem]] = js.native
  /** [Config Option] (Object[]) */
  var items: js.UndefOr[Array] = js.native
  /** [Property] (Ext.menu.Menu) */
  @JSName("menu")
  var menu_ICycle: js.UndefOr[IMenu] = js.native
  /** [Config Option] (String) */
  var prependText: js.UndefOr[String] = js.native
  /** [Method] Sets the button s active menu item
    * @param item Ext.menu.CheckItem The item to activate
    * @param suppressEvent Boolean True to prevent the button's change event from firing.
    */
  var setActiveItem: js.UndefOr[
    js.Function2[/* item */ js.UndefOr[ICheckItem], /* suppressEvent */ js.UndefOr[Boolean], Unit]
  ] = js.native
  /** [Config Option] (Boolean) */
  var showText: js.UndefOr[Boolean] = js.native
  /** [Method] This is normally called internally on button click but can be called externally to advance the button s active item */
  var toggleSelected: js.UndefOr[js.Function0[Unit]] = js.native
}

object ICycle {
  @scala.inline
  def apply(): ICycle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ICycle]
  }
  @scala.inline
  implicit class ICycleOps[Self <: ICycle] (val x: Self) extends AnyVal {
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
    def setChangeHandler(value: js.Any): Self = this.set("changeHandler", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChangeHandler: Self = this.set("changeHandler", js.undefined)
    @scala.inline
    def setForceGlyph(value: js.Any): Self = this.set("forceGlyph", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteForceGlyph: Self = this.set("forceGlyph", js.undefined)
    @scala.inline
    def setForceIcon(value: String): Self = this.set("forceIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteForceIcon: Self = this.set("forceIcon", js.undefined)
    @scala.inline
    def setGetActiveItem(value: () => ICheckItem): Self = this.set("getActiveItem", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetActiveItem: Self = this.set("getActiveItem", js.undefined)
    @scala.inline
    def setItems(value: Array): Self = this.set("items", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItems: Self = this.set("items", js.undefined)
    @scala.inline
    def setMenu(value: IMenu): Self = this.set("menu", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMenu: Self = this.set("menu", js.undefined)
    @scala.inline
    def setPrependText(value: String): Self = this.set("prependText", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrependText: Self = this.set("prependText", js.undefined)
    @scala.inline
    def setSetActiveItem(value: (/* item */ js.UndefOr[ICheckItem], /* suppressEvent */ js.UndefOr[Boolean]) => Unit): Self = this.set("setActiveItem", js.Any.fromFunction2(value))
    @scala.inline
    def deleteSetActiveItem: Self = this.set("setActiveItem", js.undefined)
    @scala.inline
    def setShowText(value: Boolean): Self = this.set("showText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowText: Self = this.set("showText", js.undefined)
    @scala.inline
    def setToggleSelected(value: () => Unit): Self = this.set("toggleSelected", js.Any.fromFunction0(value))
    @scala.inline
    def deleteToggleSelected: Self = this.set("toggleSelected", js.undefined)
  }
  
}

