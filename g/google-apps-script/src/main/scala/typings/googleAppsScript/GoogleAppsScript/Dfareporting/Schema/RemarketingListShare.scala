package typings.googleAppsScript.GoogleAppsScript.Dfareporting.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RemarketingListShare extends js.Object {
  
  var kind: js.UndefOr[String] = js.native
  
  var remarketingListId: js.UndefOr[String] = js.native
  
  var sharedAccountIds: js.UndefOr[js.Array[String]] = js.native
  
  var sharedAdvertiserIds: js.UndefOr[js.Array[String]] = js.native
}
object RemarketingListShare {
  
  @scala.inline
  def apply(): RemarketingListShare = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RemarketingListShare]
  }
  
  @scala.inline
  implicit class RemarketingListShareOps[Self <: RemarketingListShare] (val x: Self) extends AnyVal {
    
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
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setRemarketingListId(value: String): Self = this.set("remarketingListId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRemarketingListId: Self = this.set("remarketingListId", js.undefined)
    
    @scala.inline
    def setSharedAccountIdsVarargs(value: String*): Self = this.set("sharedAccountIds", js.Array(value :_*))
    
    @scala.inline
    def setSharedAccountIds(value: js.Array[String]): Self = this.set("sharedAccountIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSharedAccountIds: Self = this.set("sharedAccountIds", js.undefined)
    
    @scala.inline
    def setSharedAdvertiserIdsVarargs(value: String*): Self = this.set("sharedAdvertiserIds", js.Array(value :_*))
    
    @scala.inline
    def setSharedAdvertiserIds(value: js.Array[String]): Self = this.set("sharedAdvertiserIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSharedAdvertiserIds: Self = this.set("sharedAdvertiserIds", js.undefined)
  }
}
