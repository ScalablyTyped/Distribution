package typings.firebaseDatabase.anon

import org.scalablytyped.runtime.Instantiable0
import typings.firebaseDatabase.indexNodeMod.firebaseAppTypesAugmentingMod.FirebaseApp
import typings.firebaseDatabaseTypes.mod.FirebaseDatabase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Database extends StObject {
  
  def apply(): FirebaseDatabase = js.native
  def apply(app: FirebaseApp): FirebaseDatabase = js.native
  
  var Database: Instantiable0[FirebaseDatabase] = js.native
  
  var ServerValue: typings.firebaseDatabaseTypes.mod.ServerValue = js.native
  
  def enableLogging(): js.Any = js.native
  def enableLogging(logger: js.Function1[/* a */ String, js.Any]): js.Any = js.native
  def enableLogging(logger: js.Function1[/* a */ String, js.Any], persistent: Boolean): js.Any = js.native
  def enableLogging(logger: Boolean): js.Any = js.native
  def enableLogging(logger: Boolean, persistent: Boolean): js.Any = js.native
  def enableLogging(logger: Unit, persistent: Boolean): js.Any = js.native
  @JSName("enableLogging")
  var enableLogging_Original: FnCall = js.native
}
