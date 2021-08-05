package typings.emberString

import typings.emberTemplate.handlebarsMod.SafeString
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
  
  inline def htmlSafe(str: String): SafeString = ^.asInstanceOf[js.Dynamic].applyDynamic("htmlSafe")(str.asInstanceOf[js.Any]).asInstanceOf[SafeString]
  
  inline def isHTMLSafe(str: js.Any): /* is @ember/template.@ember/template/-private/handlebars.SafeString */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isHTMLSafe")(str.asInstanceOf[js.Any]).asInstanceOf[/* is @ember/template.@ember/template/-private/handlebars.SafeString */ Boolean]
  
  inline def loc(template: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("loc")(template.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def loc(template: String, args: js.Array[String]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("loc")(template.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def underscore(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("underscore")(str.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def w(str: String): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("w")(str.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
}
