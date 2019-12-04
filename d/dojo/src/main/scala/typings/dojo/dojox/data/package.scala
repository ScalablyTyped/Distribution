package typings.dojo.dojox

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object data {
  type css = css_
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dojox/data/restListener.html
    *
    * this function can be used to receive REST notifications, from Comet or from another frame
    *
    * @param message
    */
  type restListener = js.Function1[/* message */ js.Any, Unit]
}
