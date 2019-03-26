package typings
package firefoxDashWebextDashBrowserLib.browserNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object extensionTypesNs {
  type Date = java.lang.String | scala.Double | js.Object
  /** A plain JSON value */
  /* Rewritten from type alias, can be one of: 
    - scala.Null
    - java.lang.String
    - scala.Double
    - scala.Boolean
    - _PlainJSONArray
    - _PlainJSONObject
  */
  type PlainJSONValue = _PlainJSONValue | scala.Null | java.lang.String | scala.Double | scala.Boolean
}
