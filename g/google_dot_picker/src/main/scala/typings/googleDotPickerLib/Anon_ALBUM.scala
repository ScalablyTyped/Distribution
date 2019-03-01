package typings
package googleDotPickerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ALBUM extends js.Object {
  var ALBUM: java.lang.String
  var DOCUMENT: java.lang.String
  var LOCATION: java.lang.String
  var PHOTO: java.lang.String
  var URL: java.lang.String
  var VIDEO: java.lang.String
}

object Anon_ALBUM {
  @scala.inline
  def apply(
    ALBUM: java.lang.String,
    DOCUMENT: java.lang.String,
    LOCATION: java.lang.String,
    PHOTO: java.lang.String,
    URL: java.lang.String,
    VIDEO: java.lang.String
  ): Anon_ALBUM = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ALBUM")(ALBUM)
    __obj.updateDynamic("DOCUMENT")(DOCUMENT)
    __obj.updateDynamic("LOCATION")(LOCATION)
    __obj.updateDynamic("PHOTO")(PHOTO)
    __obj.updateDynamic("URL")(URL)
    __obj.updateDynamic("VIDEO")(VIDEO)
    __obj.asInstanceOf[Anon_ALBUM]
  }
}

