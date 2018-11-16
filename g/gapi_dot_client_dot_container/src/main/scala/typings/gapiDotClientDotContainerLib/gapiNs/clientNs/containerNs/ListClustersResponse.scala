package typings
package gapiDotClientDotContainerLib.gapiNs.clientNs.containerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ListClustersResponse extends js.Object {
  /**
               * A list of clusters in the project in the specified zone, or
               * across all ones.
               */
  var clusters: js.UndefOr[js.Array[Cluster]] = js.undefined
  /**
               * If any zones are listed here, the list of clusters returned
               * may be missing those zones.
               */
  var missingZones: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

