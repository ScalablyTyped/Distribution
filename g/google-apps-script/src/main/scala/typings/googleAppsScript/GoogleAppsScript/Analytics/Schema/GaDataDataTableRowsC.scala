package typings.googleAppsScript.GoogleAppsScript.Analytics.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GaDataDataTableRowsC extends js.Object {
  
  var v: js.UndefOr[String] = js.native
}
object GaDataDataTableRowsC {
  
  @scala.inline
  def apply(): GaDataDataTableRowsC = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GaDataDataTableRowsC]
  }
  
  @scala.inline
  implicit class GaDataDataTableRowsCOps[Self <: GaDataDataTableRowsC] (val x: Self) extends AnyVal {
    
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
    def setV(value: String): Self = this.set("v", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteV: Self = this.set("v", js.undefined)
  }
}
