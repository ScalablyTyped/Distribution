package typings.framesync.libTypesMod

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[StepId with String] = js.native
  /* "fixedUpdate" */ @js.native
  object FixedUpdate extends TopLevel[FixedUpdate with String]
  
  /* "postRender" */ @js.native
  object PostRender extends TopLevel[PostRender with String]
  
  /* "read" */ @js.native
  object Read extends TopLevel[Read with String]
  
  /* "render" */ @js.native
  object Render extends TopLevel[Render with String]
  
  /* "update" */ @js.native
  object Update extends TopLevel[Update with String]
  
}

