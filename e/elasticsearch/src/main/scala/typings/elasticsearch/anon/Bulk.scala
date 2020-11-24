package typings.elasticsearch.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Bulk extends js.Object {
  
  var bulk: Double = js.native
  
  var search: Double = js.native
}
object Bulk {
  
  @scala.inline
  def apply(bulk: Double, search: Double): Bulk = {
    val __obj = js.Dynamic.literal(bulk = bulk.asInstanceOf[js.Any], search = search.asInstanceOf[js.Any])
    __obj.asInstanceOf[Bulk]
  }
  
  @scala.inline
  implicit class BulkOps[Self <: Bulk] (val x: Self) extends AnyVal {
    
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
    def setBulk(value: Double): Self = this.set("bulk", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSearch(value: Double): Self = this.set("search", value.asInstanceOf[js.Any])
  }
}
