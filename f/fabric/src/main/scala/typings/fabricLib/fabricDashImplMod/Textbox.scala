package typings
package fabricLib.fabricDashImplMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fabric/fabric-impl", "Textbox")
@js.native
class Textbox protected () extends IText {
  /**
       * Constructor
       * @param text Text string
       * @param [options] Options object
       */
  def this(text: java.lang.String) = this()
  /**
       * Constructor
       * @param text Text string
       * @param [options] Options object
       */
  def this(text: java.lang.String, options: IITextOptions) = this()
  /**
       * Get minimum width of text box
       * @return {Number}
       */
  def getMinWidth(): scala.Double = js.native
  /**
       * Detect if the text line is ended with an hard break
       * text and itext do not have wrapping, return false
       * @param {Number} lineIndex text to split
       * @return {Boolean}
       */
  def isEndOfWrapping(lineIndex: scala.Double): scala.Boolean = js.native
}

