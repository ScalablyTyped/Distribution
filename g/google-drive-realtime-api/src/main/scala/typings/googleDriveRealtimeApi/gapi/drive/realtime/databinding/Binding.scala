package typings.googleDriveRealtimeApi.gapi.drive.realtime.databinding

import typings.googleDriveRealtimeApi.gapi.drive.realtime.CollaborativeObject
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Binding extends js.Object {
  // Throws gapi.drive.realtime.databinding.AlreadyBoundError If domElement has already been bound.
  // The collaborative object to bind.
  var collaborativeObject: CollaborativeObject
  // The DOM element that the collaborative object is bound to. Value must not be null.
  var domElement: Element
  // Unbinds the domElement from collaborativeObject.
  def unbind(): Unit
}

object Binding {
  @scala.inline
  def apply(collaborativeObject: CollaborativeObject, domElement: Element, unbind: () => Unit): Binding = {
    val __obj = js.Dynamic.literal(collaborativeObject = collaborativeObject.asInstanceOf[js.Any], domElement = domElement.asInstanceOf[js.Any], unbind = js.Any.fromFunction0(unbind))
    __obj.asInstanceOf[Binding]
  }
}

