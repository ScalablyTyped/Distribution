package typings.embroiderSharedInternals

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcPathsMod {
  
  @JSImport("@embroider/shared-internals/src/paths", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def explicitRelative(fromDir: String, toFile: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("explicitRelative")(fromDir.asInstanceOf[js.Any], toFile.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def extensionsPattern(extensions: js.Array[String]): js.RegExp = ^.asInstanceOf[js.Dynamic].applyDynamic("extensionsPattern")(extensions.asInstanceOf[js.Any]).asInstanceOf[js.RegExp]
}
