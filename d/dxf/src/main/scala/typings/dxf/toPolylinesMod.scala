package typings.dxf

import typings.dxf.informationMod.FileInfo
import typings.dxf.informationMod.Polyline
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object toPolylinesMod {
  
  @JSImport("dxf/toPolylines", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(parsed: FileInfo): js.Array[Polyline] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(parsed.asInstanceOf[js.Any]).asInstanceOf[js.Array[Polyline]]
}
