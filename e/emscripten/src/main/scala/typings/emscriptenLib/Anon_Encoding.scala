package typings
package emscriptenLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Encoding extends js.Object {
  var encoding: java.lang.String
  var flags: java.lang.String
}

object Anon_Encoding {
  @scala.inline
  def apply(encoding: java.lang.String, flags: java.lang.String): Anon_Encoding = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("encoding")(encoding)
    __obj.updateDynamic("flags")(flags)
    __obj.asInstanceOf[Anon_Encoding]
  }
}

