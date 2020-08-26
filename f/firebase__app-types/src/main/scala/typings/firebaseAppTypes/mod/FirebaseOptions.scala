package typings.firebaseAppTypes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FirebaseOptions extends js.Object {
  var apiKey: js.UndefOr[String] = js.native
  var appId: js.UndefOr[String] = js.native
  var authDomain: js.UndefOr[String] = js.native
  var databaseURL: js.UndefOr[String] = js.native
  var measurementId: js.UndefOr[String] = js.native
  var messagingSenderId: js.UndefOr[String] = js.native
  var projectId: js.UndefOr[String] = js.native
  var storageBucket: js.UndefOr[String] = js.native
}

object FirebaseOptions {
  @scala.inline
  def apply(): FirebaseOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FirebaseOptions]
  }
  @scala.inline
  implicit class FirebaseOptionsOps[Self <: FirebaseOptions] (val x: Self) extends AnyVal {
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
    def setApiKey(value: String): Self = this.set("apiKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteApiKey: Self = this.set("apiKey", js.undefined)
    @scala.inline
    def setAppId(value: String): Self = this.set("appId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAppId: Self = this.set("appId", js.undefined)
    @scala.inline
    def setAuthDomain(value: String): Self = this.set("authDomain", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuthDomain: Self = this.set("authDomain", js.undefined)
    @scala.inline
    def setDatabaseURL(value: String): Self = this.set("databaseURL", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDatabaseURL: Self = this.set("databaseURL", js.undefined)
    @scala.inline
    def setMeasurementId(value: String): Self = this.set("measurementId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMeasurementId: Self = this.set("measurementId", js.undefined)
    @scala.inline
    def setMessagingSenderId(value: String): Self = this.set("messagingSenderId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMessagingSenderId: Self = this.set("messagingSenderId", js.undefined)
    @scala.inline
    def setProjectId(value: String): Self = this.set("projectId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProjectId: Self = this.set("projectId", js.undefined)
    @scala.inline
    def setStorageBucket(value: String): Self = this.set("storageBucket", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStorageBucket: Self = this.set("storageBucket", js.undefined)
  }
  
}

