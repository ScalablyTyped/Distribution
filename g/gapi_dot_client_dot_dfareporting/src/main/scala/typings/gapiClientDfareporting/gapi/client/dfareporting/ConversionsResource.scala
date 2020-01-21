package typings.gapiClientDfareporting.gapi.client.dfareporting

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientDfareporting.AnonAltFieldsKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConversionsResource extends js.Object {
  /** Inserts conversions. */
  def batchinsert(request: AnonAltFieldsKey): Request_[ConversionsBatchInsertResponse]
  /** Updates existing conversions. */
  def batchupdate(request: AnonAltFieldsKey): Request_[ConversionsBatchUpdateResponse]
}

object ConversionsResource {
  @scala.inline
  def apply(
    batchinsert: AnonAltFieldsKey => Request_[ConversionsBatchInsertResponse],
    batchupdate: AnonAltFieldsKey => Request_[ConversionsBatchUpdateResponse]
  ): ConversionsResource = {
    val __obj = js.Dynamic.literal(batchinsert = js.Any.fromFunction1(batchinsert), batchupdate = js.Any.fromFunction1(batchupdate))
  
    __obj.asInstanceOf[ConversionsResource]
  }
}

