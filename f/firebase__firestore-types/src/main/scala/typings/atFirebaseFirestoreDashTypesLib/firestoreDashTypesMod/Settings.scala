package typings
package atFirebaseFirestoreDashTypesLib.firestoreDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Settings extends js.Object {
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

