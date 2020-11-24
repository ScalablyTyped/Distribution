package typings.diff2html.typesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait LineType extends js.Object
@JSImport("diff2html/lib/types", "LineType")
@js.native
object LineType extends js.Object {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[LineType with String] = js.native
  
  @js.native
  sealed trait CONTEXT extends LineType
  /* "context" */ @js.native
  object CONTEXT extends TopLevel[CONTEXT with String]
  
  @js.native
  sealed trait DELETE extends LineType
  /* "delete" */ @js.native
  object DELETE extends TopLevel[DELETE with String]
  
  @js.native
  sealed trait INSERT extends LineType
  /* "insert" */ @js.native
  object INSERT extends TopLevel[INSERT with String]
}
