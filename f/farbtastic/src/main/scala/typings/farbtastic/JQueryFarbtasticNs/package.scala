package typings.farbtastic

import typings.farbtastic.JQuery
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object JQueryFarbtasticNs {
  type Callback = CallbackFunction | Placeholder
  type CallbackFunction = js.Function1[/* color */ String, js.Any]
  type Placeholder = String | Element | JQuery
}
