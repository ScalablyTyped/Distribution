package typings.atGoogleDashCloudPubsub.buildSrcHistogramMod

import typings.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@google-cloud/pubsub/build/src/histogram", "Histogram")
@js.native
class Histogram () extends js.Object {
  def this(options: HistogramOptions) = this()
  var data: Map[Double, Double] = js.native
  var length: Double = js.native
  var options: HistogramOptions = js.native
  /*!
    * Adds a value to the histogram.
    *
    * @private
    * @param {numnber} value - The value in milliseconds.
    */
  def add(value: Double): Unit = js.native
  /*!
    * Retrieves the nth percentile of recorded values.
    *
    * @private
    * @param {number} percent The requested percentage.
    * @return {number}
    */
  def percentile(percent: Double): Double = js.native
}

