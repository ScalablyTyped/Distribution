package typings.emscripten

import typings.emscripten.EmscriptenNs.EnvironmentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object emscriptenStrings {
  @js.native
  sealed trait NODE extends EnvironmentType
  
  @js.native
  sealed trait SHELL extends EnvironmentType
  
  @js.native
  sealed trait WEB extends EnvironmentType
  
  @js.native
  sealed trait WORKER extends EnvironmentType
  
  @scala.inline
  def NODE: NODE = "NODE".asInstanceOf[NODE]
  @scala.inline
  def SHELL: SHELL = "SHELL".asInstanceOf[SHELL]
  @scala.inline
  def WEB: WEB = "WEB".asInstanceOf[WEB]
  @scala.inline
  def WORKER: WORKER = "WORKER".asInstanceOf[WORKER]
}

