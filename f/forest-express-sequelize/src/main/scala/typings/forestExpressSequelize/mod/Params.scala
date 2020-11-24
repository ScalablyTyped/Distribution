package typings.forestExpressSequelize.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Params extends js.Object {
  
  var fields: StringDictionary[String] = js.native
  
  var filters: Filter | AggregatedFilters = js.native
  
  var page: Page = js.native
  
  var search: String = js.native
  
  var searchExtended: String = js.native
  
  var sort: String = js.native
  
  var timezone: String = js.native
}
object Params {
  
  @scala.inline
  def apply(
    fields: StringDictionary[String],
    filters: Filter | AggregatedFilters,
    page: Page,
    search: String,
    searchExtended: String,
    sort: String,
    timezone: String
  ): Params = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any], filters = filters.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], search = search.asInstanceOf[js.Any], searchExtended = searchExtended.asInstanceOf[js.Any], sort = sort.asInstanceOf[js.Any], timezone = timezone.asInstanceOf[js.Any])
    __obj.asInstanceOf[Params]
  }
  
  @scala.inline
  implicit class ParamsOps[Self <: Params] (val x: Self) extends AnyVal {
    
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
    def setFields(value: StringDictionary[String]): Self = this.set("fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilters(value: Filter | AggregatedFilters): Self = this.set("filters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPage(value: Page): Self = this.set("page", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSearch(value: String): Self = this.set("search", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSearchExtended(value: String): Self = this.set("searchExtended", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSort(value: String): Self = this.set("sort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimezone(value: String): Self = this.set("timezone", value.asInstanceOf[js.Any])
  }
}
