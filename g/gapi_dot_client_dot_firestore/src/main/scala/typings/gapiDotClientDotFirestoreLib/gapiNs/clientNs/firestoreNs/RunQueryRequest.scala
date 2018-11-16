package typings
package gapiDotClientDotFirestoreLib.gapiNs.clientNs.firestoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait RunQueryRequest extends js.Object {
  /**
               * Starts a new transaction and reads the documents.
               * Defaults to a read-only transaction.
               * The new transaction ID will be returned as the first response in the
               * stream.
               */
  var newTransaction: js.UndefOr[TransactionOptions] = js.undefined
  /**
               * Reads documents as they were at the given time.
               * This may not be older than 60 seconds.
               */
  var readTime: js.UndefOr[java.lang.String] = js.undefined
  /** A structured query. */
  var structuredQuery: js.UndefOr[StructuredQuery] = js.undefined
  /** Reads documents in a transaction. */
  var transaction: js.UndefOr[java.lang.String] = js.undefined
}

