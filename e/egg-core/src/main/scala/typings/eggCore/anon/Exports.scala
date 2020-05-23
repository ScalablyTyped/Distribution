package typings.eggCore.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Exports extends js.Object {
  var exports: js.Any
  var fullpath: String
  var properties: js.Array[String]
}

object Exports {
  @scala.inline
  def apply(exports: js.Any, fullpath: String, properties: js.Array[String]): Exports = {
    val __obj = js.Dynamic.literal(exports = exports.asInstanceOf[js.Any], fullpath = fullpath.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any])
    __obj.asInstanceOf[Exports]
  }
}

