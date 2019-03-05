package typings
package expoLib.expoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("expo", "Localization")
@js.native
object LocalizationNs extends js.Object {
  trait LocalizationData extends js.Object {
    var country: js.UndefOr[java.lang.String] = js.undefined
    var isRTL: scala.Boolean
    var isoCurrencyCodes: js.UndefOr[js.Array[java.lang.String]] = js.undefined
    var locale: java.lang.String
    var locales: js.Array[java.lang.String]
    var timezone: java.lang.String
  }
  
  val country: js.UndefOr[java.lang.String] = js.native
  val isRTL: scala.Boolean = js.native
  val isoCurrencyCodes: js.UndefOr[js.Array[java.lang.String]] = js.native
  val locale: java.lang.String = js.native
  val locales: js.Array[java.lang.String] = js.native
  val timezone: java.lang.String = js.native
  def getLocalizationAsync(): js.Promise[LocalizationData] = js.native
}

