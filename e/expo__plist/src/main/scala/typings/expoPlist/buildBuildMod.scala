package typings.expoPlist

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildBuildMod {
  
  @JSImport("@expo/plist/build/build", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def build(obj: Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("build")(obj.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def build(obj: Any, opts: StringDictionary[Any]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("build")(obj.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[String]
}
