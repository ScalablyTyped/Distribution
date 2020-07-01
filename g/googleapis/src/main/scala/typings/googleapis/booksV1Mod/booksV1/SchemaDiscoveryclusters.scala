package typings.googleapis.booksV1Mod.booksV1

import typings.googleapis.anon.Bannerwithcontentcontainer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaDiscoveryclusters extends js.Object {
  var clusters: js.UndefOr[js.Array[Bannerwithcontentcontainer]] = js.native
  /**
    * Resorce type.
    */
  var kind: js.UndefOr[String] = js.native
  var totalClusters: js.UndefOr[Double] = js.native
}

object SchemaDiscoveryclusters {
  @scala.inline
  def apply(
    clusters: js.Array[Bannerwithcontentcontainer] = null,
    kind: String = null,
    totalClusters: js.UndefOr[Double] = js.undefined
  ): SchemaDiscoveryclusters = {
    val __obj = js.Dynamic.literal()
    if (clusters != null) __obj.updateDynamic("clusters")(clusters.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (!js.isUndefined(totalClusters)) __obj.updateDynamic("totalClusters")(totalClusters.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaDiscoveryclusters]
  }
}

