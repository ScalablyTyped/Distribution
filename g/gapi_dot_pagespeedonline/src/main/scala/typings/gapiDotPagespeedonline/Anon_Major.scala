package typings.gapiDotPagespeedonline

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Major extends js.Object {
  /**
    * The major version number of the PageSpeed SDK used to generate these results.
    */
  var major: Double
  /**
    * The minor version number of the PageSpeed SDK used to generate these results.
    */
  var minor: Double
}

object Anon_Major {
  @scala.inline
  def apply(major: Double, minor: Double): Anon_Major = {
    val __obj = js.Dynamic.literal(major = major, minor = minor)
  
    __obj.asInstanceOf[Anon_Major]
  }
}

