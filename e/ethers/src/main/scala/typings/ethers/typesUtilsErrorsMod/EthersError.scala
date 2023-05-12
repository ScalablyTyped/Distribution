package typings.ethers.typesUtilsErrorsMod

import typings.std.Error
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EthersError[T /* <: ErrorCode */]
  extends StObject
     with Error {
  
  /**
    *  The string error code.
    */
  var code: ErrorCode
  
  /**
    *  Any related error.
    */
  var error: js.UndefOr[js.Error] = js.undefined
  
  /**
    *  Additional info regarding the error that may be useful.
    *
    *  This is generally helpful mostly for human-based debugging.
    */
  var info: js.UndefOr[Record[String, Any]] = js.undefined
}
object EthersError {
  
  inline def apply[T /* <: ErrorCode */](code: ErrorCode, message: String, name: String): EthersError[T] = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[EthersError[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EthersError[?], T /* <: ErrorCode */] (val x: Self & EthersError[T]) extends AnyVal {
    
    inline def setCode(value: ErrorCode): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setError(value: js.Error): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    inline def setInfo(value: Record[String, Any]): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
    
    inline def setInfoUndefined: Self = StObject.set(x, "info", js.undefined)
  }
}
