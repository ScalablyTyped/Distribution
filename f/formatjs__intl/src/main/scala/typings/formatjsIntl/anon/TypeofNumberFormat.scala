package typings.formatjsIntl.anon

import typings.std.Intl.NumberFormat
import typings.std.Intl.NumberFormatOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofNumberFormat extends StObject {
  
  def apply(): NumberFormat = js.native
  def apply(locales: String): NumberFormat = js.native
  def apply(locales: String, options: NumberFormatOptions): NumberFormat = js.native
  def apply(locales: js.Array[String]): NumberFormat = js.native
  def apply(locales: js.Array[String], options: NumberFormatOptions): NumberFormat = js.native
  def apply(locales: Unit, options: NumberFormatOptions): NumberFormat = js.native
  
  def supportedLocalesOf(locales: String): js.Array[String] = js.native
  def supportedLocalesOf(locales: String, options: NumberFormatOptions): js.Array[String] = js.native
  def supportedLocalesOf(locales: js.Array[String]): js.Array[String] = js.native
  def supportedLocalesOf(locales: js.Array[String], options: NumberFormatOptions): js.Array[String] = js.native
}
