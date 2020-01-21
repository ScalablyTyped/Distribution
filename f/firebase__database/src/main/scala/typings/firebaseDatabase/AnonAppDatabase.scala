package typings.firebaseDatabase

import org.scalablytyped.runtime.Instantiable0
import typings.firebaseDatabase.indexNodeMod.firebaseAppTypesAugmentingMod.FirebaseApp
import typings.firebaseDatabaseTypes.mod.FirebaseDatabase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAppDatabase extends js.Object {
  var Database: Instantiable0[FirebaseDatabase] = js.native
  var ServerValue: typings.firebaseDatabaseTypes.mod.ServerValue = js.native
  @JSName("enableLogging")
  var enableLogging_Original: FnA = js.native
  def apply(): FirebaseDatabase = js.native
  def apply(app: FirebaseApp): FirebaseDatabase = js.native
  def enableLogging(): js.Any = js.native
  def enableLogging(logger: js.Function1[/* a */ String, _]): js.Any = js.native
  def enableLogging(logger: js.Function1[/* a */ String, _], persistent: Boolean): js.Any = js.native
  def enableLogging(logger: Boolean): js.Any = js.native
  def enableLogging(logger: Boolean, persistent: Boolean): js.Any = js.native
}

