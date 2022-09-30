package typings.dexie.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DBCoreTransaction extends StObject {
  
  def abort(): Unit
}
object DBCoreTransaction {
  
  inline def apply(abort: () => Unit): DBCoreTransaction = {
    val __obj = js.Dynamic.literal(abort = js.Any.fromFunction0(abort))
    __obj.asInstanceOf[DBCoreTransaction]
  }
  
  extension [Self <: DBCoreTransaction](x: Self) {
    
    inline def setAbort(value: () => Unit): Self = StObject.set(x, "abort", js.Any.fromFunction0(value))
  }
}
