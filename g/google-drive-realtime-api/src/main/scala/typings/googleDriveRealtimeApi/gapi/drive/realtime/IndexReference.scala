package typings.googleDriveRealtimeApi.gapi.drive.realtime

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IndexReference[V] extends CollaborativeObject {
  
  // The behavior of this index reference when the element it points at is deleted.
  // @return one of the elements of DeleteMode
  def deleteMode(): String = js.native
  
  //The index of the current location the reference points to. Write to this property to change the referenced index.
  var index: Double = js.native
  
  // The object this reference points to. Read-only.
  def referencedObject(): V = js.native
}
