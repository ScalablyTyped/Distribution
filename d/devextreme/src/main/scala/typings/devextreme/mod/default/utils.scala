package typings.devextreme.mod.default

import typings.devextreme.anon.AllowPan
import typings.devextreme.mod.DevExpress.dxSchedulerTimeZone
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("devextreme", "utils")
@js.native
object utils extends js.Object {
  
  def cancelAnimationFrame(requestID: Double): Unit = js.native
  
  def getTimeZones(): js.Array[dxSchedulerTimeZone] = js.native
  def getTimeZones(date: Date): js.Array[dxSchedulerTimeZone] = js.native
  
  def initMobileViewport(options: AllowPan): Unit = js.native
  
  def requestAnimationFrame(callback: js.Function): Double = js.native
}
