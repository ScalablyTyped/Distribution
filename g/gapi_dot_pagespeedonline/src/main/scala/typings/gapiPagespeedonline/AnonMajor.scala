package typings.gapiPagespeedonline

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonMajor extends js.Object {
  /**
    * The major version number of the PageSpeed SDK used to generate these results.
    */
  var major: Double
  /**
    * The minor version number of the PageSpeed SDK used to generate these results.
    */
  var minor: Double
}

object AnonMajor {
  @scala.inline
  def apply(major: Double, minor: Double): AnonMajor = {
    val __obj = js.Dynamic.literal(major = major.asInstanceOf[js.Any], minor = minor.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonMajor]
  }
}

