package typings.gapiClientAndroidpublisher.gapi.client.androidpublisher

import typings.gapiClient.gapi.client.Request
import typings.gapiClientAndroidpublisher.anon.EditId
import typings.gapiClientAndroidpublisher.anon.PackageName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EditsResource extends js.Object {
  var apklistings: ApklistingsResource
  var apks: ApksResource
  var deobfuscationfiles: DeobfuscationfilesResource
  var details: DetailsResource
  var expansionfiles: ExpansionfilesResource
  var images: ImagesResource
  var listings: ListingsResource
  var testers: TestersResource
  var tracks: TracksResource
  /** Commits/applies the changes made in this edit back to the app. */
  def commit(request: EditId): Request[AppEdit]
  /**
    * Deletes an edit for an app. Creating a new edit will automatically delete any of your previous edits so this method need only be called if you want to
    * preemptively abandon an edit.
    */
  def delete(request: EditId): Request[Unit]
  /** Returns information about the edit specified. Calls will fail if the edit is no long active (e.g. has been deleted, superseded or expired). */
  def get(request: EditId): Request[AppEdit]
  /** Creates a new edit for an app, populated with the app's current state. */
  def insert(request: PackageName): Request[AppEdit]
  /** Checks that the edit can be successfully committed. The edit's changes are not applied to the live app. */
  def validate(request: EditId): Request[AppEdit]
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
}

