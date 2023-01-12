package typings.extjs.Ext

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IQueryable
  extends StObject
     with IBase {
  
  /** [Method] Retrieves the first direct child of this container which matches the passed selector or component
    * @param selector String/Ext.Component An Ext.ComponentQuery selector. If no selector is specified, the first child will be returned.
    * @returns Object Ext.Component The matching child Ext.Component (or null if no match was found).
    */
  var child: js.UndefOr[js.Function1[/* selector */ js.UndefOr[Any], Any]] = js.undefined
  
  /** [Method] Retrieves the first descendant of this container which matches the passed selector
    * @param selector String/Ext.Component An Ext.ComponentQuery selector or Ext.Component. If no selector is specified, the first child will be returned.
    * @returns Object Ext.Component The matching descendant Ext.Component (or null if no match was found).
    */
  var down: js.UndefOr[js.Function1[/* selector */ js.UndefOr[Any], Any]] = js.undefined
  
  /** [Method] Retrieves all descendant components which match the passed selector
    * @param selector String Selector complying to an Ext.ComponentQuery selector. If no selector is specified all items will be returned.
    * @returns Ext.Component[] Components which matched the selector
    */
  var query: js.UndefOr[js.Function1[/* selector */ js.UndefOr[java.lang.String], Array]] = js.undefined
  
  /** [Method] Retrieves all descendant components which match the passed function
    * @param fn Function The matcher function. It will be called with a single argument, the component being tested.
    * @param scope Object The scope in which to run the function. If not specified, it will default to the active component.
    * @returns Ext.Component[] Components matched by the passed function
    */
  var queryBy: js.UndefOr[js.Function2[/* fn */ js.UndefOr[Any], /* scope */ js.UndefOr[Any], Array]] = js.undefined
  
  /** [Method] Finds a component at any level under this container matching the id itemId
    * @param id String The id to find
    * @returns Ext.Component The matching id, null if not found
    */
  var queryById: js.UndefOr[js.Function1[/* id */ js.UndefOr[java.lang.String], IComponent]] = js.undefined
}
object IQueryable {
  
  inline def apply(): IQueryable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IQueryable]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IQueryable] (val x: Self) extends AnyVal {
    
    inline def setChild(value: /* selector */ js.UndefOr[Any] => Any): Self = StObject.set(x, "child", js.Any.fromFunction1(value))
    
    inline def setChildUndefined: Self = StObject.set(x, "child", js.undefined)
    
    inline def setDown(value: /* selector */ js.UndefOr[Any] => Any): Self = StObject.set(x, "down", js.Any.fromFunction1(value))
    
    inline def setDownUndefined: Self = StObject.set(x, "down", js.undefined)
    
    inline def setQuery(value: /* selector */ js.UndefOr[java.lang.String] => Array): Self = StObject.set(x, "query", js.Any.fromFunction1(value))
    
    inline def setQueryBy(value: (/* fn */ js.UndefOr[Any], /* scope */ js.UndefOr[Any]) => Array): Self = StObject.set(x, "queryBy", js.Any.fromFunction2(value))
    
    inline def setQueryById(value: /* id */ js.UndefOr[java.lang.String] => IComponent): Self = StObject.set(x, "queryById", js.Any.fromFunction1(value))
    
    inline def setQueryByIdUndefined: Self = StObject.set(x, "queryById", js.undefined)
    
    inline def setQueryByUndefined: Self = StObject.set(x, "queryBy", js.undefined)
    
    inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
  }
}
