package typings
package atFeathersjsErrorsLib.errorsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@feathersjs/errors", "FeathersError")
@js.native
class FeathersError protected ()
  extends nodeLib.Error {
  def this(msg: java.lang.String, name: java.lang.String, code: scala.Double, className: java.lang.String, data: js.Any) = this()
  def this(msg: nodeLib.Error, name: java.lang.String, code: scala.Double, className: java.lang.String, data: js.Any) = this()
}

