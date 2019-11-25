package typings.atFirebaseAppDashTypes.atFirebaseAppDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FirebaseOptions extends js.Object {
  var apiKey: js.UndefOr[String] = js.undefined
  var appId: js.UndefOr[String] = js.undefined
  var authDomain: js.UndefOr[String] = js.undefined
  var databaseURL: js.UndefOr[String] = js.undefined
  var measurementId: js.UndefOr[String] = js.undefined
  var messagingSenderId: js.UndefOr[String] = js.undefined
  var projectId: js.UndefOr[String] = js.undefined
  var storageBucket: js.UndefOr[String] = js.undefined
}

object FirebaseOptions {
  @scala.inline
  def apply(
    apiKey: String = null,
    appId: String = null,
    authDomain: String = null,
    databaseURL: String = null,
    measurementId: String = null,
    messagingSenderId: String = null,
    projectId: String = null,
    storageBucket: String = null
  ): FirebaseOptions = {
    val __obj = js.Dynamic.literal()
    if (apiKey != null) __obj.updateDynamic("apiKey")(apiKey.asInstanceOf[js.Any])
    if (appId != null) __obj.updateDynamic("appId")(appId.asInstanceOf[js.Any])
    if (authDomain != null) __obj.updateDynamic("authDomain")(authDomain.asInstanceOf[js.Any])
    if (databaseURL != null) __obj.updateDynamic("databaseURL")(databaseURL.asInstanceOf[js.Any])
    if (measurementId != null) __obj.updateDynamic("measurementId")(measurementId.asInstanceOf[js.Any])
    if (messagingSenderId != null) __obj.updateDynamic("messagingSenderId")(messagingSenderId.asInstanceOf[js.Any])
    if (projectId != null) __obj.updateDynamic("projectId")(projectId.asInstanceOf[js.Any])
    if (storageBucket != null) __obj.updateDynamic("storageBucket")(storageBucket.asInstanceOf[js.Any])
    __obj.asInstanceOf[FirebaseOptions]
  }
}

