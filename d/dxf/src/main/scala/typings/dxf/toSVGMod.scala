package typings.dxf

import typings.dxf.informationMod.FileInfo
import typings.dxf.informationMod.SVG
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object toSVGMod {
  
  @JSImport("dxf/toSVG", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(parsed: FileInfo): SVG = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(parsed.asInstanceOf[js.Any]).asInstanceOf[SVG]
}
