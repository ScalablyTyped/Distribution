package typings.elementtree.elementtreeMod

import typings.elementtree.elementtreeStrings.text
import typings.elementtree.elementtreeStrings.xml
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ElementTreeWriteOptions extends js.Object {
  var default_namespace: js.UndefOr[String] = js.undefined
  var encoding: js.UndefOr[String] = js.undefined
   // default is 'utf-8'
  var indent: js.UndefOr[Double] = js.undefined
  var method: js.UndefOr[xml | text] = js.undefined
   // default is 'xml'
  var xml_declaration: js.UndefOr[Boolean] = js.undefined
}

object ElementTreeWriteOptions {
  @scala.inline
  def apply(
    default_namespace: String = null,
    encoding: String = null,
    indent: Int | Double = null,
    method: xml | text = null,
    xml_declaration: js.UndefOr[Boolean] = js.undefined
  ): ElementTreeWriteOptions = {
    val __obj = js.Dynamic.literal()
    if (default_namespace != null) __obj.updateDynamic("default_namespace")(default_namespace)
    if (encoding != null) __obj.updateDynamic("encoding")(encoding)
    if (indent != null) __obj.updateDynamic("indent")(indent.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (!js.isUndefined(xml_declaration)) __obj.updateDynamic("xml_declaration")(xml_declaration)
    __obj.asInstanceOf[ElementTreeWriteOptions]
  }
}

