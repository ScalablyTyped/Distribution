package typings.googleVisualization.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object google {
  
  @scala.inline
  def load(visualization: java.lang.String, version: java.lang.String, packages: js.Any): scala.Unit = (typings.googleVisualization.global.google.^.asInstanceOf[js.Dynamic].applyDynamic("load")(visualization.asInstanceOf[js.Any], version.asInstanceOf[js.Any], packages.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def setOnLoadCallback(handler: js.Function): scala.Unit = typings.googleVisualization.global.google.^.asInstanceOf[js.Dynamic].applyDynamic("setOnLoadCallback")(handler.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  @scala.inline
  def setOnLoadCallback(handler: js.Function0[scala.Unit]): scala.Unit = typings.googleVisualization.global.google.^.asInstanceOf[js.Dynamic].applyDynamic("setOnLoadCallback")(handler.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
}
