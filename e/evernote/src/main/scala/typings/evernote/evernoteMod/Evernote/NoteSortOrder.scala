package typings.evernote.evernoteMod.Evernote

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait NoteSortOrder extends js.Object

/**
  * This enumeration defines the possible sort ordering for notes when
  * they are returned from a search result.
  */
@JSImport("evernote", "Evernote.NoteSortOrder")
@js.native
object NoteSortOrder extends js.Object {
  @js.native
  sealed trait CREATED extends NoteSortOrder
  
  @js.native
  sealed trait RELEVANCE extends NoteSortOrder
  
  @js.native
  sealed trait TITLE extends NoteSortOrder
  
  @js.native
  sealed trait UPDATED extends NoteSortOrder
  
  @js.native
  sealed trait UPDATE_SEQUENCE_NUMBER extends NoteSortOrder
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[NoteSortOrder with Double] = js.native
  /* 1 */ @js.native
  object CREATED extends TopLevel[CREATED with Double]
  
  /* 3 */ @js.native
  object RELEVANCE extends TopLevel[RELEVANCE with Double]
  
  /* 5 */ @js.native
  object TITLE extends TopLevel[TITLE with Double]
  
  /* 2 */ @js.native
  object UPDATED extends TopLevel[UPDATED with Double]
  
  /* 4 */ @js.native
  object UPDATE_SEQUENCE_NUMBER extends TopLevel[UPDATE_SEQUENCE_NUMBER with Double]
  
}

