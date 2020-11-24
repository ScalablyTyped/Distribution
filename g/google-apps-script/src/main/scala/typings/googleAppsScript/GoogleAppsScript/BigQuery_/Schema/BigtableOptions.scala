package typings.googleAppsScript.GoogleAppsScript.BigQuery_.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BigtableOptions extends js.Object {
  
  var columnFamilies: js.UndefOr[js.Array[BigtableColumnFamily]] = js.native
  
  var ignoreUnspecifiedColumnFamilies: js.UndefOr[Boolean] = js.native
  
  var readRowkeyAsString: js.UndefOr[Boolean] = js.native
}
object BigtableOptions {
  
  @scala.inline
  def apply(): BigtableOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BigtableOptions]
  }
  
  @scala.inline
  implicit class BigtableOptionsOps[Self <: BigtableOptions] (val x: Self) extends AnyVal {
    
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
    def setColumnFamiliesVarargs(value: BigtableColumnFamily*): Self = this.set("columnFamilies", js.Array(value :_*))
    
    @scala.inline
    def setColumnFamilies(value: js.Array[BigtableColumnFamily]): Self = this.set("columnFamilies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColumnFamilies: Self = this.set("columnFamilies", js.undefined)
    
    @scala.inline
    def setIgnoreUnspecifiedColumnFamilies(value: Boolean): Self = this.set("ignoreUnspecifiedColumnFamilies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIgnoreUnspecifiedColumnFamilies: Self = this.set("ignoreUnspecifiedColumnFamilies", js.undefined)
    
    @scala.inline
    def setReadRowkeyAsString(value: Boolean): Self = this.set("readRowkeyAsString", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReadRowkeyAsString: Self = this.set("readRowkeyAsString", js.undefined)
  }
}
