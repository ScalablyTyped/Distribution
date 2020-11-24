package typings.docusignEsign.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ServiceVersion extends js.Object {
  
  /**
    * The version of the rest API.
    */
  var version: js.UndefOr[String] = js.native
  
  var versionUrl: js.UndefOr[String] = js.native
}
object ServiceVersion {
  
  @scala.inline
  def apply(): ServiceVersion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServiceVersion]
  }
  
  @scala.inline
  implicit class ServiceVersionOps[Self <: ServiceVersion] (val x: Self) extends AnyVal {
    
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
    def setVersion(value: String): Self = this.set("version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVersion: Self = this.set("version", js.undefined)
    
    @scala.inline
    def setVersionUrl(value: String): Self = this.set("versionUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVersionUrl: Self = this.set("versionUrl", js.undefined)
  }
}
