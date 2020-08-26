package typings.firebaseDatabaseTypes.mod.firebaseComponentAugmentingMod

import typings.firebaseDatabaseTypes.mod.FirebaseDatabase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NameServiceMapping extends js.Object {
  var database: FirebaseDatabase = js.native
}

object NameServiceMapping {
  @scala.inline
  def apply(database: FirebaseDatabase): NameServiceMapping = {
    val __obj = js.Dynamic.literal(database = database.asInstanceOf[js.Any])
    __obj.asInstanceOf[NameServiceMapping]
  }
  @scala.inline
  implicit class NameServiceMappingOps[Self <: NameServiceMapping] (val x: Self) extends AnyVal {
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
    def setDatabase(value: FirebaseDatabase): Self = this.set("database", value.asInstanceOf[js.Any])
  }
  
}

