package typings.firebaseFirestore.firestoreSrcLocalIndexeddbSchemaMod

import typings.firebaseFirestore.firestoreSrcProtosFirestoreBundleProtoMod.BundledQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DbNamedQuery extends StObject {
  
  /** The query saved in the bundle. */
  var bundledQuery: BundledQuery
  
  /** The name of the query. */
  var name: String
  
  /** The read time of the results saved in the bundle from the named query. */
  var readTime: DbTimestamp
}
object DbNamedQuery {
  
  inline def apply(bundledQuery: BundledQuery, name: String, readTime: DbTimestamp): DbNamedQuery = {
    val __obj = js.Dynamic.literal(bundledQuery = bundledQuery.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], readTime = readTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[DbNamedQuery]
  }
  
  extension [Self <: DbNamedQuery](x: Self) {
    
    inline def setBundledQuery(value: BundledQuery): Self = StObject.set(x, "bundledQuery", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setReadTime(value: DbTimestamp): Self = StObject.set(x, "readTime", value.asInstanceOf[js.Any])
  }
}
