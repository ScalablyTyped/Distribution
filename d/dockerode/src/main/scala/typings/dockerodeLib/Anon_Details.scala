package typings
package dockerodeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Details extends js.Object {
  var Details: Anon_ApiVersion
  var Name: java.lang.String
  var Version: java.lang.String
}

object Anon_Details {
  @scala.inline
  def apply(Details: Anon_ApiVersion, Name: java.lang.String, Version: java.lang.String): Anon_Details = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Details")(Details)
    __obj.updateDynamic("Name")(Name)
    __obj.updateDynamic("Version")(Version)
    __obj.asInstanceOf[Anon_Details]
  }
}

