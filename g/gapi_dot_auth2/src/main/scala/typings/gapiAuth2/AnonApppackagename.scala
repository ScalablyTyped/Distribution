package typings.gapiAuth2

import typings.gapiAuth2.gapi.auth2.GoogleUser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonApppackagename extends js.Object {
  /**
    * The package name of the Android app to install over the air. See
    * <a href="https://developers.google.com/identity/sign-in/web/android-app-installs">Android app installs from your web site</a>.
    * Optional. (default: none)
    */
  var app_package_name: js.UndefOr[String] = js.undefined
  /**
    * The height of the button in pixels (default: 36).
    */
  var height: js.UndefOr[Double] = js.undefined
  /**
    * Display long labels such as "Sign in with Google" rather than "Sign in" (default: false).
    */
  var longtitle: js.UndefOr[Boolean] = js.undefined
  /**
    * The callback function to call when sign-in fails (default: none).
    */
  var onfailure: js.UndefOr[js.Function1[/* reason */ AnonError, Unit]] = js.undefined
  /**
    * The callback function to call when a user successfully signs in (default: none).
    */
  var onsuccess: js.UndefOr[js.Function1[/* user */ GoogleUser, Unit]] = js.undefined
  /**
    * The auth scope or scopes to authorize. Auth scopes for individual APIs can be found in their documentation.
    */
  var scope: js.UndefOr[String] = js.undefined
  /**
    * The color theme of the button: either light or dark (default: light).
    */
  var theme: js.UndefOr[String] = js.undefined
  /**
    * The width of the button in pixels (default: 120).
    */
  var width: js.UndefOr[Double] = js.undefined
}

object AnonApppackagename {
  @scala.inline
  def apply(
    app_package_name: String = null,
    height: Int | Double = null,
    longtitle: js.UndefOr[Boolean] = js.undefined,
    onfailure: /* reason */ AnonError => Unit = null,
    onsuccess: /* user */ GoogleUser => Unit = null,
    scope: String = null,
    theme: String = null,
    width: Int | Double = null
  ): AnonApppackagename = {
    val __obj = js.Dynamic.literal()
    if (app_package_name != null) __obj.updateDynamic("app_package_name")(app_package_name.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (!js.isUndefined(longtitle)) __obj.updateDynamic("longtitle")(longtitle.asInstanceOf[js.Any])
    if (onfailure != null) __obj.updateDynamic("onfailure")(js.Any.fromFunction1(onfailure))
    if (onsuccess != null) __obj.updateDynamic("onsuccess")(js.Any.fromFunction1(onsuccess))
    if (scope != null) __obj.updateDynamic("scope")(scope.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonApppackagename]
  }
}

