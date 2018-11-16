package typings
package emscriptenLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object emscriptenLibStrings {
  @js.native
  sealed trait NODE extends js.Object
  
  @js.native
  sealed trait SHELL extends js.Object
  
  @js.native
  sealed trait WEB extends js.Object
  
  @js.native
  sealed trait WORKER extends js.Object
  
  def NODE: NODE = "NODE".asInstanceOf[NODE]
  def SHELL: SHELL = "SHELL".asInstanceOf[SHELL]
  def WEB: WEB = "WEB".asInstanceOf[WEB]
  def WORKER: WORKER = "WORKER".asInstanceOf[WORKER]
}

