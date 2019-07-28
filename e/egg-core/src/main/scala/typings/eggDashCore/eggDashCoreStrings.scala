package typings.eggDashCore

import typings.eggDashCore.eggDashCoreMod.EggType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object eggDashCoreStrings {
  @js.native
  sealed trait agent extends EggType
  
  @js.native
  sealed trait application extends EggType
  
  @scala.inline
  def agent: agent = "agent".asInstanceOf[agent]
  @scala.inline
  def application: application = "application".asInstanceOf[application]
}

