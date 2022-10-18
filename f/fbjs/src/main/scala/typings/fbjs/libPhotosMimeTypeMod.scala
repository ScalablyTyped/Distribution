package typings.fbjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libPhotosMimeTypeMod {
  
  @JSImport("fbjs/lib/PhotosMimeType", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isImage(mimeString: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isImage")(mimeString.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isJpeg(mimeString: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isJpeg")(mimeString.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
