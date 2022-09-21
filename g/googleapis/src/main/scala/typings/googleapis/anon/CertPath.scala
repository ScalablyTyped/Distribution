package typings.googleapis.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CertPath extends StObject {
  
  var certPath: js.UndefOr[String] = js.undefined
  
  var pvkPassword: js.UndefOr[String] = js.undefined
  
  var pvkPath: js.UndefOr[String] = js.undefined
}
object CertPath {
  
  inline def apply(): CertPath = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CertPath]
  }
  
  extension [Self <: CertPath](x: Self) {
    
    inline def setCertPath(value: String): Self = StObject.set(x, "certPath", value.asInstanceOf[js.Any])
    
    inline def setCertPathUndefined: Self = StObject.set(x, "certPath", js.undefined)
    
    inline def setPvkPassword(value: String): Self = StObject.set(x, "pvkPassword", value.asInstanceOf[js.Any])
    
    inline def setPvkPasswordUndefined: Self = StObject.set(x, "pvkPassword", js.undefined)
    
    inline def setPvkPath(value: String): Self = StObject.set(x, "pvkPath", value.asInstanceOf[js.Any])
    
    inline def setPvkPathUndefined: Self = StObject.set(x, "pvkPath", js.undefined)
  }
}
