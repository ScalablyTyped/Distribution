package typings
package atFirebaseFirestoreDashTypesLib.firestoreDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Settings extends js.Object {
  /**
    * An approximate cache size threshold for the on-disk data. If the cache grows beyond this
    * size, Firestore will start removing data that hasn't been recently used. The size is not a
    * guarantee that the cache will stay below that size, only that if the cache exceeds the given
    * size, cleanup will be attempted.
    *
    * The default value is 40 MB. The threshold must be set to at least 1 MB, and can be set to
    * CACHE_SIZE_UNLIMITED to disable garbage collection.
    */
  var cacheSizeBytes: js.UndefOr[scala.Double] = js.undefined
  /** The hostname to connect to. */
  var host: js.UndefOr[java.lang.String] = js.undefined
  /** Whether to use SSL when connecting. */
  var ssl: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Enables the use of `Timestamp`s for timestamp fields in
    * `DocumentSnapshot`s.
    *
    * Currently, Firestore returns timestamp fields as `Date` but `Date` only
    * supports millisecond precision, which leads to truncation and causes
    * unexpected behavior when using a timestamp from a snapshot as a part
    * of a subsequent query.
    *
    * Setting `timestampsInSnapshots` to true will cause Firestore to return
    * `Timestamp` values instead of `Date` avoiding this kind of problem. To make
    * this work you must also change any code that uses `Date` to use `Timestamp`
    * instead.
    *
    * NOTE: in the future `timestampsInSnapshots: true` will become the
    * default and this option will be removed so you should change your code to
    * use Timestamp now and opt-in to this new behavior as soon as you can.
    */
  var timestampsInSnapshots: js.UndefOr[scala.Boolean] = js.undefined
}

