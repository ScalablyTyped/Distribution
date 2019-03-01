package typings
package easyDashXDashHeadersLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Ca extends js.Object {
  var ca: java.lang.String
  var cert: java.lang.String
  var key: java.lang.String
}

object Anon_Ca {
  @scala.inline
  def apply(ca: java.lang.String, cert: java.lang.String, key: java.lang.String): Anon_Ca = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ca")(ca)
    __obj.updateDynamic("cert")(cert)
    __obj.updateDynamic("key")(key)
    __obj.asInstanceOf[Anon_Ca]
  }
}

