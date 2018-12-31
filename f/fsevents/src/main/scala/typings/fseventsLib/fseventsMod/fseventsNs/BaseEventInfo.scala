package typings
package fseventsLib.fseventsMod.fseventsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseEventInfo[E /* <: java.lang.String */] extends js.Object {
  var changes: fseventsLib.Anon_Xattrs
  var event: E
  var flags: scala.Double
  var path: java.lang.String
  var `type`: fseventsLib.fseventsLibStrings.file | fseventsLib.fseventsLibStrings.directory | fseventsLib.fseventsLibStrings.symlink
}

