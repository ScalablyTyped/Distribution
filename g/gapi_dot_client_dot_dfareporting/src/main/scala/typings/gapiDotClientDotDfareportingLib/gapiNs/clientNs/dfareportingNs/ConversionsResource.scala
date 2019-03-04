package typings
package gapiDotClientDotDfareportingLib.gapiNs.clientNs.dfareportingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConversionsResource extends js.Object {
  /** Inserts conversions. */
  def batchinsert(request: gapiDotClientDotDfareportingLib.Anon_AltFieldsKey): gapiDotClientLib.gapiNs.clientNs.Request[ConversionsBatchInsertResponse]
  /** Updates existing conversions. */
  def batchupdate(request: gapiDotClientDotDfareportingLib.Anon_AltFieldsKey): gapiDotClientLib.gapiNs.clientNs.Request[ConversionsBatchUpdateResponse]
}

object ConversionsResource {
  @scala.inline
  def apply(
    batchinsert: js.Function1[
      gapiDotClientDotDfareportingLib.Anon_AltFieldsKey, 
      gapiDotClientLib.gapiNs.clientNs.Request[ConversionsBatchInsertResponse]
    ],
    batchupdate: js.Function1[
      gapiDotClientDotDfareportingLib.Anon_AltFieldsKey, 
      gapiDotClientLib.gapiNs.clientNs.Request[ConversionsBatchUpdateResponse]
    ]
  ): ConversionsResource = {
    val __obj = js.Dynamic.literal(batchinsert = batchinsert, batchupdate = batchupdate)
  
    __obj.asInstanceOf[ConversionsResource]
  }
}

