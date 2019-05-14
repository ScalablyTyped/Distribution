package typings
package framesyncLib.libTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait StepId extends js.Object

@JSImport("framesync/lib/types", "StepId")
@js.native
object StepId extends js.Object {
  @js.native
  sealed trait FixedUpdate
    extends framesyncLib.libTypesMod.StepId
  
  @js.native
  sealed trait PostRender
    extends framesyncLib.libTypesMod.StepId
  
  @js.native
  sealed trait Read
    extends framesyncLib.libTypesMod.StepId
  
  @js.native
  sealed trait Render
    extends framesyncLib.libTypesMod.StepId
  
  @js.native
  sealed trait Update
    extends framesyncLib.libTypesMod.StepId
  
  /* "fixedUpdate" */ val FixedUpdate: FixedUpdate with java.lang.String = js.native
  /* "postRender" */ val PostRender: PostRender with java.lang.String = js.native
  /* "read" */ val Read: Read with java.lang.String = js.native
  /* "render" */ val Render: Render with java.lang.String = js.native
  /* "update" */ val Update: Update with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[framesyncLib.libTypesMod.StepId with java.lang.String] = js.native
}

