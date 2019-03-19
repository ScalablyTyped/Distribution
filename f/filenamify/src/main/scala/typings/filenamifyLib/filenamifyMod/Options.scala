package typings
package filenamifyLib.filenamifyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
  	 * String to use as replacement for reserved filename characters.
  	 *
  	 * Cannot contain: `<` `>` `:` `"` `/` `\` `|` `?` `*`
  	 *
  	 * @default '!'
  	 */
  val replacement: js.UndefOr[java.lang.String] = js.undefined
}

object Options {
  @scala.inline
  def apply(replacement: java.lang.String = null): Options = {
    val __obj = js.Dynamic.literal()
    if (replacement != null) __obj.updateDynamic("replacement")(replacement)
    __obj.asInstanceOf[Options]
  }
}

