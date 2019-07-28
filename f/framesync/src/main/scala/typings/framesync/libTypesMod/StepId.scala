package typings.framesync.libTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait StepId extends js.Object

@JSImport("framesync/lib/types", "StepId")
@js.native
object StepId extends js.Object {
  @js.native
  sealed trait FixedUpdate extends StepId
  
  @js.native
  sealed trait PostRender extends StepId
  
  @js.native
  sealed trait Read extends StepId
  
  @js.native
  sealed trait Render extends StepId
  
  @js.native
  sealed trait Update extends StepId
  
  /* "fixedUpdate" */ val FixedUpdate: typings.framesync.libTypesMod.StepId.FixedUpdate with String = js.native
  /* "postRender" */ val PostRender: typings.framesync.libTypesMod.StepId.PostRender with String = js.native
  /* "read" */ val Read: typings.framesync.libTypesMod.StepId.Read with String = js.native
  /* "render" */ val Render: typings.framesync.libTypesMod.StepId.Render with String = js.native
  /* "update" */ val Update: typings.framesync.libTypesMod.StepId.Update with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[StepId with String] = js.native
}

