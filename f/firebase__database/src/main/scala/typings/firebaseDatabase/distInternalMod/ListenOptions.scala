package typings.firebaseDatabase.distInternalMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListenOptions extends StObject {
  
  /** Whether to remove the listener after its first invocation. */
  val onlyOnce: js.UndefOr[Boolean] = js.undefined
}
object ListenOptions {
  
  inline def apply(): ListenOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListenOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListenOptions] (val x: Self) extends AnyVal {
    
    inline def setOnlyOnce(value: Boolean): Self = StObject.set(x, "onlyOnce", value.asInstanceOf[js.Any])
    
    inline def setOnlyOnceUndefined: Self = StObject.set(x, "onlyOnce", js.undefined)
  }
}
