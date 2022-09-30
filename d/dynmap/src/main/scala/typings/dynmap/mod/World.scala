package typings.dynmap.mod

import typings.dynmap.mod.global.JQuery
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("dynmap", "World")
@js.native
open class World () extends StObject {
  
  var center: Location[String | World | Null, Double, Double, Double] = js.native
  
  var defaultmap: WorldMap = js.native
  
  var element: js.UndefOr[JQuery] = js.native
  
  var extrazoomout: String = js.native
  
  var lastcenter: js.UndefOr[Location[String | World | Null, Double, Double, Double]] = js.native
  
  var maps: Record[String, js.UndefOr[WorldMap]] = js.native
  
  var name: String = js.native
  
  var `protected`: Boolean = js.native
  
  var title: String = js.native
  
  var worldheight: Double = js.native
}
