package typings.dynatable.JQueryDynatable

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Params extends StObject {
  
  /**
    * @default 'dynatable'
    */
  var dynatable: js.UndefOr[String] = js.native
  
  /**
    * @default 'offset'
    */
  var offset: js.UndefOr[String] = js.native
  
  /**
    * @default 'page'
    */
  var page: js.UndefOr[String] = js.native
  
  /**
    * @default 'perPage'
    */
  var perPage: js.UndefOr[String] = js.native
  
  /**
    * @default 'queries'
    */
  var queries: js.UndefOr[String] = js.native
  
  /**
    * @default 'queryRecordCount'
    */
  var queryRecordCount: js.UndefOr[String] = js.native
  
  /**
    * @default null
    */
  var record: js.UndefOr[js.Object] = js.native
  
  /**
    * @default 'records'
    */
  var records: js.UndefOr[String] = js.native
  
  /**
    * @default 'sorts'
    */
  var sorts: js.UndefOr[String] = js.native
  
  /**
    * @default 'totalRecordCount'
    */
  var totalRecordCount: js.UndefOr[String] = js.native
}
object Params {
  
  @scala.inline
  def apply(): Params = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Params]
  }
  
  @scala.inline
  implicit class ParamsMutableBuilder[Self <: Params] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDynatable(value: String): Self = StObject.set(x, "dynatable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDynatableUndefined: Self = StObject.set(x, "dynatable", js.undefined)
    
    @scala.inline
    def setOffset(value: String): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    
    @scala.inline
    def setPage(value: String): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageUndefined: Self = StObject.set(x, "page", js.undefined)
    
    @scala.inline
    def setPerPage(value: String): Self = StObject.set(x, "perPage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPerPageUndefined: Self = StObject.set(x, "perPage", js.undefined)
    
    @scala.inline
    def setQueries(value: String): Self = StObject.set(x, "queries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueriesUndefined: Self = StObject.set(x, "queries", js.undefined)
    
    @scala.inline
    def setQueryRecordCount(value: String): Self = StObject.set(x, "queryRecordCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueryRecordCountUndefined: Self = StObject.set(x, "queryRecordCount", js.undefined)
    
    @scala.inline
    def setRecord(value: js.Object): Self = StObject.set(x, "record", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecordUndefined: Self = StObject.set(x, "record", js.undefined)
    
    @scala.inline
    def setRecords(value: String): Self = StObject.set(x, "records", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecordsUndefined: Self = StObject.set(x, "records", js.undefined)
    
    @scala.inline
    def setSorts(value: String): Self = StObject.set(x, "sorts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortsUndefined: Self = StObject.set(x, "sorts", js.undefined)
    
    @scala.inline
    def setTotalRecordCount(value: String): Self = StObject.set(x, "totalRecordCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalRecordCountUndefined: Self = StObject.set(x, "totalRecordCount", js.undefined)
  }
}
