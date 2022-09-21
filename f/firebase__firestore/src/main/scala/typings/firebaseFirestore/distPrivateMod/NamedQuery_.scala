package typings.firebaseFirestore.distPrivateMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a Query saved by the SDK in its local storage.
  */
trait NamedQuery_ extends StObject {
  
  /** The name of the query. */
  val name: String
  
  /** The underlying query associated with `name`. */
  val query: Query2
  
  /** The time at which the results for this query were read. */
  val readTime: SnapshotVersion
}
object NamedQuery_ {
  
  inline def apply(name: String, query: Query2, readTime: SnapshotVersion): NamedQuery_ = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any], readTime = readTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[NamedQuery_]
  }
  
  extension [Self <: NamedQuery_](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: Query2): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setReadTime(value: SnapshotVersion): Self = StObject.set(x, "readTime", value.asInstanceOf[js.Any])
  }
}
