package typings
package gapiDotPeopleLib.gapiNs.clientNs.peopleNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CoverPhoto extends js.Object {
  var metadata: FieldMetadata
  var url: java.lang.String
}

object CoverPhoto {
  @scala.inline
  def apply(metadata: FieldMetadata, url: java.lang.String): CoverPhoto = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("metadata")(metadata)
    __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[CoverPhoto]
  }
}

