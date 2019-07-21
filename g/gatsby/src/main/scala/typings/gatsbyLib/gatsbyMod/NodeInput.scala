package typings
package gatsbyLib.gatsbyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NodeInput
  extends /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var children: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var id: java.lang.String
  var internal: gatsbyLib.Anon_Content
  var parent: js.UndefOr[java.lang.String] = js.undefined
}

object NodeInput {
  @scala.inline
  def apply(
    id: java.lang.String,
    internal: gatsbyLib.Anon_Content,
    StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    children: js.Array[java.lang.String] = null,
    parent: java.lang.String = null
  ): NodeInput = {
    val __obj = js.Dynamic.literal(id = id, internal = internal)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (children != null) __obj.updateDynamic("children")(children)
    if (parent != null) __obj.updateDynamic("parent")(parent)
    __obj.asInstanceOf[NodeInput]
  }
}

