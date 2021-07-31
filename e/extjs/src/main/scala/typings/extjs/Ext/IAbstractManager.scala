package typings.extjs.Ext

import typings.extjs.Ext.util.IHashMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IAbstractManager
  extends StObject
     with IBase {
  
  /** [Property] (Ext.util.HashMap) */
  var all: js.UndefOr[IHashMap] = js.undefined
  
  /** [Method] Creates and returns an instance of whatever this manager manages based on the supplied type and config object
    * @param config Object The config object
    * @param defaultType String If no type is discovered in the config object, we fall back to this type
    * @returns Object The instance of whatever this manager is managing
    */
  var create: js.UndefOr[
    js.Function2[
      /* config */ js.UndefOr[js.Any], 
      /* defaultType */ js.UndefOr[java.lang.String], 
      js.Any
    ]
  ] = js.undefined
  
  /** [Method] Executes the specified function once for each item in the collection
    * @param fn Function The function to execute.
    * @param scope Object The scope to execute in. Defaults to this.
    */
  var each: js.UndefOr[js.Function2[/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], Unit]] = js.undefined
  
  /** [Method] Returns an item by id
    * @param id String The id of the item
    * @returns Object The item, undefined if not found.
    */
  var get: js.UndefOr[js.Function1[/* id */ js.UndefOr[java.lang.String], js.Any]] = js.undefined
  
  /** [Method] Gets the number of items in the collection
    * @returns Number The number of items in the collection.
    */
  var getCount: js.UndefOr[js.Function0[Double]] = js.undefined
  
  /** [Method] Checks if an item type is registered
    * @param type String The mnemonic string by which the class may be looked up
    * @returns Boolean Whether the type is registered.
    */
  var isRegistered: js.UndefOr[js.Function1[/* type */ js.UndefOr[java.lang.String], Boolean]] = js.undefined
  
  /** [Method] Registers a function that will be called when an item with the specified id is added to the manager
    * @param id String The item id
    * @param fn Function The callback function. Called with a single parameter, the item.
    * @param scope Object The scope (this reference) in which the callback is executed. Defaults to the item.
    */
  var onAvailable: js.UndefOr[
    js.Function3[
      /* id */ js.UndefOr[java.lang.String], 
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      Unit
    ]
  ] = js.undefined
  
  /** [Method] Registers an item to be managed
    * @param item Object The item to register
    */
  var register: js.UndefOr[js.Function1[/* item */ js.UndefOr[js.Any], Unit]] = js.undefined
  
  /** [Method] Registers a new item constructor keyed by a type key
    * @param type String The mnemonic string by which the class may be looked up.
    * @param cls Function The new instance class.
    */
  var registerType: js.UndefOr[
    js.Function2[/* type */ js.UndefOr[java.lang.String], /* cls */ js.UndefOr[js.Any], Unit]
  ] = js.undefined
  
  /** [Method] Unregisters an item by removing it from this manager
    * @param item Object The item to unregister
    */
  var unregister: js.UndefOr[js.Function1[/* item */ js.UndefOr[js.Any], Unit]] = js.undefined
}
object IAbstractManager {
  
  @scala.inline
  def apply(): IAbstractManager = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IAbstractManager]
  }
  
  @scala.inline
  implicit class IAbstractManagerMutableBuilder[Self <: IAbstractManager] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAll(value: IHashMap): Self = StObject.set(x, "all", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllUndefined: Self = StObject.set(x, "all", js.undefined)
    
    @scala.inline
    def setCreate(value: (/* config */ js.UndefOr[js.Any], /* defaultType */ js.UndefOr[java.lang.String]) => js.Any): Self = StObject.set(x, "create", js.Any.fromFunction2(value))
    
    @scala.inline
    def setCreateUndefined: Self = StObject.set(x, "create", js.undefined)
    
    @scala.inline
    def setEach(value: (/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit): Self = StObject.set(x, "each", js.Any.fromFunction2(value))
    
    @scala.inline
    def setEachUndefined: Self = StObject.set(x, "each", js.undefined)
    
    @scala.inline
    def setGet(value: /* id */ js.UndefOr[java.lang.String] => js.Any): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetCount(value: () => Double): Self = StObject.set(x, "getCount", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetCountUndefined: Self = StObject.set(x, "getCount", js.undefined)
    
    @scala.inline
    def setGetUndefined: Self = StObject.set(x, "get", js.undefined)
    
    @scala.inline
    def setIsRegistered(value: /* type */ js.UndefOr[java.lang.String] => Boolean): Self = StObject.set(x, "isRegistered", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIsRegisteredUndefined: Self = StObject.set(x, "isRegistered", js.undefined)
    
    @scala.inline
    def setOnAvailable(
      value: (/* id */ js.UndefOr[java.lang.String], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit
    ): Self = StObject.set(x, "onAvailable", js.Any.fromFunction3(value))
    
    @scala.inline
    def setOnAvailableUndefined: Self = StObject.set(x, "onAvailable", js.undefined)
    
    @scala.inline
    def setRegister(value: /* item */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "register", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRegisterType(value: (/* type */ js.UndefOr[java.lang.String], /* cls */ js.UndefOr[js.Any]) => Unit): Self = StObject.set(x, "registerType", js.Any.fromFunction2(value))
    
    @scala.inline
    def setRegisterTypeUndefined: Self = StObject.set(x, "registerType", js.undefined)
    
    @scala.inline
    def setRegisterUndefined: Self = StObject.set(x, "register", js.undefined)
    
    @scala.inline
    def setUnregister(value: /* item */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "unregister", js.Any.fromFunction1(value))
    
    @scala.inline
    def setUnregisterUndefined: Self = StObject.set(x, "unregister", js.undefined)
  }
}
