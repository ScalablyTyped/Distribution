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
    if (apiKey != null) __obj.updateDynamic("apiKey")(apiKey)
    if (appId != null) __obj.updateDynamic("appId")(appId)
    if (authDomain != null) __obj.updateDynamic("authDomain")(authDomain)
    if (databaseURL != null) __obj.updateDynamic("databaseURL")(databaseURL)
    if (measurementId != null) __obj.updateDynamic("measurementId")(measurementId)
    if (messagingSenderId != null) __obj.updateDynamic("messagingSenderId")(messagingSenderId)
    if (projectId != null) __obj.updateDynamic("projectId")(projectId)
    if (storageBucket != null) __obj.updateDynamic("storageBucket")(storageBucket)
    __obj.asInstanceOf[FirebaseOptions]
  }
}

