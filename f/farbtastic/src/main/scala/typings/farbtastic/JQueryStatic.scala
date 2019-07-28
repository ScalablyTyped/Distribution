package typings.farbtastic

import typings.farbtastic.JQueryFarbtasticNs.Callback
import typings.farbtastic.JQueryFarbtasticNs.Farbtastic
import typings.farbtastic.JQueryFarbtasticNs.Options
import typings.farbtastic.JQueryFarbtasticNs.Placeholder
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JQueryStatic extends js.Object {
  def farbtastic(placeholder: Placeholder): Farbtastic = js.native
  def farbtastic(placeholder: Placeholder, callback: Callback): Farbtastic = js.native
  def farbtastic(placeholder: Placeholder, options: Options): Farbtastic = js.native
}

