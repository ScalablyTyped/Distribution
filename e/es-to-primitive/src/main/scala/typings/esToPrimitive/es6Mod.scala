package typings.esToPrimitive

import typings.std.NumberConstructor
import typings.std.StringConstructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("es-to-primitive/es6", JSImport.Namespace)
@js.native
object es6Mod extends js.Object {
  def apply(input: js.Any): js.UndefOr[String | Double | Boolean | js.Symbol | Null] = js.native
  def apply(input: js.Any, hint: NumberConstructor): js.UndefOr[String | Double | Boolean | js.Symbol | Null] = js.native
  def apply(input: js.Any, hint: StringConstructor): js.UndefOr[String | Double | Boolean | js.Symbol | Null] = js.native
}

