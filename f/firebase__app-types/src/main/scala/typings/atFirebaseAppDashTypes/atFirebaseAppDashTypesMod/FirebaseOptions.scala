package typings.atFirebaseAppDashTypes.atFirebaseAppDashTypesMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FirebaseOptions
  extends /* name */ StringDictionary[js.Any] {
  var apiKey: js.UndefOr[String] = js.undefined
  var appId: js.UndefOr[String] = js.undefined
  var authDomain: js.UndefOr[String] = js.undefined
  var databaseURL: js.UndefOr[String] = js.undefined
  var messagingSenderId: js.UndefOr[String] = js.undefined
  var projectId: js.UndefOr[String] = js.undefined
  var storageBucket: js.UndefOr[String] = js.undefined
}

object FirebaseOptions {
  @scala.inline
  def apply(
    StringDictionary: /* name */ StringDictionary[js.Any] = null,
    apiKey: String = null,
    appId: String = null,
    authDomain: String = null,
    databaseURL: String = null,
    messagingSenderId: String = null,
    projectId: String = null,
    storageBucket: String = null
  ): FirebaseOptions = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (apiKey != null) __obj.updateDynamic("apiKey")(apiKey)
    if (appId != null) __obj.updateDynamic("appId")(appId)
    if (authDomain != null) __obj.updateDynamic("authDomain")(authDomain)
    if (databaseURL != null) __obj.updateDynamic("databaseURL")(databaseURL)
    if (messagingSenderId != null) __obj.updateDynamic("messagingSenderId")(messagingSenderId)
    if (projectId != null) __obj.updateDynamic("projectId")(projectId)
    if (storageBucket != null) __obj.updateDynamic("storageBucket")(storageBucket)
    __obj.asInstanceOf[FirebaseOptions]
  }
}

