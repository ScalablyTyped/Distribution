package typings.googleAppsScript.GoogleAppsScript.Dfareporting.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Browser extends js.Object {
  
  var browserVersionId: js.UndefOr[String] = js.native
  
  var dartId: js.UndefOr[String] = js.native
  
  var kind: js.UndefOr[String] = js.native
  
  var majorVersion: js.UndefOr[String] = js.native
  
  var minorVersion: js.UndefOr[String] = js.native
  
  var name: js.UndefOr[String] = js.native
}
object Browser {
  
  @scala.inline
  def apply(): Browser = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Browser]
  }
  
  @scala.inline
  implicit class BrowserOps[Self <: Browser] (val x: Self) extends AnyVal {
    
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
    def setBrowserVersionId(value: String): Self = this.set("browserVersionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBrowserVersionId: Self = this.set("browserVersionId", js.undefined)
    
    @scala.inline
    def setDartId(value: String): Self = this.set("dartId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDartId: Self = this.set("dartId", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setMajorVersion(value: String): Self = this.set("majorVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMajorVersion: Self = this.set("majorVersion", js.undefined)
    
    @scala.inline
    def setMinorVersion(value: String): Self = this.set("minorVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinorVersion: Self = this.set("minorVersion", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
  }
}
