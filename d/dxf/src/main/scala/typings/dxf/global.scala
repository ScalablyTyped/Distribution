package typings.dxf

import typings.dxf.commonMod.ColorNumbers
import typings.dxf.configMod.Config
import typings.dxf.handlersEntitiesMod.Entity
import typings.dxf.handlersEntitiesMod.LayerGroupedEntities
import typings.dxf.informationMod.FileInfo
import typings.dxf.informationMod.Polyline
import typings.dxf.informationMod.SVG
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object dxf {
    
    @JSGlobal("dxf")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("dxf.Helper")
    @js.native
    open class Helper protected ()
      extends typings.dxf.mod.Helper {
      def this(contents: String) = this()
    }
    
    @JSGlobal("dxf.colors")
    @js.native
    val colors: ColorNumbers = js.native
    
    @JSGlobal("dxf.config")
    @js.native
    val config: Config = js.native
    
    inline def denormalise(parsed: FileInfo): js.Array[Entity] = ^.asInstanceOf[js.Dynamic].applyDynamic("denormalise")(parsed.asInstanceOf[js.Any]).asInstanceOf[js.Array[Entity]]
    
    inline def groupEntitiesByLayer(entities: js.Array[Entity]): LayerGroupedEntities = ^.asInstanceOf[js.Dynamic].applyDynamic("groupEntitiesByLayer")(entities.asInstanceOf[js.Any]).asInstanceOf[LayerGroupedEntities]
    
    inline def parseString(string: String): FileInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("parseString")(string.asInstanceOf[js.Any]).asInstanceOf[FileInfo]
    
    inline def toPolylines(parsed: FileInfo): js.Array[Polyline] = ^.asInstanceOf[js.Dynamic].applyDynamic("toPolylines")(parsed.asInstanceOf[js.Any]).asInstanceOf[js.Array[Polyline]]
    
    inline def toSVG(parsed: FileInfo): SVG = ^.asInstanceOf[js.Dynamic].applyDynamic("toSVG")(parsed.asInstanceOf[js.Any]).asInstanceOf[SVG]
  }
}
