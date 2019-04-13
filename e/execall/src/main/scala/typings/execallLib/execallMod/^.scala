package typings
package execallLib.execallMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("execall", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  /**
    * Find multiple RegExp matches in a string. Instead of having to iterate over
    * `RegExp#exec`, immutable, and with a nicer result format.
    *
    * @param re Regular expression to match against the `input`.
    * @returns An array of matches.
    */
  def apply(re: stdLib.RegExp, input: java.lang.String): js.Array[Match] = js.native
}

