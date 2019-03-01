package typings
package gapiDotClientDotClouddebuggerLib.gapiNs.clientNs.clouddebuggerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SourceLocation extends js.Object {
  /** Line inside the file. The first line in the file has the value `1`. */
  var line: js.UndefOr[scala.Double] = js.undefined
  /** Path to the source file within the source context of the target binary. */
  var path: js.UndefOr[java.lang.String] = js.undefined
}

object SourceLocation {
  @scala.inline
  def apply(line: scala.Int | scala.Double = null, path: java.lang.String = null): SourceLocation = {
    val __obj = js.Dynamic.literal()
    if (line != null) __obj.updateDynamic("line")(line.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path)
    __obj.asInstanceOf[SourceLocation]
  }
}

