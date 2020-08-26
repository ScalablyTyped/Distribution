package typings.ejWebAll.ej.RadialMenu

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Model extends js.Object {
  /** To show the Radial in initial render.
    */
  var autoOpen: js.UndefOr[Boolean] = js.native
  /** Renders the back button Image for Radial using class.
    */
  var backImageClass: js.UndefOr[String] = js.native
  /** Event triggers when we click an item.
    */
  var click: js.UndefOr[js.Function1[/* e */ ClickEventArgs, Unit]] = js.native
  /** Event triggers when the menu is closed.
    */
  var close: js.UndefOr[js.Function1[/* e */ CloseEventArgs, Unit]] = js.native
  /** Sets the root class for RadialMenu theme. This cssClass API helps to use custom skinning option for RadialMenu control. By defining the root class using this API, we need to
    * include this root class in CSS.
    */
  var cssClass: js.UndefOr[String] = js.native
  /** To enable Animation for Radial Menu.
    */
  var enableAnimation: js.UndefOr[Boolean] = js.native
  /** Renders the Image for Radial using Class.
    */
  var imageClass: js.UndefOr[String] = js.native
  /** Specify the items of radial menu
    */
  var items: js.UndefOr[js.Array[Item]] = js.native
  /** Event triggers when the menu is opened.
    */
  var open: js.UndefOr[js.Function1[/* e */ OpenEventArgs, Unit]] = js.native
  /** To set radial render position.
    */
  var position: js.UndefOr[js.Any] = js.native
  /** Specifies the radius of radial menu
    */
  var radius: js.UndefOr[Double] = js.native
  /** To show the Radial while clicking given target element.
    */
  var targetElementId: js.UndefOr[String] = js.native
}

object Model {
  @scala.inline
  def apply(): Model = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Model]
  }
  @scala.inline
  implicit class ModelOps[Self <: Model] (val x: Self) extends AnyVal {
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
    def setAutoOpen(value: Boolean): Self = this.set("autoOpen", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoOpen: Self = this.set("autoOpen", js.undefined)
    @scala.inline
    def setBackImageClass(value: String): Self = this.set("backImageClass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackImageClass: Self = this.set("backImageClass", js.undefined)
    @scala.inline
    def setClick(value: /* e */ ClickEventArgs => Unit): Self = this.set("click", js.Any.fromFunction1(value))
    @scala.inline
    def deleteClick: Self = this.set("click", js.undefined)
    @scala.inline
    def setClose(value: /* e */ CloseEventArgs => Unit): Self = this.set("close", js.Any.fromFunction1(value))
    @scala.inline
    def deleteClose: Self = this.set("close", js.undefined)
    @scala.inline
    def setCssClass(value: String): Self = this.set("cssClass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCssClass: Self = this.set("cssClass", js.undefined)
    @scala.inline
    def setEnableAnimation(value: Boolean): Self = this.set("enableAnimation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableAnimation: Self = this.set("enableAnimation", js.undefined)
    @scala.inline
    def setImageClass(value: String): Self = this.set("imageClass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImageClass: Self = this.set("imageClass", js.undefined)
    @scala.inline
    def setItemsVarargs(value: Item*): Self = this.set("items", js.Array(value :_*))
    @scala.inline
    def setItems(value: js.Array[Item]): Self = this.set("items", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItems: Self = this.set("items", js.undefined)
    @scala.inline
    def setOpen(value: /* e */ OpenEventArgs => Unit): Self = this.set("open", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOpen: Self = this.set("open", js.undefined)
    @scala.inline
    def setPosition(value: js.Any): Self = this.set("position", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
    @scala.inline
    def setRadius(value: Double): Self = this.set("radius", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRadius: Self = this.set("radius", js.undefined)
    @scala.inline
    def setTargetElementId(value: String): Self = this.set("targetElementId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTargetElementId: Self = this.set("targetElementId", js.undefined)
  }
  
}

