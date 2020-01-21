package typings.googleTranslateApi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("google-translate-api", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(text: String): js.Promise[TranslateResult] = js.native
  def apply(text: String, options: TranslateOption): js.Promise[TranslateResult] = js.native
}

