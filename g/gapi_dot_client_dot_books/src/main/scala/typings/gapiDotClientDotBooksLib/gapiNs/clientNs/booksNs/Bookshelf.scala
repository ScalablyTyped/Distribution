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

object Bookshelf {
  @scala.inline
  def apply(
    access: java.lang.String = null,
    created: java.lang.String = null,
    description: java.lang.String = null,
    id: scala.Int | scala.Double = null,
    kind: java.lang.String = null,
    selfLink: java.lang.String = null,
    title: java.lang.String = null,
    updated: java.lang.String = null,
    volumeCount: scala.Int | scala.Double = null,
    volumesLastUpdated: java.lang.String = null
  ): Bookshelf = {
    val __obj = js.Dynamic.literal()
    if (access != null) __obj.updateDynamic("access")(access)
    if (created != null) __obj.updateDynamic("created")(created)
    if (description != null) __obj.updateDynamic("description")(description)
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (selfLink != null) __obj.updateDynamic("selfLink")(selfLink)
    if (title != null) __obj.updateDynamic("title")(title)
    if (updated != null) __obj.updateDynamic("updated")(updated)
    if (volumeCount != null) __obj.updateDynamic("volumeCount")(volumeCount.asInstanceOf[js.Any])
    if (volumesLastUpdated != null) __obj.updateDynamic("volumesLastUpdated")(volumesLastUpdated)
    __obj.asInstanceOf[Bookshelf]
  }
}

