package typings.favicons.faviconsMod

import typings.favicons.Anon_Contents
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FavIconResponse extends js.Object {
  var files: js.Array[Anon_Contents]
  var html: js.Array[String]
  var images: js.Array[Anon_Contents]
}

object FavIconResponse {
  @scala.inline
  def apply(files: js.Array[Anon_Contents], html: js.Array[String], images: js.Array[Anon_Contents]): FavIconResponse = {
    val __obj = js.Dynamic.literal(files = files, html = html, images = images)
  
    __obj.asInstanceOf[FavIconResponse]
  }
}

