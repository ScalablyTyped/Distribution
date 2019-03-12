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
    identify: java.lang.String => scala.Unit,
    people_append: Props[_] => scala.Unit,
    people_delete_user: () => scala.Unit,
    people_increment: Props[scala.Double] => scala.Unit,
    people_set: Props[_] => scala.Unit,
    people_set_once: Props[_] => scala.Unit,
    people_union: Props[js.Array[java.lang.String]] => scala.Unit,
    people_unset: js.Array[java.lang.String] => scala.Unit,
    reset: () => scala.Unit,
    token: java.lang.String,
    track: (java.lang.String, Props[_]) => scala.Unit
  ): ExpoMixpanelAnalytics = {
    val __obj = js.Dynamic.literal(identify = js.Any.fromFunction1(identify), people_append = js.Any.fromFunction1(people_append), people_delete_user = js.Any.fromFunction0(people_delete_user), people_increment = js.Any.fromFunction1(people_increment), people_set = js.Any.fromFunction1(people_set), people_set_once = js.Any.fromFunction1(people_set_once), people_union = js.Any.fromFunction1(people_union), people_unset = js.Any.fromFunction1(people_unset), reset = js.Any.fromFunction0(reset), token = token, track = js.Any.fromFunction2(track))
  
    __obj.asInstanceOf[ExpoMixpanelAnalytics]
  }
}

