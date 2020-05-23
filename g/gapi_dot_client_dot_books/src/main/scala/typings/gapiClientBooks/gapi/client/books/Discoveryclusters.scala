package typings.gapiClientBooks.gapi.client.books

import typings.gapiClientBooks.anon.Bannerwithcontentcontainer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Discoveryclusters extends js.Object {
  var clusters: js.UndefOr[js.Array[Bannerwithcontentcontainer]] = js.undefined
  /** Resorce type. */
  var kind: js.UndefOr[String] = js.undefined
  var totalClusters: js.UndefOr[Double] = js.undefined
}

object Discoveryclusters {
  @scala.inline
  def apply(
    clusters: js.Array[Bannerwithcontentcontainer] = null,
    kind: String = null,
    totalClusters: js.UndefOr[Double] = js.undefined
  ): Discoveryclusters = {
    val __obj = js.Dynamic.literal()
    if (clusters != null) __obj.updateDynamic("clusters")(clusters.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (!js.isUndefined(totalClusters)) __obj.updateDynamic("totalClusters")(totalClusters.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Discoveryclusters]
  }
}

