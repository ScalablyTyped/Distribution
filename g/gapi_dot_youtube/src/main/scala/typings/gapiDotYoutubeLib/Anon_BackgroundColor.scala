package typings
package gapiDotYoutubeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BackgroundColor extends js.Object {
  /**
    * The text color for the video watch pages branded area.
    */
  var backgroundColor: java.lang.String
  /**
    * An ID that uniquely identifies a playlist that displays next to the video player on the video watch page.
    */
  var featuredPlaylistId: java.lang.String
  /**
    * The background color for the video watch pages branded area.
    */
  var textColor: java.lang.String
}

object Anon_BackgroundColor {
  @scala.inline
  def apply(
    backgroundColor: java.lang.String,
    featuredPlaylistId: java.lang.String,
    textColor: java.lang.String
  ): Anon_BackgroundColor = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("backgroundColor")(backgroundColor)
    __obj.updateDynamic("featuredPlaylistId")(featuredPlaylistId)
    __obj.updateDynamic("textColor")(textColor)
    __obj.asInstanceOf[Anon_BackgroundColor]
  }
}

