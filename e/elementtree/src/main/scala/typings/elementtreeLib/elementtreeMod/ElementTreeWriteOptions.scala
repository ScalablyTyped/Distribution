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

