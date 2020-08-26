package typings.firebaseDatabase.writeTreeMod

import org.scalablytyped.runtime.StringDictionary
import typings.firebaseDatabase.nodeMod.Node
import typings.firebaseDatabase.pathMod.Path
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WriteRecord extends js.Object {
  var children: js.UndefOr[StringDictionary[Node] | Null] = js.native
  var path: Path = js.native
  var snap: js.UndefOr[Node | Null] = js.native
  var visible: Boolean = js.native
  var writeId: Double = js.native
}

object WriteRecord {
  @scala.inline
  def apply(path: Path, visible: Boolean, writeId: Double): WriteRecord = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any], writeId = writeId.asInstanceOf[js.Any])
    __obj.asInstanceOf[WriteRecord]
  }
  @scala.inline
  implicit class WriteRecordOps[Self <: WriteRecord] (val x: Self) extends AnyVal {
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
    def setPath(value: Path): Self = this.set("path", value.asInstanceOf[js.Any])
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
    @scala.inline
    def setWriteId(value: Double): Self = this.set("writeId", value.asInstanceOf[js.Any])
    @scala.inline
    def setChildren(value: StringDictionary[Node]): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    @scala.inline
    def setChildrenNull: Self = this.set("children", null)
    @scala.inline
    def setSnap(value: Node): Self = this.set("snap", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSnap: Self = this.set("snap", js.undefined)
    @scala.inline
    def setSnapNull: Self = this.set("snap", null)
  }
  
}

