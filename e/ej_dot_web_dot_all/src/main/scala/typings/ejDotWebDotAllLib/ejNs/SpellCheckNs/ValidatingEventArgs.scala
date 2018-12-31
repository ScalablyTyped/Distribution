package typings
package ejDotWebDotAllLib.ejNs.SpellCheckNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ValidatingEventArgs extends js.Object {
  /** Returns the cancel option value.
    */
  var cancel: js.UndefOr[scala.Boolean] = js.undefined
  /** Returns the change word to replace the error word.
    */
  var changeWord: js.UndefOr[java.lang.String] = js.undefined
  /** Returns the error word to change.
    */
  var changeableWord: js.UndefOr[java.lang.String] = js.undefined
  /** Returns the custom word to add into dictionary file.
    */
  var customWord: js.UndefOr[java.lang.String] = js.undefined
  /** Returns the error word to ignore.
    */
  var ignoreWord: js.UndefOr[java.lang.String] = js.undefined
  /** Returns the index of an error word.
    */
  var index: js.UndefOr[scala.Double] = js.undefined
  /** Returns the SpellCheck model.
    */
  var model: js.UndefOr[Model] = js.undefined
  /** Returns the validating request type.
    */
  var requestType: js.UndefOr[java.lang.String] = js.undefined
  /** Returns the target content.
    */
  var targetContent: js.UndefOr[java.lang.String] = js.undefined
  /** Returns the name of the event.
    */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

