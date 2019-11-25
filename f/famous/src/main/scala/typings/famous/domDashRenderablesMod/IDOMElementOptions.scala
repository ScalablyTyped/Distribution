package typings.famous.domDashRenderablesMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDOMElementOptions extends js.Object {
  var attributes: js.UndefOr[StringDictionary[String]] = js.undefined
  var classes: js.UndefOr[js.Array[String]] = js.undefined
  var content: js.UndefOr[String] = js.undefined
  var cutout: js.UndefOr[Boolean] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var properties: js.UndefOr[StringDictionary[String]] = js.undefined
  var tagName: js.UndefOr[String] = js.undefined
}

object IDOMElementOptions {
  @scala.inline
  def apply(
    attributes: StringDictionary[String] = null,
    classes: js.Array[String] = null,
    content: String = null,
    cutout: js.UndefOr[Boolean] = js.undefined,
    id: String = null,
    properties: StringDictionary[String] = null,
    tagName: String = null
  ): IDOMElementOptions = {
    val __obj = js.Dynamic.literal()
    if (attributes != null) __obj.updateDynamic("attributes")(attributes.asInstanceOf[js.Any])
    if (classes != null) __obj.updateDynamic("classes")(classes.asInstanceOf[js.Any])
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (!js.isUndefined(cutout)) __obj.updateDynamic("cutout")(cutout.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (properties != null) __obj.updateDynamic("properties")(properties.asInstanceOf[js.Any])
    if (tagName != null) __obj.updateDynamic("tagName")(tagName.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDOMElementOptions]
  }
}

