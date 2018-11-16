package typings
package gapiDotClientDotServicecontrolLib.gapiNs.clientNs.servicecontrolNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ExponentialBuckets extends js.Object {
  /**
               * The i'th exponential bucket covers the interval
               * [scale &#42; growth_factor^(i-1), scale &#42; growth_factor^i)
               * where i ranges from 1 to num_finite_buckets inclusive.
               * Must be larger than 1.0.
               */
  var growthFactor: js.UndefOr[scala.Double] = js.undefined
  /**
               * The number of finite buckets. With the underflow and overflow buckets,
               * the total number of buckets is `num_finite_buckets` + 2.
               * See comments on `bucket_options` for details.
               */
  var numFiniteBuckets: js.UndefOr[scala.Double] = js.undefined
  /**
               * The i'th exponential bucket covers the interval
               * [scale &#42; growth_factor^(i-1), scale &#42; growth_factor^i)
               * where i ranges from 1 to num_finite_buckets inclusive.
               * Must be > 0.
               */
  var scale: js.UndefOr[scala.Double] = js.undefined
}

