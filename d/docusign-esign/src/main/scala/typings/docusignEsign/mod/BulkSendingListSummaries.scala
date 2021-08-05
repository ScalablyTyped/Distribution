package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BulkSendingListSummaries extends StObject {
  
  /**
    * An array of `bulkSendingListSummary` objects where each summary provides basic information about a bulk send list that belongs to the current user.
    */
  var bulkListSummaries: js.UndefOr[
    js.Array[
      /* This object contains basic information about a bulk send list. */ BulkSendingListSummary
    ]
  ] = js.undefined
}
object BulkSendingListSummaries {
  
  inline def apply(): BulkSendingListSummaries = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BulkSendingListSummaries]
  }
  
  extension [Self <: BulkSendingListSummaries](x: Self) {
    
    inline def setBulkListSummaries(
      value: js.Array[
          /* This object contains basic information about a bulk send list. */ BulkSendingListSummary
        ]
    ): Self = StObject.set(x, "bulkListSummaries", value.asInstanceOf[js.Any])
    
    inline def setBulkListSummariesUndefined: Self = StObject.set(x, "bulkListSummaries", js.undefined)
    
    inline def setBulkListSummariesVarargs(
      value: (/* This object contains basic information about a bulk send list. */ BulkSendingListSummary)*
    ): Self = StObject.set(x, "bulkListSummaries", js.Array(value :_*))
  }
}
