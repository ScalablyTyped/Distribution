package typings.evernote.mod.Types

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait NoteSortOrder extends js.Object
@JSImport("evernote", "Types.NoteSortOrder")
@js.native
object NoteSortOrder extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[NoteSortOrder with Double] = js.native
  
  @js.native
  sealed trait CREATED extends NoteSortOrder
  /* 1 */ @js.native
  object CREATED extends TopLevel[CREATED with Double]
  
  @js.native
  sealed trait RELEVANCE extends NoteSortOrder
  /* 3 */ @js.native
  object RELEVANCE extends TopLevel[RELEVANCE with Double]
  
  @js.native
  sealed trait TITLE extends NoteSortOrder
  /* 5 */ @js.native
  object TITLE extends TopLevel[TITLE with Double]
  
  @js.native
  sealed trait UPDATED extends NoteSortOrder
  /* 2 */ @js.native
  object UPDATED extends TopLevel[UPDATED with Double]
  
  @js.native
  sealed trait UPDATE_SEQUENCE_NUMBER extends NoteSortOrder
  /* 4 */ @js.native
  object UPDATE_SEQUENCE_NUMBER extends TopLevel[UPDATE_SEQUENCE_NUMBER with Double]
}
