package typings.extjs.Ext.grid.feature

import typings.extjs.Ext.grid.IPanel
import typings.extjs.Ext.util.IObservable
import typings.extjs.Ext.view.ITable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IFeature extends IObservable {
  
  /** [Method] Disables the feature  */
  var disable: js.UndefOr[js.Function0[Unit]] = js.native
  
  /** [Property] (Boolean) */
  var disabled: js.UndefOr[Boolean] = js.native
  
  /** [Method] Enables the feature  */
  var enable: js.UndefOr[js.Function0[Unit]] = js.native
  
  /** [Property] (String) */
  var eventPrefix: js.UndefOr[String] = js.native
  
  /** [Property] (String) */
  var eventSelector: js.UndefOr[String] = js.native
  
  /** [Method] Abstract method to be overriden when a feature should add additional arguments to its event signature
    * @param eventName Object
    * @param view Object
    * @param featureTarget Object
    * @param e Object
    */
  var getFireEventArgs: js.UndefOr[
    js.Function4[
      /* eventName */ js.UndefOr[js.Any], 
      /* view */ js.UndefOr[js.Any], 
      /* featureTarget */ js.UndefOr[js.Any], 
      /* e */ js.UndefOr[js.Any], 
      Unit
    ]
  ] = js.native
  
  /** [Property] (Ext.grid.Panel) */
  var grid: js.UndefOr[IPanel] = js.native
  
  /** [Property] (Boolean) */
  var hasFeatureEvent: js.UndefOr[Boolean] = js.native
  
  /** [Property] (Ext.view.Table) */
  var view: js.UndefOr[ITable] = js.native
}
object IFeature {
  
  @scala.inline
  def apply(): IFeature = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IFeature]
  }
  
  @scala.inline
  implicit class IFeatureOps[Self <: IFeature] (val x: Self) extends AnyVal {
    
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
    def setDisable(value: () => Unit): Self = this.set("disable", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteDisable: Self = this.set("disable", js.undefined)
    
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    
    @scala.inline
    def setEnable(value: () => Unit): Self = this.set("enable", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteEnable: Self = this.set("enable", js.undefined)
    
    @scala.inline
    def setEventPrefix(value: String): Self = this.set("eventPrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEventPrefix: Self = this.set("eventPrefix", js.undefined)
    
    @scala.inline
    def setEventSelector(value: String): Self = this.set("eventSelector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEventSelector: Self = this.set("eventSelector", js.undefined)
    
    @scala.inline
    def setGetFireEventArgs(
      value: (/* eventName */ js.UndefOr[js.Any], /* view */ js.UndefOr[js.Any], /* featureTarget */ js.UndefOr[js.Any], /* e */ js.UndefOr[js.Any]) => Unit
    ): Self = this.set("getFireEventArgs", js.Any.fromFunction4(value))
    
    @scala.inline
    def deleteGetFireEventArgs: Self = this.set("getFireEventArgs", js.undefined)
    
    @scala.inline
    def setGrid(value: IPanel): Self = this.set("grid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGrid: Self = this.set("grid", js.undefined)
    
    @scala.inline
    def setHasFeatureEvent(value: Boolean): Self = this.set("hasFeatureEvent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHasFeatureEvent: Self = this.set("hasFeatureEvent", js.undefined)
    
    @scala.inline
    def setView(value: ITable): Self = this.set("view", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteView: Self = this.set("view", js.undefined)
  }
}
