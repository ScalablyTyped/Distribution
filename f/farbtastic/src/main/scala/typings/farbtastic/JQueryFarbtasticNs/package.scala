package typings.farbtastic

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object JQueryFarbtasticNs {
  import typings.farbtastic.JQuery
  import typings.std.Element

  type Callback = CallbackFunction | Placeholder
  type CallbackFunction = js.Function1[/* color */ String, js.Any]
  type Placeholder = String | Element | JQuery
}
