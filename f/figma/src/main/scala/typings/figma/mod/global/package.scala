package typings.figma.mod.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


// Global variable with Figma's plugin API.
inline def figma: PluginAPI = js.Dynamic.global.selectDynamic("figma").asInstanceOf[PluginAPI]

inline def html: String = js.Dynamic.global.selectDynamic("__html__").asInstanceOf[String]

type MessageEventHandler = js.Function2[/* pluginMessage */ Any, /* props */ OnMessageProperties, Unit]

////////////////////////////////////////////////////////////////////////////////
// Datatypes
type Transform = js.Tuple2[js.Tuple3[Double, Double, Double], js.Tuple3[Double, Double, Double]]

type VectorPaths = js.Array[VectorPath]
