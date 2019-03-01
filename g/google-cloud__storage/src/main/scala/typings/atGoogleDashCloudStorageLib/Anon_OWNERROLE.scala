package typings
package atGoogleDashCloudStorageLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_OWNERROLE extends js.Object {
  var OWNER_ROLE: java.lang.String
  var READER_ROLE: java.lang.String
  var WRITER_ROLE: java.lang.String
}

object Anon_OWNERROLE {
  @scala.inline
  def apply(OWNER_ROLE: java.lang.String, READER_ROLE: java.lang.String, WRITER_ROLE: java.lang.String): Anon_OWNERROLE = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("OWNER_ROLE")(OWNER_ROLE)
    __obj.updateDynamic("READER_ROLE")(READER_ROLE)
    __obj.updateDynamic("WRITER_ROLE")(WRITER_ROLE)
    __obj.asInstanceOf[Anon_OWNERROLE]
  }
}

