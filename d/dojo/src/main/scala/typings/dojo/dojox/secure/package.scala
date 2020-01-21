package typings.dojo.dojox

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object secure {
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dojox/secure/DOM.html
    *
    *
    * @param element
    */
  type DOM = js.Function1[/* element */ js.Any, scala.Unit]
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dojox/secure/sandbox.html
    *
    * Creates a secure sandbox from which scripts and HTML can be loaded that
    * will only be able to access the provided element and it's descendants, the
    * rest of the DOM and JS environment will not be accessible to the sandboxed
    * scripts and HTML.
    * This function will create and return a sandbox object (see dojox.secure.__Sandbox)
    * for the provided element.
    *
    * @param element The DOM element to use as the container for the sandbox
    */
  type sandbox = js.Function1[/* element */ js.Any, scala.Unit]
}
