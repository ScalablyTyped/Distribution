package typings.expoMixpanelAnalytics.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExpoMixpanelAnalytics extends js.Object {
  var token: String
  def identify(userId: String): Unit
  def people_append(props: Props[_]): Unit
  def people_delete_user(): Unit
  def people_increment(props: Props[Double]): Unit
  def people_set(props: Props[_]): Unit
  def people_set_once(props: Props[_]): Unit
  def people_union(props: Props[js.Array[String]]): Unit
  def people_unset(keys: js.Array[String]): Unit
  def reset(): Unit
  def track(name: String, props: Props[_]): Unit
}

object ExpoMixpanelAnalytics {
  @scala.inline
  def apply(
    identify: String => Unit,
    people_append: Props[_] => Unit,
    people_delete_user: () => Unit,
    people_increment: Props[Double] => Unit,
    people_set: Props[_] => Unit,
    people_set_once: Props[_] => Unit,
    people_union: Props[js.Array[String]] => Unit,
    people_unset: js.Array[String] => Unit,
    reset: () => Unit,
    token: String,
    track: (String, Props[_]) => Unit
  ): ExpoMixpanelAnalytics = {
    val __obj = js.Dynamic.literal(identify = js.Any.fromFunction1(identify), people_append = js.Any.fromFunction1(people_append), people_delete_user = js.Any.fromFunction0(people_delete_user), people_increment = js.Any.fromFunction1(people_increment), people_set = js.Any.fromFunction1(people_set), people_set_once = js.Any.fromFunction1(people_set_once), people_union = js.Any.fromFunction1(people_union), people_unset = js.Any.fromFunction1(people_unset), reset = js.Any.fromFunction0(reset), token = token.asInstanceOf[js.Any], track = js.Any.fromFunction2(track))
    __obj.asInstanceOf[ExpoMixpanelAnalytics]
  }
}

