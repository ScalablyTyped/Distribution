package typings.documentdb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConsistentHashRingOptions extends js.Object {
  /** Function to compute the hash for a given link or partition key */
  var computeHash: js.UndefOr[js.Function2[/* key */ String | Double, /* seed */ Double, Double]] = js.native
  /** Number of points in the ring to assign to each collection link */
  var numberOfVirtualNodesPerCollection: js.UndefOr[Double] = js.native
}

object ConsistentHashRingOptions {
  @scala.inline
  def apply(): ConsistentHashRingOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConsistentHashRingOptions]
  }
  @scala.inline
  implicit class ConsistentHashRingOptionsOps[Self <: ConsistentHashRingOptions] (val x: Self) extends AnyVal {
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
    def setComputeHash(value: (/* key */ String | Double, /* seed */ Double) => Double): Self = this.set("computeHash", js.Any.fromFunction2(value))
    @scala.inline
    def deleteComputeHash: Self = this.set("computeHash", js.undefined)
    @scala.inline
    def setNumberOfVirtualNodesPerCollection(value: Double): Self = this.set("numberOfVirtualNodesPerCollection", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNumberOfVirtualNodesPerCollection: Self = this.set("numberOfVirtualNodesPerCollection", js.undefined)
  }
  
}

