package typings
package farbtasticLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object JQueryFarbtasticNs {
  type Callback = CallbackFunction | Placeholder
  type CallbackFunction = js.Function1[/* color */ java.lang.String, js.Any]
  type Placeholder = java.lang.String | stdLib.Element | farbtasticLib.JQuery
}
