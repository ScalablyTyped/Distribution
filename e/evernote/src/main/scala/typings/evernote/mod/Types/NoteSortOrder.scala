package typings.evernote.mod.Types

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait NoteSortOrder extends StObject
@JSImport("evernote", "Types.NoteSortOrder")
@js.native
object NoteSortOrder extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[NoteSortOrder & Double] = js.native
  
  @js.native
  sealed trait CREATED
    extends StObject
       with NoteSortOrder
  /* 1 */ val CREATED: typings.evernote.mod.Types.NoteSortOrder.CREATED & Double = js.native
  
  @js.native
  sealed trait RELEVANCE
    extends StObject
       with NoteSortOrder
  /* 3 */ val RELEVANCE: typings.evernote.mod.Types.NoteSortOrder.RELEVANCE & Double = js.native
  
  @js.native
  sealed trait TITLE
    extends StObject
       with NoteSortOrder
  /* 5 */ val TITLE: typings.evernote.mod.Types.NoteSortOrder.TITLE & Double = js.native
  
  @js.native
  sealed trait UPDATED
    extends StObject
       with NoteSortOrder
  /* 2 */ val UPDATED: typings.evernote.mod.Types.NoteSortOrder.UPDATED & Double = js.native
  
  @js.native
  sealed trait UPDATE_SEQUENCE_NUMBER
    extends StObject
       with NoteSortOrder
  /* 4 */ val UPDATE_SEQUENCE_NUMBER: typings.evernote.mod.Types.NoteSortOrder.UPDATE_SEQUENCE_NUMBER & Double = js.native
}
