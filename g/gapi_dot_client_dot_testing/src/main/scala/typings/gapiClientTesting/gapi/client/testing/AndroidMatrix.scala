package typings.gapiClientTesting.gapi.client.testing

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AndroidMatrix extends js.Object {
  /**
    * The ids of the set of Android device to be used.
    * Use the EnvironmentDiscoveryService to get supported options.
    * Required
    */
  var androidModelIds: js.UndefOr[js.Array[String]] = js.native
  /**
    * The ids of the set of Android OS version to be used.
    * Use the EnvironmentDiscoveryService to get supported options.
    * Required
    */
  var androidVersionIds: js.UndefOr[js.Array[String]] = js.native
  /**
    * The set of locales the test device will enable for testing.
    * Use the EnvironmentDiscoveryService to get supported options.
    * Required
    */
  var locales: js.UndefOr[js.Array[String]] = js.native
  /**
    * The set of orientations to test with.
    * Use the EnvironmentDiscoveryService to get supported options.
    * Required
    */
  var orientations: js.UndefOr[js.Array[String]] = js.native
}

object AndroidMatrix {
  @scala.inline
  def apply(): AndroidMatrix = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AndroidMatrix]
  }
  @scala.inline
  implicit class AndroidMatrixOps[Self <: AndroidMatrix] (val x: Self) extends AnyVal {
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
    def setAndroidModelIdsVarargs(value: String*): Self = this.set("androidModelIds", js.Array(value :_*))
    @scala.inline
    def setAndroidModelIds(value: js.Array[String]): Self = this.set("androidModelIds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAndroidModelIds: Self = this.set("androidModelIds", js.undefined)
    @scala.inline
    def setAndroidVersionIdsVarargs(value: String*): Self = this.set("androidVersionIds", js.Array(value :_*))
    @scala.inline
    def setAndroidVersionIds(value: js.Array[String]): Self = this.set("androidVersionIds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAndroidVersionIds: Self = this.set("androidVersionIds", js.undefined)
    @scala.inline
    def setLocalesVarargs(value: String*): Self = this.set("locales", js.Array(value :_*))
    @scala.inline
    def setLocales(value: js.Array[String]): Self = this.set("locales", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocales: Self = this.set("locales", js.undefined)
    @scala.inline
    def setOrientationsVarargs(value: String*): Self = this.set("orientations", js.Array(value :_*))
    @scala.inline
    def setOrientations(value: js.Array[String]): Self = this.set("orientations", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrientations: Self = this.set("orientations", js.undefined)
  }
  
}

