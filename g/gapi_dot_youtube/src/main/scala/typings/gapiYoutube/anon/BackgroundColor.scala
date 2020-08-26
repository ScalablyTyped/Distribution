package typings.gapiYoutube.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BackgroundColor extends js.Object {
  /**
    * The text color for the video watch pages branded area.
    */
  var backgroundColor: String = js.native
  /**
    * An ID that uniquely identifies a playlist that displays next to the video player on the video watch page.
    */
  var featuredPlaylistId: String = js.native
  /**
    * The background color for the video watch pages branded area.
    */
  var textColor: String = js.native
}

object BackgroundColor {
  @scala.inline
  def apply(backgroundColor: String, featuredPlaylistId: String, textColor: String): BackgroundColor = {
    val __obj = js.Dynamic.literal(backgroundColor = backgroundColor.asInstanceOf[js.Any], featuredPlaylistId = featuredPlaylistId.asInstanceOf[js.Any], textColor = textColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[BackgroundColor]
  }
  @scala.inline
  implicit class BackgroundColorOps[Self <: BackgroundColor] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBackgroundColor(value: String): Self = this.set("backgroundColor", value.asInstanceOf[js.Any])
    @scala.inline
    def setFeaturedPlaylistId(value: String): Self = this.set("featuredPlaylistId", value.asInstanceOf[js.Any])
    @scala.inline
    def setTextColor(value: String): Self = this.set("textColor", value.asInstanceOf[js.Any])
  }
  
}

