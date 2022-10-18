package typings.eggErrors

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libErrorTypeMod {
  
  @JSImport("egg-errors/lib/error_type", JSImport.Default)
  @js.native
  object default extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[ErrorType & String] = js.native
    
    /* "BUILTIN" */ val BUILTIN: typings.eggErrors.libErrorTypeMod.ErrorType.BUILTIN & String = js.native
    
    /* "ERROR" */ val ERROR: typings.eggErrors.libErrorTypeMod.ErrorType.ERROR & String = js.native
    
    /* "EXCEPTION" */ val EXCEPTION: typings.eggErrors.libErrorTypeMod.ErrorType.EXCEPTION & String = js.native
  }
  
  @js.native
  sealed trait ErrorType extends StObject
  @JSImport("egg-errors/lib/error_type", "ErrorType")
  @js.native
  object ErrorType extends StObject {
    
    @js.native
    sealed trait BUILTIN
      extends StObject
         with ErrorType
    
    @js.native
    sealed trait ERROR
      extends StObject
         with ErrorType
    
    @js.native
    sealed trait EXCEPTION
      extends StObject
         with ErrorType
  }
}
