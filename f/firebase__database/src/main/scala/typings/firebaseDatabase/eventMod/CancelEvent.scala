package typings.firebaseDatabase.eventMod

import typings.firebaseDatabase.eventRegistrationMod.EventRegistration
import typings.firebaseDatabase.pathMod.Path
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/database/dist/src/core/view/Event", "CancelEvent")
@js.native
class CancelEvent protected () extends Event {
  /**
    * @param {EventRegistration} eventRegistration
    * @param {Error} error
    * @param {!Path} path
    */
  def this(eventRegistration: EventRegistration, error: Error, path: Path) = this()
  var error: Error = js.native
  var eventRegistration: EventRegistration = js.native
  var path: Path = js.native
}

