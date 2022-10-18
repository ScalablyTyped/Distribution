package typings.expoImageUtils

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildDownloadMod {
  
  @JSImport("@expo/image-utils/build/Download", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def downloadImage(url: String): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("downloadImage")(url.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  
  inline def downloadOrUseCachedImage(url: String): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("downloadOrUseCachedImage")(url.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
}
