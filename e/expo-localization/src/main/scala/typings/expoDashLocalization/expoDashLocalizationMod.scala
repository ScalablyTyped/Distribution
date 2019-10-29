package typings.expoDashLocalization

import typings.expoDashLocalization.buildLocalizationDotTypesMod.Localization
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("expo-localization", JSImport.Namespace)
@js.native
object expoDashLocalizationMod extends js.Object {
  val isRTL: js.Any = js.native
  val isoCurrencyCodes: js.Any = js.native
  val locale: String = js.native
  val locales: js.Any = js.native
  val region: js.Any = js.native
  val timezone: js.Any = js.native
  def getLocalizationAsync(): js.Promise[Localization] = js.native
}

