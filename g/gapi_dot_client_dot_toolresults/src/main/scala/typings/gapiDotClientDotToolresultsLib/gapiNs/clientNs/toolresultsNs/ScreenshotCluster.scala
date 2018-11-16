package typings
package gapiDotClientDotToolresultsLib.gapiNs.clientNs.toolresultsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ScreenshotCluster extends js.Object {
  /** A string that describes the activity of every screen in the cluster. */
  var activity: js.UndefOr[java.lang.String] = js.undefined
  /** A unique identifier for the cluster. */
  var clusterId: js.UndefOr[java.lang.String] = js.undefined
  /**
               * A singular screen that represents the cluster as a whole. This screen will act as the "cover" of the entire cluster. When users look at the clusters,
               * only the key screen from each cluster will be shown. Which screen is the key screen is determined by the ClusteringAlgorithm
               */
  var keyScreen: js.UndefOr[Screen] = js.undefined
  /** Full list of screens. */
  var screens: js.UndefOr[js.Array[Screen]] = js.undefined
}

