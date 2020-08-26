package typings.gitlab.projectsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NamespaceInfoSchema extends js.Object {
  var avatar_url: String = js.native
  var full_path: String = js.native
  var id: Double = js.native
  var kind: String = js.native
  var name: String = js.native
  var parent_id: js.UndefOr[Double] = js.native
  var path: String = js.native
  var web_url: String = js.native
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
    web_url: String
  ): NamespaceInfoSchema = {
    val __obj = js.Dynamic.literal(avatar_url = avatar_url.asInstanceOf[js.Any], full_path = full_path.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], web_url = web_url.asInstanceOf[js.Any])
    __obj.asInstanceOf[NamespaceInfoSchema]
  }
  @scala.inline
  implicit class NamespaceInfoSchemaOps[Self <: NamespaceInfoSchema] (val x: Self) extends AnyVal {
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
    def setAvatar_url(value: String): Self = this.set("avatar_url", value.asInstanceOf[js.Any])
    @scala.inline
    def setFull_path(value: String): Self = this.set("full_path", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: Double): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    @scala.inline
    def setWeb_url(value: String): Self = this.set("web_url", value.asInstanceOf[js.Any])
    @scala.inline
    def setParent_id(value: Double): Self = this.set("parent_id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParent_id: Self = this.set("parent_id", js.undefined)
  }
  
}

