package typings.extjs.Ext

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IXTemplate
  extends StObject
     with ITemplate {
  
  /** [Method] Appends the result of this template to the provided output array
    * @param values Object
    * @param out Object
    * @param parent Object
    * @returns Array The given out array.
    */
  @JSName("applyOut")
  var applyOut_IXTemplate: js.UndefOr[
    js.Function3[
      /* values */ js.UndefOr[Any], 
      /* out */ js.UndefOr[Any], 
      /* parent */ js.UndefOr[Any], 
      Array
    ]
  ] = js.undefined
  
  /** [Config Option] (String/Array) */
  var definitions: js.UndefOr[Any] = js.undefined
}
object IXTemplate {
  
  inline def apply(): IXTemplate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IXTemplate]
  }
  
  extension [Self <: IXTemplate](x: Self) {
    
    inline def setApplyOut(
      value: (/* values */ js.UndefOr[Any], /* out */ js.UndefOr[Any], /* parent */ js.UndefOr[Any]) => Array
    ): Self = StObject.set(x, "applyOut", js.Any.fromFunction3(value))
    
    inline def setApplyOutUndefined: Self = StObject.set(x, "applyOut", js.undefined)
    
    inline def setDefinitions(value: Any): Self = StObject.set(x, "definitions", value.asInstanceOf[js.Any])
    
    inline def setDefinitionsUndefined: Self = StObject.set(x, "definitions", js.undefined)
  }
}
