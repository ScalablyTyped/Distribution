package typings.firebaseDatabase

import typings.firebaseDatabase.databaseMod.Database
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonInstance extends js.Object {
  var instance: Database
  var namespace: AnonA
}

object AnonInstance {
  @scala.inline
  def apply(instance: Database, namespace: AnonA): AnonInstance = {
    val __obj = js.Dynamic.literal(instance = instance.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonInstance]
  }
}

