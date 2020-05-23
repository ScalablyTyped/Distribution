package typings.gapiYoutube.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BackgroundColor extends js.Object {
  /**
    * The text color for the video watch pages branded area.
    */
  var backgroundColor: String
  /**
    * An ID that uniquely identifies a playlist that displays next to the video player on the video watch page.
    */
  var featuredPlaylistId: String
  /**
    * The background color for the video watch pages branded area.
    */
  var textColor: String
}

object BackgroundColor {
  @scala.inline
  def apply(backgroundColor: String, featuredPlaylistId: String, textColor: String): BackgroundColor = {
    val __obj = js.Dynamic.literal(backgroundColor = backgroundColor.asInstanceOf[js.Any], featuredPlaylistId = featuredPlaylistId.asInstanceOf[js.Any], textColor = textColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[BackgroundColor]
  }
}

