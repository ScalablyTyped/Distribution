package typings.evernote.mod.Types

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait NoteSortOrder extends StObject
@JSImport("evernote", "Types.NoteSortOrder")
@js.native
object NoteSortOrder extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[NoteSortOrder with Double] = js.native
  
  @js.native
  sealed trait CREATED extends NoteSortOrder
  /* 1 */ val CREATED: typings.evernote.mod.Types.NoteSortOrder.CREATED with Double = js.native
  
  @js.native
  sealed trait RELEVANCE extends NoteSortOrder
  /* 3 */ val RELEVANCE: typings.evernote.mod.Types.NoteSortOrder.RELEVANCE with Double = js.native
  
  @js.native
  sealed trait TITLE extends NoteSortOrder
  /* 5 */ val TITLE: typings.evernote.mod.Types.NoteSortOrder.TITLE with Double = js.native
  
  @js.native
  sealed trait UPDATED extends NoteSortOrder
  /* 2 */ val UPDATED: typings.evernote.mod.Types.NoteSortOrder.UPDATED with Double = js.native
  
  @js.native
  sealed trait UPDATE_SEQUENCE_NUMBER extends NoteSortOrder
  /* 4 */ val UPDATE_SEQUENCE_NUMBER: typings.evernote.mod.Types.NoteSortOrder.UPDATE_SEQUENCE_NUMBER with Double = js.native
}
