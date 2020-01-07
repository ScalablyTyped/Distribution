package typings.googleapis.buildSrcApisCloudbuildV1alpha1Mod.cloudbuild_v1alpha1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Location of the source in a supported storage service.
  */
@js.native
trait Schema$Source extends js.Object {
  /**
    * If provided, get the source from this location in a Cloud Source
    * Repository.
    */
  var repoSource: js.UndefOr[Schema$RepoSource] = js.native
  /**
    * If provided, get the source from this location in Google Cloud Storage.
    */
  var storageSource: js.UndefOr[Schema$StorageSource] = js.native
}

object Schema$Source {
  @scala.inline
  def apply(repoSource: Schema$RepoSource = null, storageSource: Schema$StorageSource = null): Schema$Source = {
    val __obj = js.Dynamic.literal()
    if (repoSource != null) __obj.updateDynamic("repoSource")(repoSource.asInstanceOf[js.Any])
    if (storageSource != null) __obj.updateDynamic("storageSource")(storageSource.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Source]
  }
}

