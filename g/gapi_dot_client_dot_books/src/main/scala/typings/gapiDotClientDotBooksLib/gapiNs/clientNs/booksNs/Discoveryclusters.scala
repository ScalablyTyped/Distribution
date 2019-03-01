package typings
package gapiDotClientDotBooksLib.gapiNs.clientNs.booksNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Discoveryclusters extends js.Object {
  var clusters: js.UndefOr[js.Array[gapiDotClientDotBooksLib.Anon_Bannerwithcontentcontainer]] = js.undefined
  /** Resorce type. */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  var totalClusters: js.UndefOr[scala.Double] = js.undefined
}

object Discoveryclusters {
  @scala.inline
  def apply(
    clusters: js.Array[gapiDotClientDotBooksLib.Anon_Bannerwithcontentcontainer] = null,
    kind: java.lang.String = null,
    totalClusters: scala.Int | scala.Double = null
  ): Discoveryclusters = {
    val __obj = js.Dynamic.literal()
    if (clusters != null) __obj.updateDynamic("clusters")(clusters)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (totalClusters != null) __obj.updateDynamic("totalClusters")(totalClusters.asInstanceOf[js.Any])
    __obj.asInstanceOf[Discoveryclusters]
  }
}

