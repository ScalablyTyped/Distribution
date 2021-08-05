package typings.extjs.Ext

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IBase
  extends StObject
     with IClass {
  
  /** [Method] Call the original method that was previously overridden with override Ext define My Cat  constructor functi
    * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callOverridden(arguments)
    * @returns Object Returns the result of calling the overridden method
    */
  var callOverridden: js.UndefOr[js.Function1[/* args */ js.UndefOr[js.Any], js.Any]] = js.undefined
  
  /** [Method] Call the parent method of the current method
    * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callParent(arguments)
    * @returns Object Returns the result of calling the parent method
    */
  var callParent: js.UndefOr[js.Function1[/* args */ js.UndefOr[js.Any], js.Any]] = js.undefined
  
  /** [Method] This method is used by an override to call the superclass method but bypass any overridden method
    * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callSuper(arguments)
    * @returns Object Returns the result of calling the superclass method
    */
  var callSuper: js.UndefOr[js.Function1[/* args */ js.UndefOr[js.Any], js.Any]] = js.undefined
  
  /** [Method] Returns the initial configuration passed to constructor when instantiating this class
    * @param name String Name of the config option to return.
    * @returns Object/Mixed The full config object or a single config value when name parameter specified.
    */
  var getInitialConfig: js.UndefOr[js.Function1[/* name */ js.UndefOr[java.lang.String], js.Any]] = js.undefined
  
  /** [Method] Initialize configuration for this class
    * @param config Object
    * @returns Ext.Base this
    */
  var initConfig: js.UndefOr[js.Function1[/* config */ js.UndefOr[js.Any], this.type]] = js.undefined
  
  /** [Property] (Ext.Class) */
  var self: js.UndefOr[IClass] = js.undefined
}
object IBase {
  
  inline def apply(): IBase = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IBase]
  }
  
  extension [Self <: IBase](x: Self) {
    
    inline def setCallOverridden(value: /* args */ js.UndefOr[js.Any] => js.Any): Self = StObject.set(x, "callOverridden", js.Any.fromFunction1(value))
    
    inline def setCallOverriddenUndefined: Self = StObject.set(x, "callOverridden", js.undefined)
    
    inline def setCallParent(value: /* args */ js.UndefOr[js.Any] => js.Any): Self = StObject.set(x, "callParent", js.Any.fromFunction1(value))
    
    inline def setCallParentUndefined: Self = StObject.set(x, "callParent", js.undefined)
    
    inline def setCallSuper(value: /* args */ js.UndefOr[js.Any] => js.Any): Self = StObject.set(x, "callSuper", js.Any.fromFunction1(value))
    
    inline def setCallSuperUndefined: Self = StObject.set(x, "callSuper", js.undefined)
    
    inline def setGetInitialConfig(value: /* name */ js.UndefOr[java.lang.String] => js.Any): Self = StObject.set(x, "getInitialConfig", js.Any.fromFunction1(value))
    
    inline def setGetInitialConfigUndefined: Self = StObject.set(x, "getInitialConfig", js.undefined)
    
    inline def setInitConfig(value: /* config */ js.UndefOr[js.Any] => IBase): Self = StObject.set(x, "initConfig", js.Any.fromFunction1(value))
    
    inline def setInitConfigUndefined: Self = StObject.set(x, "initConfig", js.undefined)
    
    inline def setSelf(value: IClass): Self = StObject.set(x, "self", value.asInstanceOf[js.Any])
    
    inline def setSelfUndefined: Self = StObject.set(x, "self", js.undefined)
  }
}
