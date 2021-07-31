package typings.extjs.Ext.util

import typings.extjs.Ext.IBase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IMemento
  extends StObject
     with IBase {
  
  /** [Method] Captures the specified properties from the target object in this memento
    * @param props String/String[] The property or array of properties to capture.
    * @param target Object The object from which to capture properties.
    */
  var capture: js.UndefOr[
    js.Function2[/* props */ js.UndefOr[js.Any], /* target */ js.UndefOr[js.Any], Unit]
  ] = js.undefined
  
  /** [Method] Removes the specified properties from this memento
    * @param props String/String[] The property or array of properties to remove.
    */
  var remove: js.UndefOr[js.Function1[/* props */ js.UndefOr[js.Any], Unit]] = js.undefined
  
  /** [Method] Restores the specified properties from this memento to the target object
    * @param props String/String[] The property or array of properties to restore.
    * @param clear Boolean True to remove the restored properties from this memento or false to keep them (default is true).
    * @param target Object The object to which to restore properties.
    */
  var restore: js.UndefOr[
    js.Function3[
      /* props */ js.UndefOr[js.Any], 
      /* clear */ js.UndefOr[Boolean], 
      /* target */ js.UndefOr[js.Any], 
      Unit
    ]
  ] = js.undefined
  
  /** [Method] Restores all captured properties in this memento to the target object
    * @param clear Boolean True to remove the restored properties from this memento or false to keep them (default is true).
    * @param target Object The object to which to restore properties.
    */
  var restoreAll: js.UndefOr[
    js.Function2[/* clear */ js.UndefOr[Boolean], /* target */ js.UndefOr[js.Any], Unit]
  ] = js.undefined
  
  /** [Property] (Object) */
  var target: js.UndefOr[js.Any] = js.undefined
}
object IMemento {
  
  @scala.inline
  def apply(): IMemento = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IMemento]
  }
  
  @scala.inline
  implicit class IMementoMutableBuilder[Self <: IMemento] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCapture(value: (/* props */ js.UndefOr[js.Any], /* target */ js.UndefOr[js.Any]) => Unit): Self = StObject.set(x, "capture", js.Any.fromFunction2(value))
    
    @scala.inline
    def setCaptureUndefined: Self = StObject.set(x, "capture", js.undefined)
    
    @scala.inline
    def setRemove(value: /* props */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "remove", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemoveUndefined: Self = StObject.set(x, "remove", js.undefined)
    
    @scala.inline
    def setRestore(
      value: (/* props */ js.UndefOr[js.Any], /* clear */ js.UndefOr[Boolean], /* target */ js.UndefOr[js.Any]) => Unit
    ): Self = StObject.set(x, "restore", js.Any.fromFunction3(value))
    
    @scala.inline
    def setRestoreAll(value: (/* clear */ js.UndefOr[Boolean], /* target */ js.UndefOr[js.Any]) => Unit): Self = StObject.set(x, "restoreAll", js.Any.fromFunction2(value))
    
    @scala.inline
    def setRestoreAllUndefined: Self = StObject.set(x, "restoreAll", js.undefined)
    
    @scala.inline
    def setRestoreUndefined: Self = StObject.set(x, "restore", js.undefined)
    
    @scala.inline
    def setTarget(value: js.Any): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
  }
}
