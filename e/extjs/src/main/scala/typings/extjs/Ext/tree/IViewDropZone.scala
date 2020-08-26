package typings.extjs.Ext.tree

import typings.extjs.Ext.view.IDropZone
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IViewDropZone extends IDropZone {
  /** [Config Option] (Boolean) */
  var allowContainerDrop: js.UndefOr[Boolean] = js.native
  /** [Config Option] (Boolean) */
  var allowParentInserts: js.UndefOr[Boolean] = js.native
  /** [Config Option] (Boolean) */
  var appendOnly: js.UndefOr[Boolean] = js.native
  /** [Config Option] (Number) */
  var expandDelay: js.UndefOr[Double] = js.native
  /** [Method] Moved out of the DropZone without dropping  */
  @JSName("notifyOut")
  var notifyOut_IViewDropZone: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Method] The mouse is no longer over a tree node so dropping is not valid
    * @param n Object
    * @param dd Object
    * @param e Object
    * @param data Object
    */
  @JSName("onNodeOut")
  var onNodeOut_IViewDropZone: js.UndefOr[
    js.Function4[
      /* n */ js.UndefOr[js.Any], 
      /* dd */ js.UndefOr[js.Any], 
      /* e */ js.UndefOr[js.Any], 
      /* data */ js.UndefOr[js.Any], 
      Unit
    ]
  ] = js.native
}

object IViewDropZone {
  @scala.inline
  def apply(): IViewDropZone = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IViewDropZone]
  }
  @scala.inline
  implicit class IViewDropZoneOps[Self <: IViewDropZone] (val x: Self) extends AnyVal {
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
    def setAllowContainerDrop(value: Boolean): Self = this.set("allowContainerDrop", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowContainerDrop: Self = this.set("allowContainerDrop", js.undefined)
    @scala.inline
    def setAllowParentInserts(value: Boolean): Self = this.set("allowParentInserts", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowParentInserts: Self = this.set("allowParentInserts", js.undefined)
    @scala.inline
    def setAppendOnly(value: Boolean): Self = this.set("appendOnly", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAppendOnly: Self = this.set("appendOnly", js.undefined)
    @scala.inline
    def setExpandDelay(value: Double): Self = this.set("expandDelay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpandDelay: Self = this.set("expandDelay", js.undefined)
    @scala.inline
    def setNotifyOut(value: () => Unit): Self = this.set("notifyOut", js.Any.fromFunction0(value))
    @scala.inline
    def deleteNotifyOut: Self = this.set("notifyOut", js.undefined)
    @scala.inline
    def setOnNodeOut(
      value: (/* n */ js.UndefOr[js.Any], /* dd */ js.UndefOr[js.Any], /* e */ js.UndefOr[js.Any], /* data */ js.UndefOr[js.Any]) => Unit
    ): Self = this.set("onNodeOut", js.Any.fromFunction4(value))
    @scala.inline
    def deleteOnNodeOut: Self = this.set("onNodeOut", js.undefined)
  }
  
}

