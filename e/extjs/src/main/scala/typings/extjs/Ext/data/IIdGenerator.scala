package typings.extjs.Ext.data

import typings.extjs.Ext.IBase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IIdGenerator
  extends StObject
     with IBase {
  
  /** [Method] Generates and returns the next id
    * @returns String The next id.
    */
  var generate: js.UndefOr[js.Function0[String]] = js.undefined
  
  /** [Config Option] (String) */
  var id: js.UndefOr[String] = js.undefined
  
  /** [Property] (Boolean) */
  var isGenerator: js.UndefOr[Boolean] = js.undefined
}
object IIdGenerator {
  
  inline def apply(): IIdGenerator = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IIdGenerator]
  }
  
  extension [Self <: IIdGenerator](x: Self) {
    
    inline def setGenerate(value: () => String): Self = StObject.set(x, "generate", js.Any.fromFunction0(value))
    
    inline def setGenerateUndefined: Self = StObject.set(x, "generate", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setIsGenerator(value: Boolean): Self = StObject.set(x, "isGenerator", value.asInstanceOf[js.Any])
    
    inline def setIsGeneratorUndefined: Self = StObject.set(x, "isGenerator", js.undefined)
  }
}
