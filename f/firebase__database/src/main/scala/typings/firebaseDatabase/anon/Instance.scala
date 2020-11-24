package typings.firebaseDatabase.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Instance[T] extends js.Object {
  
  var instance: typings.firebaseDatabaseTypes.mod.Database = js.native
  
  var namespace: T = js.native
}
object Instance {
  
  @scala.inline
  def apply[T](instance: typings.firebaseDatabaseTypes.mod.Database, namespace: T): Instance[T] = {
    val __obj = js.Dynamic.literal(instance = instance.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any])
    __obj.asInstanceOf[Instance[T]]
  }
  
  @scala.inline
  implicit class InstanceOps[Self <: Instance[_], T] (val x: Self with Instance[T]) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setInstance(value: typings.firebaseDatabaseTypes.mod.Database): Self = this.set("instance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNamespace(value: T): Self = this.set("namespace", value.asInstanceOf[js.Any])
  }
}
