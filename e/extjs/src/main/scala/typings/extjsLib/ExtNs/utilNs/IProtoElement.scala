package typings
package extjsLib.ExtNs.utilNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IProtoElement
  extends extjsLib.ExtNs.IBase {
  /** [Method] Adds class to the element
  		* @param cls String One or more classnames separated with spaces.
  		* @returns Ext.util.ProtoElement this
  		*/
  var addCls: js.UndefOr[js.Function1[/* cls */ js.UndefOr[java.lang.String], this.type]] = js.undefined
  /** [Property] (String) */
  var clsProp: js.UndefOr[java.lang.String] = js.undefined
  /** [Method] Indicates that the current state of the object has been flushed to the DOM so we need to track any subsequent changes */
  var flush: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Method] True if the element has given class
  		* @param cls String
  		* @returns Boolean
  		*/
  var hasCls: js.UndefOr[js.Function1[/* cls */ js.UndefOr[java.lang.String], scala.Boolean]] = js.undefined
  /** [Method] Removes class from the element
  		* @param cls String One or more classnames separated with spaces.
  		* @returns Ext.util.ProtoElement this
  		*/
  var removeCls: js.UndefOr[js.Function1[/* cls */ js.UndefOr[java.lang.String], this.type]] = js.undefined
  /** [Property] (String) */
  var removedProp: js.UndefOr[java.lang.String] = js.undefined
  /** [Method] Adds styles to the element
  		* @param prop String/Object The style property to be set, or an object of multiple styles.
  		* @param value String The value to apply to the given property.
  		* @returns Ext.util.ProtoElement this
  		*/
  var setStyle: js.UndefOr[
    js.Function2[/* prop */ js.UndefOr[js.Any], /* value */ js.UndefOr[java.lang.String], this.type]
  ] = js.undefined
  /** [Property] (Boolean) */
  var styleIsText: js.UndefOr[scala.Boolean] = js.undefined
  /** [Property] (String) */
  var styleProp: js.UndefOr[java.lang.String] = js.undefined
  /** [Method] Writes style and class properties to given object
  		* @param to Object
  		* @returns Object to
  		*/
  var writeTo: js.UndefOr[js.Function1[/* to */ js.UndefOr[js.Any], _]] = js.undefined
}

