package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BulkSendingListSummaries extends StObject {
  
  /**
    * An array of `bulkSendingListSummary` objects where each summary provides basic information about a bulk send list that belongs to the current user.
    */
  var bulkListSummaries: js.UndefOr[
    js.Array[
      /* This object contains basic information about a bulk send list. */ BulkSendingListSummary
    ]
  ] = js.native
}
object BulkSendingListSummaries {
  
  @scala.inline
  def apply(): BulkSendingListSummaries = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BulkSendingListSummaries]
  }
  
  @scala.inline
  implicit class BulkSendingListSummariesMutableBuilder[Self <: BulkSendingListSummaries] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBulkListSummaries(
      value: js.Array[
          /* This object contains basic information about a bulk send list. */ BulkSendingListSummary
        ]
    ): Self = StObject.set(x, "bulkListSummaries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBulkListSummariesUndefined: Self = StObject.set(x, "bulkListSummaries", js.undefined)
    
    @scala.inline
    def setBulkListSummariesVarargs(
      value: (/* This object contains basic information about a bulk send list. */ BulkSendingListSummary)*
    ): Self = StObject.set(x, "bulkListSummaries", js.Array(value :_*))
  }
}
