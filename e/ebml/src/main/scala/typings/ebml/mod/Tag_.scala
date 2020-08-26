package typings.ebml.mod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Tag_[T /* <: TagType */] extends TagMetadata {
  var data: Buffer = js.native
  @JSName("type")
  var type_Tag_ : T = js.native
  var value: /* import warning: importer.ImportType#apply Failed type conversion: ebml.ebml.Tag.DataTypeToTypeMap[T] */ js.Any = js.native
}

object Tag_ {
  @scala.inline
  def apply[/* <: typings.ebml.mod.TagType */ T](
    data: Buffer,
    dataSize: Double,
    end: Double,
    name: String,
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
  @scala.inline
  implicit class Tag_Ops[Self <: Tag_[_], /* <: typings.ebml.mod.TagType */ T] (val x: Self with Tag_[T]) extends AnyVal {
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
    def setData(value: Buffer): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: T): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(
      value: /* import warning: importer.ImportType#apply Failed type conversion: ebml.ebml.Tag.DataTypeToTypeMap[T] */ js.Any
    ): Self = this.set("value", value.asInstanceOf[js.Any])
  }
  
}

