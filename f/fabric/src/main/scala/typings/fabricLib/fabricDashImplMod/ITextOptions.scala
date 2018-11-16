package typings
package fabricLib.fabricDashImplMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ITextOptions extends IObjectOptions {
  /**
       * Character spacing
       */
  var charSpacing: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Font family
  	 */
  var fontFamily: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Font size (in pixels)
  	 */
  var fontSize: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Font style . Possible values?: "", "normal", "italic" or "oblique".
  	 */
  var fontStyle: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Font weight (e.g. bold, normal, 400, 600, 800)
  	 */
  var fontWeight: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  /**
  	 * Line height
  	 */
  var lineHeight: js.UndefOr[scala.Double] = js.undefined
  /**
       * Text decoration linethrough.
       * @type Boolean
       * @default
       */
  var linethrough: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * Text decoration overline.
       * @type Boolean
       * @default
       */
  var overline: js.UndefOr[scala.Boolean] = js.undefined
  var path: js.UndefOr[java.lang.String] = js.undefined
  var text: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Text alignment. Possible values?: "left", "center", or "right".
  	 */
  var textAlign: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Background color of text lines
  	 */
  var textBackgroundColor: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Text decoration Possible values?: "", "underline", "overline" or "line-through".
       * Feels like this has been deprecated in favor of underline, overline, linethrough props
  	 */
  var textDecoration: js.UndefOr[java.lang.String] = js.undefined
  /**
       * Text decoration underline.
       * @type Boolean
       * @default
       */
  var underline: js.UndefOr[scala.Boolean] = js.undefined
  var useNative: js.UndefOr[scala.Boolean] = js.undefined
}

