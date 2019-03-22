package typings
package gitlabLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DEVELOPER extends js.Object {
  var DEVELOPER: scala.Double
  var GUEST: scala.Double
  var MASTER: scala.Double
  var OWNER: scala.Double
  var REPORTER: scala.Double
}

object Anon_DEVELOPER {
  @scala.inline
  def apply(
    DEVELOPER: scala.Double,
    GUEST: scala.Double,
    MASTER: scala.Double,
    OWNER: scala.Double,
    REPORTER: scala.Double
  ): Anon_DEVELOPER = {
    val __obj = js.Dynamic.literal(DEVELOPER = DEVELOPER, GUEST = GUEST, MASTER = MASTER, OWNER = OWNER, REPORTER = REPORTER)
  
    __obj.asInstanceOf[Anon_DEVELOPER]
  }
}

