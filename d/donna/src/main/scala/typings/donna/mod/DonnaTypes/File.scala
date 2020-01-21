package typings.donna.mod.DonnaTypes

import org.scalablytyped.runtime.NumberDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait File extends js.Object {
  var exports: js.Any
  var objects: NumberDictionary[Line]
}

object File {
  @scala.inline
  def apply(exports: js.Any, objects: NumberDictionary[Line]): File = {
    val __obj = js.Dynamic.literal(exports = exports.asInstanceOf[js.Any], objects = objects.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[File]
  }
}

