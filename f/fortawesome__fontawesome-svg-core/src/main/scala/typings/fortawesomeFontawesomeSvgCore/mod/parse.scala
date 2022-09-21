package typings.fortawesomeFontawesomeSvgCore.mod

import typings.fortawesomeFontawesomeCommonTypes.mod.IconLookup
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object parse {
  
  @JSImport("@fortawesome/fontawesome-svg-core", "parse")
  @js.native
  val ^ : js.Any = js.native
  
  inline def icon(parseIconString: String): IconLookup = ^.asInstanceOf[js.Dynamic].applyDynamic("icon")(parseIconString.asInstanceOf[js.Any]).asInstanceOf[IconLookup]
  
  inline def transform(transformString: String): Transform = ^.asInstanceOf[js.Dynamic].applyDynamic("transform")(transformString.asInstanceOf[js.Any]).asInstanceOf[Transform]
}
