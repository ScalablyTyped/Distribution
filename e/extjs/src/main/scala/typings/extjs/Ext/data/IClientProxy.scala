package typings.extjs.Ext.data

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IClientProxy
  extends typings.extjs.Ext.data.proxy.IProxy {
  
  /** [Method] Abstract function that must be implemented by each ClientProxy subclass  */
  var clear: js.UndefOr[js.Function0[Unit]] = js.native
}
object IClientProxy {
  
  @scala.inline
  def apply(): IClientProxy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IClientProxy]
  }
  
  @scala.inline
  implicit class IClientProxyMutableBuilder[Self <: IClientProxy] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClear(value: () => Unit): Self = StObject.set(x, "clear", js.Any.fromFunction0(value))
    
    @scala.inline
    def setClearUndefined: Self = StObject.set(x, "clear", js.undefined)
  }
}
