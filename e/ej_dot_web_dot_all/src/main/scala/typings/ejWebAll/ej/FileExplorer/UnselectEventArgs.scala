package typings.ejWebAll.ej.FileExplorer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnselectEventArgs extends js.Object {
  /** Returns the FileExplorer model.
    */
  var model: js.UndefOr[Model] = js.native
  /** Returns the name of unselected item.
    */
  var name: js.UndefOr[String] = js.native
  /** Returns the name of unselected items.
    */
  var names: js.UndefOr[js.Array[String]] = js.native
  /** Returns the type of unselected item.
    */
  var nodeType: js.UndefOr[String] = js.native
  /** Returns the path of unselected item.
    */
  var path: js.UndefOr[String] = js.native
  /** Returns the name of the event.
    */
  var `type`: js.UndefOr[String] = js.native
  /** Returns the unselected item details.
    */
  var unselectedItem: js.UndefOr[js.Any] = js.native
  /** Returns the unselected items details.
    */
  var unselectedItems: js.UndefOr[js.Array[_]] = js.native
}

object UnselectEventArgs {
  @scala.inline
  def apply(): UnselectEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnselectEventArgs]
  }
  @scala.inline
  implicit class UnselectEventArgsOps[Self <: UnselectEventArgs] (val x: Self) extends AnyVal {
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
    def setModel(value: Model): Self = this.set("model", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModel: Self = this.set("model", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setNamesVarargs(value: String*): Self = this.set("names", js.Array(value :_*))
    @scala.inline
    def setNames(value: js.Array[String]): Self = this.set("names", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNames: Self = this.set("names", js.undefined)
    @scala.inline
    def setNodeType(value: String): Self = this.set("nodeType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNodeType: Self = this.set("nodeType", js.undefined)
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePath: Self = this.set("path", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    @scala.inline
    def setUnselectedItem(value: js.Any): Self = this.set("unselectedItem", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnselectedItem: Self = this.set("unselectedItem", js.undefined)
    @scala.inline
    def setUnselectedItemsVarargs(value: js.Any*): Self = this.set("unselectedItems", js.Array(value :_*))
    @scala.inline
    def setUnselectedItems(value: js.Array[_]): Self = this.set("unselectedItems", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnselectedItems: Self = this.set("unselectedItems", js.undefined)
  }
  
}

