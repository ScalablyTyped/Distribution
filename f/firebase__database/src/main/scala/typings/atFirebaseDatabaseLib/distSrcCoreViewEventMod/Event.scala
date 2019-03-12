package typings
package atFirebaseDatabaseLib.distSrcCoreViewEventMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Event extends js.Object {
  /**
    * @return {!function()}
    */
  def getEventRunner(): js.Function0[scala.Unit]
  /**
    * @return {!string}
    */
  def getEventType(): java.lang.String
  /**
    * @return {!Path}
    */
  def getPath(): atFirebaseDatabaseLib.distSrcCoreUtilPathMod.Path
}

object Event {
  @scala.inline
  def apply(
    getEventRunner: () => js.Function0[scala.Unit],
    getEventType: () => java.lang.String,
    getPath: () => atFirebaseDatabaseLib.distSrcCoreUtilPathMod.Path,
    toString: () => java.lang.String
  ): Event = {
    val __obj = js.Dynamic.literal(getEventRunner = js.Any.fromFunction0(getEventRunner), getEventType = js.Any.fromFunction0(getEventType), getPath = js.Any.fromFunction0(getPath), toString = js.Any.fromFunction0(toString))
  
    __obj.asInstanceOf[Event]
  }
}

