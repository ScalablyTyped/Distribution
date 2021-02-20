package typings.emscripten

import typings.emscripten.anon.Kind
import typings.emscripten.anon.Module
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Emscripten {
  
  @js.native
  trait CCallOpts extends StObject {
    
    var async: js.UndefOr[Boolean] = js.native
  }
  object CCallOpts {
    
    @scala.inline
    def apply(): CCallOpts = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CCallOpts]
    }
    
    @scala.inline
    implicit class CCallOptsMutableBuilder[Self <: CCallOpts] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAsync(value: Boolean): Self = StObject.set(x, "async", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAsyncUndefined: Self = StObject.set(x, "async", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.emscripten.emscriptenStrings.float
    - typings.emscripten.emscriptenStrings.double
  */
  trait CFloatType extends StObject
  object CFloatType {
    
    @scala.inline
    def double: typings.emscripten.emscriptenStrings.double = "double".asInstanceOf[typings.emscripten.emscriptenStrings.double]
    
    @scala.inline
    def float: typings.emscripten.emscriptenStrings.float = "float".asInstanceOf[typings.emscripten.emscriptenStrings.float]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.emscripten.emscriptenStrings.i8
    - typings.emscripten.emscriptenStrings.i16
    - typings.emscripten.emscriptenStrings.i32
    - typings.emscripten.emscriptenStrings.i64
  */
  trait CIntType extends StObject
  object CIntType {
    
    @scala.inline
    def i16: typings.emscripten.emscriptenStrings.i16 = "i16".asInstanceOf[typings.emscripten.emscriptenStrings.i16]
    
    @scala.inline
    def i32: typings.emscripten.emscriptenStrings.i32 = "i32".asInstanceOf[typings.emscripten.emscriptenStrings.i32]
    
    @scala.inline
    def i64: typings.emscripten.emscriptenStrings.i64 = "i64".asInstanceOf[typings.emscripten.emscriptenStrings.i64]
    
    @scala.inline
    def i8: typings.emscripten.emscriptenStrings.i8 = "i8".asInstanceOf[typings.emscripten.emscriptenStrings.i8]
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
    
    @scala.inline
    def Asterisk: typings.emscripten.emscriptenStrings.Asterisk = "*".asInstanceOf[typings.emscripten.emscriptenStrings.Asterisk]
    
    @scala.inline
    def doubleAsterisk: typings.emscripten.emscriptenStrings.doubleAsterisk = "double*".asInstanceOf[typings.emscripten.emscriptenStrings.doubleAsterisk]
    
    @scala.inline
    def floatAsterisk: typings.emscripten.emscriptenStrings.floatAsterisk = "float*".asInstanceOf[typings.emscripten.emscriptenStrings.floatAsterisk]
    
    @scala.inline
    def i16Asterisk: typings.emscripten.emscriptenStrings.i16Asterisk = "i16*".asInstanceOf[typings.emscripten.emscriptenStrings.i16Asterisk]
    
    @scala.inline
    def i32Asterisk: typings.emscripten.emscriptenStrings.i32Asterisk = "i32*".asInstanceOf[typings.emscripten.emscriptenStrings.i32Asterisk]
    
    @scala.inline
    def i64Asterisk: typings.emscripten.emscriptenStrings.i64Asterisk = "i64*".asInstanceOf[typings.emscripten.emscriptenStrings.i64Asterisk]
    
    @scala.inline
    def i8Asterisk: typings.emscripten.emscriptenStrings.i8Asterisk = "i8*".asInstanceOf[typings.emscripten.emscriptenStrings.i8Asterisk]
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
    
    @scala.inline
    def Asterisk: typings.emscripten.emscriptenStrings.Asterisk = "*".asInstanceOf[typings.emscripten.emscriptenStrings.Asterisk]
    
    @scala.inline
    def double: typings.emscripten.emscriptenStrings.double = "double".asInstanceOf[typings.emscripten.emscriptenStrings.double]
    
    @scala.inline
    def doubleAsterisk: typings.emscripten.emscriptenStrings.doubleAsterisk = "double*".asInstanceOf[typings.emscripten.emscriptenStrings.doubleAsterisk]
    
    @scala.inline
    def float: typings.emscripten.emscriptenStrings.float = "float".asInstanceOf[typings.emscripten.emscriptenStrings.float]
    
    @scala.inline
    def floatAsterisk: typings.emscripten.emscriptenStrings.floatAsterisk = "float*".asInstanceOf[typings.emscripten.emscriptenStrings.floatAsterisk]
    
    @scala.inline
    def i16: typings.emscripten.emscriptenStrings.i16 = "i16".asInstanceOf[typings.emscripten.emscriptenStrings.i16]
    
    @scala.inline
    def i16Asterisk: typings.emscripten.emscriptenStrings.i16Asterisk = "i16*".asInstanceOf[typings.emscripten.emscriptenStrings.i16Asterisk]
    
    @scala.inline
    def i32: typings.emscripten.emscriptenStrings.i32 = "i32".asInstanceOf[typings.emscripten.emscriptenStrings.i32]
    
    @scala.inline
    def i32Asterisk: typings.emscripten.emscriptenStrings.i32Asterisk = "i32*".asInstanceOf[typings.emscripten.emscriptenStrings.i32Asterisk]
    
    @scala.inline
    def i64: typings.emscripten.emscriptenStrings.i64 = "i64".asInstanceOf[typings.emscripten.emscriptenStrings.i64]
    
    @scala.inline
    def i64Asterisk: typings.emscripten.emscriptenStrings.i64Asterisk = "i64*".asInstanceOf[typings.emscripten.emscriptenStrings.i64Asterisk]
    
    @scala.inline
    def i8: typings.emscripten.emscriptenStrings.i8 = "i8".asInstanceOf[typings.emscripten.emscriptenStrings.i8]
    
    @scala.inline
    def i8Asterisk: typings.emscripten.emscriptenStrings.i8Asterisk = "i8*".asInstanceOf[typings.emscripten.emscriptenStrings.i8Asterisk]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.emscripten.emscriptenStrings.WEB
    - typings.emscripten.emscriptenStrings.NODE
    - typings.emscripten.emscriptenStrings.SHELL
    - typings.emscripten.emscriptenStrings.WORKER
  */
  trait EnvironmentType extends StObject
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
  
  @js.native
  trait FileSystemType extends StObject
  
  /* Rewritten from type alias, can be one of: 
    - typings.emscripten.emscriptenStrings.number
    - typings.emscripten.emscriptenStrings.string
    - typings.emscripten.emscriptenStrings.array
    - typings.emscripten.emscriptenStrings.boolean
  */
  trait JSType extends StObject
  object JSType {
    
    @scala.inline
    def array: typings.emscripten.emscriptenStrings.array = "array".asInstanceOf[typings.emscripten.emscriptenStrings.array]
    
    @scala.inline
    def boolean: typings.emscripten.emscriptenStrings.boolean = "boolean".asInstanceOf[typings.emscripten.emscriptenStrings.boolean]
    
    @scala.inline
    def number: typings.emscripten.emscriptenStrings.number = "number".asInstanceOf[typings.emscripten.emscriptenStrings.number]
    
    @scala.inline
    def string: typings.emscripten.emscriptenStrings.string = "string".asInstanceOf[typings.emscripten.emscriptenStrings.string]
  }
  
  type TypeCompatibleWithC = Double | String | js.Array[js.Any] | Boolean
  
  type WebAssemblyExports = js.Array[Module]
  
  type WebAssemblyImports = js.Array[Kind]
}
