package typings.googleVisualization.global.google

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// https://developers.google.com/chart/interactive/docs/basic_load_libs
object charts {
  
  @JSGlobal("google.charts")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def load(version: String, packages: js.Object): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(version.asInstanceOf[js.Any], packages.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def load(version: String, packages: js.Object, mapsApiKey: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(version.asInstanceOf[js.Any], packages.asInstanceOf[js.Any], mapsApiKey.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def load(version: Double, packages: js.Object): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(version.asInstanceOf[js.Any], packages.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def load(version: Double, packages: js.Object, mapsApiKey: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(version.asInstanceOf[js.Any], packages.asInstanceOf[js.Any], mapsApiKey.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  @scala.inline
  def setOnLoadCallback(handler: js.Function): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setOnLoadCallback")(handler.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
