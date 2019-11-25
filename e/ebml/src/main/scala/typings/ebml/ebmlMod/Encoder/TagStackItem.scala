package typings.ebml.ebmlMod.Encoder

import typings.node.Buffer
import typings.std.ReturnType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TagStackItem extends js.Object {
  var children: js.Array[TagStackItem]
  var data: Buffer | Null
  var end: Double
  var id: ReturnType[js.Function1[/* tagName */ String, Double | Null]]
  var name: /* import warning: importer.ImportType#apply Failed type conversion: ebml.ebml.EBMLTagSchema['name'] */ js.Any
}

object TagStackItem {
  @scala.inline
  def apply(
    children: js.Array[TagStackItem],
    end: Double,
    id: ReturnType[js.Function1[/* tagName */ String, Double | Null]],
    name: /* import warning: importer.ImportType#apply Failed type conversion: ebml.ebml.EBMLTagSchema['name'] */ js.Any,
    data: Buffer = null
  ): TagStackItem = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    __obj.asInstanceOf[TagStackItem]
  }
}

