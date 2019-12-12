package typings.expo.buildARMod

import org.scalablytyped.runtime.TopLevel
import typings.expo.buildARMod.AnchorEventType.Add
import typings.expo.buildARMod.AnchorEventType.Remove
import typings.expo.buildARMod.AnchorEventType.Update
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
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[AnchorEventType with String] = js.native
  /* "add" */ @js.native
  object Add extends TopLevel[Add with String]
  
  /* "remove" */ @js.native
  object Remove extends TopLevel[Remove with String]
  
  /* "update" */ @js.native
  object Update extends TopLevel[Update with String]
  
}

