package typings.devtoolsProtocol.mod.Protocol.Browser

import typings.devtoolsProtocol.mod.Protocol.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Bucket extends js.Object {
  /**
    * Number of samples.
    */
  var count: integer = js.native
  /**
    * Maximum value (exclusive).
    */
  var high: integer = js.native
  /**
    * Minimum value (inclusive).
    */
  var low: integer = js.native
}

object Bucket {
  @scala.inline
  def apply(count: integer, high: integer, low: integer): Bucket = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], high = high.asInstanceOf[js.Any], low = low.asInstanceOf[js.Any])
    __obj.asInstanceOf[Bucket]
  }
  @scala.inline
  implicit class BucketOps[Self <: Bucket] (val x: Self) extends AnyVal {
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
    def setCount(value: integer): Self = this.set("count", value.asInstanceOf[js.Any])
    @scala.inline
    def setHigh(value: integer): Self = this.set("high", value.asInstanceOf[js.Any])
    @scala.inline
    def setLow(value: integer): Self = this.set("low", value.asInstanceOf[js.Any])
  }
  
}

