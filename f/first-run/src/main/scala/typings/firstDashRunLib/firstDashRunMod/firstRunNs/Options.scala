package typings
package firstDashRunLib.firstDashRunMod.firstRunNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
    * The name used to identify it.
    * @default name field in your package.json
    */
  var name: java.lang.String
}

object Options {
  @scala.inline
  def apply(name: java.lang.String): Options = {
    val __obj = js.Dynamic.literal(name = name)
  
    __obj.asInstanceOf[Options]
  }
}

