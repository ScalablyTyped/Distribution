package typings.evernote.evernoteMod.Evernote

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait QueryFormat extends js.Object

/**
  * Every search query is specified as a sequence of characters.
  * Currently, only the USER query format is supported.
  */
@JSImport("evernote", "Evernote.QueryFormat")
@js.native
object QueryFormat extends js.Object {
  @js.native
  sealed trait SEXP extends QueryFormat
  
  @js.native
  sealed trait USER extends QueryFormat
  
  /* 2 */ val SEXP: typings.evernote.evernoteMod.Evernote.QueryFormat.SEXP with Double = js.native
  /* 1 */ val USER: typings.evernote.evernoteMod.Evernote.QueryFormat.USER with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[QueryFormat with Double] = js.native
}

