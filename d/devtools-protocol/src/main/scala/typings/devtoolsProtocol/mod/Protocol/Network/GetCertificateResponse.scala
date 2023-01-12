package typings.devtoolsProtocol.mod.Protocol.Network

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetCertificateResponse extends StObject {
  
  var tableNames: js.Array[String]
}
object GetCertificateResponse {
  
  inline def apply(tableNames: js.Array[String]): GetCertificateResponse = {
    val __obj = js.Dynamic.literal(tableNames = tableNames.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetCertificateResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetCertificateResponse] (val x: Self) extends AnyVal {
    
    inline def setTableNames(value: js.Array[String]): Self = StObject.set(x, "tableNames", value.asInstanceOf[js.Any])
    
    inline def setTableNamesVarargs(value: String*): Self = StObject.set(x, "tableNames", js.Array(value*))
  }
}
