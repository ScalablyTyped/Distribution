package typings.domDashHelpers

import org.scalablytyped.runtime.StringDictionary
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("dom-helpers/style", JSImport.Namespace)
@js.native
object styleMod extends js.Object {
  def apply(element: Element, property: String): String = js.native
  def apply(element: Element, property: String, value: js.Any): Unit = js.native
  def apply(element: Element, property: StringDictionary[js.Any], value: js.Any): Unit = js.native
}

