package typings.googleapis.bigtableadminV2Mod.bigtableadminV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An initial split point for a newly created table.
  */
trait SchemaSplit extends StObject {
  
  /**
    * Row key to use as an initial tablet boundary.
    */
  var key: js.UndefOr[String] = js.undefined
}
object SchemaSplit {
  
  @scala.inline
  def apply(): SchemaSplit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSplit]
  }
  
  @scala.inline
  implicit class SchemaSplitMutableBuilder[Self <: SchemaSplit] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
  }
}
