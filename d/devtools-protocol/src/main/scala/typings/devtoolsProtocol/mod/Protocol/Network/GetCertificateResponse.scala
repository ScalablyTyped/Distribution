package typings.devtoolsProtocol.mod.Protocol.Network

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetCertificateResponse extends StObject {
  
  var tableNames: js.Array[String]
}
object GetCertificateResponse {
  
  @scala.inline
  def apply(tableNames: js.Array[String]): GetCertificateResponse = {
    val __obj = js.Dynamic.literal(tableNames = tableNames.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetCertificateResponse]
  }
  
  @scala.inline
  implicit class GetCertificateResponseMutableBuilder[Self <: GetCertificateResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTableNames(value: js.Array[String]): Self = StObject.set(x, "tableNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTableNamesVarargs(value: String*): Self = StObject.set(x, "tableNames", js.Array(value :_*))
  }
}
