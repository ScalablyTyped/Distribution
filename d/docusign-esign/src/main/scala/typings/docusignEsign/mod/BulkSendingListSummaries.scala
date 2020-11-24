package typings.docusignEsign.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BulkSendingListSummaries extends js.Object {
  
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
  implicit class BulkSendingListSummariesOps[Self <: BulkSendingListSummaries] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBulkListSummariesVarargs(
      value: (/* This object contains basic information about a bulk send list. */ BulkSendingListSummary)*
    ): Self = this.set("bulkListSummaries", js.Array(value :_*))
    
    @scala.inline
    def setBulkListSummaries(
      value: js.Array[
          /* This object contains basic information about a bulk send list. */ BulkSendingListSummary
        ]
    ): Self = this.set("bulkListSummaries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBulkListSummaries: Self = this.set("bulkListSummaries", js.undefined)
  }
}
