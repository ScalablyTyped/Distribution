package typings.dynmap.mod

import typings.dynmap.anon.Instantiable
import typings.dynmap.dynmapStrings.pinned
import typings.dynmap.mod.global.Array
import typings.std.Record
import typings.std.XMLHttpRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type Component[Data /* <: Record[String | Double | js.Symbol, Any | Null | Array[Any]] */] = Data & Instantiable[Data]

type HexColor = /* template literal string: #${string} */ String

type JQueryErrorHandlerFn = js.Function3[/* status */ Double, /* statusText */ String, /* request */ XMLHttpRequest, Unit]

type JQuerySuccessHandlerFn = js.Function1[/* request */ XMLHttpRequest, Unit]

type SidebarState = Boolean | pinned

type WorldMapConversion = js.Tuple9[Double, Double, Double, Double, Double, Double, Double, Double, Double]
