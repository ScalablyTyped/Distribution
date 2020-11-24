package typings.electron.Electron

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LoadFileOptions extends js.Object {
  
  /**
    * Passed to `url.format()`.
    */
  var hash: js.UndefOr[String] = js.native
  
  /**
    * Passed to `url.format()`.
    */
  var query: js.UndefOr[Record[String, String]] = js.native
  
  /**
    * Passed to `url.format()`.
    */
  var search: js.UndefOr[String] = js.native
}
object LoadFileOptions {
  
  @scala.inline
  def apply(): LoadFileOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LoadFileOptions]
  }
  
  @scala.inline
  implicit class LoadFileOptionsOps[Self <: LoadFileOptions] (val x: Self) extends AnyVal {
    
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
    def setHash(value: String): Self = this.set("hash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHash: Self = this.set("hash", js.undefined)
    
    @scala.inline
    def setQuery(value: Record[String, String]): Self = this.set("query", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQuery: Self = this.set("query", js.undefined)
    
    @scala.inline
    def setSearch(value: String): Self = this.set("search", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSearch: Self = this.set("search", js.undefined)
  }
}
