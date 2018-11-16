package typings
package expiredDashStorageLib.expiredDashStorageMod.ExpiredStorageNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait PeekInterface extends js.Object {
  /**
       * Has the [key] expired or not
       */
  var isExpired: scala.Boolean
  /**
       * Time remaining until expiration
       */
  var timeLeft: scala.Double | scala.Null
  /**
       * The value of a [key]
       */
  var value: java.lang.String | scala.Null
}

