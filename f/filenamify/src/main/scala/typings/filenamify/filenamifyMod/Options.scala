package typings.filenamify.filenamifyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
  		Truncate the filename to the given length.
  		
  		Systems generally allow up to 255 characters, but we default to 100 for usability reasons.
  		@default 100
  		*/
  val maxLength: js.UndefOr[Double] = js.undefined
  /**
  		String to use as replacement for reserved filename characters.
  		Cannot contain: `<` `>` `:` `"` `/` `\` `|` `?` `*`
  		@default '!'
  		*/
  val replacement: js.UndefOr[String] = js.undefined
}

object Options {
  @scala.inline
  def apply(maxLength: Int | Double = null, replacement: String = null): Options = {
    val __obj = js.Dynamic.literal()
    if (maxLength != null) __obj.updateDynamic("maxLength")(maxLength.asInstanceOf[js.Any])
    if (replacement != null) __obj.updateDynamic("replacement")(replacement.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

