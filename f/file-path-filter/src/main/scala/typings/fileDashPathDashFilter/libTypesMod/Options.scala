package typings.fileDashPathDashFilter.libTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
    * A function that maps each filtered item to a file path.  This allows you to filter things
    * other than strings.
    *
    * Defaults to a function that returns the first argument as a string.
    */
  var map: js.UndefOr[MapFunction] = js.undefined
  /**
    * The path separator. This allows you to filter paths from
    * other operating systems (e.g. filtering Windows paths on a Mac).
    *
    * Defaults to the default path separtor for the host OS.
    */
  var sep: js.UndefOr[String] = js.undefined
}

object Options {
  @scala.inline
  def apply(map: /* repeated */ js.Any => String = null, sep: String = null): Options = {
    val __obj = js.Dynamic.literal()
    if (map != null) __obj.updateDynamic("map")(js.Any.fromFunction1(map))
    if (sep != null) __obj.updateDynamic("sep")(sep.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

