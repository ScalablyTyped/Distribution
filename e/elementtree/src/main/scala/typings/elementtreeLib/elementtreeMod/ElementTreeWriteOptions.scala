package typings
package elementtreeLib.elementtreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ElementTreeWriteOptions extends js.Object {
  var default_namespace: js.UndefOr[java.lang.String] = js.undefined
  var encoding: js.UndefOr[java.lang.String] = js.undefined
   // default is 'utf-8'
  var indent: js.UndefOr[scala.Double] = js.undefined
  var method: js.UndefOr[
    elementtreeLib.elementtreeLibStrings.xml | elementtreeLib.elementtreeLibStrings.text
  ] = js.undefined
   // default is 'xml'
  var xml_declaration: js.UndefOr[scala.Boolean] = js.undefined
}

object ElementTreeWriteOptions {
  @scala.inline
  def apply(
    default_namespace: java.lang.String = null,
    encoding: java.lang.String = null,
    indent: scala.Int | scala.Double = null,
    method: elementtreeLib.elementtreeLibStrings.xml | elementtreeLib.elementtreeLibStrings.text = null,
    xml_declaration: js.UndefOr[scala.Boolean] = js.undefined
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

