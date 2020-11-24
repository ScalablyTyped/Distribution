package typings.eggCore

import typings.eggCore.mod.EggType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object eggCoreStrings {
  
  @scala.inline
  def agent: agent = "agent".asInstanceOf[agent]
  
  @scala.inline
  def application: application = "application".asInstanceOf[application]
  
  @js.native
  sealed trait agent extends EggType
  
  @js.native
  sealed trait application extends EggType
}
