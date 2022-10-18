package typings.googleGax

import typings.googleGax.googleGaxBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcFeatureDetectionMod {
  
  @JSImport("google-gax/build/src/featureDetection", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def hasAbortController(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasAbortController")().asInstanceOf[Boolean]
  
  inline def hasTextDecoder(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasTextDecoder")().asInstanceOf[Boolean]
  
  inline def hasTextEncoder(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasTextEncoder")().asInstanceOf[Boolean]
  
  inline def hasWindowFetch(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasWindowFetch")().asInstanceOf[Boolean]
  
  inline def isNodeJS(): String | `false` = ^.asInstanceOf[js.Dynamic].applyDynamic("isNodeJS")().asInstanceOf[String | `false`]
}
