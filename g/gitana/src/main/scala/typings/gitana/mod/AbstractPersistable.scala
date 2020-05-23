package typings.gitana.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gitana", "AbstractPersistable")
@js.native
class AbstractPersistable protected () extends Chainable {
  def this(driver: js.Any, `object`: js.Any) = this()
  def handleResponse(response: js.Any): Unit = js.native
  def handleSystemProperties(response: js.Any): Unit = js.native
  def json(): js.Any = js.native
}

/* static members */
@JSImport("gitana", "AbstractPersistable")
@js.native
object AbstractPersistable extends js.Object {
  def extend(_instance: js.Any, _static: js.Any, args: js.Any*): js.Any = js.native
  def forEach(`object`: js.Any, block: js.Any, context: js.Any): Unit = js.native
  def implement(args: js.Any*): js.Any = js.native
  def valueOf(`type`: js.Any): js.Any = js.native
}

