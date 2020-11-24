package typings.firebaseDatabase.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Namespace extends js.Object {
  
  var instance: typings.firebaseDatabaseTypes.mod.Database = js.native
  
  var namespace: DataSnapshot = js.native
}
object Namespace {
  
  @scala.inline
  def apply(instance: typings.firebaseDatabaseTypes.mod.Database, namespace: DataSnapshot): Namespace = {
    val __obj = js.Dynamic.literal(instance = instance.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any])
    __obj.asInstanceOf[Namespace]
  }
  
  @scala.inline
  implicit class NamespaceOps[Self <: Namespace] (val x: Self) extends AnyVal {
    
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
    def setNamespace(value: DataSnapshot): Self = this.set("namespace", value.asInstanceOf[js.Any])
  }
}
