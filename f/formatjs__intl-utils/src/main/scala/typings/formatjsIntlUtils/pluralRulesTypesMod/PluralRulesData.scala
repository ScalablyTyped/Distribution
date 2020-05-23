package typings.formatjsIntlUtils.pluralRulesTypesMod

import typings.formatjsIntlUtils.anon.Cardinal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PluralRulesData extends js.Object {
  var categories: Cardinal = js.native
  def fn(`val`: String): LDMLPluralRule = js.native
  def fn(`val`: String, ord: Boolean): LDMLPluralRule = js.native
  def fn(`val`: Double): LDMLPluralRule = js.native
  def fn(`val`: Double, ord: Boolean): LDMLPluralRule = js.native
}

