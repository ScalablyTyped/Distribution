package typings
package gapiDotClientDotClouddebuggerLib.gapiNs.clientNs.clouddebuggerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait FormatMessage extends js.Object {
  /**
               * Format template for the message. The `format` uses placeholders `$0`,
               * `$1`, etc. to reference parameters. `$$` can be used to denote the `$`
               * character.
               *
               * Examples:
               *
               * &#42;   `Failed to load '$0' which helps debug $1 the first time it
               * is loaded.  Again, $0 is very important.`
               * &#42;   `Please pay $$10 to use $0 instead of $1.`
               */
  var format: js.UndefOr[java.lang.String] = js.undefined
  /** Optional parameters to be embedded into the message. */
  var parameters: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

