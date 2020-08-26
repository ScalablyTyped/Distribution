package typings.firebaseDatabase.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Instance extends js.Object {
  var instance: typings.firebaseDatabase.databaseMod.Database = js.native
  var namespace: DataSnapshot = js.native
}

object Instance {
  @scala.inline
  def apply(instance: typings.firebaseDatabase.databaseMod.Database, namespace: DataSnapshot): Instance = {
    val __obj = js.Dynamic.literal(instance = instance.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any])
    __obj.asInstanceOf[Instance]
  }
  @scala.inline
  implicit class InstanceOps[Self <: Instance] (val x: Self) extends AnyVal {
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
    def setInstance(value: typings.firebaseDatabase.databaseMod.Database): Self = this.set("instance", value.asInstanceOf[js.Any])
    @scala.inline
    def setNamespace(value: DataSnapshot): Self = this.set("namespace", value.asInstanceOf[js.Any])
  }
  
}

