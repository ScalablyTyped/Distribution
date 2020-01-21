package typings.firebaseAnalytics.mod.firebaseAppTypesAugmentingMod

import typings.firebaseAnalyticsTypes.mod.FirebaseAnalytics
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FirebaseApp extends js.Object {
  def analytics(): FirebaseAnalytics
}

object FirebaseApp {
  @scala.inline
  def apply(analytics: () => FirebaseAnalytics): FirebaseApp = {
    val __obj = js.Dynamic.literal(analytics = js.Any.fromFunction0(analytics))
  
    __obj.asInstanceOf[FirebaseApp]
  }
}

