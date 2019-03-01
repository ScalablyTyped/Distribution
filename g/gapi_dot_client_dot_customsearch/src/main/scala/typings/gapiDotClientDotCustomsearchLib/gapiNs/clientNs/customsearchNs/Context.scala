package typings
package gapiDotClientDotCustomsearchLib.gapiNs.clientNs.customsearchNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Context extends js.Object {
  var facets: js.UndefOr[js.Array[js.Array[gapiDotClientDotCustomsearchLib.Anon_Anchor]]] = js.undefined
  var title: js.UndefOr[java.lang.String] = js.undefined
}

object Context {
  @scala.inline
  def apply(
    facets: js.Array[js.Array[gapiDotClientDotCustomsearchLib.Anon_Anchor]] = null,
    title: java.lang.String = null
  ): Context = {
    val __obj = js.Dynamic.literal()
    if (facets != null) __obj.updateDynamic("facets")(facets)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[Context]
  }
}

