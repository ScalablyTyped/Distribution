package typings.googleapis.buildSrcApisToolresultsV1beta3Mod.toolresults_v1beta3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$ScreenshotCluster extends js.Object {
  /**
    * A string that describes the activity of every screen in the cluster.
    */
  var activity: js.UndefOr[String] = js.native
  /**
    * A unique identifier for the cluster.
    */
  var clusterId: js.UndefOr[String] = js.native
  /**
    * A singular screen that represents the cluster as a whole. This screen
    * will act as the &quot;cover&quot; of the entire cluster. When users look
    * at the clusters, only the key screen from each cluster will be shown.
    * Which screen is the key screen is determined by the ClusteringAlgorithm
    */
  var keyScreen: js.UndefOr[Schema$Screen] = js.native
  /**
    * Full list of screens.
    */
  var screens: js.UndefOr[js.Array[Schema$Screen]] = js.native
}

object Schema$ScreenshotCluster {
  @scala.inline
  def apply(
    activity: String = null,
    clusterId: String = null,
    keyScreen: Schema$Screen = null,
    screens: js.Array[Schema$Screen] = null
  ): Schema$ScreenshotCluster = {
    val __obj = js.Dynamic.literal()
    if (activity != null) __obj.updateDynamic("activity")(activity.asInstanceOf[js.Any])
    if (clusterId != null) __obj.updateDynamic("clusterId")(clusterId.asInstanceOf[js.Any])
    if (keyScreen != null) __obj.updateDynamic("keyScreen")(keyScreen.asInstanceOf[js.Any])
    if (screens != null) __obj.updateDynamic("screens")(screens.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ScreenshotCluster]
  }
}

