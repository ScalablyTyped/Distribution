package typings.dymoDashLabelDashFramework.dymo.label.framework

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("dymo.label.framework.renderLabel")
@js.native
object renderLabel extends js.Object {
  /**
  	 * Creates a label raster image that can be used for label previewing.
  	 * Returns a string that is a base64-encoded PNG stream of the label image.
  	 * This string can be used as data: url for  element.
  	 * Note: data: urls are not supported by IE6 and IE7. IE8 supports them with a 32KB limit (so it may not be possible to preview 'large' labels).
  	 *
    * @param labelXml Label to preview.
    * @param renderParamsXml The rendering parameters, such as shadow depth, label color, etc. See [LabelRenderParams.xsd]{@link http://labelwriter.com/software/dls/sdk/LabelRenderParams.xsd}.
    * @param printerName The name of the printer that the preview is generated for.
  	 *   The preview/output can be different for different printers, especially for tape printers
  	 *   with different print head sizes. If it is not important what printer the label is
  	 *   printed to, an empty string can be passed. In this case, the default printer metrics
  	 *   will be used. The default is LW400 for LabelWriter printers and LW400 DUO Tape for tape printers.
  	 *
  	 * @returns A base64-encoded PNG stream of the label image.
  	 */
  def apply(labelXml: String, renderParamsXml: String, printerName: String): String = js.native
}

