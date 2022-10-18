package typings.fastGlob

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object outManagersPatternsMod {
  
  @JSImport("fast-glob/out/managers/patterns", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def removeDuplicateSlashes(pattern: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("removeDuplicateSlashes")(pattern.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def transform(patterns: js.Array[String]): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("transform")(patterns.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
}
