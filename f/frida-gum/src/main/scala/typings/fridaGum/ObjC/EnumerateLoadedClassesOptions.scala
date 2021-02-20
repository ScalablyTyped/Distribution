package typings.fridaGum.ObjC

import typings.fridaGum.ModuleMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnumerateLoadedClassesOptions extends StObject {
  
  /**
    * Limit enumeration to modules in the given module map.
    */
  var ownedBy: js.UndefOr[ModuleMap] = js.native
}
object EnumerateLoadedClassesOptions {
  
  @scala.inline
  def apply(): EnumerateLoadedClassesOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EnumerateLoadedClassesOptions]
  }
  
  @scala.inline
  implicit class EnumerateLoadedClassesOptionsMutableBuilder[Self <: EnumerateLoadedClassesOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOwnedBy(value: ModuleMap): Self = StObject.set(x, "ownedBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnedByUndefined: Self = StObject.set(x, "ownedBy", js.undefined)
  }
}
