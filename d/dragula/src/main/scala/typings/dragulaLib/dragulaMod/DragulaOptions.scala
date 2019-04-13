package typings
package dragulaLib.dragulaMod

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

object DragulaOptions {
  @scala.inline
  def apply(
    accepts: (/* el */ js.UndefOr[stdLib.Element], /* target */ js.UndefOr[stdLib.Element], /* source */ js.UndefOr[stdLib.Element], /* sibling */ js.UndefOr[stdLib.Element]) => scala.Boolean = null,
    containers: js.Array[stdLib.Element] = null,
    copy: (js.Function2[/* el */ stdLib.Element, /* source */ stdLib.Element, scala.Boolean]) | scala.Boolean = null,
    delay: scala.Boolean | scala.Double = null,
    direction: java.lang.String = null,
    ignoreInputTextSelection: js.UndefOr[scala.Boolean] = js.undefined,
    invalid: (/* el */ js.UndefOr[stdLib.Element], /* target */ js.UndefOr[stdLib.Element]) => scala.Boolean = null,
    isContainer: /* el */ js.UndefOr[stdLib.Element] => scala.Boolean = null,
    mirrorContainer: stdLib.Element = null,
    moves: (/* el */ js.UndefOr[stdLib.Element], /* container */ js.UndefOr[stdLib.Element], /* handle */ js.UndefOr[stdLib.Element], /* sibling */ js.UndefOr[stdLib.Element]) => scala.Boolean = null,
    removeOnSpill: js.UndefOr[scala.Boolean] = js.undefined,
    revertOnSpill: js.UndefOr[scala.Boolean] = js.undefined
  ): DragulaOptions = {
    val __obj = js.Dynamic.literal()
    if (accepts != null) __obj.updateDynamic("accepts")(js.Any.fromFunction4(accepts))
    if (containers != null) __obj.updateDynamic("containers")(containers)
    if (copy != null) __obj.updateDynamic("copy")(copy.asInstanceOf[js.Any])
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    if (direction != null) __obj.updateDynamic("direction")(direction)
    if (!js.isUndefined(ignoreInputTextSelection)) __obj.updateDynamic("ignoreInputTextSelection")(ignoreInputTextSelection)
    if (invalid != null) __obj.updateDynamic("invalid")(js.Any.fromFunction2(invalid))
    if (isContainer != null) __obj.updateDynamic("isContainer")(js.Any.fromFunction1(isContainer))
    if (mirrorContainer != null) __obj.updateDynamic("mirrorContainer")(mirrorContainer)
    if (moves != null) __obj.updateDynamic("moves")(js.Any.fromFunction4(moves))
    if (!js.isUndefined(removeOnSpill)) __obj.updateDynamic("removeOnSpill")(removeOnSpill)
    if (!js.isUndefined(revertOnSpill)) __obj.updateDynamic("revertOnSpill")(revertOnSpill)
    __obj.asInstanceOf[DragulaOptions]
  }
}

