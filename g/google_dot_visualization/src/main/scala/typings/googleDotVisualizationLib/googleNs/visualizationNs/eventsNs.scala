package typings
package googleDotVisualizationLib.googleNs.visualizationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//#endregion
//#region Events
@JSGlobal("google.visualization.events")
@js.native
object eventsNs extends js.Object {
  def addListener(visualization: js.Any, eventName: java.lang.String, callback: js.Function): js.Any = js.native
  def addListener(
    visualization: js.Any,
    eventName: java.lang.String,
    callback: js.Function1[/* repeated */js.Any, scala.Unit]
  ): js.Any = js.native
  def addOneTimeListener(visualization: js.Any, eventName: java.lang.String, callback: js.Function): js.Any = js.native
  def addOneTimeListener(
    visualization: js.Any,
    eventName: java.lang.String,
    callback: js.Function1[/* repeated */js.Any, scala.Unit]
  ): js.Any = js.native
  def removeAllListeners(visualization: js.Any): scala.Unit = js.native
  def removeListener(listener: js.Any): scala.Unit = js.native
  def trigger(visualization: js.Any, eventName: java.lang.String): scala.Unit = js.native
  def trigger(visualization: js.Any, eventName: java.lang.String, args: js.Any): scala.Unit = js.native
}

