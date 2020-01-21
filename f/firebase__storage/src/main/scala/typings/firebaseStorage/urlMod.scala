package typings.firebaseStorage

import typings.firebaseStorage.requestinfoMod.UrlParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/storage/dist/src/implementation/url", JSImport.Namespace)
@js.native
object urlMod extends js.Object {
  def makeQueryString(params: UrlParams): String = js.native
  def makeUrl(urlPart: String): String = js.native
}

