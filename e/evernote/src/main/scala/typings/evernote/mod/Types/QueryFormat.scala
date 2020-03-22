package typings.evernote.mod.Types

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait QueryFormat extends js.Object

@JSImport("evernote", "Types.QueryFormat")
@js.native
object QueryFormat extends js.Object {
  @js.native
  sealed trait SEXP extends QueryFormat
  
  @js.native
  sealed trait USER extends QueryFormat
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[QueryFormat with Double] = js.native
  /* 2 */ @js.native
  object SEXP extends TopLevel[SEXP with Double]
  
  /* 1 */ @js.native
  object USER extends TopLevel[USER with Double]
  
}

