package typings.dropzone.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DropzoneMockFile
  extends /* index */ StringDictionary[js.Any] {
  var name: String
  var size: Double
}

object DropzoneMockFile {
  @scala.inline
  def apply(name: String, size: Double, StringDictionary: /* name */ StringDictionary[js.Any] = null): DropzoneMockFile = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[DropzoneMockFile]
  }
}

