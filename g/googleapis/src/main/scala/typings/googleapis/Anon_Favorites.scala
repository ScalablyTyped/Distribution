package typings.googleapis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Favorites extends js.Object {
  var favorites: js.UndefOr[String] = js.native
  var likes: js.UndefOr[String] = js.native
  var uploads: js.UndefOr[String] = js.native
  var watchHistory: js.UndefOr[String] = js.native
  var watchLater: js.UndefOr[String] = js.native
}

object Anon_Favorites {
  @scala.inline
  def apply(
    favorites: String = null,
    likes: String = null,
    uploads: String = null,
    watchHistory: String = null,
    watchLater: String = null
  ): Anon_Favorites = {
    val __obj = js.Dynamic.literal()
    if (favorites != null) __obj.updateDynamic("favorites")(favorites.asInstanceOf[js.Any])
    if (likes != null) __obj.updateDynamic("likes")(likes.asInstanceOf[js.Any])
    if (uploads != null) __obj.updateDynamic("uploads")(uploads.asInstanceOf[js.Any])
    if (watchHistory != null) __obj.updateDynamic("watchHistory")(watchHistory.asInstanceOf[js.Any])
    if (watchLater != null) __obj.updateDynamic("watchLater")(watchLater.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Favorites]
  }
}

