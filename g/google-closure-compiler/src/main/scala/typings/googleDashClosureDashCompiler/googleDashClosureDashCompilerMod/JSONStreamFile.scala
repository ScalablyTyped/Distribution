package typings.googleDashClosureDashCompiler.googleDashClosureDashCompilerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// The "json_streams" compiler flag lets the compiler accept/produce
// arrays of JSON objects in this shape for input/output.
trait JSONStreamFile extends js.Object {
  var path: String
  var src: String
  var srcmap: js.UndefOr[String] = js.undefined
}

object JSONStreamFile {
  @scala.inline
  def apply(path: String, src: String, srcmap: String = null): JSONStreamFile = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], src = src.asInstanceOf[js.Any])
    if (srcmap != null) __obj.updateDynamic("srcmap")(srcmap.asInstanceOf[js.Any])
    __obj.asInstanceOf[JSONStreamFile]
  }
}

