package typings.formatThousands

import typings.formatThousands.anon.FormatFourDigits
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(): String = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[String]
  inline def apply(number: String): String = ^.asInstanceOf[js.Dynamic].apply(number.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def apply(number: String, option: String): String = (^.asInstanceOf[js.Dynamic].apply(number.asInstanceOf[js.Any], option.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def apply(number: String, option: FormatFourDigits): String = (^.asInstanceOf[js.Dynamic].apply(number.asInstanceOf[js.Any], option.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def apply(number: Double): String = ^.asInstanceOf[js.Dynamic].apply(number.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def apply(number: Double, option: String): String = (^.asInstanceOf[js.Dynamic].apply(number.asInstanceOf[js.Any], option.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def apply(number: Double, option: FormatFourDigits): String = (^.asInstanceOf[js.Dynamic].apply(number.asInstanceOf[js.Any], option.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def apply(number: Unit, option: String): String = (^.asInstanceOf[js.Dynamic].apply(number.asInstanceOf[js.Any], option.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def apply(number: Unit, option: FormatFourDigits): String = (^.asInstanceOf[js.Dynamic].apply(number.asInstanceOf[js.Any], option.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @JSImport("format-thousands", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
