package typings
package atFirebaseAppDashTypesLib.atFirebaseAppDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FirebaseOptions
  extends /* name */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var apiKey: js.UndefOr[java.lang.String] = js.undefined
  var authDomain: js.UndefOr[java.lang.String] = js.undefined
  var databaseURL: js.UndefOr[java.lang.String] = js.undefined
  var messagingSenderId: js.UndefOr[java.lang.String] = js.undefined
  var projectId: js.UndefOr[java.lang.String] = js.undefined
  var storageBucket: js.UndefOr[java.lang.String] = js.undefined
}

object FirebaseOptions {
  @scala.inline
  def apply(
    StringDictionary: /* name */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    apiKey: java.lang.String = null,
    authDomain: java.lang.String = null,
    databaseURL: java.lang.String = null,
    messagingSenderId: java.lang.String = null,
    projectId: java.lang.String = null,
    storageBucket: java.lang.String = null
  ): FirebaseOptions = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (apiKey != null) __obj.updateDynamic("apiKey")(apiKey)
    if (authDomain != null) __obj.updateDynamic("authDomain")(authDomain)
    if (databaseURL != null) __obj.updateDynamic("databaseURL")(databaseURL)
    if (messagingSenderId != null) __obj.updateDynamic("messagingSenderId")(messagingSenderId)
    if (projectId != null) __obj.updateDynamic("projectId")(projectId)
    if (storageBucket != null) __obj.updateDynamic("storageBucket")(storageBucket)
    __obj.asInstanceOf[FirebaseOptions]
  }
}

