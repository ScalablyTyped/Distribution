package typings.googleAppsScript.GoogleAppsScript.YoutubePartner.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReferenceConflictMatch extends js.Object {
  
  var conflicting_reference_offset_ms: js.UndefOr[String] = js.native
  
  var length_ms: js.UndefOr[String] = js.native
  
  var original_reference_offset_ms: js.UndefOr[String] = js.native
  
  var `type`: js.UndefOr[String] = js.native
}
object ReferenceConflictMatch {
  
  @scala.inline
  def apply(): ReferenceConflictMatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReferenceConflictMatch]
  }
  
  @scala.inline
  implicit class ReferenceConflictMatchOps[Self <: ReferenceConflictMatch] (val x: Self) extends AnyVal {
    
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
    def setConflicting_reference_offset_ms(value: String): Self = this.set("conflicting_reference_offset_ms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConflicting_reference_offset_ms: Self = this.set("conflicting_reference_offset_ms", js.undefined)
    
    @scala.inline
    def setLength_ms(value: String): Self = this.set("length_ms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLength_ms: Self = this.set("length_ms", js.undefined)
    
    @scala.inline
    def setOriginal_reference_offset_ms(value: String): Self = this.set("original_reference_offset_ms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOriginal_reference_offset_ms: Self = this.set("original_reference_offset_ms", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
