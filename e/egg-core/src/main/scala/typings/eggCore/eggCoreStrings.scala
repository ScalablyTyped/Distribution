package typings.eggCore

import typings.eggCore.mod.EggType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object eggCoreStrings {
  @js.native
  sealed trait agent extends EggType
  
  @js.native
  sealed trait application extends EggType
  
  @scala.inline
  def agent: agent = "agent".asInstanceOf[agent]
  @scala.inline
  def application: application = "application".asInstanceOf[application]
}

