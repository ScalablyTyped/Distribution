package typings
package gapiDotPeopleLib.gapiNs.clientNs.peopleNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Source extends js.Object {
  var etag: java.lang.String
  var id: java.lang.String
  var resourceName: java.lang.String
  var `type`: SourceType
}

object Source {
  @scala.inline
  def apply(etag: java.lang.String, id: java.lang.String, resourceName: java.lang.String, `type`: SourceType): Source = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("etag")(etag)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("resourceName")(resourceName)
    __obj.asInstanceOf[Source]
  }
}

