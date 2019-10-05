package typings.eqDotJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object eq {
  import org.scalablytyped.runtime.NumberDictionary
  import typings.eqDotJs.JQuery
  import typings.std.Element
  import typings.std.HTMLCollectionOf
  import typings.std.HTMLElement
  import typings.std.NodeList

  type AvailableElementType = HTMLElement | HTMLCollectionOf[Element] | js.Array[HTMLElement] | NodeList | JQuery
  type EqjsNodesTable = NumberDictionary[HTMLElement]
}
