package typings
package expoDashMixpanelDashAnalyticsLib.expoDashMixpanelDashAnalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("expo-mixpanel-analytics", JSImport.Default)
@js.native
class default protected () extends ExpoMixpanelAnalytics {
  def this(token: java.lang.String) = this()
  /* CompleteClass */
  override var token: java.lang.String = js.native
  /* CompleteClass */
  override def identify(userId: java.lang.String): scala.Unit = js.native
  /* CompleteClass */
  override def people_append(props: Props[_]): scala.Unit = js.native
  /* CompleteClass */
  override def people_delete_user(): scala.Unit = js.native
  /* CompleteClass */
  override def people_increment(props: Props[scala.Double]): scala.Unit = js.native
  /* CompleteClass */
  override def people_set(props: Props[_]): scala.Unit = js.native
  /* CompleteClass */
  override def people_set_once(props: Props[_]): scala.Unit = js.native
  /* CompleteClass */
  override def people_union(props: Props[js.Array[java.lang.String]]): scala.Unit = js.native
  /* CompleteClass */
  override def people_unset(keys: js.Array[java.lang.String]): scala.Unit = js.native
  /* CompleteClass */
  override def reset(): scala.Unit = js.native
  /* CompleteClass */
  override def track(name: java.lang.String, props: Props[_]): scala.Unit = js.native
}

