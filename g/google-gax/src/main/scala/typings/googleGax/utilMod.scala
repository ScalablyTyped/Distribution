package typings.googleGax

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilMod {
  
  @JSImport("google-gax/build/src/util", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def camelToSnakeCase(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("camelToSnakeCase")(str.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def toCamelCase(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toCamelCase")(str.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def toLowerCamelCase(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toLowerCamelCase")(str.asInstanceOf[js.Any]).asInstanceOf[String]
}
