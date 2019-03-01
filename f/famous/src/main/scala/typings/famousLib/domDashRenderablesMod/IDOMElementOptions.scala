package typings
package famousLib.domDashRenderablesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDOMElementOptions extends js.Object {
  var attributes: js.UndefOr[org.scalablytyped.runtime.StringDictionary[java.lang.String]] = js.undefined
  var classes: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var content: js.UndefOr[java.lang.String] = js.undefined
  var cutout: js.UndefOr[scala.Boolean] = js.undefined
  var id: js.UndefOr[java.lang.String] = js.undefined
  var properties: js.UndefOr[org.scalablytyped.runtime.StringDictionary[java.lang.String]] = js.undefined
  var tagName: js.UndefOr[java.lang.String] = js.undefined
}

object IDOMElementOptions {
  @scala.inline
  def apply(
    attributes: org.scalablytyped.runtime.StringDictionary[java.lang.String] = null,
    classes: js.Array[java.lang.String] = null,
    content: java.lang.String = null,
    cutout: js.UndefOr[scala.Boolean] = js.undefined,
    id: java.lang.String = null,
    properties: org.scalablytyped.runtime.StringDictionary[java.lang.String] = null,
    tagName: java.lang.String = null
  ): IDOMElementOptions = {
    val __obj = js.Dynamic.literal()
    if (attributes != null) __obj.updateDynamic("attributes")(attributes)
    if (classes != null) __obj.updateDynamic("classes")(classes)
    if (content != null) __obj.updateDynamic("content")(content)
    if (!js.isUndefined(cutout)) __obj.updateDynamic("cutout")(cutout)
    if (id != null) __obj.updateDynamic("id")(id)
    if (properties != null) __obj.updateDynamic("properties")(properties)
    if (tagName != null) __obj.updateDynamic("tagName")(tagName)
    __obj.asInstanceOf[IDOMElementOptions]
  }
}

