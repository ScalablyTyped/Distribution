package typings.googleAppsScript.GoogleAppsScript.Analytics.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GaDataDataTableRows extends js.Object {
  
  var c: js.UndefOr[js.Array[GaDataDataTableRowsC]] = js.native
}
object GaDataDataTableRows {
  
  @scala.inline
  def apply(): GaDataDataTableRows = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GaDataDataTableRows]
  }
  
  @scala.inline
  implicit class GaDataDataTableRowsOps[Self <: GaDataDataTableRows] (val x: Self) extends AnyVal {
    
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
    def setCVarargs(value: GaDataDataTableRowsC*): Self = this.set("c", js.Array(value :_*))
    
    @scala.inline
    def setC(value: js.Array[GaDataDataTableRowsC]): Self = this.set("c", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteC: Self = this.set("c", js.undefined)
  }
}
