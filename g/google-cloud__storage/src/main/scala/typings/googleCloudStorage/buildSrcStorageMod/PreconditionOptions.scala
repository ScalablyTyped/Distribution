package typings.googleCloudStorage.buildSrcStorageMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PreconditionOptions extends StObject {
  
  var ifGenerationMatch: js.UndefOr[Double] = js.undefined
  
  var ifGenerationNotMatch: js.UndefOr[Double] = js.undefined
  
  var ifMetagenerationMatch: js.UndefOr[Double] = js.undefined
  
  var ifMetagenerationNotMatch: js.UndefOr[Double] = js.undefined
}
object PreconditionOptions {
  
  inline def apply(): PreconditionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PreconditionOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PreconditionOptions] (val x: Self) extends AnyVal {
    
    inline def setIfGenerationMatch(value: Double): Self = StObject.set(x, "ifGenerationMatch", value.asInstanceOf[js.Any])
    
    inline def setIfGenerationMatchUndefined: Self = StObject.set(x, "ifGenerationMatch", js.undefined)
    
    inline def setIfGenerationNotMatch(value: Double): Self = StObject.set(x, "ifGenerationNotMatch", value.asInstanceOf[js.Any])
    
    inline def setIfGenerationNotMatchUndefined: Self = StObject.set(x, "ifGenerationNotMatch", js.undefined)
    
    inline def setIfMetagenerationMatch(value: Double): Self = StObject.set(x, "ifMetagenerationMatch", value.asInstanceOf[js.Any])
    
    inline def setIfMetagenerationMatchUndefined: Self = StObject.set(x, "ifMetagenerationMatch", js.undefined)
    
    inline def setIfMetagenerationNotMatch(value: Double): Self = StObject.set(x, "ifMetagenerationNotMatch", value.asInstanceOf[js.Any])
    
    inline def setIfMetagenerationNotMatchUndefined: Self = StObject.set(x, "ifMetagenerationNotMatch", js.undefined)
  }
}
