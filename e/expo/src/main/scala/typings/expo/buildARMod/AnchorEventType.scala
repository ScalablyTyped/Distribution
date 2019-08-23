package typings.expo.buildARMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait AnchorEventType extends js.Object

@JSImport("expo/build/AR", "AnchorEventType")
@js.native
object AnchorEventType extends js.Object {
  @js.native
  sealed trait Add extends AnchorEventType
  
  @js.native
  sealed trait Remove extends AnchorEventType
  
  @js.native
  sealed trait Update extends AnchorEventType
  
  /* "add" */ val Add: typings.expo.buildARMod.AnchorEventType.Add with String = js.native
  /* "remove" */ val Remove: typings.expo.buildARMod.AnchorEventType.Remove with String = js.native
  /* "update" */ val Update: typings.expo.buildARMod.AnchorEventType.Update with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[AnchorEventType with String] = js.native
}

