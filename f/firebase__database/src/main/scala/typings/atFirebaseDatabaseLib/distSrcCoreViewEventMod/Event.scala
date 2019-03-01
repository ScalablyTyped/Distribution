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
    getEventRunner: js.Function0[js.Function0[scala.Unit]],
    getEventType: js.Function0[java.lang.String],
    getPath: js.Function0[atFirebaseDatabaseLib.distSrcCoreUtilPathMod.Path],
    toString: js.Function0[java.lang.String]
  ): Event = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getEventRunner")(getEventRunner)
    __obj.updateDynamic("getEventType")(getEventType)
    __obj.updateDynamic("getPath")(getPath)
    __obj.updateDynamic("toString")(toString)
    __obj.asInstanceOf[Event]
  }
}

