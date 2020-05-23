package typings.gitana.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gitana", "AbstractSelfableObject")
@js.native
class AbstractSelfableObject protected () extends AbstractObject {
  def this(driver: js.Any, `object`: js.Any) = this()
  def del(): js.Any = js.native
  def reload(): this.type = js.native
  def update(): this.type = js.native
}

/* static members */
@JSImport("gitana", "AbstractSelfableObject")
@js.native
object AbstractSelfableObject extends js.Object {
  def extend(_instance: js.Any, _static: js.Any, args: js.Any*): js.Any = js.native
  def forEach(`object`: js.Any, block: js.Any, context: js.Any): Unit = js.native
  def implement(args: js.Any*): js.Any = js.native
  def valueOf(`type`: js.Any): js.Any = js.native
}

