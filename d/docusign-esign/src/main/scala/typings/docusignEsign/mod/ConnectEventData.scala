package typings.docusignEsign.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConnectEventData extends js.Object {
  
  var format: js.UndefOr[String] = js.native
  
  var includeData: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * The version of the rest API.
    */
  var version: js.UndefOr[String] = js.native
}
object ConnectEventData {
  
  @scala.inline
  def apply(): ConnectEventData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConnectEventData]
  }
  
  @scala.inline
  implicit class ConnectEventDataOps[Self <: ConnectEventData] (val x: Self) extends AnyVal {
    
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
    def setFormat(value: String): Self = this.set("format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
    
    @scala.inline
    def setIncludeDataVarargs(value: String*): Self = this.set("includeData", js.Array(value :_*))
    
    @scala.inline
    def setIncludeData(value: js.Array[String]): Self = this.set("includeData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncludeData: Self = this.set("includeData", js.undefined)
    
    @scala.inline
    def setVersion(value: String): Self = this.set("version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVersion: Self = this.set("version", js.undefined)
  }
}
