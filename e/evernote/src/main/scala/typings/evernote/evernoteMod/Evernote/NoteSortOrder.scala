package typings.evernote.evernoteMod.Evernote

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
  
  /* 1 */ val CREATED: typings.evernote.evernoteMod.Evernote.NoteSortOrder.CREATED with Double = js.native
  /* 3 */ val RELEVANCE: typings.evernote.evernoteMod.Evernote.NoteSortOrder.RELEVANCE with Double = js.native
  /* 5 */ val TITLE: typings.evernote.evernoteMod.Evernote.NoteSortOrder.TITLE with Double = js.native
  /* 2 */ val UPDATED: typings.evernote.evernoteMod.Evernote.NoteSortOrder.UPDATED with Double = js.native
  /* 4 */ val UPDATE_SEQUENCE_NUMBER: typings.evernote.evernoteMod.Evernote.NoteSortOrder.UPDATE_SEQUENCE_NUMBER with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[NoteSortOrder with Double] = js.native
}

