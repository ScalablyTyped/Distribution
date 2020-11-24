package typings.extjs.Ext.grid.feature

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IAbstractSummary extends IFeature {
  
  /** [Config Option] (String) */
  var remoteRoot: js.UndefOr[String] = js.native
  
  /** [Config Option] (Boolean) */
  var showSummaryRow: js.UndefOr[Boolean] = js.native
  
  /** [Method] Toggle whether or not to show the summary row
    * @param visible Boolean True to show the summary row
    */
  var toggleSummaryRow: js.UndefOr[js.Function1[/* visible */ js.UndefOr[Boolean], Unit]] = js.native
}
object IAbstractSummary {
  
  @scala.inline
  def apply(): IAbstractSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IAbstractSummary]
  }
  
  @scala.inline
  implicit class IAbstractSummaryOps[Self <: IAbstractSummary] (val x: Self) extends AnyVal {
    
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
    def setRemoteRoot(value: String): Self = this.set("remoteRoot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRemoteRoot: Self = this.set("remoteRoot", js.undefined)
    
    @scala.inline
    def setShowSummaryRow(value: Boolean): Self = this.set("showSummaryRow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowSummaryRow: Self = this.set("showSummaryRow", js.undefined)
    
    @scala.inline
    def setToggleSummaryRow(value: /* visible */ js.UndefOr[Boolean] => Unit): Self = this.set("toggleSummaryRow", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteToggleSummaryRow: Self = this.set("toggleSummaryRow", js.undefined)
  }
}
