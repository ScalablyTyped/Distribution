package typings.googleAppsScript.GoogleAppsScript.AdminDirectory.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Asp extends js.Object {
  
  var codeId: js.UndefOr[Double] = js.native
  
  var creationTime: js.UndefOr[String] = js.native
  
  var etag: js.UndefOr[String] = js.native
  
  var kind: js.UndefOr[String] = js.native
  
  var lastTimeUsed: js.UndefOr[String] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var userKey: js.UndefOr[String] = js.native
}
object Asp {
  
  @scala.inline
  def apply(): Asp = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Asp]
  }
  
  @scala.inline
  implicit class AspOps[Self <: Asp] (val x: Self) extends AnyVal {
    
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
    def setCodeId(value: Double): Self = this.set("codeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCodeId: Self = this.set("codeId", js.undefined)
    
    @scala.inline
    def setCreationTime(value: String): Self = this.set("creationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreationTime: Self = this.set("creationTime", js.undefined)
    
    @scala.inline
    def setEtag(value: String): Self = this.set("etag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEtag: Self = this.set("etag", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setLastTimeUsed(value: String): Self = this.set("lastTimeUsed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastTimeUsed: Self = this.set("lastTimeUsed", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setUserKey(value: String): Self = this.set("userKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserKey: Self = this.set("userKey", js.undefined)
  }
}
