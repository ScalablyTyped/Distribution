package typings.glob

import typings.glob.distMjsGlobMod.GlobOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distMjsHasMagicMod {
  
  @JSImport("glob/dist/mjs/has-magic", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def hasMagic(pattern: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasMagic")(pattern.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def hasMagic(pattern: String, options: GlobOptions): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("hasMagic")(pattern.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def hasMagic(pattern: js.Array[String]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasMagic")(pattern.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def hasMagic(pattern: js.Array[String], options: GlobOptions): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("hasMagic")(pattern.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
