package typings.emberString

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@ember/string", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def camelize(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("camelize")(str.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def capitalize(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("capitalize")(str.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def classify(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("classify")(str.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def dasherize(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("dasherize")(str.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def decamelize(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("decamelize")(str.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def underscore(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("underscore")(str.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def w(str: String): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("w")(str.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
}
