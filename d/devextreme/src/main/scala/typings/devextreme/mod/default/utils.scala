package typings.devextreme.mod.default

import typings.devextreme.anon.AllowPan
import typings.devextreme.mod.DevExpress.dxSchedulerTimeZone
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utils {
  
  @JSImport("devextreme", "default.utils.cancelAnimationFrame")
  @js.native
  def cancelAnimationFrame(requestID: Double): Unit = js.native
  
  @JSImport("devextreme", "default.utils.getTimeZones")
  @js.native
  def getTimeZones(): js.Array[dxSchedulerTimeZone] = js.native
  @JSImport("devextreme", "default.utils.getTimeZones")
  @js.native
  def getTimeZones(date: Date): js.Array[dxSchedulerTimeZone] = js.native
  
  @JSImport("devextreme", "default.utils.initMobileViewport")
  @js.native
  def initMobileViewport(options: AllowPan): Unit = js.native
  
  @JSImport("devextreme", "default.utils.requestAnimationFrame")
  @js.native
  def requestAnimationFrame(callback: js.Function): Double = js.native
}
