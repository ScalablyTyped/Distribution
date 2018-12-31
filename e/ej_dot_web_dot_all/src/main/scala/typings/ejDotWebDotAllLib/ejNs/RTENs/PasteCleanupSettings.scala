package typings
package ejDotWebDotAllLib.ejNs.RTENs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PasteCleanupSettings extends js.Object {
  /** This API is used to clean the unwanted css in the elements pasted from word document to editor.
    * @Default {false}
    */
  var cleanCSS: js.UndefOr[scala.Boolean] = js.undefined
  /** This API is used to clean the unwanted elements pasted from word document to editor.
    * @Default {false}
    */
  var cleanElements: js.UndefOr[scala.Boolean] = js.undefined
  /** This API is used to convert the list elements pasted from word document to editor.
    * @Default {false}
    */
  var listConversion: js.UndefOr[scala.Boolean] = js.undefined
  /** This API is used to remove all styles in the elements pasted from word document to editor.
    * @Default {false}
    */
  var removeStyles: js.UndefOr[scala.Boolean] = js.undefined
}

