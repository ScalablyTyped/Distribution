package typings.ebml.mod.Encoder

import typings.node.Buffer
import typings.std.ReturnType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TagStackItem extends js.Object {
  var children: js.Array[TagStackItem] = js.native
  var data: Buffer | Null = js.native
  var end: Double = js.native
  var id: ReturnType[js.Function1[/* tagName */ String, Double | Null]] = js.native
  var name: /* import warning: importer.ImportType#apply Failed type conversion: ebml.ebml.EBMLTagSchema['name'] */ js.Any = js.native
}

object TagStackItem {
  @scala.inline
  def apply(
    children: js.Array[TagStackItem],
    end: Double,
    id: ReturnType[js.Function1[/* tagName */ String, Double | Null]],
    name: /* import warning: importer.ImportType#apply Failed type conversion: ebml.ebml.EBMLTagSchema['name'] */ js.Any
  ): TagStackItem = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[TagStackItem]
  }
  @scala.inline
  implicit class TagStackItemOps[Self <: TagStackItem] (val x: Self) extends AnyVal {
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
    def setChildrenVarargs(value: TagStackItem*): Self = this.set("children", js.Array(value :_*))
    @scala.inline
    def setChildren(value: js.Array[TagStackItem]): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def setEnd(value: Double): Self = this.set("end", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: ReturnType[js.Function1[/* tagName */ String, Double | Null]]): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(
      value: /* import warning: importer.ImportType#apply Failed type conversion: ebml.ebml.EBMLTagSchema['name'] */ js.Any
    ): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setData(value: Buffer): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def setDataNull: Self = this.set("data", null)
  }
  
}

