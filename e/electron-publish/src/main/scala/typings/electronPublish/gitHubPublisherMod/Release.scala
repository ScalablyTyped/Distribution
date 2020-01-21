package typings.electronPublish.gitHubPublisherMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Release extends js.Object {
  var draft: Boolean
  var id: Double
  var prerelease: Boolean
  var published_at: String
  var tag_name: String
  var upload_url: String
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
}

