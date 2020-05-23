package typings.gatsby.mod

import org.scalablytyped.runtime.StringDictionary
import typings.gatsby.anon.Content
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NodeInput
  extends /* key */ StringDictionary[js.Any] {
  var children: js.UndefOr[js.Array[String]] = js.undefined
  var id: String
  var internal: Content
  var parent: js.UndefOr[String] = js.undefined
}

object NodeInput {
  @scala.inline
  def apply(
    id: String,
    internal: Content,
    StringDictionary: /* name */ StringDictionary[js.Any] = null,
    children: js.Array[String] = null,
    parent: String = null
  ): NodeInput = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], internal = internal.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (parent != null) __obj.updateDynamic("parent")(parent.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeInput]
  }
}

