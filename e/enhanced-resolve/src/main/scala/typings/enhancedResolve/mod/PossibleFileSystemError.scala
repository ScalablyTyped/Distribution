package typings.enhancedResolve.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PossibleFileSystemError extends StObject {
  
  var code: js.UndefOr[String] = js.undefined
  
  var errno: js.UndefOr[Double] = js.undefined
  
  var path: js.UndefOr[String] = js.undefined
  
  var syscall: js.UndefOr[String] = js.undefined
}
object PossibleFileSystemError {
  
  inline def apply(): PossibleFileSystemError = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PossibleFileSystemError]
  }
  
  extension [Self <: PossibleFileSystemError](x: Self) {
    
    inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    inline def setErrno(value: Double): Self = StObject.set(x, "errno", value.asInstanceOf[js.Any])
    
    inline def setErrnoUndefined: Self = StObject.set(x, "errno", js.undefined)
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    inline def setSyscall(value: String): Self = StObject.set(x, "syscall", value.asInstanceOf[js.Any])
    
    inline def setSyscallUndefined: Self = StObject.set(x, "syscall", js.undefined)
  }
}
