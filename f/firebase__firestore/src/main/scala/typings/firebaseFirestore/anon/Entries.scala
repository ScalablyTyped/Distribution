package typings.firebaseFirestore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Entries extends StObject {
  
  var entries: js.Array[Find]
}
object Entries {
  
  inline def apply(entries: js.Array[Find]): Entries = {
    val __obj = js.Dynamic.literal(entries = entries.asInstanceOf[js.Any])
    __obj.asInstanceOf[Entries]
  }
  
  extension [Self <: Entries](x: Self) {
    
    inline def setEntries(value: js.Array[Find]): Self = StObject.set(x, "entries", value.asInstanceOf[js.Any])
    
    inline def setEntriesVarargs(value: Find*): Self = StObject.set(x, "entries", js.Array(value*))
  }
}
