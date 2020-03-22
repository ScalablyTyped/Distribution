package typings.gitlab.repositoryFilesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RepositoryFileSchema extends js.Object {
  var blob_id: String
  var commit_id: String
  var content: String
  var content_sha256: String
  var encoding: String
  var file_name: String
  var file_path: String
  var last_commit_id: String
  var ref: String
  var size: Double
}

object RepositoryFileSchema {
  @scala.inline
  def apply(
    blob_id: String,
    commit_id: String,
    content: String,
    content_sha256: String,
    encoding: String,
    file_name: String,
    file_path: String,
    last_commit_id: String,
    ref: String,
    size: Double
  ): RepositoryFileSchema = {
    val __obj = js.Dynamic.literal(blob_id = blob_id.asInstanceOf[js.Any], commit_id = commit_id.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], content_sha256 = content_sha256.asInstanceOf[js.Any], encoding = encoding.asInstanceOf[js.Any], file_name = file_name.asInstanceOf[js.Any], file_path = file_path.asInstanceOf[js.Any], last_commit_id = last_commit_id.asInstanceOf[js.Any], ref = ref.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RepositoryFileSchema]
  }
}

