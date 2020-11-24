package typings.googleAuthLibrary.anon

import typings.googleAuthLibrary.loginticketMod.TokenPayload
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Envelope extends js.Object {
  
  var envelope: js.UndefOr[String] = js.native
  
  var payload: js.UndefOr[TokenPayload] = js.native
}
object Envelope {
  
  @scala.inline
  def apply(): Envelope = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Envelope]
  }
  
  @scala.inline
  implicit class EnvelopeOps[Self <: Envelope] (val x: Self) extends AnyVal {
    
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
    def setEnvelope(value: String): Self = this.set("envelope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnvelope: Self = this.set("envelope", js.undefined)
    
    @scala.inline
    def setPayload(value: TokenPayload): Self = this.set("payload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePayload: Self = this.set("payload", js.undefined)
  }
}
