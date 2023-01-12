package typings.devtoolsProtocol.mod.Protocol.Target

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FilterEntry extends StObject {
  
  /**
    * If set, causes exclusion of mathcing targets from the list.
    */
  var exclude: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If not present, matches any type.
    */
  var `type`: js.UndefOr[String] = js.undefined
}
object FilterEntry {
  
  inline def apply(): FilterEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FilterEntry]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FilterEntry] (val x: Self) extends AnyVal {
    
    inline def setExclude(value: Boolean): Self = StObject.set(x, "exclude", value.asInstanceOf[js.Any])
    
    inline def setExcludeUndefined: Self = StObject.set(x, "exclude", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
