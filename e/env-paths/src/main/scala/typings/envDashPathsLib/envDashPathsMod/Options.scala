package typings
package envDashPathsLib.envDashPathsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
  		__Don't use this option unless you really have to!__
  		Suffix appended to the project name to avoid name conflicts with native apps. Pass an empty string to disable it.
  		@default 'nodejs'
  		*/
  val suffix: js.UndefOr[java.lang.String] = js.undefined
}

object Options {
  @scala.inline
  def apply(suffix: java.lang.String = null): Options = {
    val __obj = js.Dynamic.literal()
    if (suffix != null) __obj.updateDynamic("suffix")(suffix)
    __obj.asInstanceOf[Options]
  }
}

