package typings.googleCloudSpanner.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick</ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IRequestOptions * / any, 'priority'> */
trait Pickanypriority extends StObject {
  
  var priority: js.UndefOr[Any] = js.undefined
}
object Pickanypriority {
  
  inline def apply(): Pickanypriority = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Pickanypriority]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Pickanypriority] (val x: Self) extends AnyVal {
    
    inline def setPriority(value: Any): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
    
    inline def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
  }
}
