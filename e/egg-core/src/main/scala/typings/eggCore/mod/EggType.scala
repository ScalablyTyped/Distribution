package typings.eggCore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.eggCore.eggCoreStrings.application
  - typings.eggCore.eggCoreStrings.agent
*/
trait EggType extends js.Object

object EggType {
  @scala.inline
  def agent: typings.eggCore.eggCoreStrings.agent = this.cast("agent")
  @scala.inline
  def application: typings.eggCore.eggCoreStrings.application = this.cast("application")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

