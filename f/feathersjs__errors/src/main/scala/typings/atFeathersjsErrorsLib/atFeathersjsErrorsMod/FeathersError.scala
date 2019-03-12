package typings
package atFeathersjsErrorsLib.atFeathersjsErrorsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@feathersjs/errors", "FeathersError")
@js.native
class FeathersError protected ()
  extends stdLib.Error {
  def this(msg: java.lang.String, name: java.lang.String, code: scala.Double, className: java.lang.String, data: js.Any) = this()
  def this(msg: stdLib.Error, name: java.lang.String, code: scala.Double, className: java.lang.String, data: js.Any) = this()
  val className: java.lang.String = js.native
  val code: scala.Double = js.native
  val data: js.Any = js.native
  val errors: js.Any = js.native
  /* CompleteClass */
  override var message: java.lang.String = js.native
  /* CompleteClass */
  override var name: java.lang.String = js.native
  def toJSON(): FeathersErrorJSON = js.native
}

