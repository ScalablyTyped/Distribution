package typings
package fastDashStatsLib.fastDashStatsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Bucket extends js.Object {
  /**
       * Bucket midpoint
       */
  var bucket: scala.Double
  /**
       * Number of datapoints
       */
  var count: scala.Double
  /**
       * [<bucket low>, <bucket high>],
       */
  var range: js.Array[scala.Double]
}

