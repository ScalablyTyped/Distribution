package typings.atFirebaseDatabase.distSrcCoreViewEventMod

import typings.atFirebaseDatabase.distSrcCoreUtilPathMod.Path
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Event extends js.Object {
  /**
    * @return {!function()}
    */
  def getEventRunner(): js.Function0[Unit]
  /**
    * @return {!string}
    */
  def getEventType(): String
  /**
    * @return {!Path}
    */
  def getPath(): Path
}

object Event {
  @scala.inline
  def apply(
    getEventRunner: () => js.Function0[Unit],
    getEventType: () => String,
    getPath: () => Path,
    toString: () => String
  ): Event = {
    val __obj = js.Dynamic.literal(getEventRunner = js.Any.fromFunction0(getEventRunner), getEventType = js.Any.fromFunction0(getEventType), getPath = js.Any.fromFunction0(getPath), toString = js.Any.fromFunction0(toString))
  
    __obj.asInstanceOf[Event]
  }
}

