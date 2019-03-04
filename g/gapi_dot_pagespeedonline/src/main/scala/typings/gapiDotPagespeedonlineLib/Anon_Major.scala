package typings
package gapiDotPagespeedonlineLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Major extends js.Object {
  /**
    * The major version number of the PageSpeed SDK used to generate these results.
    */
  var major: scala.Double
  /**
    * The minor version number of the PageSpeed SDK used to generate these results.
    */
  var minor: scala.Double
}

object Anon_Major {
  @scala.inline
  def apply(major: scala.Double, minor: scala.Double): Anon_Major = {
    val __obj = js.Dynamic.literal(major = major, minor = minor)
  
    __obj.asInstanceOf[Anon_Major]
  }
}

