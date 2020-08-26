package typings.gapiAuth2.anon

import typings.gapiAuth2.gapi.auth2.GoogleUser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Apppackagename extends js.Object {
  /**
    * The package name of the Android app to install over the air. See
    * <a href="https://developers.google.com/identity/sign-in/web/android-app-installs">Android app installs from your web site</a>.
    * Optional. (default: none)
    */
  var app_package_name: js.UndefOr[String] = js.native
  /**
    * The height of the button in pixels (default: 36).
    */
  var height: js.UndefOr[Double] = js.native
  /**
    * Display long labels such as "Sign in with Google" rather than "Sign in" (default: false).
    */
  var longtitle: js.UndefOr[Boolean] = js.native
  /**
    * The callback function to call when sign-in fails (default: none).
    */
  var onfailure: js.UndefOr[js.Function1[/* reason */ Error, Unit]] = js.native
  /**
    * The callback function to call when a user successfully signs in (default: none).
    */
  var onsuccess: js.UndefOr[js.Function1[/* user */ GoogleUser, Unit]] = js.native
  /**
    * The auth scope or scopes to authorize. Auth scopes for individual APIs can be found in their documentation.
    */
  var scope: js.UndefOr[String] = js.native
  /**
    * The color theme of the button: either light or dark (default: light).
    */
  var theme: js.UndefOr[String] = js.native
  /**
    * The width of the button in pixels (default: 120).
    */
  var width: js.UndefOr[Double] = js.native
}

object Apppackagename {
  @scala.inline
  def apply(): Apppackagename = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Apppackagename]
  }
  @scala.inline
  implicit class ApppackagenameOps[Self <: Apppackagename] (val x: Self) extends AnyVal {
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
    def setApp_package_name(value: String): Self = this.set("app_package_name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteApp_package_name: Self = this.set("app_package_name", js.undefined)
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    @scala.inline
    def setLongtitle(value: Boolean): Self = this.set("longtitle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLongtitle: Self = this.set("longtitle", js.undefined)
    @scala.inline
    def setOnfailure(value: /* reason */ Error => Unit): Self = this.set("onfailure", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnfailure: Self = this.set("onfailure", js.undefined)
    @scala.inline
    def setOnsuccess(value: /* user */ GoogleUser => Unit): Self = this.set("onsuccess", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnsuccess: Self = this.set("onsuccess", js.undefined)
    @scala.inline
    def setScope(value: String): Self = this.set("scope", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScope: Self = this.set("scope", js.undefined)
    @scala.inline
    def setTheme(value: String): Self = this.set("theme", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTheme: Self = this.set("theme", js.undefined)
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
  
}

