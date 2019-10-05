package typings.firefoxDashWebextDashBrowser.browser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object extensionTypes {
  type Date = String | Double | js.Object
  /** A plain JSON value */
  /* Rewritten from type alias, can be one of: 
    - scala.Null
    - java.lang.String
    - scala.Double
    - scala.Boolean
    - typings.firefoxDashWebextDashBrowser.browser.extensionTypes._PlainJSONArray
    - typings.firefoxDashWebextDashBrowser.browser.extensionTypes._PlainJSONObject
  */
  type PlainJSONValue = _PlainJSONValue | Null | String | Double | Boolean
}
