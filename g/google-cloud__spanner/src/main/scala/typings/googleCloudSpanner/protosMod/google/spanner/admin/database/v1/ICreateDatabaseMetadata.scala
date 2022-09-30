package typings.googleCloudSpanner.protosMod.google.spanner.admin.database.v1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a CreateDatabaseMetadata. */
trait ICreateDatabaseMetadata extends StObject {
  
  /** CreateDatabaseMetadata database */
  var database: js.UndefOr[String | Null] = js.undefined
}
object ICreateDatabaseMetadata {
  
  inline def apply(): ICreateDatabaseMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ICreateDatabaseMetadata]
  }
  
  extension [Self <: ICreateDatabaseMetadata](x: Self) {
    
    inline def setDatabase(value: String): Self = StObject.set(x, "database", value.asInstanceOf[js.Any])
    
    inline def setDatabaseNull: Self = StObject.set(x, "database", null)
    
    inline def setDatabaseUndefined: Self = StObject.set(x, "database", js.undefined)
  }
}
