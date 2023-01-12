package typings.emscripten

import typings.emscripten.anon.Kind
import typings.emscripten.anon.Module
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Emscripten {
  
  trait CCallOpts extends StObject {
    
    var async: js.UndefOr[Boolean] = js.undefined
  }
  object CCallOpts {
    
    inline def apply(): CCallOpts = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CCallOpts]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CCallOpts] (val x: Self) extends AnyVal {
      
      inline def setAsync(value: Boolean): Self = StObject.set(x, "async", value.asInstanceOf[js.Any])
      
      inline def setAsyncUndefined: Self = StObject.set(x, "async", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.emscripten.emscriptenStrings.float
    - typings.emscripten.emscriptenStrings.double
  */
  trait CFloatType extends StObject
  object CFloatType {
    
    inline def double: typings.emscripten.emscriptenStrings.double = "double".asInstanceOf[typings.emscripten.emscriptenStrings.double]
    
    inline def float: typings.emscripten.emscriptenStrings.float = "float".asInstanceOf[typings.emscripten.emscriptenStrings.float]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.emscripten.emscriptenStrings.i8
    - typings.emscripten.emscriptenStrings.i16
    - typings.emscripten.emscriptenStrings.i32
    - typings.emscripten.emscriptenStrings.i64
  */
  trait CIntType extends StObject
  object CIntType {
    
    inline def i16: typings.emscripten.emscriptenStrings.i16 = "i16".asInstanceOf[typings.emscripten.emscriptenStrings.i16]
    
    inline def i32: typings.emscripten.emscriptenStrings.i32 = "i32".asInstanceOf[typings.emscripten.emscriptenStrings.i32]
    
    inline def i64: typings.emscripten.emscriptenStrings.i64 = "i64".asInstanceOf[typings.emscripten.emscriptenStrings.i64]
    
    inline def i8: typings.emscripten.emscriptenStrings.i8 = "i8".asInstanceOf[typings.emscripten.emscriptenStrings.i8]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.emscripten.emscriptenStrings.i8Asterisk
    - typings.emscripten.emscriptenStrings.i16Asterisk
    - typings.emscripten.emscriptenStrings.i32Asterisk
    - typings.emscripten.emscriptenStrings.i64Asterisk
    - typings.emscripten.emscriptenStrings.floatAsterisk
    - typings.emscripten.emscriptenStrings.doubleAsterisk
    - typings.emscripten.emscriptenStrings.Asterisk
  */
  trait CPointerType extends StObject
  object CPointerType {
    
    inline def Asterisk: typings.emscripten.emscriptenStrings.Asterisk = "*".asInstanceOf[typings.emscripten.emscriptenStrings.Asterisk]
    
    inline def doubleAsterisk: typings.emscripten.emscriptenStrings.doubleAsterisk = "double*".asInstanceOf[typings.emscripten.emscriptenStrings.doubleAsterisk]
    
    inline def floatAsterisk: typings.emscripten.emscriptenStrings.floatAsterisk = "float*".asInstanceOf[typings.emscripten.emscriptenStrings.floatAsterisk]
    
    inline def i16Asterisk: typings.emscripten.emscriptenStrings.i16Asterisk = "i16*".asInstanceOf[typings.emscripten.emscriptenStrings.i16Asterisk]
    
    inline def i32Asterisk: typings.emscripten.emscriptenStrings.i32Asterisk = "i32*".asInstanceOf[typings.emscripten.emscriptenStrings.i32Asterisk]
    
    inline def i64Asterisk: typings.emscripten.emscriptenStrings.i64Asterisk = "i64*".asInstanceOf[typings.emscripten.emscriptenStrings.i64Asterisk]
    
    inline def i8Asterisk: typings.emscripten.emscriptenStrings.i8Asterisk = "i8*".asInstanceOf[typings.emscripten.emscriptenStrings.i8Asterisk]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.emscripten.emscriptenStrings.i8
    - typings.emscripten.emscriptenStrings.i16
    - typings.emscripten.emscriptenStrings.i32
    - typings.emscripten.emscriptenStrings.i64
    - typings.emscripten.emscriptenStrings.float
    - typings.emscripten.emscriptenStrings.double
    - typings.emscripten.emscriptenStrings.i8Asterisk
    - typings.emscripten.emscriptenStrings.i16Asterisk
    - typings.emscripten.emscriptenStrings.i32Asterisk
    - typings.emscripten.emscriptenStrings.i64Asterisk
    - typings.emscripten.emscriptenStrings.floatAsterisk
    - typings.emscripten.emscriptenStrings.doubleAsterisk
    - typings.emscripten.emscriptenStrings.Asterisk
  */
  trait CType extends StObject
  object CType {
    
    inline def Asterisk: typings.emscripten.emscriptenStrings.Asterisk = "*".asInstanceOf[typings.emscripten.emscriptenStrings.Asterisk]
    
    inline def double: typings.emscripten.emscriptenStrings.double = "double".asInstanceOf[typings.emscripten.emscriptenStrings.double]
    
    inline def doubleAsterisk: typings.emscripten.emscriptenStrings.doubleAsterisk = "double*".asInstanceOf[typings.emscripten.emscriptenStrings.doubleAsterisk]
    
    inline def float: typings.emscripten.emscriptenStrings.float = "float".asInstanceOf[typings.emscripten.emscriptenStrings.float]
    
    inline def floatAsterisk: typings.emscripten.emscriptenStrings.floatAsterisk = "float*".asInstanceOf[typings.emscripten.emscriptenStrings.floatAsterisk]
    
    inline def i16: typings.emscripten.emscriptenStrings.i16 = "i16".asInstanceOf[typings.emscripten.emscriptenStrings.i16]
    
    inline def i16Asterisk: typings.emscripten.emscriptenStrings.i16Asterisk = "i16*".asInstanceOf[typings.emscripten.emscriptenStrings.i16Asterisk]
    
    inline def i32: typings.emscripten.emscriptenStrings.i32 = "i32".asInstanceOf[typings.emscripten.emscriptenStrings.i32]
    
    inline def i32Asterisk: typings.emscripten.emscriptenStrings.i32Asterisk = "i32*".asInstanceOf[typings.emscripten.emscriptenStrings.i32Asterisk]
    
    inline def i64: typings.emscripten.emscriptenStrings.i64 = "i64".asInstanceOf[typings.emscripten.emscriptenStrings.i64]
    
    inline def i64Asterisk: typings.emscripten.emscriptenStrings.i64Asterisk = "i64*".asInstanceOf[typings.emscripten.emscriptenStrings.i64Asterisk]
    
    inline def i8: typings.emscripten.emscriptenStrings.i8 = "i8".asInstanceOf[typings.emscripten.emscriptenStrings.i8]
    
    inline def i8Asterisk: typings.emscripten.emscriptenStrings.i8Asterisk = "i8*".asInstanceOf[typings.emscripten.emscriptenStrings.i8Asterisk]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.emscripten.emscriptenStrings.WEB
    - typings.emscripten.emscriptenStrings.NODE
    - typings.emscripten.emscriptenStrings.SHELL
    - typings.emscripten.emscriptenStrings.WORKER
  */
  trait EnvironmentType extends StObject
  object EnvironmentType {
    
    inline def NODE: typings.emscripten.emscriptenStrings.NODE = "NODE".asInstanceOf[typings.emscripten.emscriptenStrings.NODE]
    
    inline def SHELL: typings.emscripten.emscriptenStrings.SHELL = "SHELL".asInstanceOf[typings.emscripten.emscriptenStrings.SHELL]
    
    inline def WEB: typings.emscripten.emscriptenStrings.WEB = "WEB".asInstanceOf[typings.emscripten.emscriptenStrings.WEB]
    
    inline def WORKER: typings.emscripten.emscriptenStrings.WORKER = "WORKER".asInstanceOf[typings.emscripten.emscriptenStrings.WORKER]
  }
  
  trait FileSystemType extends StObject
  
  /* Rewritten from type alias, can be one of: 
    - typings.emscripten.emscriptenStrings.number
    - typings.emscripten.emscriptenStrings.string
    - typings.emscripten.emscriptenStrings.array
    - typings.emscripten.emscriptenStrings.boolean
  */
  trait JSType extends StObject
  object JSType {
    
    inline def array: typings.emscripten.emscriptenStrings.array = "array".asInstanceOf[typings.emscripten.emscriptenStrings.array]
    
    inline def boolean: typings.emscripten.emscriptenStrings.boolean = "boolean".asInstanceOf[typings.emscripten.emscriptenStrings.boolean]
    
    inline def number: typings.emscripten.emscriptenStrings.number = "number".asInstanceOf[typings.emscripten.emscriptenStrings.number]
    
    inline def string: typings.emscripten.emscriptenStrings.string = "string".asInstanceOf[typings.emscripten.emscriptenStrings.string]
  }
  
  type TypeCompatibleWithC = Double | String | js.Array[Any] | Boolean
  
  type WebAssemblyExports = js.Array[Module]
  
  type WebAssemblyImports = js.Array[Kind]
}
