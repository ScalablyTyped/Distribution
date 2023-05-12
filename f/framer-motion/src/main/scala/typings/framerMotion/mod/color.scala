package typings.framerMotion.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object color {
  
  @JSImport("framer-motion", "color")
  @js.native
  val ^ : js.Any = js.native
  
  inline def parse(v: Any): RGBA | HSLA = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(v.asInstanceOf[js.Any]).asInstanceOf[RGBA | HSLA]
  
  inline def test(v: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("test")(v.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def transform(v: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("transform")(v.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def transform(v: HSLA): String = ^.asInstanceOf[js.Dynamic].applyDynamic("transform")(v.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def transform(v: RGBA): String = ^.asInstanceOf[js.Dynamic].applyDynamic("transform")(v.asInstanceOf[js.Any]).asInstanceOf[String]
}
