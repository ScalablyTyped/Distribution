package typings.electronPublish.gitHubPublisherMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Release extends js.Object {
  var draft: Boolean = js.native
  var id: Double = js.native
  var prerelease: Boolean = js.native
  var published_at: String = js.native
  var tag_name: String = js.native
  var upload_url: String = js.native
}

object Release {
  @scala.inline
  def apply(
    draft: Boolean,
    id: Double,
    prerelease: Boolean,
    published_at: String,
    tag_name: String,
    upload_url: String
  ): Release = {
    val __obj = js.Dynamic.literal(draft = draft.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], prerelease = prerelease.asInstanceOf[js.Any], published_at = published_at.asInstanceOf[js.Any], tag_name = tag_name.asInstanceOf[js.Any], upload_url = upload_url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Release]
  }
  @scala.inline
  implicit class ReleaseOps[Self <: Release] (val x: Self) extends AnyVal {
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
    def setDraft(value: Boolean): Self = this.set("draft", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: Double): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setPrerelease(value: Boolean): Self = this.set("prerelease", value.asInstanceOf[js.Any])
    @scala.inline
    def setPublished_at(value: String): Self = this.set("published_at", value.asInstanceOf[js.Any])
    @scala.inline
    def setTag_name(value: String): Self = this.set("tag_name", value.asInstanceOf[js.Any])
    @scala.inline
    def setUpload_url(value: String): Self = this.set("upload_url", value.asInstanceOf[js.Any])
  }
  
}

