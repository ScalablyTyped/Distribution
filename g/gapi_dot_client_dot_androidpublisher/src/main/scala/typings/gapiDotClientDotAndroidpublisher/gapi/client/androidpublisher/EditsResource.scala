package typings.gapiDotClientDotAndroidpublisher.gapi.client.androidpublisher

import typings.gapiDotClient.gapi.client.Request
import typings.gapiDotClientDotAndroidpublisher.Anon_AltEditId
import typings.gapiDotClientDotAndroidpublisher.Anon_AltFields
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
  def commit(request: Anon_AltEditId): Request[AppEdit]
  /**
    * Deletes an edit for an app. Creating a new edit will automatically delete any of your previous edits so this method need only be called if you want to
    * preemptively abandon an edit.
    */
  def delete(request: Anon_AltEditId): Request[Unit]
  /** Returns information about the edit specified. Calls will fail if the edit is no long active (e.g. has been deleted, superseded or expired). */
  def get(request: Anon_AltEditId): Request[AppEdit]
  /** Creates a new edit for an app, populated with the app's current state. */
  def insert(request: Anon_AltFields): Request[AppEdit]
  /** Checks that the edit can be successfully committed. The edit's changes are not applied to the live app. */
  def validate(request: Anon_AltEditId): Request[AppEdit]
}

object EditsResource {
  @scala.inline
  def apply(
    apklistings: ApklistingsResource,
    apks: ApksResource,
    commit: Anon_AltEditId => Request[AppEdit],
    delete: Anon_AltEditId => Request[Unit],
    deobfuscationfiles: DeobfuscationfilesResource,
    details: DetailsResource,
    expansionfiles: ExpansionfilesResource,
    get: Anon_AltEditId => Request[AppEdit],
    images: ImagesResource,
    insert: Anon_AltFields => Request[AppEdit],
    listings: ListingsResource,
    testers: TestersResource,
    tracks: TracksResource,
    validate: Anon_AltEditId => Request[AppEdit]
  ): EditsResource = {
    val __obj = js.Dynamic.literal(apklistings = apklistings, apks = apks, commit = js.Any.fromFunction1(commit), delete = js.Any.fromFunction1(delete), deobfuscationfiles = deobfuscationfiles, details = details, expansionfiles = expansionfiles, get = js.Any.fromFunction1(get), images = images, insert = js.Any.fromFunction1(insert), listings = listings, testers = testers, tracks = tracks, validate = js.Any.fromFunction1(validate))
  
    __obj.asInstanceOf[EditsResource]
  }
}

