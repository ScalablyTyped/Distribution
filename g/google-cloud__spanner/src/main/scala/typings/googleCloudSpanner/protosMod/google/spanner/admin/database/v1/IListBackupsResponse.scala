package typings.googleCloudSpanner.protosMod.google.spanner.admin.database.v1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a ListBackupsResponse. */
trait IListBackupsResponse extends StObject {
  
  /** ListBackupsResponse backups */
  var backups: js.UndefOr[js.Array[IBackup] | Null] = js.undefined
  
  /** ListBackupsResponse nextPageToken */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
}
object IListBackupsResponse {
  
  inline def apply(): IListBackupsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IListBackupsResponse]
  }
  
  extension [Self <: IListBackupsResponse](x: Self) {
    
    inline def setBackups(value: js.Array[IBackup]): Self = StObject.set(x, "backups", value.asInstanceOf[js.Any])
    
    inline def setBackupsNull: Self = StObject.set(x, "backups", null)
    
    inline def setBackupsUndefined: Self = StObject.set(x, "backups", js.undefined)
    
    inline def setBackupsVarargs(value: IBackup*): Self = StObject.set(x, "backups", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
