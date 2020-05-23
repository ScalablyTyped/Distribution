package typings.gitlab.projectsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NamespaceInfoSchema extends js.Object {
  var avatar_url: String
  var full_path: String
  var id: Double
  var kind: String
  var name: String
  var parent_id: js.UndefOr[Double] = js.undefined
  var path: String
  var web_url: String
}

object NamespaceInfoSchema {
  @scala.inline
  def apply(
    avatar_url: String,
    full_path: String,
    id: Double,
    kind: String,
    name: String,
    path: String,
    web_url: String,
    parent_id: js.UndefOr[Double] = js.undefined
  ): NamespaceInfoSchema = {
    val __obj = js.Dynamic.literal(avatar_url = avatar_url.asInstanceOf[js.Any], full_path = full_path.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], web_url = web_url.asInstanceOf[js.Any])
    if (!js.isUndefined(parent_id)) __obj.updateDynamic("parent_id")(parent_id.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[NamespaceInfoSchema]
  }
}

