package typings.expoMetroConfig

import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildTransformerGetCacheKeyMod {
  
  @JSImport("@expo/metro-config/build/transformer/getCacheKey", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@expo/metro-config/build/transformer/getCacheKey", "cacheKeyParts")
  @js.native
  val cacheKeyParts: js.Array[String | Buffer] = js.native
  
  inline def getCacheKey(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getCacheKey")().asInstanceOf[String]
}
