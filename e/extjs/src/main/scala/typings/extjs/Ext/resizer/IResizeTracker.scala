package typings.extjs.Ext.resizer

import typings.extjs.Ext.IElement
import typings.extjs.Ext.dd.IDragTracker
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IResizeTracker extends IDragTracker {
  /** [Method] Create a proxy for this resizer
    * @param target Ext.Component/Ext.Element The target
    * @returns Ext.Element A proxy element
    */
  var createProxy: js.UndefOr[js.Function1[/* target */ js.UndefOr[js.Any], IElement]] = js.native
  /** [Method] Template method which should be overridden by each DragTracker instance
    * @param e Object
    */
  @JSName("onBeforeStart")
  var onBeforeStart_IResizeTracker: js.UndefOr[js.Function1[/* e */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Template method which should be overridden by each DragTracker instance
    * @param e Object
    */
  @JSName("onDrag")
  var onDrag_IResizeTracker: js.UndefOr[js.Function1[/* e */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Template method which should be overridden by each DragTracker instance
    * @param e Object
    */
  @JSName("onEnd")
  var onEnd_IResizeTracker: js.UndefOr[js.Function1[/* e */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Template method which should be overridden by each DragTracker instance
    * @param e Object
    */
  @JSName("onStart")
  var onStart_IResizeTracker: js.UndefOr[js.Function1[/* e */ js.UndefOr[js.Any], Unit]] = js.native
}

object IResizeTracker {
  @scala.inline
  def apply(): IResizeTracker = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IResizeTracker]
  }
  @scala.inline
  implicit class IResizeTrackerOps[Self <: IResizeTracker] (val x: Self) extends AnyVal {
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
    def setCreateProxy(value: /* target */ js.UndefOr[js.Any] => IElement): Self = this.set("createProxy", js.Any.fromFunction1(value))
    @scala.inline
    def deleteCreateProxy: Self = this.set("createProxy", js.undefined)
    @scala.inline
    def setOnBeforeStart(value: /* e */ js.UndefOr[js.Any] => Unit): Self = this.set("onBeforeStart", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnBeforeStart: Self = this.set("onBeforeStart", js.undefined)
    @scala.inline
    def setOnDrag(value: /* e */ js.UndefOr[js.Any] => Unit): Self = this.set("onDrag", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnDrag: Self = this.set("onDrag", js.undefined)
    @scala.inline
    def setOnEnd(value: /* e */ js.UndefOr[js.Any] => Unit): Self = this.set("onEnd", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnEnd: Self = this.set("onEnd", js.undefined)
    @scala.inline
    def setOnStart(value: /* e */ js.UndefOr[js.Any] => Unit): Self = this.set("onStart", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnStart: Self = this.set("onStart", js.undefined)
  }
  
}

