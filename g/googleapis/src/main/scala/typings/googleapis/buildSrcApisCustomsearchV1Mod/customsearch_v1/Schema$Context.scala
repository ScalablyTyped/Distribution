package typings.googleapis.buildSrcApisCustomsearchV1Mod.customsearch_v1

import typings.googleapis.Anon_Anchor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$Context extends js.Object {
  var facets: js.UndefOr[js.Array[js.Array[Anon_Anchor]]] = js.native
  var title: js.UndefOr[String] = js.native
}

object Schema$Context {
  @scala.inline
  def apply(facets: js.Array[js.Array[Anon_Anchor]] = null, title: String = null): Schema$Context = {
    val __obj = js.Dynamic.literal()
    if (facets != null) __obj.updateDynamic("facets")(facets.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Context]
  }
}

