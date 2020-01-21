package typings.dymoLabelFramework.dymo.label.framework

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("dymo.label.framework.openLabelXml")
@js.native
object openLabelXml extends js.Object {
  /**
  	 * Loads label content from an XML stream/string.
  	 * Note: This is the preferred way to load/open label files.
  	 * Use XMLHttpRequest() or other standard browser methods to get XML string.
  	 *
  	 * @param labelXml The label definition as an XML string.
  	 * @returns Label object.
  	 */
  def apply(labelXml: String): ILabel = js.native
}

