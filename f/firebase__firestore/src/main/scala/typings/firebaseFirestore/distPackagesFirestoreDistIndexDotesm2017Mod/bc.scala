package typings.firebaseFirestore.distPackagesFirestoreDistIndexDotesm2017Mod

import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait bc extends StObject {
  
  var ku: Set[Any]
  
  var onlineState: String
  
  var queries: os
}
object bc {
  
  inline def apply(ku: Set[Any], onlineState: String, queries: os): bc = {
    val __obj = js.Dynamic.literal(ku = ku.asInstanceOf[js.Any], onlineState = onlineState.asInstanceOf[js.Any], queries = queries.asInstanceOf[js.Any])
    __obj.asInstanceOf[bc]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: bc] (val x: Self) extends AnyVal {
    
    inline def setKu(value: Set[Any]): Self = StObject.set(x, "ku", value.asInstanceOf[js.Any])
    
    inline def setOnlineState(value: String): Self = StObject.set(x, "onlineState", value.asInstanceOf[js.Any])
    
    inline def setQueries(value: os): Self = StObject.set(x, "queries", value.asInstanceOf[js.Any])
  }
}
