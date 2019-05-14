package typings
package expoLib.expoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("expo", "DocumentPicker")
@js.native
object DocumentPickerNs extends js.Object {
  trait Options extends js.Object {
    var `type`: js.UndefOr[java.lang.String] = js.undefined
  }
  
  trait Response extends js.Object {
    var name: js.UndefOr[java.lang.String] = js.undefined
    var size: js.UndefOr[scala.Double] = js.undefined
    var `type`: js.UndefOr[expoLib.expoLibStrings.cancel | expoLib.expoLibStrings.success] = js.undefined
    var uri: js.UndefOr[java.lang.String] = js.undefined
  }
  
  def getDocumentAsync(): js.Promise[Response] = js.native
  def getDocumentAsync(options: Options): js.Promise[Response] = js.native
}

