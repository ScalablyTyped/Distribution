package typings.dragula.mod

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DragulaOptions extends js.Object {
  var accepts: js.UndefOr[
    js.Function4[
      /* el */ js.UndefOr[Element], 
      /* target */ js.UndefOr[Element], 
      /* source */ js.UndefOr[Element], 
      /* sibling */ js.UndefOr[Element], 
      Boolean
    ]
  ] = js.undefined
  var containers: js.UndefOr[js.Array[Element]] = js.undefined
  var copy: js.UndefOr[(js.Function2[/* el */ Element, /* source */ Element, Boolean]) | Boolean] = js.undefined
  var copySortSource: js.UndefOr[Boolean] = js.undefined
  var delay: js.UndefOr[Boolean | Double] = js.undefined
  var direction: js.UndefOr[String] = js.undefined
  var ignoreInputTextSelection: js.UndefOr[Boolean] = js.undefined
  var invalid: js.UndefOr[
    js.Function2[/* el */ js.UndefOr[Element], /* target */ js.UndefOr[Element], Boolean]
  ] = js.undefined
  var isContainer: js.UndefOr[js.Function1[/* el */ js.UndefOr[Element], Boolean]] = js.undefined
  var mirrorContainer: js.UndefOr[Element] = js.undefined
  var moves: js.UndefOr[
    js.Function4[
      /* el */ js.UndefOr[Element], 
      /* container */ js.UndefOr[Element], 
      /* handle */ js.UndefOr[Element], 
      /* sibling */ js.UndefOr[Element], 
      Boolean
    ]
  ] = js.undefined
  var removeOnSpill: js.UndefOr[Boolean] = js.undefined
  var revertOnSpill: js.UndefOr[Boolean] = js.undefined
}

object DragulaOptions {
  @scala.inline
  def apply(
    accepts: (/* el */ js.UndefOr[Element], /* target */ js.UndefOr[Element], /* source */ js.UndefOr[Element], /* sibling */ js.UndefOr[Element]) => Boolean = null,
    containers: js.Array[Element] = null,
    copy: (js.Function2[/* el */ Element, /* source */ Element, Boolean]) | Boolean = null,
    copySortSource: js.UndefOr[Boolean] = js.undefined,
    delay: Boolean | Double = null,
    direction: String = null,
    ignoreInputTextSelection: js.UndefOr[Boolean] = js.undefined,
    invalid: (/* el */ js.UndefOr[Element], /* target */ js.UndefOr[Element]) => Boolean = null,
    isContainer: /* el */ js.UndefOr[Element] => Boolean = null,
    mirrorContainer: Element = null,
    moves: (/* el */ js.UndefOr[Element], /* container */ js.UndefOr[Element], /* handle */ js.UndefOr[Element], /* sibling */ js.UndefOr[Element]) => Boolean = null,
    removeOnSpill: js.UndefOr[Boolean] = js.undefined,
    revertOnSpill: js.UndefOr[Boolean] = js.undefined
  ): DragulaOptions = {
    val __obj = js.Dynamic.literal()
    if (accepts != null) __obj.updateDynamic("accepts")(js.Any.fromFunction4(accepts))
    if (containers != null) __obj.updateDynamic("containers")(containers.asInstanceOf[js.Any])
    if (copy != null) __obj.updateDynamic("copy")(copy.asInstanceOf[js.Any])
    if (!js.isUndefined(copySortSource)) __obj.updateDynamic("copySortSource")(copySortSource.asInstanceOf[js.Any])
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreInputTextSelection)) __obj.updateDynamic("ignoreInputTextSelection")(ignoreInputTextSelection.asInstanceOf[js.Any])
    if (invalid != null) __obj.updateDynamic("invalid")(js.Any.fromFunction2(invalid))
    if (isContainer != null) __obj.updateDynamic("isContainer")(js.Any.fromFunction1(isContainer))
    if (mirrorContainer != null) __obj.updateDynamic("mirrorContainer")(mirrorContainer.asInstanceOf[js.Any])
    if (moves != null) __obj.updateDynamic("moves")(js.Any.fromFunction4(moves))
    if (!js.isUndefined(removeOnSpill)) __obj.updateDynamic("removeOnSpill")(removeOnSpill.asInstanceOf[js.Any])
    if (!js.isUndefined(revertOnSpill)) __obj.updateDynamic("revertOnSpill")(revertOnSpill.asInstanceOf[js.Any])
    __obj.asInstanceOf[DragulaOptions]
  }
}

