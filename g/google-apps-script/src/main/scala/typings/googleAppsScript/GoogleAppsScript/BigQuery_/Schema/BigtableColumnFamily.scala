package typings.googleAppsScript.GoogleAppsScript.BigQuery_.Schema

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BigtableColumnFamily extends StObject {
  
  var columns: js.UndefOr[js.Array[BigtableColumn]] = js.native
  
  var encoding: js.UndefOr[String] = js.native
  
  var familyId: js.UndefOr[String] = js.native
  
  var onlyReadLatest: js.UndefOr[Boolean] = js.native
  
  var `type`: js.UndefOr[String] = js.native
}
object BigtableColumnFamily {
  
  @scala.inline
  def apply(): BigtableColumnFamily = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BigtableColumnFamily]
  }
  
  @scala.inline
  implicit class BigtableColumnFamilyMutableBuilder[Self <: BigtableColumnFamily] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColumns(value: js.Array[BigtableColumn]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
    
    @scala.inline
    def setColumnsVarargs(value: BigtableColumn*): Self = StObject.set(x, "columns", js.Array(value :_*))
    
    @scala.inline
    def setEncoding(value: String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
    
    @scala.inline
    def setFamilyId(value: String): Self = StObject.set(x, "familyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFamilyIdUndefined: Self = StObject.set(x, "familyId", js.undefined)
    
    @scala.inline
    def setOnlyReadLatest(value: Boolean): Self = StObject.set(x, "onlyReadLatest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnlyReadLatestUndefined: Self = StObject.set(x, "onlyReadLatest", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
