package typings.extjs.Ext.resizer

import typings.extjs.Ext.IElement
import typings.extjs.Ext.util.IObservable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IResizer extends IObservable {
  /** [Config Option] (Ext.Element/Ext.util.Region) */
  var constrainTo: js.UndefOr[js.Any] = js.native
  /** [Config Option] (Boolean) */
  var dynamic: js.UndefOr[Boolean] = js.native
  /** [Property] (Ext.Element) */
  var el: js.UndefOr[IElement] = js.native
  /** [Method] Returns the element that was configured with the el or target config property
    * @returns Ext.Element element
    */
  var getEl: js.UndefOr[js.Function0[IElement]] = js.native
  /** [Method] Returns the element or component that was configured with the target config property
    * @returns Ext.Element/Ext.Component
    */
  var getTarget: js.UndefOr[js.Function0[_]] = js.native
  /** [Config Option] (String) */
  var handles: js.UndefOr[String] = js.native
  /** [Config Option] (Number) */
  var height: js.UndefOr[Double] = js.native
  /** [Config Option] (Number) */
  var heightIncrement: js.UndefOr[Double] = js.native
  /** [Config Option] (Number) */
  var maxHeight: js.UndefOr[Double] = js.native
  /** [Config Option] (Number) */
  var maxWidth: js.UndefOr[Double] = js.native
  /** [Config Option] (Number) */
  var minHeight: js.UndefOr[Double] = js.native
  /** [Config Option] (Number) */
  var minWidth: js.UndefOr[Double] = js.native
  /** [Property] (Ext.Element/Ext.Component) */
  var originalTarget: js.UndefOr[js.Any] = js.native
  /** [Config Option] (Boolean) */
  var pinned: js.UndefOr[Boolean] = js.native
  /** [Config Option] (Boolean) */
  var preserveRatio: js.UndefOr[Boolean] = js.native
  /** [Method] Perform a manual resize and fires the resize event
    * @param width Number
    * @param height Number
    */
  var resizeTo: js.UndefOr[
    js.Function2[/* width */ js.UndefOr[Double], /* height */ js.UndefOr[Double], Unit]
  ] = js.native
  /** [Property] (Ext.resizer.ResizeTracker) */
  var resizeTracker: js.UndefOr[IResizeTracker] = js.native
  /** [Config Option] (Ext.Element/Ext.Component) */
  var target: js.UndefOr[js.Any] = js.native
  /** [Config Option] (Boolean) */
  var transparent: js.UndefOr[Boolean] = js.native
  /** [Config Option] (Number) */
  var width: js.UndefOr[Double] = js.native
  /** [Config Option] (Number) */
  var widthIncrement: js.UndefOr[Double] = js.native
}

object IResizer {
  @scala.inline
  def apply(): IResizer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IResizer]
  }
  @scala.inline
  implicit class IResizerOps[Self <: IResizer] (val x: Self) extends AnyVal {
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
    def setConstrainTo(value: js.Any): Self = this.set("constrainTo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConstrainTo: Self = this.set("constrainTo", js.undefined)
    @scala.inline
    def setDynamic(value: Boolean): Self = this.set("dynamic", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDynamic: Self = this.set("dynamic", js.undefined)
    @scala.inline
    def setEl(value: IElement): Self = this.set("el", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEl: Self = this.set("el", js.undefined)
    @scala.inline
    def setGetEl(value: () => IElement): Self = this.set("getEl", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetEl: Self = this.set("getEl", js.undefined)
    @scala.inline
    def setGetTarget(value: () => _): Self = this.set("getTarget", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetTarget: Self = this.set("getTarget", js.undefined)
    @scala.inline
    def setHandles(value: String): Self = this.set("handles", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHandles: Self = this.set("handles", js.undefined)
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    @scala.inline
    def setHeightIncrement(value: Double): Self = this.set("heightIncrement", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeightIncrement: Self = this.set("heightIncrement", js.undefined)
    @scala.inline
    def setMaxHeight(value: Double): Self = this.set("maxHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxHeight: Self = this.set("maxHeight", js.undefined)
    @scala.inline
    def setMaxWidth(value: Double): Self = this.set("maxWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxWidth: Self = this.set("maxWidth", js.undefined)
    @scala.inline
    def setMinHeight(value: Double): Self = this.set("minHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinHeight: Self = this.set("minHeight", js.undefined)
    @scala.inline
    def setMinWidth(value: Double): Self = this.set("minWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinWidth: Self = this.set("minWidth", js.undefined)
    @scala.inline
    def setOriginalTarget(value: js.Any): Self = this.set("originalTarget", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOriginalTarget: Self = this.set("originalTarget", js.undefined)
    @scala.inline
    def setPinned(value: Boolean): Self = this.set("pinned", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePinned: Self = this.set("pinned", js.undefined)
    @scala.inline
    def setPreserveRatio(value: Boolean): Self = this.set("preserveRatio", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreserveRatio: Self = this.set("preserveRatio", js.undefined)
    @scala.inline
    def setResizeTo(value: (/* width */ js.UndefOr[Double], /* height */ js.UndefOr[Double]) => Unit): Self = this.set("resizeTo", js.Any.fromFunction2(value))
    @scala.inline
    def deleteResizeTo: Self = this.set("resizeTo", js.undefined)
    @scala.inline
    def setResizeTracker(value: IResizeTracker): Self = this.set("resizeTracker", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResizeTracker: Self = this.set("resizeTracker", js.undefined)
    @scala.inline
    def setTarget(value: js.Any): Self = this.set("target", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTarget: Self = this.set("target", js.undefined)
    @scala.inline
    def setTransparent(value: Boolean): Self = this.set("transparent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransparent: Self = this.set("transparent", js.undefined)
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
    @scala.inline
    def setWidthIncrement(value: Double): Self = this.set("widthIncrement", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidthIncrement: Self = this.set("widthIncrement", js.undefined)
  }
  
}

