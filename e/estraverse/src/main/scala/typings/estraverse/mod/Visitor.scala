package typings.estraverse.mod

import typings.estraverse.estraverseStrings.iteration
import typings.estree.mod.Node
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Visitor extends js.Object {
  var enter: js.UndefOr[
    js.ThisFunction2[
      /* this */ Controller, 
      /* node */ Node, 
      /* parent */ Node | Null, 
      VisitorOption | Node | Unit
    ]
  ] = js.undefined
  var fallback: js.UndefOr[
    iteration | (js.ThisFunction1[/* this */ Controller, /* node */ Node, js.Array[String]])
  ] = js.undefined
  var keys: js.UndefOr[Record[String, js.Array[String]]] = js.undefined
  var leave: js.UndefOr[
    js.ThisFunction2[
      /* this */ Controller, 
      /* node */ Node, 
      /* parent */ Node | Null, 
      VisitorOption | Node | Unit
    ]
  ] = js.undefined
}

object Visitor {
  @scala.inline
  def apply(
    enter: js.ThisFunction2[
      /* this */ Controller, 
      /* node */ Node, 
      /* parent */ Node | Null, 
      VisitorOption | Node | Unit
    ] = null,
    fallback: iteration | (js.ThisFunction1[/* this */ Controller, /* node */ Node, js.Array[String]]) = null,
    keys: Record[String, js.Array[String]] = null,
    leave: js.ThisFunction2[
      /* this */ Controller, 
      /* node */ Node, 
      /* parent */ Node | Null, 
      VisitorOption | Node | Unit
    ] = null
  ): Visitor = {
    val __obj = js.Dynamic.literal()
    if (enter != null) __obj.updateDynamic("enter")(enter.asInstanceOf[js.Any])
    if (fallback != null) __obj.updateDynamic("fallback")(fallback.asInstanceOf[js.Any])
    if (keys != null) __obj.updateDynamic("keys")(keys.asInstanceOf[js.Any])
    if (leave != null) __obj.updateDynamic("leave")(leave.asInstanceOf[js.Any])
    __obj.asInstanceOf[Visitor]
  }
}

