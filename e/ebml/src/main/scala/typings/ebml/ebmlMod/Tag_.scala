package typings.ebml.ebmlMod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSName("Tag")
trait Tag_[T /* <: TagType */] extends TagMetadata {
  var data: Buffer
  @JSName("type")
  var type_Tag_ : T
  var value: /* import warning: importer.ImportType#apply Failed type conversion: ebml.ebml.Tag.DataTypeToTypeMap[T] */ js.Any
}

object Tag_ {
  @scala.inline
  def apply[T /* <: TagType */](
    data: Buffer,
    dataSize: Double,
    end: Double,
    name: /* import warning: importer.ImportType#apply Failed type conversion: ebml.ebml.EBMLTagSchema['name'] */ js.Any,
    start: Double,
    tag: Double,
    tagStr: String,
    `type`: T,
    value: /* import warning: importer.ImportType#apply Failed type conversion: ebml.ebml.Tag.DataTypeToTypeMap[T] */ js.Any
  ): Tag_[T] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], dataSize = dataSize.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any], tagStr = tagStr.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Tag_[T]]
  }
}

