package typings.expoLocalization

import typings.expoLocalization.localizationTypesMod.Localization
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("expo-localization/build/ExpoLocalization.web", JSImport.Namespace)
@js.native
object expoLocalizationWebMod extends js.Object {
  @js.native
  object default extends js.Object {
    val isRTL: Boolean = js.native
    val isoCurrencyCodes: js.Array[String] = js.native
    val locale: String = js.native
    val locales: js.Array[String] = js.native
    val region: js.UndefOr[String] = js.native
    val timezone: String = js.native
    def getLocalizationAsync(): js.Promise[Localization] = js.native
  }
  
}

