package typings.gapiClientCloudbuild.gapi.client.cloudbuild

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Source extends js.Object {
  /** If provided, get source from this location in a Cloud Repo. */
  var repoSource: js.UndefOr[RepoSource] = js.native
  /** If provided, get the source from this location in Google Cloud Storage. */
  var storageSource: js.UndefOr[StorageSource] = js.native
}

object Source {
  @scala.inline
  def apply(): Source = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Source]
  }
  @scala.inline
  implicit class SourceOps[Self <: Source] (val x: Self) extends AnyVal {
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
    def setRepoSource(value: RepoSource): Self = this.set("repoSource", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRepoSource: Self = this.set("repoSource", js.undefined)
    @scala.inline
    def setStorageSource(value: StorageSource): Self = this.set("storageSource", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStorageSource: Self = this.set("storageSource", js.undefined)
  }
  
}

