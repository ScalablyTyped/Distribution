package typings.evernote.mod.Types

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait QueryFormat extends StObject
@JSImport("evernote", "Types.QueryFormat")
@js.native
object QueryFormat extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[QueryFormat with Double] = js.native
  
  @js.native
  sealed trait SEXP extends QueryFormat
  /* 2 */ val SEXP: typings.evernote.mod.Types.QueryFormat.SEXP with Double = js.native
  
  @js.native
  sealed trait USER extends QueryFormat
  /* 1 */ val USER: typings.evernote.mod.Types.QueryFormat.USER with Double = js.native
}
