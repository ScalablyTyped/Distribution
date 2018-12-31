package typings
package estraverseLib.estraverseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Visitor extends js.Object {
  var enter: js.UndefOr[
    js.Function2[
      /* node */ estreeLib.estreeMod.Node, 
      /* parentNode */ estreeLib.estreeMod.Node | scala.Null, 
      VisitorOption | estreeLib.estreeMod.Node | scala.Unit
    ]
  ] = js.undefined
  var fallback: js.UndefOr[
    estraverseLib.estraverseLibStrings.iteration | (js.Function1[/* node */ estreeLib.estreeMod.Node, js.Array[java.lang.String]])
  ] = js.undefined
  var keys: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Array[java.lang.String]]] = js.undefined
  var leave: js.UndefOr[
    js.Function2[
      /* node */ estreeLib.estreeMod.Node, 
      /* parentNode */ estreeLib.estreeMod.Node | scala.Null, 
      VisitorOption | estreeLib.estreeMod.Node | scala.Unit
    ]
  ] = js.undefined
}

