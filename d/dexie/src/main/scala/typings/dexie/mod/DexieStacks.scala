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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DexieStacks] (val x: Self) extends AnyVal {
    
    inline def setDbcore(value: DBCore): Self = StObject.set(x, "dbcore", value.asInstanceOf[js.Any])
  }
}
