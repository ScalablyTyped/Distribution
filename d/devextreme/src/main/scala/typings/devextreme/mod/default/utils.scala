package typings.devextreme.mod.default

import typings.devextreme.anon.AllowPan
import typings.devextreme.mod.DevExpress.dxSchedulerTimeZone
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utils {
  
  @JSImport("devextreme", "default.utils")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def cancelAnimationFrame(requestID: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("cancelAnimationFrame")(requestID.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def getTimeZones(): js.Array[dxSchedulerTimeZone] = ^.asInstanceOf[js.Dynamic].applyDynamic("getTimeZones")().asInstanceOf[js.Array[dxSchedulerTimeZone]]
  @scala.inline
  def getTimeZones(date: Date): js.Array[dxSchedulerTimeZone] = ^.asInstanceOf[js.Dynamic].applyDynamic("getTimeZones")(date.asInstanceOf[js.Any]).asInstanceOf[js.Array[dxSchedulerTimeZone]]
  
  @scala.inline
  def initMobileViewport(options: AllowPan): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("initMobileViewport")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def requestAnimationFrame(callback: js.Function): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("requestAnimationFrame")(callback.asInstanceOf[js.Any]).asInstanceOf[Double]
}
