package typings.dexie.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DexieStacks extends StObject {
  
  var dbcore: DBCore
}
object DexieStacks {
  
  inline def apply(dbcore: DBCore): DexieStacks = {
    val __obj = js.Dynamic.literal(dbcore = dbcore.asInstanceOf[js.Any])
    __obj.asInstanceOf[DexieStacks]
  }
  
  extension [Self <: DexieStacks](x: Self) {
    
    inline def setDbcore(value: DBCore): Self = StObject.set(x, "dbcore", value.asInstanceOf[js.Any])
  }
}
