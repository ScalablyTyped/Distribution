package typings.googleAppsScript.GoogleAppsScript

import typings.googleAppsScript.GoogleAppsScript.Appsactivity.Collection.ActivitiesCollection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Appsactivity_ extends js.Object {
  var Activities: js.UndefOr[ActivitiesCollection] = js.undefined
}

object Appsactivity_ {
  @scala.inline
  def apply(Activities: ActivitiesCollection = null): Appsactivity_ = {
    val __obj = js.Dynamic.literal()
    if (Activities != null) __obj.updateDynamic("Activities")(Activities.asInstanceOf[js.Any])
    __obj.asInstanceOf[Appsactivity_]
  }
}

