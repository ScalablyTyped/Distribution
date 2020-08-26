package typings.extjs.Ext.util

import typings.extjs.Ext.IBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IQueue extends IBase {
  /** [Method] Removes all items from the collection  */
  var clear: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Method] Returns the number of items in the collection
    * @returns Number the number of items in the collection.
    */
  var getCount: js.UndefOr[js.Function0[Double]] = js.native
  /** [Method] Remove an item from the collection
    * @param obj Object The item to remove.
    * @returns Object The item removed or false if no item was removed.
    */
  var remove: js.UndefOr[js.Function1[/* obj */ js.UndefOr[js.Any], _]] = js.native
}

object IQueue {
  @scala.inline
  def apply(): IQueue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IQueue]
  }
  @scala.inline
  implicit class IQueueOps[Self <: IQueue] (val x: Self) extends AnyVal {
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
    def setClear(value: () => Unit): Self = this.set("clear", js.Any.fromFunction0(value))
    @scala.inline
    def deleteClear: Self = this.set("clear", js.undefined)
    @scala.inline
    def setGetCount(value: () => Double): Self = this.set("getCount", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetCount: Self = this.set("getCount", js.undefined)
    @scala.inline
    def setRemove(value: /* obj */ js.UndefOr[js.Any] => _): Self = this.set("remove", js.Any.fromFunction1(value))
    @scala.inline
    def deleteRemove: Self = this.set("remove", js.undefined)
  }
  
}

