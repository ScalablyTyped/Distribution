package typings
package donnaLib.donnaMod.DonnaTypesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait File extends js.Object {
  var exports: js.Any
  var objects: org.scalablytyped.runtime.NumberDictionary[Line]
}

object File {
  @scala.inline
  def apply(exports: js.Any, objects: org.scalablytyped.runtime.NumberDictionary[Line]): File = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("exports")(exports)
    __obj.updateDynamic("objects")(objects)
    __obj.asInstanceOf[File]
  }
}

