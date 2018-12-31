package typings
package domDashHelpersLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_OffsetParentElement extends js.Object {
  var closest: js.Function3[
    /* element */ stdLib.Element, 
    /* selector */ java.lang.String, 
    /* context */ stdLib.Element, 
    stdLib.Element
  ]
  var contains: js.Function2[/* context */ stdLib.Node, /* node */ stdLib.Node, scala.Boolean]
  var default: Anon_OffsetParent
  var height: js.Function2[
    /* element */ stdLib.Element, 
    /* useClientHeight */ js.UndefOr[scala.Boolean], 
    scala.Double
  ]
  var matches: js.Function2[/* element */ stdLib.Element, /* selectors */ java.lang.String, scala.Boolean]
  var offset: js.Function1[
    /* element */ stdLib.Element, 
    domDashHelpersLib.queryOffsetMod.DomHelpersOffsetNs.DomHelpersRect
  ]
  var offsetParent: js.Function1[/* element */ stdLib.Element, stdLib.Element]
  var position: js.Function2[
    /* element */ stdLib.Element, 
    /* offsetParent */ js.UndefOr[stdLib.Node], 
    domDashHelpersLib.queryOffsetMod.DomHelpersOffsetNs.DomHelpersRect
  ]
  var querySelectorAll: js.Function2[
    /* element */ stdLib.Element, 
    /* selector */ java.lang.String, 
    js.Array[stdLib.Element]
  ]
  var scrollParent: js.Function1[/* element */ stdLib.Element, stdLib.Element]
  var scrollTop: Anon_Element
  var width: js.Function2[
    /* element */ stdLib.Element, 
    /* useClientWidth */ js.UndefOr[scala.Boolean], 
    scala.Double
  ]
}

