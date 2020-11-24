package typings.eqJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object eq {
  
  type AvailableElementType = typings.std.HTMLElement | typings.std.HTMLCollectionOf[typings.std.Element] | js.Array[typings.std.HTMLElement] | typings.std.NodeList | typings.eqJs.JQuery
  
  type EqjsNodesTable = org.scalablytyped.runtime.NumberDictionary[typings.std.HTMLElement]
}
