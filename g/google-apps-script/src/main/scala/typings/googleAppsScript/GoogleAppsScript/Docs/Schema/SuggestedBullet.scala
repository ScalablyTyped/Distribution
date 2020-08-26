package typings.googleAppsScript.GoogleAppsScript.Docs.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SuggestedBullet extends js.Object {
  var bullet: js.UndefOr[Bullet] = js.native
  var bulletSuggestionState: js.UndefOr[BulletSuggestionState] = js.native
}

object SuggestedBullet {
  @scala.inline
  def apply(): SuggestedBullet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SuggestedBullet]
  }
  @scala.inline
  implicit class SuggestedBulletOps[Self <: SuggestedBullet] (val x: Self) extends AnyVal {
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
    def setBullet(value: Bullet): Self = this.set("bullet", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBullet: Self = this.set("bullet", js.undefined)
    @scala.inline
    def setBulletSuggestionState(value: BulletSuggestionState): Self = this.set("bulletSuggestionState", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBulletSuggestionState: Self = this.set("bulletSuggestionState", js.undefined)
  }
  
}

