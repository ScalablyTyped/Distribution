package typings.firefoxWebextBrowser.browser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object extensionTypes {
  type Date = java.lang.String | scala.Double | js.Object
  /** A plain JSON value */
  /* Rewritten from type alias, can be one of: 
    - scala.Null
    - java.lang.String
    - scala.Double
    - scala.Boolean
    - typings.firefoxWebextBrowser.browser.extensionTypes.PlainJSONArray
    - typings.firefoxWebextBrowser.browser.extensionTypes.PlainJSONObject
  */
  type PlainJSONValue = typings.firefoxWebextBrowser.browser.extensionTypes._PlainJSONValue | scala.Null | java.lang.String | scala.Double | scala.Boolean
}
