package typings.firebaseFirestore.distLitePackagesFirestoreDistLiteIndexDotbrowserDotesm2017Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The results of executing an aggregation query.
  */ trait n extends StObject {
  
  var _data: Any
  
  /**
    * Returns the results of the aggregations performed over the underlying
    * query.
    *
    * The keys of the returned object will be the same as those of the
    * `AggregateSpec` object specified to the aggregation method, and the values
    * will be the corresponding aggregation result.
    *
    * @returns The results of the aggregations performed over the underlying
    * query.
    */ def data(): Any
  
  var query: Any
  
  /** A type string to uniquely identify instances of this class. */
  var `type`: String
}
object n {
  
  inline def apply(_data: Any, data: () => Any, query: Any, `type`: String): n = {
    val __obj = js.Dynamic.literal(_data = _data.asInstanceOf[js.Any], data = js.Any.fromFunction0(data), query = query.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[n]
  }
  
  extension [Self <: n](x: Self) {
    
    inline def setData(value: () => Any): Self = StObject.set(x, "data", js.Any.fromFunction0(value))
    
    inline def setQuery(value: Any): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def set_data(value: Any): Self = StObject.set(x, "_data", value.asInstanceOf[js.Any])
  }
}
