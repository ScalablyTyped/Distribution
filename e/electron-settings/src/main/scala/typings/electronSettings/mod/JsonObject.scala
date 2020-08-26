package typings.electronSettings.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JsonObject
  extends /* x */ StringDictionary[JsonValue]
     with _JsonValue

object JsonObject {
  @scala.inline
  def apply(): JsonObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JsonObject]
  }
}

