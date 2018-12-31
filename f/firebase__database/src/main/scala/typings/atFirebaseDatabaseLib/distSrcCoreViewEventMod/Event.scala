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

