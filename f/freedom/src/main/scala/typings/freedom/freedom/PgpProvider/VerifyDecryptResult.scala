package typings.freedom.freedom.PgpProvider

import typings.std.ArrayBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VerifyDecryptResult extends js.Object {
  
  var data: ArrayBuffer = js.native
  
  var signedBy: js.Array[String] = js.native
}
object VerifyDecryptResult {
  
  @scala.inline
  def apply(data: ArrayBuffer, signedBy: js.Array[String]): VerifyDecryptResult = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], signedBy = signedBy.asInstanceOf[js.Any])
    __obj.asInstanceOf[VerifyDecryptResult]
  }
  
  @scala.inline
  implicit class VerifyDecryptResultOps[Self <: VerifyDecryptResult] (val x: Self) extends AnyVal {
    
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
    def setData(value: ArrayBuffer): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignedByVarargs(value: String*): Self = this.set("signedBy", js.Array(value :_*))
    
    @scala.inline
    def setSignedBy(value: js.Array[String]): Self = this.set("signedBy", value.asInstanceOf[js.Any])
  }
}
