package typings
package dragulaLib.dragulaMod.dragulaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait DragulaOptions extends js.Object {
  var accepts: js.UndefOr[
    js.Function4[
      /* el */ js.UndefOr[stdLib.Element], 
      /* target */ js.UndefOr[stdLib.Element], 
      /* source */ js.UndefOr[stdLib.Element], 
      /* sibling */ js.UndefOr[stdLib.Element], 
      scala.Boolean
    ]
  ] = js.undefined
  var containers: js.UndefOr[js.Array[stdLib.Element]] = js.undefined
  var copy: js.UndefOr[
    (js.Function2[/* el */ stdLib.Element, /* source */ stdLib.Element, scala.Boolean]) | scala.Boolean
  ] = js.undefined
  var delay: js.UndefOr[scala.Boolean | scala.Double] = js.undefined
  var direction: js.UndefOr[java.lang.String] = js.undefined
  var ignoreInputTextSelection: js.UndefOr[scala.Boolean] = js.undefined
  var invalid: js.UndefOr[
    js.Function2[
      /* el */ js.UndefOr[stdLib.Element], 
      /* target */ js.UndefOr[stdLib.Element], 
      scala.Boolean
    ]
  ] = js.undefined
  var isContainer: js.UndefOr[js.Function1[/* el */ js.UndefOr[stdLib.Element], scala.Boolean]] = js.undefined
  var mirrorContainer: js.UndefOr[stdLib.Element] = js.undefined
  var moves: js.UndefOr[
    js.Function4[
      /* el */ js.UndefOr[stdLib.Element], 
      /* container */ js.UndefOr[stdLib.Element], 
      /* handle */ js.UndefOr[stdLib.Element], 
      /* sibling */ js.UndefOr[stdLib.Element], 
      scala.Boolean
    ]
  ] = js.undefined
  var removeOnSpill: js.UndefOr[scala.Boolean] = js.undefined
  var revertOnSpill: js.UndefOr[scala.Boolean] = js.undefined
}

