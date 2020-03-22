package typings.gitlab.pipelinesMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PipelineSchema extends js.Object {
  var created_at: Date
  var id: Double
  var ref: String
  var sha: String
  var status: String
  var updated_at: Date
  var web_url: String
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
}

