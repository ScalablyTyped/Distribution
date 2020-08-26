package typings.extjs.Ext

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IColorPalette extends IComponent {
  /** [Config Option] (Boolean) */
  var allowReselect: js.UndefOr[Boolean] = js.native
  /** [Method] Clears any selection and sets the value to null  */
  var clear: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Config Option] (String) */
  var clickEvent: js.UndefOr[java.lang.String] = js.native
  /** [Property] (String[]) */
  var colors: js.UndefOr[Array] = js.native
  /** [Method] Get the currently selected color value
    * @returns String value The selected value. Null if nothing is selected.
    */
  var getValue: js.UndefOr[js.Function0[java.lang.String]] = js.native
  /** [Config Option] (Function) */
  var handler: js.UndefOr[js.Any] = js.native
  /** [Config Option] (String) */
  var itemCls: js.UndefOr[java.lang.String] = js.native
  /** [Method] Template method called when this Component s DOM structure is created  */
  @JSName("onRender")
  var onRender_IColorPalette: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Config Option] (Object) */
  var scope: js.UndefOr[js.Any] = js.native
  /** [Method] Selects the specified color in the picker fires the select event
    * @param color String A valid 6-digit color hex code (# will be stripped if included)
    * @param suppressEvent Boolean True to stop the select event from firing.
    */
  var select: js.UndefOr[
    js.Function2[
      /* color */ js.UndefOr[java.lang.String], 
      /* suppressEvent */ js.UndefOr[Boolean], 
      Unit
    ]
  ] = js.native
  /** [Config Option] (String) */
  var selectedCls: js.UndefOr[java.lang.String] = js.native
  /** [Config Option] (String) */
  var value: js.UndefOr[java.lang.String] = js.native
}

object IColorPalette {
  @scala.inline
  def apply(): IColorPalette = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IColorPalette]
  }
  @scala.inline
  implicit class IColorPaletteOps[Self <: IColorPalette] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAllowReselect(value: Boolean): Self = this.set("allowReselect", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowReselect: Self = this.set("allowReselect", js.undefined)
    @scala.inline
    def setClear(value: () => Unit): Self = this.set("clear", js.Any.fromFunction0(value))
    @scala.inline
    def deleteClear: Self = this.set("clear", js.undefined)
    @scala.inline
    def setClickEvent(value: java.lang.String): Self = this.set("clickEvent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClickEvent: Self = this.set("clickEvent", js.undefined)
    @scala.inline
    def setColors(value: Array): Self = this.set("colors", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColors: Self = this.set("colors", js.undefined)
    @scala.inline
    def setGetValue(value: () => java.lang.String): Self = this.set("getValue", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetValue: Self = this.set("getValue", js.undefined)
    @scala.inline
    def setHandler(value: js.Any): Self = this.set("handler", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHandler: Self = this.set("handler", js.undefined)
    @scala.inline
    def setItemCls(value: java.lang.String): Self = this.set("itemCls", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItemCls: Self = this.set("itemCls", js.undefined)
    @scala.inline
    def setOnRender(value: () => Unit): Self = this.set("onRender", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnRender: Self = this.set("onRender", js.undefined)
    @scala.inline
    def setScope(value: js.Any): Self = this.set("scope", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScope: Self = this.set("scope", js.undefined)
    @scala.inline
    def setSelect(value: (/* color */ js.UndefOr[java.lang.String], /* suppressEvent */ js.UndefOr[Boolean]) => Unit): Self = this.set("select", js.Any.fromFunction2(value))
    @scala.inline
    def deleteSelect: Self = this.set("select", js.undefined)
    @scala.inline
    def setSelectedCls(value: java.lang.String): Self = this.set("selectedCls", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectedCls: Self = this.set("selectedCls", js.undefined)
    @scala.inline
    def setValue(value: java.lang.String): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
  
}

