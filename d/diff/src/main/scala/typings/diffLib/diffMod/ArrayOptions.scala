package typings
package diffLib.diffMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ArrayOptions[TLeft, TRight] extends BaseOptions {
  /**
    * Comparator for custom equality checks.
    */
  var comparator: js.UndefOr[js.Function2[/* left */ TLeft, /* right */ TRight, scala.Boolean]] = js.undefined
}

