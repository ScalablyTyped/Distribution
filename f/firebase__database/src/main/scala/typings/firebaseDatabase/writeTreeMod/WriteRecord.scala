package typings.firebaseDatabase.writeTreeMod

import org.scalablytyped.runtime.StringDictionary
import typings.firebaseDatabase.nodeMod.Node
import typings.firebaseDatabase.pathMod.Path
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
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any], writeId = writeId.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (snap != null) __obj.updateDynamic("snap")(snap.asInstanceOf[js.Any])
    __obj.asInstanceOf[WriteRecord]
  }
}

