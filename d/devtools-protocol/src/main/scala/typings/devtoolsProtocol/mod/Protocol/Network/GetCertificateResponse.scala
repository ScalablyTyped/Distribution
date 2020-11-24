package typings.devtoolsProtocol.mod.Protocol.Network

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetCertificateResponse extends js.Object {
  
  var tableNames: js.Array[String] = js.native
}
object GetCertificateResponse {
  
  @scala.inline
  def apply(tableNames: js.Array[String]): GetCertificateResponse = {
    val __obj = js.Dynamic.literal(tableNames = tableNames.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetCertificateResponse]
  }
  
  @scala.inline
  implicit class GetCertificateResponseOps[Self <: GetCertificateResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setTableNamesVarargs(value: String*): Self = this.set("tableNames", js.Array(value :_*))
    
    @scala.inline
    def setTableNames(value: js.Array[String]): Self = this.set("tableNames", value.asInstanceOf[js.Any])
  }
}
