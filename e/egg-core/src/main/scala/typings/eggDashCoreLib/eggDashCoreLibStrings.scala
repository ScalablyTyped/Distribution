package typings
package eggDashCoreLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object eggDashCoreLibStrings {
  @js.native
  sealed trait agent
    extends eggDashCoreLib.eggDashCoreMod.EggType
  
  @js.native
  sealed trait application
    extends eggDashCoreLib.eggDashCoreMod.EggType
  
  @scala.inline
  def agent: agent = "agent".asInstanceOf[agent]
  @scala.inline
  def application: application = "application".asInstanceOf[application]
}

