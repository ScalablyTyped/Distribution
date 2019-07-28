package typings.atFirebaseDatabase.distSrcCoreWriteTreeMod

import org.scalablytyped.runtime.StringDictionary
import typings.atFirebaseDatabase.distSrcCoreSnapNodeMod.Node
import typings.atFirebaseDatabase.distSrcCoreUtilPathMod.Path
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WriteRecord extends js.Object {
  var children: js.UndefOr[StringDictionary[Node] | Null] = js.undefined
  var path: Path
  var snap: js.UndefOr[Node | Null] = js.undefined
  var visible: Boolean
  var writeId: Double
}

object WriteRecord {
  @scala.inline
  def apply(
    path: Path,
    visible: Boolean,
    writeId: Double,
    children: StringDictionary[Node] = null,
    snap: Node = null
  ): WriteRecord = {
    val __obj = js.Dynamic.literal(path = path, visible = visible, writeId = writeId)
    if (children != null) __obj.updateDynamic("children")(children)
    if (snap != null) __obj.updateDynamic("snap")(snap)
    __obj.asInstanceOf[WriteRecord]
  }
}

