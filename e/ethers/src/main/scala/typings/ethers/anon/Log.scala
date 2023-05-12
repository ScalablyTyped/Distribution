package typings.ethers.anon

import typings.ethers.ethersStrings.`drop-log`
import typings.ethers.typesProvidersProviderMod.OrphanFilter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Log
  extends StObject
     with OrphanFilter {
  
  var log: Index
  
  var orphan: `drop-log`
}
object Log {
  
  inline def apply(log: Index): Log = {
    val __obj = js.Dynamic.literal(log = log.asInstanceOf[js.Any], orphan = "drop-log")
    __obj.asInstanceOf[Log]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Log] (val x: Self) extends AnyVal {
    
    inline def setLog(value: Index): Self = StObject.set(x, "log", value.asInstanceOf[js.Any])
    
    inline def setOrphan(value: `drop-log`): Self = StObject.set(x, "orphan", value.asInstanceOf[js.Any])
  }
}
