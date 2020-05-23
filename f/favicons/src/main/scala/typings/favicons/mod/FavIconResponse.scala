package typings.favicons.mod

import typings.favicons.anon.Contents
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FavIconResponse extends js.Object {
  var files: js.Array[Contents]
  var html: js.Array[String]
  var images: js.Array[Contents]
}

object FavIconResponse {
  @scala.inline
  def apply(files: js.Array[Contents], html: js.Array[String], images: js.Array[Contents]): FavIconResponse = {
    val __obj = js.Dynamic.literal(files = files.asInstanceOf[js.Any], html = html.asInstanceOf[js.Any], images = images.asInstanceOf[js.Any])
    __obj.asInstanceOf[FavIconResponse]
  }
}

