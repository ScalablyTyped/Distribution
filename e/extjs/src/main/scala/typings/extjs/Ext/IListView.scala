package typings.extjs.Ext

import typings.extjs.Ext.data.IStore
import typings.extjs.Ext.panel.ITable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IListView
  extends StObject
     with ITable {
  
  /** [Method] Reconfigures the grid with a new store columns
    * @param store Ext.data.Store The new store.
    * @param columns Object[] An array of column configs
    */
  var reconfigure: js.UndefOr[
    js.Function2[/* store */ js.UndefOr[IStore], /* columns */ js.UndefOr[Array], Unit]
  ] = js.undefined
}
object IListView {
  
  inline def apply(): IListView = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IListView]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IListView] (val x: Self) extends AnyVal {
    
    inline def setReconfigure(value: (/* store */ js.UndefOr[IStore], /* columns */ js.UndefOr[Array]) => Unit): Self = StObject.set(x, "reconfigure", js.Any.fromFunction2(value))
    
    inline def setReconfigureUndefined: Self = StObject.set(x, "reconfigure", js.undefined)
  }
}
