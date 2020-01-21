package typings.expoMixpanelAnalytics.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("expo-mixpanel-analytics", JSImport.Default)
@js.native
class default protected () extends ExpoMixpanelAnalytics {
  def this(token: String) = this()
  /* CompleteClass */
  override var token: String = js.native
  /* CompleteClass */
  override def identify(userId: String): Unit = js.native
  /* CompleteClass */
  override def people_append(props: Props[_]): Unit = js.native
  /* CompleteClass */
  override def people_delete_user(): Unit = js.native
  /* CompleteClass */
  override def people_increment(props: Props[Double]): Unit = js.native
  /* CompleteClass */
  override def people_set(props: Props[_]): Unit = js.native
  /* CompleteClass */
  override def people_set_once(props: Props[_]): Unit = js.native
  /* CompleteClass */
  override def people_union(props: Props[js.Array[String]]): Unit = js.native
  /* CompleteClass */
  override def people_unset(keys: js.Array[String]): Unit = js.native
  /* CompleteClass */
  override def reset(): Unit = js.native
  /* CompleteClass */
  override def track(name: String, props: Props[_]): Unit = js.native
}

