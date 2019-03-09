package typings
package expoDashMixpanelDashAnalyticsLib.expoDashMixpanelDashAnalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExpoMixpanelAnalytics extends js.Object {
  var token: java.lang.String
  def identify(userId: java.lang.String): scala.Unit
  def people_append(props: Props[_]): scala.Unit
  def people_delete_user(): scala.Unit
  def people_increment(props: Props[scala.Double]): scala.Unit
  def people_set(props: Props[_]): scala.Unit
  def people_set_once(props: Props[_]): scala.Unit
  def people_union(props: Props[js.Array[java.lang.String]]): scala.Unit
  def people_unset(keys: js.Array[java.lang.String]): scala.Unit
  def reset(): scala.Unit
  def track(name: java.lang.String, props: Props[_]): scala.Unit
}

object ExpoMixpanelAnalytics {
  @scala.inline
  def apply(
    identify: js.Function1[java.lang.String, scala.Unit],
    people_append: js.Function1[Props[_], scala.Unit],
    people_delete_user: js.Function0[scala.Unit],
    people_increment: js.Function1[Props[scala.Double], scala.Unit],
    people_set: js.Function1[Props[_], scala.Unit],
    people_set_once: js.Function1[Props[_], scala.Unit],
    people_union: js.Function1[Props[js.Array[java.lang.String]], scala.Unit],
    people_unset: js.Function1[js.Array[java.lang.String], scala.Unit],
    reset: js.Function0[scala.Unit],
    token: java.lang.String,
    track: js.Function2[java.lang.String, Props[_], scala.Unit]
  ): ExpoMixpanelAnalytics = {
    val __obj = js.Dynamic.literal(identify = identify, people_append = people_append, people_delete_user = people_delete_user, people_increment = people_increment, people_set = people_set, people_set_once = people_set_once, people_union = people_union, people_unset = people_unset, reset = reset, token = token, track = track)
  
    __obj.asInstanceOf[ExpoMixpanelAnalytics]
  }
}

