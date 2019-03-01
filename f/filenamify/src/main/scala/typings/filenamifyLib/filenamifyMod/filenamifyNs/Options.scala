package typings
package filenamifyLib.filenamifyMod.filenamifyNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var replacement: java.lang.String
}

object Options {
  @scala.inline
  def apply(replacement: java.lang.String): Options = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("replacement")(replacement)
    __obj.asInstanceOf[Options]
  }
}

