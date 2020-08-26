package typings.extjs.Ext.dd

import typings.extjs.Ext.Array
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDragZone extends IDragSource {
  /** [Config Option] (Object/Boolean) */
  var containerScroll: js.UndefOr[js.Any] = js.native
  /** [Method] Called when a mousedown occurs in this container
    * @param e Event The mouse down event
    * @returns Object The dragData
    */
  @JSName("getDragData")
  var getDragData_IDragZone: js.UndefOr[js.Function1[/* e */ js.UndefOr[Event], _]] = js.native
  /** [Method] Called before a repair of an invalid drop to get the XY to animate to
    * @param e Event The mouse up event
    * @returns Number[] The xy location (e.g. [100, 200])
    */
  var getRepairXY: js.UndefOr[js.Function1[/* e */ js.UndefOr[Event], Array]] = js.native
  /** [Method] Called once drag threshold has been reached to initialize the proxy element
    * @param x Number The x position of the click on the dragged object
    * @param y Number The y position of the click on the dragged object
    * @returns Boolean true to continue the drag, false to cancel
    */
  var onInitDrag: js.UndefOr[js.Function2[/* x */ js.UndefOr[Double], /* y */ js.UndefOr[Double], Boolean]] = js.native
  /** [Config Option] (String/HTMLElement/Ext.dom.Element) */
  var scrollEl: js.UndefOr[js.Any] = js.native
}

object IDragZone {
  @scala.inline
  def apply(): IDragZone = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDragZone]
  }
  @scala.inline
  implicit class IDragZoneOps[Self <: IDragZone] (val x: Self) extends AnyVal {
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
    def setContainerScroll(value: js.Any): Self = this.set("containerScroll", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContainerScroll: Self = this.set("containerScroll", js.undefined)
    @scala.inline
    def setGetDragData(value: /* e */ js.UndefOr[Event] => _): Self = this.set("getDragData", js.Any.fromFunction1(value))
    @scala.inline
    def deleteGetDragData: Self = this.set("getDragData", js.undefined)
    @scala.inline
    def setGetRepairXY(value: /* e */ js.UndefOr[Event] => Array): Self = this.set("getRepairXY", js.Any.fromFunction1(value))
    @scala.inline
    def deleteGetRepairXY: Self = this.set("getRepairXY", js.undefined)
    @scala.inline
    def setOnInitDrag(value: (/* x */ js.UndefOr[Double], /* y */ js.UndefOr[Double]) => Boolean): Self = this.set("onInitDrag", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnInitDrag: Self = this.set("onInitDrag", js.undefined)
    @scala.inline
    def setScrollEl(value: js.Any): Self = this.set("scrollEl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScrollEl: Self = this.set("scrollEl", js.undefined)
  }
  
}

