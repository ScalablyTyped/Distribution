package typings.gapiClientToolresults.gapi.client.toolresults

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScreenshotCluster extends js.Object {
  /** A string that describes the activity of every screen in the cluster. */
  var activity: js.UndefOr[String] = js.native
  /** A unique identifier for the cluster. */
  var clusterId: js.UndefOr[String] = js.native
  /**
    * A singular screen that represents the cluster as a whole. This screen will act as the "cover" of the entire cluster. When users look at the clusters,
    * only the key screen from each cluster will be shown. Which screen is the key screen is determined by the ClusteringAlgorithm
    */
  var keyScreen: js.UndefOr[Screen] = js.native
  /** Full list of screens. */
  var screens: js.UndefOr[js.Array[Screen]] = js.native
}

object ScreenshotCluster {
  @scala.inline
  def apply(): ScreenshotCluster = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScreenshotCluster]
  }
  @scala.inline
  implicit class ScreenshotClusterOps[Self <: ScreenshotCluster] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setActivity(value: String): Self = this.set("activity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActivity: Self = this.set("activity", js.undefined)
    @scala.inline
    def setClusterId(value: String): Self = this.set("clusterId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClusterId: Self = this.set("clusterId", js.undefined)
    @scala.inline
    def setKeyScreen(value: Screen): Self = this.set("keyScreen", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeyScreen: Self = this.set("keyScreen", js.undefined)
    @scala.inline
    def setScreensVarargs(value: Screen*): Self = this.set("screens", js.Array(value :_*))
    @scala.inline
    def setScreens(value: js.Array[Screen]): Self = this.set("screens", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScreens: Self = this.set("screens", js.undefined)
  }
  
}

