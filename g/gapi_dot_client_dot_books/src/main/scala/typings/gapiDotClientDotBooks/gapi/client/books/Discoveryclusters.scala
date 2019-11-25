package typings.gapiDotClientDotBooks.gapi.client.books

import typings.gapiDotClientDotBooks.Anon_Bannerwithcontentcontainer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Discoveryclusters extends js.Object {
  var clusters: js.UndefOr[js.Array[Anon_Bannerwithcontentcontainer]] = js.undefined
  /** Resorce type. */
  var kind: js.UndefOr[String] = js.undefined
  var totalClusters: js.UndefOr[Double] = js.undefined
}

object Discoveryclusters {
  @scala.inline
  def apply(
    clusters: js.Array[Anon_Bannerwithcontentcontainer] = null,
    kind: String = null,
    totalClusters: Int | Double = null
  ): Discoveryclusters = {
    val __obj = js.Dynamic.literal()
    if (clusters != null) __obj.updateDynamic("clusters")(clusters.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (totalClusters != null) __obj.updateDynamic("totalClusters")(totalClusters.asInstanceOf[js.Any])
    __obj.asInstanceOf[Discoveryclusters]
  }
}

