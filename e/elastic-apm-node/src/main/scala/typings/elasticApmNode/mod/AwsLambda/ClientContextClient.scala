package typings.elasticApmNode.mod.AwsLambda

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClientContextClient extends js.Object {
  
  var appPackageName: String = js.native
  
  var appTitle: String = js.native
  
  var appVersionCode: String = js.native
  
  var appVersionName: String = js.native
  
  var installationId: String = js.native
}
object ClientContextClient {
  
  @scala.inline
  def apply(
    appPackageName: String,
    appTitle: String,
    appVersionCode: String,
    appVersionName: String,
    installationId: String
  ): ClientContextClient = {
    val __obj = js.Dynamic.literal(appPackageName = appPackageName.asInstanceOf[js.Any], appTitle = appTitle.asInstanceOf[js.Any], appVersionCode = appVersionCode.asInstanceOf[js.Any], appVersionName = appVersionName.asInstanceOf[js.Any], installationId = installationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientContextClient]
  }
  
  @scala.inline
  implicit class ClientContextClientOps[Self <: ClientContextClient] (val x: Self) extends AnyVal {
    
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
    def setAppPackageName(value: String): Self = this.set("appPackageName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppTitle(value: String): Self = this.set("appTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppVersionCode(value: String): Self = this.set("appVersionCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppVersionName(value: String): Self = this.set("appVersionName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstallationId(value: String): Self = this.set("installationId", value.asInstanceOf[js.Any])
  }
}
