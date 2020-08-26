package typings.googleCloudKms.mod.v1.KeyManagementServiceClient

import typings.googleCloudKms.anon.Clientemail
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConfigurationObject extends js.Object {
  var credentials: js.UndefOr[Clientemail] = js.native
  var email: js.UndefOr[String] = js.native
  var keyFilename: js.UndefOr[String] = js.native
  var port: js.UndefOr[Double] = js.native
  var projectId: js.UndefOr[String] = js.native
  var promise: js.UndefOr[js.Any] = js.native
  var servicePath: js.UndefOr[String] = js.native
}

object ConfigurationObject {
  @scala.inline
  def apply(): ConfigurationObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConfigurationObject]
  }
  @scala.inline
  implicit class ConfigurationObjectOps[Self <: ConfigurationObject] (val x: Self) extends AnyVal {
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
    def setCredentials(value: Clientemail): Self = this.set("credentials", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCredentials: Self = this.set("credentials", js.undefined)
    @scala.inline
    def setEmail(value: String): Self = this.set("email", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEmail: Self = this.set("email", js.undefined)
    @scala.inline
    def setKeyFilename(value: String): Self = this.set("keyFilename", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeyFilename: Self = this.set("keyFilename", js.undefined)
    @scala.inline
    def setPort(value: Double): Self = this.set("port", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePort: Self = this.set("port", js.undefined)
    @scala.inline
    def setProjectId(value: String): Self = this.set("projectId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProjectId: Self = this.set("projectId", js.undefined)
    @scala.inline
    def setPromise(value: js.Any): Self = this.set("promise", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePromise: Self = this.set("promise", js.undefined)
    @scala.inline
    def setServicePath(value: String): Self = this.set("servicePath", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteServicePath: Self = this.set("servicePath", js.undefined)
  }
  
}

