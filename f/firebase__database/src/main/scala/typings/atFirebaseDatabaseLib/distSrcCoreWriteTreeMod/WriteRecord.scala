package typings
package atFirebaseDatabaseLib.distSrcCoreWriteTreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WriteRecord extends js.Object {
  var children: js.UndefOr[
    org.scalablytyped.runtime.StringDictionary[atFirebaseDatabaseLib.distSrcCoreSnapNodeMod.Node] | scala.Null
  ] = js.undefined
  var path: atFirebaseDatabaseLib.distSrcCoreUtilPathMod.Path
  var snap: js.UndefOr[atFirebaseDatabaseLib.distSrcCoreSnapNodeMod.Node | scala.Null] = js.undefined
  var visible: scala.Boolean
  var writeId: scala.Double
}

object WriteRecord {
  @scala.inline
  def apply(
    path: atFirebaseDatabaseLib.distSrcCoreUtilPathMod.Path,
    visible: scala.Boolean,
    writeId: scala.Double,
    children: org.scalablytyped.runtime.StringDictionary[atFirebaseDatabaseLib.distSrcCoreSnapNodeMod.Node] = null,
    snap: atFirebaseDatabaseLib.distSrcCoreSnapNodeMod.Node = null
  ): WriteRecord = {
    val __obj = js.Dynamic.literal(path = path, visible = visible, writeId = writeId)
    if (children != null) __obj.updateDynamic("children")(children)
    if (snap != null) __obj.updateDynamic("snap")(snap)
    __obj.asInstanceOf[WriteRecord]
  }
}

