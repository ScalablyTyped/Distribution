package typings.dexie.dexieMod.Dexie

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IndexSpec extends js.Object {
  var auto: Boolean
  var compound: Boolean
  var keyPath: String | js.Array[String]
  var multi: Boolean
  var name: String
  var src: String
  var unique: Boolean
}

object IndexSpec {
  @scala.inline
  def apply(
    auto: Boolean,
    compound: Boolean,
    keyPath: String | js.Array[String],
    multi: Boolean,
    name: String,
    src: String,
    unique: Boolean
  ): IndexSpec = {
    val __obj = js.Dynamic.literal(auto = auto, compound = compound, keyPath = keyPath.asInstanceOf[js.Any], multi = multi, name = name, src = src, unique = unique)
  
    __obj.asInstanceOf[IndexSpec]
  }
}

