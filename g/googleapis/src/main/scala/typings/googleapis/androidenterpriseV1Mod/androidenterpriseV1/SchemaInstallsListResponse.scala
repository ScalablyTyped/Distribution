package typings.googleapis.androidenterpriseV1Mod.androidenterpriseV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The install resources for the device.
  */
@js.native
trait SchemaInstallsListResponse extends js.Object {
  
  /**
    * An installation of an app for a user on a specific device. The existence
    * of an install implies that the user must have an entitlement to the app.
    */
  var install: js.UndefOr[js.Array[SchemaInstall]] = js.native
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;androidenterprise#installsListResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.native
}
object SchemaInstallsListResponse {
  
  @scala.inline
  def apply(): SchemaInstallsListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInstallsListResponse]
  }
  
  @scala.inline
  implicit class SchemaInstallsListResponseOps[Self <: SchemaInstallsListResponse] (val x: Self) extends AnyVal {
    
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
    def setInstallVarargs(value: SchemaInstall*): Self = this.set("install", js.Array(value :_*))
    
    @scala.inline
    def setInstall(value: js.Array[SchemaInstall]): Self = this.set("install", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInstall: Self = this.set("install", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
  }
}
