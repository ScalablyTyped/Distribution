package typings.docusignEsign.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UsageHistory extends js.Object {
  
  /**
    * The date and time the user last sent an envelope.
    */
  var lastSentDateTime: js.UndefOr[String] = js.native
  
  /**
    * The date and time the user last signed an envelope.
    */
  var lastSignedDateTime: js.UndefOr[String] = js.native
  
  /**
    * The number of envelopes the user has sent.
    */
  var sentCount: js.UndefOr[String] = js.native
  
  /**
    * The number of envelopes the user has signed.
    */
  var signedCount: js.UndefOr[String] = js.native
}
object UsageHistory {
  
  @scala.inline
  def apply(): UsageHistory = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UsageHistory]
  }
  
  @scala.inline
  implicit class UsageHistoryOps[Self <: UsageHistory] (val x: Self) extends AnyVal {
    
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
    def setLastSentDateTime(value: String): Self = this.set("lastSentDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastSentDateTime: Self = this.set("lastSentDateTime", js.undefined)
    
    @scala.inline
    def setLastSignedDateTime(value: String): Self = this.set("lastSignedDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastSignedDateTime: Self = this.set("lastSignedDateTime", js.undefined)
    
    @scala.inline
    def setSentCount(value: String): Self = this.set("sentCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSentCount: Self = this.set("sentCount", js.undefined)
    
    @scala.inline
    def setSignedCount(value: String): Self = this.set("signedCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSignedCount: Self = this.set("signedCount", js.undefined)
  }
}
