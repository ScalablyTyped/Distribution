package typings
package gapiDotClientDotDatastoreLib.gapiNs.clientNs.datastoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait CommitResponse extends js.Object {
  /**
               * The number of index entries updated during the commit, or zero if none were
               * updated.
               */
  var indexUpdates: js.UndefOr[scala.Double] = js.undefined
  /**
               * The result of performing the mutations.
               * The i-th mutation result corresponds to the i-th mutation in the request.
               */
  var mutationResults: js.UndefOr[js.Array[MutationResult]] = js.undefined
}

