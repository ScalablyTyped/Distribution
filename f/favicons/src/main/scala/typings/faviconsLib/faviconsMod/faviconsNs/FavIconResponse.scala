package typings
package faviconsLib.faviconsMod.faviconsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FavIconResponse extends js.Object {
  var files: js.Array[faviconsLib.Anon_Contents]
  var html: js.Array[java.lang.String]
  var images: js.Array[faviconsLib.Anon_Contents]
}

object FavIconResponse {
  @scala.inline
  def apply(
    files: js.Array[faviconsLib.Anon_Contents],
    html: js.Array[java.lang.String],
    images: js.Array[faviconsLib.Anon_Contents]
  ): FavIconResponse = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("files")(files)
    __obj.updateDynamic("html")(html)
    __obj.updateDynamic("images")(images)
    __obj.asInstanceOf[FavIconResponse]
  }
}

