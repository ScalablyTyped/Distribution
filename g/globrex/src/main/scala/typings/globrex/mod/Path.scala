package typings.globrex.mod

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Path extends js.Object {
  /**
    * JavaScript RegExp instance build for testing against paths.
    * The regex have different path separators depending on host OS.
    */
  var regex: RegExp
  /**
    * Array of RegExp instances separated by /.
    * This can be usable when working with file paths or urls.
    * ```js
    * [ /^foo$/, /^bar$/, /^([^\/]*)$/, '^baz\\.(md|js|txt)$' ]
    * ```
    */
  var segments: js.Array[RegExp]
  /**
    * String representation of the RegExp
    */
  var string: String
}

object Path {
  @scala.inline
  def apply(regex: RegExp, segments: js.Array[RegExp], string: String): Path = {
    val __obj = js.Dynamic.literal(regex = regex.asInstanceOf[js.Any], segments = segments.asInstanceOf[js.Any], string = string.asInstanceOf[js.Any])
    __obj.asInstanceOf[Path]
  }
}

