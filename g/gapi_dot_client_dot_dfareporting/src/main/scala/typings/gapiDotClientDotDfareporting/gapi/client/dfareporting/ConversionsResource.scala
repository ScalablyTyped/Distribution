package typings.gapiDotClientDotDfareporting.gapi.client.dfareporting

import typings.gapiDotClient.gapi.client.Request
import typings.gapiDotClientDotDfareporting.Anon_AltFieldsKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConversionsResource extends js.Object {
  /** Inserts conversions. */
  def batchinsert(request: Anon_AltFieldsKey): Request[ConversionsBatchInsertResponse]
  /** Updates existing conversions. */
  def batchupdate(request: Anon_AltFieldsKey): Request[ConversionsBatchUpdateResponse]
}

object ConversionsResource {
  @scala.inline
  def apply(
    batchinsert: Anon_AltFieldsKey => Request[ConversionsBatchInsertResponse],
    batchupdate: Anon_AltFieldsKey => Request[ConversionsBatchUpdateResponse]
  ): ConversionsResource = {
    val __obj = js.Dynamic.literal(batchinsert = js.Any.fromFunction1(batchinsert), batchupdate = js.Any.fromFunction1(batchupdate))
  
    __obj.asInstanceOf[ConversionsResource]
  }
}

