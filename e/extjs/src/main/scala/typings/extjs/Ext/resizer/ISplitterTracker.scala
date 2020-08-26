package typings.extjs.Ext.resizer

import typings.extjs.Ext.dd.IDragTracker
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISplitterTracker extends IDragTracker {
  /** [Method] ensure the tracker is enabled store boxes of previous and next components and calculate the constrain region
    * @param e Object
    */
  @JSName("onBeforeStart")
  var onBeforeStart_ISplitterTracker: js.UndefOr[js.Function1[/* e */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Track the proxy and set the proper XY coordinates while constraining the drag
    * @param e Object
    */
  @JSName("onDrag")
  var onDrag_ISplitterTracker: js.UndefOr[js.Function1[/* e */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] perform the resize and remove the proxy class from the splitter el
    * @param e Object
    */
  @JSName("onEnd")
  var onEnd_ISplitterTracker: js.UndefOr[js.Function1[/* e */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] We move the splitter el
    * @param e Object
    */
  @JSName("onStart")
  var onStart_ISplitterTracker: js.UndefOr[js.Function1[/* e */ js.UndefOr[js.Any], Unit]] = js.native
}

object ISplitterTracker {
  @scala.inline
  def apply(): ISplitterTracker = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ISplitterTracker]
  }
  @scala.inline
  implicit class ISplitterTrackerOps[Self <: ISplitterTracker] (val x: Self) extends AnyVal {
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

