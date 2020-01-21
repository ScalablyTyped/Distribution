package typings.googleDriveRealtimeApi.gapi.drive.realtime

import typings.googleDriveRealtimeApi.AnonSHIFTAFTERDELETE
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("gapi.drive.realtime.IndexReference")
@js.native
class IndexReference[V] () extends CollaborativeObject {
  //The index of the current location the reference points to. Write to this property to change the referenced index.
  var index: Double = js.native
  // The behavior of this index reference when the element it points at is deleted.
  // @return one of the elements of DeleteMode
  def deleteMode(): String = js.native
  // The object this reference points to. Read-only.
  def referencedObject(): V = js.native
}

/* static members */
@JSGlobal("gapi.drive.realtime.IndexReference")
@js.native
object IndexReference extends js.Object {
  // (Categories of) the shift behavior of an index reference when the element it points at is deleted.
  var DeleteMode: AnonSHIFTAFTERDELETE = js.native
}

