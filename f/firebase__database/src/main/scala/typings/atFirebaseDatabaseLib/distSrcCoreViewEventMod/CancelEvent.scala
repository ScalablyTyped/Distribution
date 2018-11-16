package typings
package atFirebaseDatabaseLib.distSrcCoreViewEventMod

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
  def this(eventRegistration: atFirebaseDatabaseLib.distSrcCoreViewEventRegistrationMod.EventRegistration, error: stdLib.Error, path: atFirebaseDatabaseLib.distSrcCoreUtilPathMod.Path) = this()
  var error: stdLib.Error = js.native
  var eventRegistration: atFirebaseDatabaseLib.distSrcCoreViewEventRegistrationMod.EventRegistration = js.native
  var path: atFirebaseDatabaseLib.distSrcCoreUtilPathMod.Path = js.native
  /**
       * @return {!function()}
       */
  /* CompleteClass */
  override def getEventRunner(): js.Function0[scala.Unit] = js.native
  /**
       * @return {!string}
       */
  /* CompleteClass */
  override def getEventType(): java.lang.String = js.native
  /**
       * @return {!Path}
       */
  /* CompleteClass */
  override def getPath(): atFirebaseDatabaseLib.distSrcCoreUtilPathMod.Path = js.native
}

