package typings.googleVisualization.global.google

import typings.googleVisualization.google.LoadOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// https://developers.google.com/chart/interactive/docs/basic_load_libs
object charts {
  
  @JSGlobal("google.charts")
  @js.native
  val ^ : js.Any = js.native
  
  inline def load(options: LoadOptions): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("load")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  inline def load(version: String, options: LoadOptions): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(version.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def load(version: Double, options: LoadOptions): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(version.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  /** Legacy https://developers.google.com/chart/interactive/docs/basic_load_libs#updateloader */
  inline def load_visualization(
    visualization: typings.googleVisualization.googleVisualizationStrings.visualization,
    version: String,
    options: LoadOptions
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(visualization.asInstanceOf[js.Any], version.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def load_visualization(
    visualization: typings.googleVisualization.googleVisualizationStrings.visualization,
    version: Double,
    options: LoadOptions
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(visualization.asInstanceOf[js.Any], version.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  /** Loads with `safeMode` enabled. */
  inline def safeLoad(options: LoadOptions): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("safeLoad")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  inline def setOnLoadCallback(handler: js.Function): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setOnLoadCallback")(handler.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
