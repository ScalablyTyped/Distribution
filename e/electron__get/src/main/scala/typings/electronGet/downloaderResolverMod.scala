package typings.electronGet

import typings.electronGet.downloaderMod.Downloader
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@electron/get/dist/cjs/downloader-resolver", JSImport.Namespace)
@js.native
object downloaderResolverMod extends js.Object {
  
  def getDownloaderForSystem(): js.Promise[Downloader[_]] = js.native
}
