package typings.figma.mod.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


// Global variable with Figma's plugin API.
inline def figma: typings.figma.mod.global.PluginAPI = js.Dynamic.global.selectDynamic("figma").asInstanceOf[typings.figma.mod.global.PluginAPI]

inline def html: java.lang.String = js.Dynamic.global.selectDynamic("__html__").asInstanceOf[java.lang.String]

type MessageEventHandler = js.Function2[
/* pluginMessage */ js.Any, 
/* props */ typings.figma.mod.global.OnMessageProperties, 
scala.Unit]

////////////////////////////////////////////////////////////////////////////////
// Datatypes
type Transform = js.Tuple2[
js.Tuple3[scala.Double, scala.Double, scala.Double], 
js.Tuple3[scala.Double, scala.Double, scala.Double]]

type VectorPaths = js.Array[typings.figma.mod.global.VectorPath]
