package typings.geakstrSassInlineSvg

import typings.geakstrSassInlineSvg.anon.EncodingFormat
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(svgPath: String): js.Function2[/* path */ String, /* selectors */ String, String] = ^.asInstanceOf[js.Dynamic].apply(svgPath.asInstanceOf[js.Any]).asInstanceOf[js.Function2[/* path */ String, /* selectors */ String, String]]
  inline def apply(svgPath: String, options: EncodingFormat): js.Function2[/* path */ String, /* selectors */ String, String] = (^.asInstanceOf[js.Dynamic].apply(svgPath.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function2[/* path */ String, /* selectors */ String, String]]
  
  @JSImport("@geakstr/sass-inline-svg", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
