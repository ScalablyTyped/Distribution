package typings.ethersprojectAbstractSigner.mod

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypedDataSigner extends js.Object {
  
  def _signTypedData(domain: TypedDataDomain, types: Record[String, js.Array[TypedDataField]], value: Record[String, _]): js.Promise[String] = js.native
}
object TypedDataSigner {
  
  @scala.inline
  def apply(
    _signTypedData: (TypedDataDomain, Record[String, js.Array[TypedDataField]], Record[String, _]) => js.Promise[String]
  ): TypedDataSigner = {
    val __obj = js.Dynamic.literal(_signTypedData = js.Any.fromFunction3(_signTypedData))
    __obj.asInstanceOf[TypedDataSigner]
  }
  
  @scala.inline
  implicit class TypedDataSignerOps[Self <: TypedDataSigner] (val x: Self) extends AnyVal {
    
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
    def set_signTypedData(
      value: (TypedDataDomain, Record[String, js.Array[TypedDataField]], Record[String, _]) => js.Promise[String]
    ): Self = this.set("_signTypedData", js.Any.fromFunction3(value))
  }
}
