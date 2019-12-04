package typings.atFirebaseDatabase

import typings.atFirebaseDatabase.distSrcApiDatabaseMod.Database
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Instance extends js.Object {
  var instance: Database
  var namespace: Anon_A
}

object Anon_Instance {
  @scala.inline
  def apply(instance: Database, namespace: Anon_A): Anon_Instance = {
    val __obj = js.Dynamic.literal(instance = instance.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Instance]
  }
}

