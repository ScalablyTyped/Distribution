package typings.docusignEsign.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConnectConfigResults extends js.Object {
  
  /**
    * An array of DocuSign Connect configurations.
    */
  var configurations: js.UndefOr[js.Array[ConnectCustomConfiguration]] = js.native
  
  /**
    * The number of results.
    */
  var totalRecords: js.UndefOr[String] = js.native
}
object ConnectConfigResults {
  
  @scala.inline
  def apply(): ConnectConfigResults = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConnectConfigResults]
  }
  
  @scala.inline
  implicit class ConnectConfigResultsOps[Self <: ConnectConfigResults] (val x: Self) extends AnyVal {
    
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
    def setConfigurationsVarargs(value: ConnectCustomConfiguration*): Self = this.set("configurations", js.Array(value :_*))
    
    @scala.inline
    def setConfigurations(value: js.Array[ConnectCustomConfiguration]): Self = this.set("configurations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConfigurations: Self = this.set("configurations", js.undefined)
    
    @scala.inline
    def setTotalRecords(value: String): Self = this.set("totalRecords", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTotalRecords: Self = this.set("totalRecords", js.undefined)
  }
}
