package typings.evernote.mod.Types

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait QueryFormat extends StObject
@JSImport("evernote", "Types.QueryFormat")
@js.native
object QueryFormat extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[QueryFormat & Double] = js.native
  
  @js.native
  sealed trait SEXP
    extends StObject
       with QueryFormat
  /* 2 */ val SEXP: typings.evernote.mod.Types.QueryFormat.SEXP & Double = js.native
  
  @js.native
  sealed trait USER
    extends StObject
       with QueryFormat
  /* 1 */ val USER: typings.evernote.mod.Types.QueryFormat.USER & Double = js.native
}
