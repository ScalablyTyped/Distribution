package typings.expo.expoMod

import typings.expo.expoMod.DocumentPickerNs.Options
import typings.expo.expoMod.DocumentPickerNs.Response
import typings.expo.expoStrings.cancel
import typings.expo.expoStrings.success
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("expo", "DocumentPicker")
@js.native
object DocumentPickerNs extends js.Object {
  trait Options extends js.Object {
    var `type`: js.UndefOr[String] = js.undefined
  }
  
  trait Response extends js.Object {
    var name: js.UndefOr[String] = js.undefined
    var size: js.UndefOr[Double] = js.undefined
    var `type`: js.UndefOr[cancel | success] = js.undefined
    var uri: js.UndefOr[String] = js.undefined
  }
  
  def getDocumentAsync(): js.Promise[Response] = js.native
  def getDocumentAsync(options: Options): js.Promise[Response] = js.native
}

