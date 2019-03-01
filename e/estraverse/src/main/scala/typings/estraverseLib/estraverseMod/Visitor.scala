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

object Visitor {
  @scala.inline
  def apply(
    enter: js.Function2[
      /* node */ estreeLib.estreeMod.Node, 
      /* parentNode */ estreeLib.estreeMod.Node | scala.Null, 
      VisitorOption | estreeLib.estreeMod.Node | scala.Unit
    ] = null,
    fallback: estraverseLib.estraverseLibStrings.iteration | (js.Function1[/* node */ estreeLib.estreeMod.Node, js.Array[java.lang.String]]) = null,
    keys: org.scalablytyped.runtime.StringDictionary[js.Array[java.lang.String]] = null,
    leave: js.Function2[
      /* node */ estreeLib.estreeMod.Node, 
      /* parentNode */ estreeLib.estreeMod.Node | scala.Null, 
      VisitorOption | estreeLib.estreeMod.Node | scala.Unit
    ] = null
  ): Visitor = {
    val __obj = js.Dynamic.literal()
    if (enter != null) __obj.updateDynamic("enter")(enter)
    if (fallback != null) __obj.updateDynamic("fallback")(fallback.asInstanceOf[js.Any])
    if (keys != null) __obj.updateDynamic("keys")(keys)
    if (leave != null) __obj.updateDynamic("leave")(leave)
    __obj.asInstanceOf[Visitor]
  }
}

