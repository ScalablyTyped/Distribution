package typings.devtoolsProtocol.mod.Protocol.Page

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CompilationCacheParams extends StObject {
  
  /**
    * A hint to the backend whether eager compilation is recommended.
    * (the actual compilation mode used is upon backend discretion).
    */
  var eager: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The URL of the script to produce a compilation cache entry for.
    */
  var url: String
}
object CompilationCacheParams {
  
  inline def apply(url: String): CompilationCacheParams = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompilationCacheParams]
  }
  
  extension [Self <: CompilationCacheParams](x: Self) {
    
    inline def setEager(value: Boolean): Self = StObject.set(x, "eager", value.asInstanceOf[js.Any])
    
    inline def setEagerUndefined: Self = StObject.set(x, "eager", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
