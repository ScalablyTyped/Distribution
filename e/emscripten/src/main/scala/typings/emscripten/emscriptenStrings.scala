package typings.emscripten

import typings.emscripten.Emscripten.CFloatType
import typings.emscripten.Emscripten.CIntType
import typings.emscripten.Emscripten.CPointerType
import typings.emscripten.Emscripten.CType
import typings.emscripten.Emscripten.EnvironmentType
import typings.emscripten.Emscripten.JSType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object emscriptenStrings {
  
  @js.native
  sealed trait Asterisk
    extends CPointerType
       with CType
  @scala.inline
  def Asterisk: Asterisk = "*".asInstanceOf[Asterisk]
  
  @js.native
  sealed trait NODE extends EnvironmentType
  @scala.inline
  def NODE: NODE = "NODE".asInstanceOf[NODE]
  
  @js.native
  sealed trait SHELL extends EnvironmentType
  @scala.inline
  def SHELL: SHELL = "SHELL".asInstanceOf[SHELL]
  
  @js.native
  sealed trait WEB extends EnvironmentType
  @scala.inline
  def WEB: WEB = "WEB".asInstanceOf[WEB]
  
  @js.native
  sealed trait WORKER extends EnvironmentType
  @scala.inline
  def WORKER: WORKER = "WORKER".asInstanceOf[WORKER]
  
  @js.native
  sealed trait array extends JSType
  @scala.inline
  def array: array = "array".asInstanceOf[array]
  
  @js.native
  sealed trait binary extends StObject
  @scala.inline
  def binary: binary = "binary".asInstanceOf[binary]
  
  @js.native
  sealed trait boolean extends JSType
  @scala.inline
  def boolean: boolean = "boolean".asInstanceOf[boolean]
  
  @js.native
  sealed trait double
    extends CFloatType
       with CType
  @scala.inline
  def double: double = "double".asInstanceOf[double]
  
  @js.native
  sealed trait doubleAsterisk
    extends CPointerType
       with CType
  @scala.inline
  def doubleAsterisk: doubleAsterisk = "double*".asInstanceOf[doubleAsterisk]
  
  @js.native
  sealed trait float
    extends CFloatType
       with CType
  @scala.inline
  def float: float = "float".asInstanceOf[float]
  
  @js.native
  sealed trait floatAsterisk
    extends CPointerType
       with CType
  @scala.inline
  def floatAsterisk: floatAsterisk = "float*".asInstanceOf[floatAsterisk]
  
  @js.native
  sealed trait i16
    extends CIntType
       with CType
  @scala.inline
  def i16: i16 = "i16".asInstanceOf[i16]
  
  @js.native
  sealed trait i16Asterisk
    extends CPointerType
       with CType
  @scala.inline
  def i16Asterisk: i16Asterisk = "i16*".asInstanceOf[i16Asterisk]
  
  @js.native
  sealed trait i32
    extends CIntType
       with CType
  @scala.inline
  def i32: i32 = "i32".asInstanceOf[i32]
  
  @js.native
  sealed trait i32Asterisk
    extends CPointerType
       with CType
  @scala.inline
  def i32Asterisk: i32Asterisk = "i32*".asInstanceOf[i32Asterisk]
  
  @js.native
  sealed trait i64
    extends CIntType
       with CType
  @scala.inline
  def i64: i64 = "i64".asInstanceOf[i64]
  
  @js.native
  sealed trait i64Asterisk
    extends CPointerType
       with CType
  @scala.inline
  def i64Asterisk: i64Asterisk = "i64*".asInstanceOf[i64Asterisk]
  
  @js.native
  sealed trait i8
    extends CIntType
       with CType
  @scala.inline
  def i8: i8 = "i8".asInstanceOf[i8]
  
  @js.native
  sealed trait i8Asterisk
    extends CPointerType
       with CType
  @scala.inline
  def i8Asterisk: i8Asterisk = "i8*".asInstanceOf[i8Asterisk]
  
  @js.native
  sealed trait number extends JSType
  @scala.inline
  def number: number = "number".asInstanceOf[number]
  
  @js.native
  sealed trait string extends JSType
  @scala.inline
  def string: string = "string".asInstanceOf[string]
  
  @js.native
  sealed trait utf8 extends StObject
  @scala.inline
  def utf8: utf8 = "utf8".asInstanceOf[utf8]
}
