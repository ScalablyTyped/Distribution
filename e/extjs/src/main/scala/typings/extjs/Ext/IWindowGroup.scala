package typings.extjs.Ext

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IWindowGroup
  extends StObject
     with IBase {
  
  /** [Method] Brings the specified Component to the front of any other active Components in this ZIndexManager
    * @param comp String/Object The id of the Component or a Ext.Component instance
    * @returns Boolean True if the dialog was brought to the front, else false if it was already in front
    */
  var bringToFront: js.UndefOr[js.Function1[/* comp */ js.UndefOr[js.Any], Boolean]] = js.undefined
  
  /** [Method] Executes the specified function once for every Component in this ZIndexManager passing each Component as the only pa
    * @param fn Function The function to execute for each item
    * @param scope Object The scope (this reference) in which the function is executed. Defaults to the current Component in the iteration.
    */
  var each: js.UndefOr[js.Function2[/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], Unit]] = js.undefined
  
  /** [Method] Executes the specified function once for every Component in this ZIndexManager passing each Component as the only pa
    * @param fn Function The function to execute for each item
    * @param scope Object The scope (this reference) in which the function is executed. Defaults to the current Component in the iteration.
    */
  var eachBottomUp: js.UndefOr[js.Function2[/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], Unit]] = js.undefined
  
  /** [Method] Executes the specified function once for every Component in this ZIndexManager passing each Component as the only pa
    * @param fn Function The function to execute for each item
    * @param scope Object The scope (this reference) in which the function is executed. Defaults to the current Component in the iteration.
    */
  var eachTopDown: js.UndefOr[js.Function2[/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], Unit]] = js.undefined
  
  /** [Method] Gets a registered Component by id
    * @param id String/Object The id of the Component or a Ext.Component instance
    * @returns Ext.Component
    */
  var get: js.UndefOr[js.Function1[/* id */ js.UndefOr[js.Any], IComponent]] = js.undefined
  
  /** [Method] Gets the currently active Component in this ZIndexManager
    * @returns Ext.Component The active Component
    */
  var getActive: js.UndefOr[js.Function0[IComponent]] = js.undefined
  
  /** [Method] Returns zero or more Components in this ZIndexManager using the custom search function passed to this method
    * @param fn Function The search function
    * @param scope Object The scope (this reference) in which the function is executed. Defaults to the Component being tested. That gets passed to the function if not specified.
    * @returns Array An array of zero or more matching windows
    */
  var getBy: js.UndefOr[js.Function2[/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], Array]] = js.undefined
  
  /** [Method] Hides all Components managed by this ZIndexManager  */
  var hideAll: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /** [Method] Registers a floating Ext Component with this ZIndexManager
    * @param comp Ext.Component The Component to register.
    */
  var register: js.UndefOr[js.Function1[/* comp */ js.UndefOr[IComponent], Unit]] = js.undefined
  
  /** [Method] Sends the specified Component to the back of other active Components in this ZIndexManager
    * @param comp String/Object The id of the Component or a Ext.Component instance
    * @returns Ext.Component The Component
    */
  var sendToBack: js.UndefOr[js.Function1[/* comp */ js.UndefOr[js.Any], IComponent]] = js.undefined
  
  /** [Method] Unregisters a Ext Component from this ZIndexManager
    * @param comp Ext.Component The Component to unregister.
    */
  var unregister: js.UndefOr[js.Function1[/* comp */ js.UndefOr[IComponent], Unit]] = js.undefined
}
object IWindowGroup {
  
  inline def apply(): IWindowGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IWindowGroup]
  }
  
  extension [Self <: IWindowGroup](x: Self) {
    
    inline def setBringToFront(value: /* comp */ js.UndefOr[js.Any] => Boolean): Self = StObject.set(x, "bringToFront", js.Any.fromFunction1(value))
    
    inline def setBringToFrontUndefined: Self = StObject.set(x, "bringToFront", js.undefined)
    
    inline def setEach(value: (/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit): Self = StObject.set(x, "each", js.Any.fromFunction2(value))
    
    inline def setEachBottomUp(value: (/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit): Self = StObject.set(x, "eachBottomUp", js.Any.fromFunction2(value))
    
    inline def setEachBottomUpUndefined: Self = StObject.set(x, "eachBottomUp", js.undefined)
    
    inline def setEachTopDown(value: (/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit): Self = StObject.set(x, "eachTopDown", js.Any.fromFunction2(value))
    
    inline def setEachTopDownUndefined: Self = StObject.set(x, "eachTopDown", js.undefined)
    
    inline def setEachUndefined: Self = StObject.set(x, "each", js.undefined)
    
    inline def setGet(value: /* id */ js.UndefOr[js.Any] => IComponent): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
    
    inline def setGetActive(value: () => IComponent): Self = StObject.set(x, "getActive", js.Any.fromFunction0(value))
    
    inline def setGetActiveUndefined: Self = StObject.set(x, "getActive", js.undefined)
    
    inline def setGetBy(value: (/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Array): Self = StObject.set(x, "getBy", js.Any.fromFunction2(value))
    
    inline def setGetByUndefined: Self = StObject.set(x, "getBy", js.undefined)
    
    inline def setGetUndefined: Self = StObject.set(x, "get", js.undefined)
    
    inline def setHideAll(value: () => Unit): Self = StObject.set(x, "hideAll", js.Any.fromFunction0(value))
    
    inline def setHideAllUndefined: Self = StObject.set(x, "hideAll", js.undefined)
    
    inline def setRegister(value: /* comp */ js.UndefOr[IComponent] => Unit): Self = StObject.set(x, "register", js.Any.fromFunction1(value))
    
    inline def setRegisterUndefined: Self = StObject.set(x, "register", js.undefined)
    
    inline def setSendToBack(value: /* comp */ js.UndefOr[js.Any] => IComponent): Self = StObject.set(x, "sendToBack", js.Any.fromFunction1(value))
    
    inline def setSendToBackUndefined: Self = StObject.set(x, "sendToBack", js.undefined)
    
    inline def setUnregister(value: /* comp */ js.UndefOr[IComponent] => Unit): Self = StObject.set(x, "unregister", js.Any.fromFunction1(value))
    
    inline def setUnregisterUndefined: Self = StObject.set(x, "unregister", js.undefined)
  }
}
