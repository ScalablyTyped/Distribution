package typings.firebaseAppTypes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FirebaseAppConfig extends js.Object {
  var automaticDataCollectionEnabled: js.UndefOr[Boolean] = js.native
  var name: js.UndefOr[String] = js.native
}

object FirebaseAppConfig {
  @scala.inline
  def apply(): FirebaseAppConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FirebaseAppConfig]
  }
  @scala.inline
  implicit class FirebaseAppConfigOps[Self <: FirebaseAppConfig] (val x: Self) extends AnyVal {
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
    def setAutomaticDataCollectionEnabled(value: Boolean): Self = this.set("automaticDataCollectionEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutomaticDataCollectionEnabled: Self = this.set("automaticDataCollectionEnabled", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
  }
  
}

