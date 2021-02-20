package typings.googleVisualization.global.google

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// https://developers.google.com/chart/interactive/docs/basic_load_libs
object charts {
  
  @JSGlobal("google.charts.load")
  @js.native
  def load(version: String, packages: js.Object): js.Promise[Unit] = js.native
  @JSGlobal("google.charts.load")
  @js.native
  def load(version: String, packages: js.Object, mapsApiKey: String): js.Promise[Unit] = js.native
  @JSGlobal("google.charts.load")
  @js.native
  def load(version: Double, packages: js.Object): js.Promise[Unit] = js.native
  @JSGlobal("google.charts.load")
  @js.native
  def load(version: Double, packages: js.Object, mapsApiKey: String): js.Promise[Unit] = js.native
  
  @JSGlobal("google.charts.setOnLoadCallback")
  @js.native
  def setOnLoadCallback(handler: js.Function): Unit = js.native
}
