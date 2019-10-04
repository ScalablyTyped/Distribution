package typings.ebml.ebmlMod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Tag[T /* <: TagType */] extends TagMetadata {
  var data: Buffer
  @JSName("type")
  var type_Tag: T
  var value: /* import warning: ImportType.apply Failed type conversion: ebml.ebml.Tag.DataTypeToTypeMap[T] */ js.Any
}

object Tag {
  @scala.inline
  def apply[T /* <: TagType */](
    data: Buffer,
    dataSize: Double,
    end: Double,
    name: /* import warning: ImportType.apply Failed type conversion: ebml.ebml.EBMLTagSchema['name'] */ js.Any,
    start: Double,
    tag: Double,
    tagStr: String,
    `type`: T,
    value: /* import warning: ImportType.apply Failed type conversion: ebml.ebml.Tag.DataTypeToTypeMap[T] */ js.Any
  ): Tag[T] = {
    val __obj = js.Dynamic.literal(data = data, dataSize = dataSize, end = end, name = name, start = start, tag = tag, tagStr = tagStr, value = value)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Tag[T]]
  }
}

