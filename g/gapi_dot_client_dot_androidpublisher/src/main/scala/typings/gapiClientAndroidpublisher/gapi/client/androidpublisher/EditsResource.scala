package typings.gapiClientAndroidpublisher.gapi.client.androidpublisher

import typings.gapiClient.gapi.client.Request
import typings.gapiClientAndroidpublisher.anon.EditId
import typings.gapiClientAndroidpublisher.anon.PackageName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EditsResource extends js.Object {
  var apklistings: ApklistingsResource = js.native
  var apks: ApksResource = js.native
  var deobfuscationfiles: DeobfuscationfilesResource = js.native
  var details: DetailsResource = js.native
  var expansionfiles: ExpansionfilesResource = js.native
  var images: ImagesResource = js.native
  var listings: ListingsResource = js.native
  var testers: TestersResource = js.native
  var tracks: TracksResource = js.native
  /** Commits/applies the changes made in this edit back to the app. */
  def commit(request: EditId): Request[AppEdit] = js.native
  /**
    * Deletes an edit for an app. Creating a new edit will automatically delete any of your previous edits so this method need only be called if you want to
    * preemptively abandon an edit.
    */
  def delete(request: EditId): Request[Unit] = js.native
  /** Returns information about the edit specified. Calls will fail if the edit is no long active (e.g. has been deleted, superseded or expired). */
  def get(request: EditId): Request[AppEdit] = js.native
  /** Creates a new edit for an app, populated with the app's current state. */
  def insert(request: PackageName): Request[AppEdit] = js.native
  /** Checks that the edit can be successfully committed. The edit's changes are not applied to the live app. */
  def validate(request: EditId): Request[AppEdit] = js.native
}

object EditsResource {
  @scala.inline
  def apply(
    apklistings: ApklistingsResource,
    apks: ApksResource,
    commit: EditId => Request[AppEdit],
    delete: EditId => Request[Unit],
    deobfuscationfiles: DeobfuscationfilesResource,
    details: DetailsResource,
    expansionfiles: ExpansionfilesResource,
    get: EditId => Request[AppEdit],
    images: ImagesResource,
    insert: PackageName => Request[AppEdit],
    listings: ListingsResource,
    testers: TestersResource,
    tracks: TracksResource,
    validate: EditId => Request[AppEdit]
  ): EditsResource = {
    val __obj = js.Dynamic.literal(apklistings = apklistings.asInstanceOf[js.Any], apks = apks.asInstanceOf[js.Any], commit = js.Any.fromFunction1(commit), delete = js.Any.fromFunction1(delete), deobfuscationfiles = deobfuscationfiles.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], expansionfiles = expansionfiles.asInstanceOf[js.Any], get = js.Any.fromFunction1(get), images = images.asInstanceOf[js.Any], insert = js.Any.fromFunction1(insert), listings = listings.asInstanceOf[js.Any], testers = testers.asInstanceOf[js.Any], tracks = tracks.asInstanceOf[js.Any], validate = js.Any.fromFunction1(validate))
    __obj.asInstanceOf[EditsResource]
  }
  @scala.inline
  implicit class EditsResourceOps[Self <: EditsResource] (val x: Self) extends AnyVal {
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
    def setApklistings(value: ApklistingsResource): Self = this.set("apklistings", value.asInstanceOf[js.Any])
    @scala.inline
    def setApks(value: ApksResource): Self = this.set("apks", value.asInstanceOf[js.Any])
    @scala.inline
    def setCommit(value: EditId => Request[AppEdit]): Self = this.set("commit", js.Any.fromFunction1(value))
    @scala.inline
    def setDelete(value: EditId => Request[Unit]): Self = this.set("delete", js.Any.fromFunction1(value))
    @scala.inline
    def setDeobfuscationfiles(value: DeobfuscationfilesResource): Self = this.set("deobfuscationfiles", value.asInstanceOf[js.Any])
    @scala.inline
    def setDetails(value: DetailsResource): Self = this.set("details", value.asInstanceOf[js.Any])
    @scala.inline
    def setExpansionfiles(value: ExpansionfilesResource): Self = this.set("expansionfiles", value.asInstanceOf[js.Any])
    @scala.inline
    def setGet(value: EditId => Request[AppEdit]): Self = this.set("get", js.Any.fromFunction1(value))
    @scala.inline
    def setImages(value: ImagesResource): Self = this.set("images", value.asInstanceOf[js.Any])
    @scala.inline
    def setInsert(value: PackageName => Request[AppEdit]): Self = this.set("insert", js.Any.fromFunction1(value))
    @scala.inline
    def setListings(value: ListingsResource): Self = this.set("listings", value.asInstanceOf[js.Any])
    @scala.inline
    def setTesters(value: TestersResource): Self = this.set("testers", value.asInstanceOf[js.Any])
    @scala.inline
    def setTracks(value: TracksResource): Self = this.set("tracks", value.asInstanceOf[js.Any])
    @scala.inline
    def setValidate(value: EditId => Request[AppEdit]): Self = this.set("validate", js.Any.fromFunction1(value))
  }
  
}

