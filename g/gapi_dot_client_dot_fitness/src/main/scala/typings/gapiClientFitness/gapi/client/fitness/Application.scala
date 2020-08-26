package typings.gapiClientFitness.gapi.client.fitness

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Application extends js.Object {
  /** An optional URI that can be used to link back to the application. */
  var detailsUrl: js.UndefOr[String] = js.native
  /**
    * The name of this application. This is required for REST clients, but we do not enforce uniqueness of this name. It is provided as a matter of
    * convenience for other developers who would like to identify which REST created an Application or Data Source.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Package name for this application. This is used as a unique identifier when created by Android applications, but cannot be specified by REST clients.
    * REST clients will have their developer project number reflected into the Data Source data stream IDs, instead of the packageName.
    */
  var packageName: js.UndefOr[String] = js.native
  /** Version of the application. You should update this field whenever the application changes in a way that affects the computation of the data. */
  var version: js.UndefOr[String] = js.native
}

object Application {
  @scala.inline
  def apply(): Application = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Application]
  }
  @scala.inline
  implicit class ApplicationOps[Self <: Application] (val x: Self) extends AnyVal {
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
    def setDetailsUrl(value: String): Self = this.set("detailsUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDetailsUrl: Self = this.set("detailsUrl", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setPackageName(value: String): Self = this.set("packageName", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePackageName: Self = this.set("packageName", js.undefined)
    @scala.inline
    def setVersion(value: String): Self = this.set("version", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVersion: Self = this.set("version", js.undefined)
  }
  
}

