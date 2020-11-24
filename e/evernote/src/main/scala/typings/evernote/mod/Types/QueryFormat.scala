package typings.evernote.mod.Types

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait QueryFormat extends js.Object
@JSImport("evernote", "Types.QueryFormat")
@js.native
object QueryFormat extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[QueryFormat with Double] = js.native
  
  @js.native
  sealed trait SEXP extends QueryFormat
  /* 2 */ @js.native
  object SEXP extends TopLevel[SEXP with Double]
  
  @js.native
  sealed trait USER extends QueryFormat
  /* 1 */ @js.native
  object USER extends TopLevel[USER with Double]
}
