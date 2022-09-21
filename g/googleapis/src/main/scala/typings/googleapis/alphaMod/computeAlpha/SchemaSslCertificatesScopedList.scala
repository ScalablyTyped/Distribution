package typings.googleapis.alphaMod.computeAlpha

import typings.googleapis.anon.Code
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSslCertificatesScopedList extends StObject {
  
  /**
    * List of SslCertificates contained in this scope.
    */
  var sslCertificates: js.UndefOr[js.Array[SchemaSslCertificate]] = js.undefined
  
  /**
    * Informational warning which replaces the list of backend services when the list is empty.
    */
  var warning: js.UndefOr[Code | Null] = js.undefined
}
object SchemaSslCertificatesScopedList {
  
  inline def apply(): SchemaSslCertificatesScopedList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSslCertificatesScopedList]
  }
  
  extension [Self <: SchemaSslCertificatesScopedList](x: Self) {
    
    inline def setSslCertificates(value: js.Array[SchemaSslCertificate]): Self = StObject.set(x, "sslCertificates", value.asInstanceOf[js.Any])
    
    inline def setSslCertificatesUndefined: Self = StObject.set(x, "sslCertificates", js.undefined)
    
    inline def setSslCertificatesVarargs(value: SchemaSslCertificate*): Self = StObject.set(x, "sslCertificates", js.Array(value*))
    
    inline def setWarning(value: Code): Self = StObject.set(x, "warning", value.asInstanceOf[js.Any])
    
    inline def setWarningNull: Self = StObject.set(x, "warning", null)
    
    inline def setWarningUndefined: Self = StObject.set(x, "warning", js.undefined)
  }
}
