package typings.googleAppsScript.GoogleAppsScript.YoutubePartner.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReferenceConflict extends js.Object {
  
  var conflictingReferenceId: js.UndefOr[String] = js.native
  
  var expiryTime: js.UndefOr[String] = js.native
  
  var id: js.UndefOr[String] = js.native
  
  var kind: js.UndefOr[String] = js.native
  
  var matches: js.UndefOr[js.Array[ReferenceConflictMatch]] = js.native
  
  var originalReferenceId: js.UndefOr[String] = js.native
  
  var status: js.UndefOr[String] = js.native
}
object ReferenceConflict {
  
  @scala.inline
  def apply(): ReferenceConflict = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReferenceConflict]
  }
  
  @scala.inline
  implicit class ReferenceConflictOps[Self <: ReferenceConflict] (val x: Self) extends AnyVal {
    
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
    def setConflictingReferenceId(value: String): Self = this.set("conflictingReferenceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConflictingReferenceId: Self = this.set("conflictingReferenceId", js.undefined)
    
    @scala.inline
    def setExpiryTime(value: String): Self = this.set("expiryTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpiryTime: Self = this.set("expiryTime", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setMatchesVarargs(value: ReferenceConflictMatch*): Self = this.set("matches", js.Array(value :_*))
    
    @scala.inline
    def setMatches(value: js.Array[ReferenceConflictMatch]): Self = this.set("matches", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMatches: Self = this.set("matches", js.undefined)
    
    @scala.inline
    def setOriginalReferenceId(value: String): Self = this.set("originalReferenceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOriginalReferenceId: Self = this.set("originalReferenceId", js.undefined)
    
    @scala.inline
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
  }
}
