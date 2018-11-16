package typings
package gapiDotClientDotServicecontrolLib.gapiNs.clientNs.servicecontrolNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ExplicitBuckets extends js.Object {
  /**
               * 'bound' is a list of strictly increasing boundaries between
               * buckets. Note that a list of length N-1 defines N buckets because
               * of fenceposting. See comments on `bucket_options` for details.
               *
               * The i'th finite bucket covers the interval
               * [bound[i-1], bound[i])
               * where i ranges from 1 to bound_size() - 1. Note that there are no
               * finite buckets at all if 'bound' only contains a single element; in
               * that special case the single bound defines the boundary between the
               * underflow and overflow buckets.
               *
               * bucket number                   lower bound    upper bound
               * i == 0 (underflow)              -inf           bound[i]
               * 0 < i < bound_size()            bound[i-1]     bound[i]
               * i == bound_size() (overflow)    bound[i-1]     +inf
               */
  var bounds: js.UndefOr[js.Array[scala.Double]] = js.undefined
}

