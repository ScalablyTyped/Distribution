package typings.geopattern

import typings.geopattern.mod.Pattern
import typings.geopattern.mod.PatternOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object GeoPattern {
    
    @JSGlobal("GeoPattern")
    @js.native
    val ^ : js.Any = js.native
    
    inline def generate(): Pattern = ^.asInstanceOf[js.Dynamic].applyDynamic("generate")().asInstanceOf[Pattern]
    inline def generate(string: String): Pattern = ^.asInstanceOf[js.Dynamic].applyDynamic("generate")(string.asInstanceOf[js.Any]).asInstanceOf[Pattern]
    inline def generate(string: String, options: PatternOptions): Pattern = (^.asInstanceOf[js.Dynamic].applyDynamic("generate")(string.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Pattern]
    inline def generate(string: Unit, options: PatternOptions): Pattern = (^.asInstanceOf[js.Dynamic].applyDynamic("generate")(string.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Pattern]
  }
}
