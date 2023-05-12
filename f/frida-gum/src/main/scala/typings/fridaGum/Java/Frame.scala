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
    * Method flags. E.g. `Java.ACC_PUBLIC | Java.ACC_STATIC`.
    */
  var methodFlags: Double
  
  /**
    * Method name, e.g. `"loopOnce"`.
    */
  var methodName: String
  
  /**
    * Where the code is from, i.e. the filesystem path to the `.dex` on Android.
    */
  var origin: String
  
  /**
    * Signature, e.g. `"Landroid/os/Looper;,loopOnce,(Landroid/os/Looper;JI)Z"`.
    */
  var signature: String
}
object Frame {
  
  inline def apply(
    className: String,
    fileName: String,
    lineNumber: Double,
    methodFlags: Double,
    methodName: String,
    origin: String,
    signature: String
  ): Frame = {
    val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], fileName = fileName.asInstanceOf[js.Any], lineNumber = lineNumber.asInstanceOf[js.Any], methodFlags = methodFlags.asInstanceOf[js.Any], methodName = methodName.asInstanceOf[js.Any], origin = origin.asInstanceOf[js.Any], signature = signature.asInstanceOf[js.Any])
    __obj.asInstanceOf[Frame]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Frame] (val x: Self) extends AnyVal {
    
    inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setFileName(value: String): Self = StObject.set(x, "fileName", value.asInstanceOf[js.Any])
    
    inline def setLineNumber(value: Double): Self = StObject.set(x, "lineNumber", value.asInstanceOf[js.Any])
    
    inline def setMethodFlags(value: Double): Self = StObject.set(x, "methodFlags", value.asInstanceOf[js.Any])
    
    inline def setMethodName(value: String): Self = StObject.set(x, "methodName", value.asInstanceOf[js.Any])
    
    inline def setOrigin(value: String): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
    
    inline def setSignature(value: String): Self = StObject.set(x, "signature", value.asInstanceOf[js.Any])
  }
}
