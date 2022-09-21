package typings.googleapis.bigtableadminV2Mod.bigtableadminV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaColumnFamily extends StObject {
  
  /**
    * Garbage collection rule specified as a protobuf. Must serialize to at most 500 bytes. NOTE: Garbage collection executes opportunistically in the background, and so it's possible for reads to return a cell even if it matches the active GC expression for its family.
    */
  var gcRule: js.UndefOr[SchemaGcRule] = js.undefined
}
object SchemaColumnFamily {
  
  inline def apply(): SchemaColumnFamily = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaColumnFamily]
  }
  
  extension [Self <: SchemaColumnFamily](x: Self) {
    
    inline def setGcRule(value: SchemaGcRule): Self = StObject.set(x, "gcRule", value.asInstanceOf[js.Any])
    
    inline def setGcRuleUndefined: Self = StObject.set(x, "gcRule", js.undefined)
  }
}
