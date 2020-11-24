package typings.docusignEsign.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConnectFailureFilter extends js.Object {
  
  var envelopeIds: js.UndefOr[js.Array[String]] = js.native
  
  var synchronous: js.UndefOr[String] = js.native
}
object ConnectFailureFilter {
  
  @scala.inline
  def apply(): ConnectFailureFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConnectFailureFilter]
  }
  
  @scala.inline
  implicit class ConnectFailureFilterOps[Self <: ConnectFailureFilter] (val x: Self) extends AnyVal {
    
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
    def setEnvelopeIdsVarargs(value: String*): Self = this.set("envelopeIds", js.Array(value :_*))
    
    @scala.inline
    def setEnvelopeIds(value: js.Array[String]): Self = this.set("envelopeIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnvelopeIds: Self = this.set("envelopeIds", js.undefined)
    
    @scala.inline
    def setSynchronous(value: String): Self = this.set("synchronous", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSynchronous: Self = this.set("synchronous", js.undefined)
  }
}
