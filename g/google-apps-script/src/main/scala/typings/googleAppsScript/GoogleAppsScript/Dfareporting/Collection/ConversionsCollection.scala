package typings.googleAppsScript.GoogleAppsScript.Dfareporting.Collection

import typings.googleAppsScript.GoogleAppsScript.Dfareporting.Schema.ConversionsBatchInsertRequest
import typings.googleAppsScript.GoogleAppsScript.Dfareporting.Schema.ConversionsBatchInsertResponse
import typings.googleAppsScript.GoogleAppsScript.Dfareporting.Schema.ConversionsBatchUpdateRequest
import typings.googleAppsScript.GoogleAppsScript.Dfareporting.Schema.ConversionsBatchUpdateResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConversionsCollection extends js.Object {
  // Inserts conversions.
  def batchinsert(resource: ConversionsBatchInsertRequest, profileId: String): ConversionsBatchInsertResponse = js.native
  // Updates existing conversions.
  def batchupdate(resource: ConversionsBatchUpdateRequest, profileId: String): ConversionsBatchUpdateResponse = js.native
}

object ConversionsCollection {
  @scala.inline
  def apply(
    batchinsert: (ConversionsBatchInsertRequest, String) => ConversionsBatchInsertResponse,
    batchupdate: (ConversionsBatchUpdateRequest, String) => ConversionsBatchUpdateResponse
  ): ConversionsCollection = {
    val __obj = js.Dynamic.literal(batchinsert = js.Any.fromFunction2(batchinsert), batchupdate = js.Any.fromFunction2(batchupdate))
    __obj.asInstanceOf[ConversionsCollection]
  }
  @scala.inline
  implicit class ConversionsCollectionOps[Self <: ConversionsCollection] (val x: Self) extends AnyVal {
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
    def setBatchinsert(value: (ConversionsBatchInsertRequest, String) => ConversionsBatchInsertResponse): Self = this.set("batchinsert", js.Any.fromFunction2(value))
    @scala.inline
    def setBatchupdate(value: (ConversionsBatchUpdateRequest, String) => ConversionsBatchUpdateResponse): Self = this.set("batchupdate", js.Any.fromFunction2(value))
  }
  
}

