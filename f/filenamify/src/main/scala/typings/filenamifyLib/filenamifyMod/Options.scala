package typings
package filenamifyLib.filenamifyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
  		Truncate the filename to the given length.
  		
  		Systems generally allow up to 255 characters, but we default to 100 for usability reasons.
  		@default 100
  		*/
  val maxLength: js.UndefOr[scala.Double] = js.undefined
  /**
  		String to use as replacement for reserved filename characters.
  		Cannot contain: `<` `>` `:` `"` `/` `\` `|` `?` `*`
  		@default '!'
  		*/
  val replacement: js.UndefOr[java.lang.String] = js.undefined
}

object Options {
  @scala.inline
  def apply(maxLength: scala.Int | scala.Double = null, replacement: java.lang.String = null): Options = {
    val __obj = js.Dynamic.literal()
    if (maxLength != null) __obj.updateDynamic("maxLength")(maxLength.asInstanceOf[js.Any])
    if (replacement != null) __obj.updateDynamic("replacement")(replacement)
    __obj.asInstanceOf[Options]
  }
}

