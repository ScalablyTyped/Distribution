package typings.ebml.mod

import typings.ebml.ebmlStrings.f
import typings.ebml.ebmlStrings.i
import typings.ebml.ebmlStrings.s
import typings.ebml.ebmlStrings.u
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TagMetadata extends js.Object {
  /** Size of data in bytes */
  var dataSize: Double = js.native
  /** End byte offset if known, else `-1` */
  var end: Double = js.native
  /** Element name */
  var name: String = js.native
  /** Start byte offset */
  var start: Double = js.native
  /** EBML ID */
  var tag: Double = js.native
  /** EBML ID as a hex string */
  var tagStr: String = js.native
  /** Data type */
  var `type`: TagType | u | i | f | s = js.native
}

object TagMetadata {
  @scala.inline
  def apply(
    dataSize: Double,
    end: Double,
    name: String,
    start: Double,
    tag: Double,
    tagStr: String,
    `type`: TagType | u | i | f | s
  ): TagMetadata = {
    val __obj = js.Dynamic.literal(dataSize = dataSize.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any], tagStr = tagStr.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TagMetadata]
  }
  @scala.inline
  implicit class TagMetadataOps[Self <: TagMetadata] (val x: Self) extends AnyVal {
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
    def setDataSize(value: Double): Self = this.set("dataSize", value.asInstanceOf[js.Any])
    @scala.inline
    def setEnd(value: Double): Self = this.set("end", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setStart(value: Double): Self = this.set("start", value.asInstanceOf[js.Any])
    @scala.inline
    def setTag(value: Double): Self = this.set("tag", value.asInstanceOf[js.Any])
    @scala.inline
    def setTagStr(value: String): Self = this.set("tagStr", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: TagType | u | i | f | s): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

