package typings.eggDashCore.eggDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.eggDashCore.eggDashCoreStrings.application
  - typings.eggDashCore.eggDashCoreStrings.agent
*/
trait EggType extends js.Object

object EggType {
  @scala.inline
  def agent: typings.eggDashCore.eggDashCoreStrings.agent = this.cast("agent")
  @scala.inline
  def application: typings.eggDashCore.eggDashCoreStrings.application = this.cast("application")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

