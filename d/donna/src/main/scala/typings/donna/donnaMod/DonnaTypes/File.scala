package typings.donna.donnaMod.DonnaTypes

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
    val __obj = js.Dynamic.literal(exports = exports, objects = objects)
  
    __obj.asInstanceOf[File]
  }
}

