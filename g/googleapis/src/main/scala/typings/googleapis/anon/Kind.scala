package typings.googleapis.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Kind extends StObject {
  
  var id: js.UndefOr[String] = js.native
  
  var kind: js.UndefOr[String] = js.native
}
object Kind {
  
  @scala.inline
  def apply(): Kind = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Kind]
  }
  
  @scala.inline
  implicit class KindMutableBuilder[Self <: Kind] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
