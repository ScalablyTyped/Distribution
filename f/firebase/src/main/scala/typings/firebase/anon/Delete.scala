package typings.firebase.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Delete extends StObject {
  
  def delete(): js.Promise[Unit] = js.native
}
object Delete {
  
  @scala.inline
  def apply(delete: () => js.Promise[Unit]): Delete = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction0(delete))
    __obj.asInstanceOf[Delete]
  }
  
  @scala.inline
  implicit class DeleteMutableBuilder[Self <: Delete] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDelete(value: () => js.Promise[Unit]): Self = StObject.set(x, "delete", js.Any.fromFunction0(value))
  }
}
