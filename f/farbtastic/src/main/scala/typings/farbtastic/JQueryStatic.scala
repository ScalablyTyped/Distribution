package typings.farbtastic

import typings.farbtastic.JQueryFarbtastic.Callback
import typings.farbtastic.JQueryFarbtastic.Farbtastic
import typings.farbtastic.JQueryFarbtastic.Options
import typings.farbtastic.JQueryFarbtastic.Placeholder
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JQueryStatic extends js.Object {
  def farbtastic(placeholder: Placeholder): Farbtastic = js.native
  def farbtastic(placeholder: Placeholder, callback: Callback): Farbtastic = js.native
  def farbtastic(placeholder: Placeholder, options: Options): Farbtastic = js.native
}

