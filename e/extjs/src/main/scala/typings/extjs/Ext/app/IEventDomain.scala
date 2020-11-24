package typings.extjs.Ext.app

import typings.extjs.Ext.IBase
import typings.extjs.Ext.IClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IEventDomain extends IBase {
  
  /** [Config Option] (String) */
  var idProperty: js.UndefOr[String] = js.native
  
  /** [Property] (Object) */
  var instances: js.UndefOr[js.Any] = js.native
  
  /** [Method] This method matches the firer of the event the target to the given selector
    * @param target Object The firer of the event.
    * @param selector String The selector to which to match the target.
    * @returns Boolean true if the target matches the selector.
    */
  var `match`: js.UndefOr[
    js.Function2[/* target */ js.UndefOr[js.Any], /* selector */ js.UndefOr[String], Boolean]
  ] = js.native
  
  /** [Method] This method is called by the derived class to monitor fireEvent calls
    * @param observable Ext.Class The Observable to monitor for events.
    */
  var monitor: js.UndefOr[js.Function1[/* observable */ js.UndefOr[IClass], Unit]] = js.native
}
object IEventDomain {
  
  @scala.inline
  def apply(): IEventDomain = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IEventDomain]
  }
  
  @scala.inline
  implicit class IEventDomainOps[Self <: IEventDomain] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setIdProperty(value: String): Self = this.set("idProperty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIdProperty: Self = this.set("idProperty", js.undefined)
    
    @scala.inline
    def setInstances(value: js.Any): Self = this.set("instances", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInstances: Self = this.set("instances", js.undefined)
    
    @scala.inline
    def setMatch(value: (/* target */ js.UndefOr[js.Any], /* selector */ js.UndefOr[String]) => Boolean): Self = this.set("match", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteMatch: Self = this.set("match", js.undefined)
    
    @scala.inline
    def setMonitor(value: /* observable */ js.UndefOr[IClass] => Unit): Self = this.set("monitor", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteMonitor: Self = this.set("monitor", js.undefined)
  }
}
