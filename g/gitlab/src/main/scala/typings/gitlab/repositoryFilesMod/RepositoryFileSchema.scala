package typings.gitlab.repositoryFilesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RepositoryFileSchema extends js.Object {
  var blob_id: String = js.native
  var commit_id: String = js.native
  var content: String = js.native
  var content_sha256: String = js.native
  var encoding: String = js.native
  var file_name: String = js.native
  var file_path: String = js.native
  var last_commit_id: String = js.native
  var ref: String = js.native
  var size: Double = js.native
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
  @scala.inline
  implicit class RepositoryFileSchemaOps[Self <: RepositoryFileSchema] (val x: Self) extends AnyVal {
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
    def setBlob_id(value: String): Self = this.set("blob_id", value.asInstanceOf[js.Any])
    @scala.inline
    def setCommit_id(value: String): Self = this.set("commit_id", value.asInstanceOf[js.Any])
    @scala.inline
    def setContent(value: String): Self = this.set("content", value.asInstanceOf[js.Any])
    @scala.inline
    def setContent_sha256(value: String): Self = this.set("content_sha256", value.asInstanceOf[js.Any])
    @scala.inline
    def setEncoding(value: String): Self = this.set("encoding", value.asInstanceOf[js.Any])
    @scala.inline
    def setFile_name(value: String): Self = this.set("file_name", value.asInstanceOf[js.Any])
    @scala.inline
    def setFile_path(value: String): Self = this.set("file_path", value.asInstanceOf[js.Any])
    @scala.inline
    def setLast_commit_id(value: String): Self = this.set("last_commit_id", value.asInstanceOf[js.Any])
    @scala.inline
    def setRef(value: String): Self = this.set("ref", value.asInstanceOf[js.Any])
    @scala.inline
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
  }
  
}

