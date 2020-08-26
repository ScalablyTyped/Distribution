package typings.gitlab.pipelinesMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PipelineSchema extends js.Object {
  var created_at: Date = js.native
  var id: Double = js.native
  var ref: String = js.native
  var sha: String = js.native
  var status: String = js.native
  var updated_at: Date = js.native
  var web_url: String = js.native
}

object PipelineSchema {
  @scala.inline
  def apply(
    created_at: Date,
    id: Double,
    ref: String,
    sha: String,
    status: String,
    updated_at: Date,
    web_url: String
  ): PipelineSchema = {
    val __obj = js.Dynamic.literal(created_at = created_at.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], ref = ref.asInstanceOf[js.Any], sha = sha.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], updated_at = updated_at.asInstanceOf[js.Any], web_url = web_url.asInstanceOf[js.Any])
    __obj.asInstanceOf[PipelineSchema]
  }
  @scala.inline
  implicit class PipelineSchemaOps[Self <: PipelineSchema] (val x: Self) extends AnyVal {
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
    def setCreated_at(value: Date): Self = this.set("created_at", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: Double): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setRef(value: String): Self = this.set("ref", value.asInstanceOf[js.Any])
    @scala.inline
    def setSha(value: String): Self = this.set("sha", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def setUpdated_at(value: Date): Self = this.set("updated_at", value.asInstanceOf[js.Any])
    @scala.inline
    def setWeb_url(value: String): Self = this.set("web_url", value.asInstanceOf[js.Any])
  }
  
}

