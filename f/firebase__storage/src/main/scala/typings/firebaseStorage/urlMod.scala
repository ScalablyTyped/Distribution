package typings.firebaseStorage

import typings.firebaseStorage.requestinfoMod.UrlParams
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object urlMod {
  
  @JSImport("@firebase/storage/dist/src/implementation/url", "makeQueryString")
  @js.native
  def makeQueryString(params: UrlParams): String = js.native
  
  @JSImport("@firebase/storage/dist/src/implementation/url", "makeUrl")
  @js.native
  def makeUrl(urlPart: String): String = js.native
}
