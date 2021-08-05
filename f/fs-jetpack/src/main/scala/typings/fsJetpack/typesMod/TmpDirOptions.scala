package typings.fsJetpack.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TmpDirOptions extends StObject {
  
  var basePath: js.UndefOr[String] = js.undefined
  
  var prefix: js.UndefOr[String] = js.undefined
}
object TmpDirOptions {
  
  inline def apply(): TmpDirOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TmpDirOptions]
  }
  
  extension [Self <: TmpDirOptions](x: Self) {
    
    inline def setBasePath(value: String): Self = StObject.set(x, "basePath", value.asInstanceOf[js.Any])
    
    inline def setBasePathUndefined: Self = StObject.set(x, "basePath", js.undefined)
    
    inline def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
    
    inline def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
  }
}
