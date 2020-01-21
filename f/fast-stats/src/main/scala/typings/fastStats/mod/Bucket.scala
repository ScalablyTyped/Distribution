package typings.fastStats.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Bucket extends js.Object {
  /**
    * Bucket midpoint
    */
  var bucket: Double
  /**
    * Number of datapoints
    */
  var count: Double
  /**
    * [<bucket low>, <bucket high>],
    */
  var range: js.Array[Double]
}

object Bucket {
  @scala.inline
  def apply(bucket: Double, count: Double, range: js.Array[Double]): Bucket = {
    val __obj = js.Dynamic.literal(bucket = bucket.asInstanceOf[js.Any], count = count.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Bucket]
  }
}

