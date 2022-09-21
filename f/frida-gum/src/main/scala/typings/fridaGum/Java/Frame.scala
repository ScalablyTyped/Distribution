package typings.fridaGum.Java

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Frame extends StObject {
  
  /**
    * Class name that method belongs to, e.g. `"android.os.Looper"`.
    */
  var className: String
  
  /**
    * Source file name, e.g. `"Looper.java"`.
    */
  var fileName: String
  
  /**
    * Source line number, e.g. `201`.
    */
  var lineNumber: Double
  
  /**
    * Method name, e.g. `"loopOnce"`.
    */
  var methodName: String
  
  /**
    * Signature, e.g. `"Landroid/os/Looper;,loopOnce,(Landroid/os/Looper;JI)Z"`.
    */
  var signature: String
}
object Frame {
  
  inline def apply(className: String, fileName: String, lineNumber: Double, methodName: String, signature: String): Frame = {
    val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], fileName = fileName.asInstanceOf[js.Any], lineNumber = lineNumber.asInstanceOf[js.Any], methodName = methodName.asInstanceOf[js.Any], signature = signature.asInstanceOf[js.Any])
    __obj.asInstanceOf[Frame]
  }
  
  extension [Self <: Frame](x: Self) {
    
    inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setFileName(value: String): Self = StObject.set(x, "fileName", value.asInstanceOf[js.Any])
    
    inline def setLineNumber(value: Double): Self = StObject.set(x, "lineNumber", value.asInstanceOf[js.Any])
    
    inline def setMethodName(value: String): Self = StObject.set(x, "methodName", value.asInstanceOf[js.Any])
    
    inline def setSignature(value: String): Self = StObject.set(x, "signature", value.asInstanceOf[js.Any])
  }
}
