package typings.emscripten.Emscripten

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.emscripten.emscriptenStrings.WEB
  - typings.emscripten.emscriptenStrings.NODE
  - typings.emscripten.emscriptenStrings.SHELL
  - typings.emscripten.emscriptenStrings.WORKER
*/
trait EnvironmentType extends js.Object
object EnvironmentType {
  
  @scala.inline
  def NODE: typings.emscripten.emscriptenStrings.NODE = "NODE".asInstanceOf[typings.emscripten.emscriptenStrings.NODE]
  
  @scala.inline
  def SHELL: typings.emscripten.emscriptenStrings.SHELL = "SHELL".asInstanceOf[typings.emscripten.emscriptenStrings.SHELL]
  
  @scala.inline
  def WEB: typings.emscripten.emscriptenStrings.WEB = "WEB".asInstanceOf[typings.emscripten.emscriptenStrings.WEB]
  
  @scala.inline
  def WORKER: typings.emscripten.emscriptenStrings.WORKER = "WORKER".asInstanceOf[typings.emscripten.emscriptenStrings.WORKER]
}
