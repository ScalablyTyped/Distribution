package typings.googleVisualization.global.google

import typings.googleVisualization.global.google.^
import typings.googleVisualization.google.LoadOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


/** Legacy https://developers.google.com/chart/interactive/docs/basic_load_libs#updateloader */
inline def load_visualization(
  visualization: typings.googleVisualization.googleVisualizationStrings.visualization,
  version: String,
  options: LoadOptions
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(visualization.asInstanceOf[js.Any], version.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def load_visualization(
  visualization: typings.googleVisualization.googleVisualizationStrings.visualization,
  version: Double,
  options: LoadOptions
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(visualization.asInstanceOf[js.Any], version.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def setOnLoadCallback(handler: js.Function): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setOnLoadCallback")(handler.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def setOnLoadCallback(handler: js.Function0[Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setOnLoadCallback")(handler.asInstanceOf[js.Any]).asInstanceOf[Unit]
