package typings
package gapiDotCalendarLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Domain extends js.Object {
  var domain: java.lang.String
  var reason: java.lang.String
}

object Anon_Domain {
  @scala.inline
  def apply(domain: java.lang.String, reason: java.lang.String): Anon_Domain = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("domain")(domain)
    __obj.updateDynamic("reason")(reason)
    __obj.asInstanceOf[Anon_Domain]
  }
}

