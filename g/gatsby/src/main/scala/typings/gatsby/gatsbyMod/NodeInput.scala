package typings.gatsby.gatsbyMod

import org.scalablytyped.runtime.StringDictionary
import typings.gatsby.Anon_Content
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NodeInput
  extends /* key */ StringDictionary[js.Any] {
  var children: js.UndefOr[js.Array[String]] = js.undefined
  var id: String
  var internal: Anon_Content
  var parent: js.UndefOr[String] = js.undefined
}

object NodeInput {
  @scala.inline
  def apply(
    id: String,
    internal: Anon_Content,
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    children: js.Array[String] = null,
    parent: String = null
  ): NodeInput = {
    val __obj = js.Dynamic.literal(id = id, internal = internal)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (children != null) __obj.updateDynamic("children")(children)
    if (parent != null) __obj.updateDynamic("parent")(parent)
    __obj.asInstanceOf[NodeInput]
  }
}

