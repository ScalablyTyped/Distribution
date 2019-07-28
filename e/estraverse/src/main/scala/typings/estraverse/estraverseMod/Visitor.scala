package typings.estraverse.estraverseMod

import org.scalablytyped.runtime.StringDictionary
import typings.estraverse.estraverseStrings.iteration
import typings.estree.estreeMod.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Visitor extends js.Object {
  var enter: js.UndefOr[
    js.Function2[/* node */ Node, /* parentNode */ Node | Null, VisitorOption | Node | Unit]
  ] = js.undefined
  var fallback: js.UndefOr[iteration | (js.Function1[/* node */ Node, js.Array[String]])] = js.undefined
  var keys: js.UndefOr[StringDictionary[js.Array[String]]] = js.undefined
  var leave: js.UndefOr[
    js.Function2[/* node */ Node, /* parentNode */ Node | Null, VisitorOption | Node | Unit]
  ] = js.undefined
}

object Visitor {
  @scala.inline
  def apply(
    enter: (/* node */ Node, /* parentNode */ Node | Null) => VisitorOption | Node | Unit = null,
    fallback: iteration | (js.Function1[/* node */ Node, js.Array[String]]) = null,
    keys: StringDictionary[js.Array[String]] = null,
    leave: (/* node */ Node, /* parentNode */ Node | Null) => VisitorOption | Node | Unit = null
  ): Visitor = {
    val __obj = js.Dynamic.literal()
    if (enter != null) __obj.updateDynamic("enter")(js.Any.fromFunction2(enter))
    if (fallback != null) __obj.updateDynamic("fallback")(fallback.asInstanceOf[js.Any])
    if (keys != null) __obj.updateDynamic("keys")(keys)
    if (leave != null) __obj.updateDynamic("leave")(js.Any.fromFunction2(leave))
    __obj.asInstanceOf[Visitor]
  }
}

