package typings
package gapiDotClientDotServicecontrolLib.gapiNs.clientNs.servicecontrolNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait LinearBuckets extends js.Object {
  /**
               * The number of finite buckets. With the underflow and overflow buckets,
               * the total number of buckets is `num_finite_buckets` + 2.
               * See comments on `bucket_options` for details.
               */
  var numFiniteBuckets: js.UndefOr[scala.Double] = js.undefined
  /**
               * The i'th linear bucket covers the interval
               * [offset + (i-1) &#42; width, offset + i &#42; width)
               * where i ranges from 1 to num_finite_buckets, inclusive.
               */
  var offset: js.UndefOr[scala.Double] = js.undefined
  /**
               * The i'th linear bucket covers the interval
               * [offset + (i-1) &#42; width, offset + i &#42; width)
               * where i ranges from 1 to num_finite_buckets, inclusive.
               * Must be strictly positive.
               */
  var width: js.UndefOr[scala.Double] = js.undefined
}

