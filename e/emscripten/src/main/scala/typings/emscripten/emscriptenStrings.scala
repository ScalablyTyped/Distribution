package typings.emscripten

import typings.emscripten.Emscripten.EnvironmentType
import typings.emscripten.Emscripten.ValueType
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
  
  @js.native
  sealed trait array extends ValueType
  
  @js.native
  sealed trait binary extends js.Object
  
  @js.native
  sealed trait boolean extends ValueType
  
  @js.native
  sealed trait number extends ValueType
  
  @js.native
  sealed trait string extends ValueType
  
  @js.native
  sealed trait utf8 extends js.Object
  
  @scala.inline
  def NODE: NODE = "NODE".asInstanceOf[NODE]
  @scala.inline
  def SHELL: SHELL = "SHELL".asInstanceOf[SHELL]
  @scala.inline
  def WEB: WEB = "WEB".asInstanceOf[WEB]
  @scala.inline
  def WORKER: WORKER = "WORKER".asInstanceOf[WORKER]
  @scala.inline
  def array: array = "array".asInstanceOf[array]
  @scala.inline
  def binary: binary = "binary".asInstanceOf[binary]
  @scala.inline
  def boolean: boolean = "boolean".asInstanceOf[boolean]
  @scala.inline
  def number: number = "number".asInstanceOf[number]
  @scala.inline
  def string: string = "string".asInstanceOf[string]
  @scala.inline
  def utf8: utf8 = "utf8".asInstanceOf[utf8]
}

