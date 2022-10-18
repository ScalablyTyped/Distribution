package typings.firebaseDatabase.distInternalMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UserCallback extends StObject {
  
  def apply(dataSnapshot: DataSnapshot): Any = js.native
  def apply(dataSnapshot: DataSnapshot, previousChildName: String): Any = js.native
  
  var context: js.UndefOr[js.Object | Null] = js.native
  
  var userCallback: js.UndefOr[Any] = js.native
}
