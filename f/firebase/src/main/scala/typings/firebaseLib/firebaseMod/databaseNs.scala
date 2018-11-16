package typings
package firebaseLib.firebaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("firebase", "database")
@js.native
object databaseNs extends js.Object {
  def enableLogging(): js.Any = js.native
  def enableLogging(logger: js.Function1[/* a */ java.lang.String, _]): js.Any = js.native
  def enableLogging(logger: js.Function1[/* a */ java.lang.String, _], persistent: scala.Boolean): js.Any = js.native
  def enableLogging(logger: scala.Boolean): js.Any = js.native
  def enableLogging(logger: scala.Boolean, persistent: scala.Boolean): js.Any = js.native
  @JSName("ServerValue")
  @js.native
  object ServerValueNs extends js.Object {
    var TIMESTAMP: js.Object = js.native
  }
  
}

