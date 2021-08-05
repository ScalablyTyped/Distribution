package typings.electronGet

import typings.electronGet.esmDownloaderMod.Downloader
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esmDownloaderResolverMod {
  
  @JSImport("@electron/get/dist/esm/downloader-resolver", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getDownloaderForSystem(): js.Promise[Downloader[js.Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getDownloaderForSystem")().asInstanceOf[js.Promise[Downloader[js.Any]]]
}
