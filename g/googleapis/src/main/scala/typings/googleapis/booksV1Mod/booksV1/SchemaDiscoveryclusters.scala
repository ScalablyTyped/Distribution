package typings.googleapis.booksV1Mod.booksV1

import typings.googleapis.AnonBannerwithcontentcontainer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaDiscoveryclusters extends js.Object {
  var clusters: js.UndefOr[js.Array[AnonBannerwithcontentcontainer]] = js.native
  /**
    * Resorce type.
    */
  var kind: js.UndefOr[String] = js.native
  var totalClusters: js.UndefOr[Double] = js.native
}

object SchemaDiscoveryclusters {
  @scala.inline
  def apply(
    clusters: js.Array[AnonBannerwithcontentcontainer] = null,
    kind: String = null,
    totalClusters: Int | Double = null
  ): SchemaDiscoveryclusters = {
    val __obj = js.Dynamic.literal()
    if (clusters != null) __obj.updateDynamic("clusters")(clusters.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (totalClusters != null) __obj.updateDynamic("totalClusters")(totalClusters.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaDiscoveryclusters]
  }
}

