package typings.extjs.Ext.selection

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ITreeModel extends IRowModel {
  /** [Method] binds the store to the selModel
    * @param store Object
    * @param initial Object
    */
  @JSName("bindStore")
  var bindStore_ITreeModel: js.UndefOr[
    js.Function2[/* store */ js.UndefOr[js.Any], /* initial */ js.UndefOr[js.Any], Unit]
  ] = js.native
}

object ITreeModel {
  @scala.inline
  def apply(): ITreeModel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITreeModel]
  }
  @scala.inline
  implicit class ITreeModelOps[Self <: ITreeModel] (val x: Self) extends AnyVal {
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
    def setBindStore(value: (/* store */ js.UndefOr[js.Any], /* initial */ js.UndefOr[js.Any]) => Unit): Self = this.set("bindStore", js.Any.fromFunction2(value))
    @scala.inline
    def deleteBindStore: Self = this.set("bindStore", js.undefined)
  }
  
}

