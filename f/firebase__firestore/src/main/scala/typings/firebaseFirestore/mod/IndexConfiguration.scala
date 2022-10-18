package typings.firebaseFirestore.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IndexConfiguration
  extends StObject
     with /* key */ StringDictionary[Any] {
  
  /** A list of all Firestore indexes. */
  val indexes: js.UndefOr[js.Array[Index]] = js.undefined
}
object IndexConfiguration {
  
  inline def apply(): IndexConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IndexConfiguration]
  }
  
  extension [Self <: IndexConfiguration](x: Self) {
    
    inline def setIndexes(value: js.Array[Index]): Self = StObject.set(x, "indexes", value.asInstanceOf[js.Any])
    
    inline def setIndexesUndefined: Self = StObject.set(x, "indexes", js.undefined)
    
    inline def setIndexesVarargs(value: Index*): Self = StObject.set(x, "indexes", js.Array(value*))
  }
}
