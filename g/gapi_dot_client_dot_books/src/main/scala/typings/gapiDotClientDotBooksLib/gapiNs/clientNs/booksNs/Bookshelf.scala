package typings
package gapiDotClientDotBooksLib.gapiNs.clientNs.booksNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Bookshelf extends js.Object {
  /** Whether this bookshelf is PUBLIC or PRIVATE. */
  var access: js.UndefOr[java.lang.String] = js.undefined
  /** Created time for this bookshelf (formatted UTC timestamp with millisecond resolution). */
  var created: js.UndefOr[java.lang.String] = js.undefined
  /** Description of this bookshelf. */
  var description: js.UndefOr[java.lang.String] = js.undefined
  /** Id of this bookshelf, only unique by user. */
  var id: js.UndefOr[scala.Double] = js.undefined
  /** Resource type for bookshelf metadata. */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** URL to this resource. */
  var selfLink: js.UndefOr[java.lang.String] = js.undefined
  /** Title of this bookshelf. */
  var title: js.UndefOr[java.lang.String] = js.undefined
  /** Last modified time of this bookshelf (formatted UTC timestamp with millisecond resolution). */
  var updated: js.UndefOr[java.lang.String] = js.undefined
  /** Number of volumes in this bookshelf. */
  var volumeCount: js.UndefOr[scala.Double] = js.undefined
  /** Last time a volume was added or removed from this bookshelf (formatted UTC timestamp with millisecond resolution). */
  var volumesLastUpdated: js.UndefOr[java.lang.String] = js.undefined
}

