package typings.elasticsearch.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CatRecoveryParams
  extends StObject
     with GenericParams {
  
  var bytes: js.UndefOr[CatBytes] = js.undefined
  
  var format: String
  
  var h: js.UndefOr[NameList] = js.undefined
  
  var help: js.UndefOr[Boolean] = js.undefined
  
  var masterTimeout: js.UndefOr[TimeSpan] = js.undefined
  
  var v: js.UndefOr[Boolean] = js.undefined
}
object CatRecoveryParams {
  
  inline def apply(format: String): CatRecoveryParams = {
    val __obj = js.Dynamic.literal(format = format.asInstanceOf[js.Any])
    __obj.asInstanceOf[CatRecoveryParams]
  }
  
  extension [Self <: CatRecoveryParams](x: Self) {
    
    inline def setBytes(value: CatBytes): Self = StObject.set(x, "bytes", value.asInstanceOf[js.Any])
    
    inline def setBytesUndefined: Self = StObject.set(x, "bytes", js.undefined)
    
    inline def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setH(value: NameList): Self = StObject.set(x, "h", value.asInstanceOf[js.Any])
    
    inline def setHUndefined: Self = StObject.set(x, "h", js.undefined)
    
    inline def setHVarargs(value: String*): Self = StObject.set(x, "h", js.Array(value :_*))
    
    inline def setHelp(value: Boolean): Self = StObject.set(x, "help", value.asInstanceOf[js.Any])
    
    inline def setHelpUndefined: Self = StObject.set(x, "help", js.undefined)
    
    inline def setMasterTimeout(value: TimeSpan): Self = StObject.set(x, "masterTimeout", value.asInstanceOf[js.Any])
    
    inline def setMasterTimeoutUndefined: Self = StObject.set(x, "masterTimeout", js.undefined)
    
    inline def setV(value: Boolean): Self = StObject.set(x, "v", value.asInstanceOf[js.Any])
    
    inline def setVUndefined: Self = StObject.set(x, "v", js.undefined)
  }
}
