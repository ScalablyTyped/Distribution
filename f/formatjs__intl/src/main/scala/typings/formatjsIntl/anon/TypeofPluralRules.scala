package typings.formatjsIntl.anon

import typings.std.Intl.PluralRules
import typings.std.Intl.PluralRulesOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofPluralRules extends StObject {
  
  def apply(): PluralRules = js.native
  def apply(locales: String): PluralRules = js.native
  def apply(locales: String, options: PluralRulesOptions): PluralRules = js.native
  def apply(locales: js.Array[String]): PluralRules = js.native
  def apply(locales: js.Array[String], options: PluralRulesOptions): PluralRules = js.native
  def apply(locales: Unit, options: PluralRulesOptions): PluralRules = js.native
  
  def supportedLocalesOf(locales: String): js.Array[String] = js.native
  def supportedLocalesOf(locales: String, options: PluralRulesOptions): js.Array[String] = js.native
  def supportedLocalesOf(locales: js.Array[String]): js.Array[String] = js.native
  def supportedLocalesOf(locales: js.Array[String], options: PluralRulesOptions): js.Array[String] = js.native
}
