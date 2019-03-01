package typings
package googleDashClosureDashCompilerLib.googleDashClosureDashCompilerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// The "json_streams" compiler flag lets the compiler accept/produce
// arrays of JSON objects in this shape for input/output.
trait JSONStreamFile extends js.Object {
  var path: java.lang.String
  var src: java.lang.String
  var srcmap: js.UndefOr[java.lang.String] = js.undefined
}

object JSONStreamFile {
  @scala.inline
  def apply(path: java.lang.String, src: java.lang.String, srcmap: java.lang.String = null): JSONStreamFile = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("path")(path)
    __obj.updateDynamic("src")(src)
    if (srcmap != null) __obj.updateDynamic("srcmap")(srcmap)
    __obj.asInstanceOf[JSONStreamFile]
  }
}

