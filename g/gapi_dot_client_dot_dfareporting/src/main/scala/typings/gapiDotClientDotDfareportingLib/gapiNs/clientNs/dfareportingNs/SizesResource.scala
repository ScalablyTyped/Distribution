package typings
package gapiDotClientDotDfareportingLib.gapiNs.clientNs.dfareportingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SizesResource extends js.Object {
  /** Gets one size by ID. */
  def get(request: gapiDotClientDotDfareportingLib.Anon_AltFields): gapiDotClientLib.gapiNs.clientNs.Request[Size]
  /** Inserts a new size. */
  def insert(request: gapiDotClientDotDfareportingLib.Anon_AltFieldsKey): gapiDotClientLib.gapiNs.clientNs.Request[Size]
  /** Retrieves a list of sizes, possibly filtered. */
  def list(request: gapiDotClientDotDfareportingLib.Anon_AltFieldsHeight): gapiDotClientLib.gapiNs.clientNs.Request[SizesListResponse]
}

object SizesResource {
  @scala.inline
  def apply(
    get: js.Function1[
      gapiDotClientDotDfareportingLib.Anon_AltFields, 
      gapiDotClientLib.gapiNs.clientNs.Request[Size]
    ],
    insert: js.Function1[
      gapiDotClientDotDfareportingLib.Anon_AltFieldsKey, 
      gapiDotClientLib.gapiNs.clientNs.Request[Size]
    ],
    list: js.Function1[
      gapiDotClientDotDfareportingLib.Anon_AltFieldsHeight, 
      gapiDotClientLib.gapiNs.clientNs.Request[SizesListResponse]
    ]
  ): SizesResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("get")(get)
    __obj.updateDynamic("insert")(insert)
    __obj.updateDynamic("list")(list)
    __obj.asInstanceOf[SizesResource]
  }
}

