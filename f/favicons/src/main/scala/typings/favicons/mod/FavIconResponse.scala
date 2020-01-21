package typings.favicons.mod

import typings.favicons.AnonContents
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FavIconResponse extends js.Object {
  var files: js.Array[AnonContents]
  var html: js.Array[String]
  var images: js.Array[AnonContents]
}

object FavIconResponse {
  @scala.inline
  def apply(files: js.Array[AnonContents], html: js.Array[String], images: js.Array[AnonContents]): FavIconResponse = {
    val __obj = js.Dynamic.literal(files = files.asInstanceOf[js.Any], html = html.asInstanceOf[js.Any], images = images.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[FavIconResponse]
  }
}

