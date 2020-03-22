package typings.gapiClientDfareporting.gapi.client.dfareporting

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientDfareporting.AnonKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConversionsResource extends js.Object {
  /** Inserts conversions. */
  def batchinsert(request: AnonKey): Request_[ConversionsBatchInsertResponse]
  /** Updates existing conversions. */
  def batchupdate(request: AnonKey): Request_[ConversionsBatchUpdateResponse]
}

object ConversionsResource {
  @scala.inline
  def apply(
    batchinsert: AnonKey => Request_[ConversionsBatchInsertResponse],
    batchupdate: AnonKey => Request_[ConversionsBatchUpdateResponse]
  ): ConversionsResource = {
    val __obj = js.Dynamic.literal(batchinsert = js.Any.fromFunction1(batchinsert), batchupdate = js.Any.fromFunction1(batchupdate))
  
    __obj.asInstanceOf[ConversionsResource]
  }
}

