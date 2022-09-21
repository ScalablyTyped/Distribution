package typings.esbuild.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnalyzeMetafileOptions extends StObject {
  
  var color: js.UndefOr[Boolean] = js.undefined
  
  var verbose: js.UndefOr[Boolean] = js.undefined
}
object AnalyzeMetafileOptions {
  
  inline def apply(): AnalyzeMetafileOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnalyzeMetafileOptions]
  }
  
  extension [Self <: AnalyzeMetafileOptions](x: Self) {
    
    inline def setColor(value: Boolean): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setVerbose(value: Boolean): Self = StObject.set(x, "verbose", value.asInstanceOf[js.Any])
    
    inline def setVerboseUndefined: Self = StObject.set(x, "verbose", js.undefined)
  }
}
