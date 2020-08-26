package typings.extjs.Ext.dd

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDDProxy extends IDD {
  /** [Property] (Boolean) */
  var centerFrame: js.UndefOr[Boolean] = js.native
  /** [Method] Creates the proxy element if it does not yet exist */
  var createFrame: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Property] (String) */
  var dragElId: js.UndefOr[String] = js.native
  /** [Method] overrides Ext dd DragDrop By default we try to move the element to the last location of the frame
    * @param e Object
    */
  @JSName("endDrag")
  var endDrag_IDDProxy: js.UndefOr[js.Function1[/* e */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Initialization for the drag frame element  */
  var initFrame: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Property] (Boolean) */
  var resizeFrame: js.UndefOr[Boolean] = js.native
  /** [Method] toString method
    * @returns String string representation of the dd obj
    */
  @JSName("toString")
  var toString_FIDDProxy: js.UndefOr[js.Function0[String]] = js.native
}

object IDDProxy {
  @scala.inline
  def apply(): IDDProxy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDDProxy]
  }
  @scala.inline
  implicit class IDDProxyOps[Self <: IDDProxy] (val x: Self) extends AnyVal {
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
    def setCenterFrame(value: Boolean): Self = this.set("centerFrame", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCenterFrame: Self = this.set("centerFrame", js.undefined)
    @scala.inline
    def setCreateFrame(value: () => Unit): Self = this.set("createFrame", js.Any.fromFunction0(value))
    @scala.inline
    def deleteCreateFrame: Self = this.set("createFrame", js.undefined)
    @scala.inline
    def setDragElId(value: String): Self = this.set("dragElId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDragElId: Self = this.set("dragElId", js.undefined)
    @scala.inline
    def setEndDrag(value: /* e */ js.UndefOr[js.Any] => Unit): Self = this.set("endDrag", js.Any.fromFunction1(value))
    @scala.inline
    def deleteEndDrag: Self = this.set("endDrag", js.undefined)
    @scala.inline
    def setInitFrame(value: () => Unit): Self = this.set("initFrame", js.Any.fromFunction0(value))
    @scala.inline
    def deleteInitFrame: Self = this.set("initFrame", js.undefined)
    @scala.inline
    def setResizeFrame(value: Boolean): Self = this.set("resizeFrame", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResizeFrame: Self = this.set("resizeFrame", js.undefined)
    @scala.inline
    def setToString(value: () => String): Self = this.set("toString", js.Any.fromFunction0(value))
    @scala.inline
    def deleteToString: Self = this.set("toString", js.undefined)
  }
  
}

