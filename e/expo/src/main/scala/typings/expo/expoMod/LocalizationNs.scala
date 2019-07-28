package typings.expo.expoMod

import typings.expo.expoMod.LocalizationNs.LocalizationData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("expo", "Localization")
@js.native
object LocalizationNs extends js.Object {
  trait LocalizationData extends js.Object {
    var country: js.UndefOr[String] = js.undefined
    var isRTL: Boolean
    var isoCurrencyCodes: js.UndefOr[js.Array[String]] = js.undefined
    var locale: String
    var locales: js.Array[String]
    var timezone: String
  }
  
  val country: js.UndefOr[String] = js.native
  val isRTL: Boolean = js.native
  val isoCurrencyCodes: js.UndefOr[js.Array[String]] = js.native
  val locale: String = js.native
  val locales: js.Array[String] = js.native
  val timezone: String = js.native
  def getLocalizationAsync(): js.Promise[LocalizationData] = js.native
}

