package typings.firefoxDashWebextDashBrowser.browserNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object extensionTypesNs {
  type Date = String | Double | js.Object
  /** A plain JSON value */
  /* Rewritten from type alias, can be one of: 
    - scala.Null
    - java.lang.String
    - scala.Double
    - scala.Boolean
    - typings.firefoxDashWebextDashBrowser.browserNs.extensionTypesNs._PlainJSONArray
    - typings.firefoxDashWebextDashBrowser.browserNs.extensionTypesNs._PlainJSONObject
  */
  type PlainJSONValue = _PlainJSONValue | Null | String | Double | Boolean
}
