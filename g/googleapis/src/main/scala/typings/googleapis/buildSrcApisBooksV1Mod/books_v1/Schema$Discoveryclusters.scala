package typings.googleapis.buildSrcApisBooksV1Mod.books_v1

import typings.googleapis.Anon_Bannerwithcontentcontainer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$Discoveryclusters extends js.Object {
  var clusters: js.UndefOr[js.Array[Anon_Bannerwithcontentcontainer]] = js.native
  /**
    * Resorce type.
    */
  var kind: js.UndefOr[String] = js.native
  var totalClusters: js.UndefOr[Double] = js.native
}

object Schema$Discoveryclusters {
  @scala.inline
  def apply(
    clusters: js.Array[Anon_Bannerwithcontentcontainer] = null,
    kind: String = null,
    totalClusters: Int | Double = null
  ): Schema$Discoveryclusters = {
    val __obj = js.Dynamic.literal()
    if (clusters != null) __obj.updateDynamic("clusters")(clusters.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (totalClusters != null) __obj.updateDynamic("totalClusters")(totalClusters.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Discoveryclusters]
  }
}

