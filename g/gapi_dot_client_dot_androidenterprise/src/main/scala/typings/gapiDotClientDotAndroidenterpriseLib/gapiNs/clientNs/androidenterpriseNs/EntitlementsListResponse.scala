package typings
package gapiDotClientDotAndroidenterpriseLib.gapiNs.clientNs.androidenterpriseNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait EntitlementsListResponse extends js.Object {
  /**
               * An entitlement of a user to a product (e.g. an app). For example, a free app that they have installed, or a paid app that they have been allocated a
               * license to.
               */
  var entitlement: js.UndefOr[js.Array[Entitlement]] = js.undefined
  /** Identifies what kind of resource this is. Value: the fixed string "androidenterprise#entitlementsListResponse". */
  var kind: js.UndefOr[java.lang.String] = js.undefined
}

