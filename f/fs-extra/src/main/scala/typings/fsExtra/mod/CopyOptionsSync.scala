package typings.fsExtra.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CopyOptionsSync
  extends StObject
     with typings.node.fsMod.CopyOptions {
  
  @JSName("filter")
  var filter_CopyOptionsSync: js.UndefOr[CopyFilterSync] = js.undefined
}
object CopyOptionsSync {
  
  inline def apply(): CopyOptionsSync = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CopyOptionsSync]
  }
  
  extension [Self <: CopyOptionsSync](x: Self) {
    
    inline def setFilter(value: (/* src */ String, /* dest */ String) => Boolean): Self = StObject.set(x, "filter", js.Any.fromFunction2(value))
    
    inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
  }
}
