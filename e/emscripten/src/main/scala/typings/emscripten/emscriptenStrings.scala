package typings.emscripten

import typings.emscripten.Emscripten.CFloatType
import typings.emscripten.Emscripten.CIntType
import typings.emscripten.Emscripten.CPointerType
import typings.emscripten.Emscripten.CType
import typings.emscripten.Emscripten.EnvironmentType
import typings.emscripten.Emscripten.JSType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object emscriptenStrings {
  @js.native
  sealed trait Asterisk
    extends CPointerType
       with CType
  
  @js.native
  sealed trait NODE extends EnvironmentType
  
  @js.native
  sealed trait SHELL extends EnvironmentType
  
  @js.native
  sealed trait WEB extends EnvironmentType
  
  @js.native
  sealed trait WORKER extends EnvironmentType
  
  @js.native
  sealed trait array extends JSType
  
  @js.native
  sealed trait binary extends js.Object
  
  @js.native
  sealed trait boolean extends JSType
  
  @js.native
  sealed trait double
    extends CFloatType
       with CType
  
  @js.native
  sealed trait doubleAsterisk
    extends CPointerType
       with CType
  
  @js.native
  sealed trait float
    extends CFloatType
       with CType
  
  @js.native
  sealed trait floatAsterisk
    extends CPointerType
       with CType
  
  @js.native
  sealed trait i16
    extends CIntType
       with CType
  
  @js.native
  sealed trait i16Asterisk
    extends CPointerType
       with CType
  
  @js.native
  sealed trait i32
    extends CIntType
       with CType
  
  @js.native
  sealed trait i32Asterisk
    extends CPointerType
       with CType
  
  @js.native
  sealed trait i64
    extends CIntType
       with CType
  
  @js.native
  sealed trait i64Asterisk
    extends CPointerType
       with CType
  
  @js.native
  sealed trait i8
    extends CIntType
       with CType
  
  @js.native
  sealed trait i8Asterisk
    extends CPointerType
       with CType
  
  @js.native
  sealed trait number extends JSType
  
  @js.native
  sealed trait string extends JSType
  
  @js.native
  sealed trait utf8 extends js.Object
  
  @scala.inline
  def Asterisk: Asterisk = "*".asInstanceOf[Asterisk]
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
  def double: double = "double".asInstanceOf[double]
  @scala.inline
  def doubleAsterisk: doubleAsterisk = "double*".asInstanceOf[doubleAsterisk]
  @scala.inline
  def float: float = "float".asInstanceOf[float]
  @scala.inline
  def floatAsterisk: floatAsterisk = "float*".asInstanceOf[floatAsterisk]
  @scala.inline
  def i16: i16 = "i16".asInstanceOf[i16]
  @scala.inline
  def i16Asterisk: i16Asterisk = "i16*".asInstanceOf[i16Asterisk]
  @scala.inline
  def i32: i32 = "i32".asInstanceOf[i32]
  @scala.inline
  def i32Asterisk: i32Asterisk = "i32*".asInstanceOf[i32Asterisk]
  @scala.inline
  def i64: i64 = "i64".asInstanceOf[i64]
  @scala.inline
  def i64Asterisk: i64Asterisk = "i64*".asInstanceOf[i64Asterisk]
  @scala.inline
  def i8: i8 = "i8".asInstanceOf[i8]
  @scala.inline
  def i8Asterisk: i8Asterisk = "i8*".asInstanceOf[i8Asterisk]
  @scala.inline
  def number: number = "number".asInstanceOf[number]
  @scala.inline
  def string: string = "string".asInstanceOf[string]
  @scala.inline
  def utf8: utf8 = "utf8".asInstanceOf[utf8]
}

