package typings
package ejDotWebDotAllLib.ejNs.ListViewNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FieldSettings extends js.Object {
  /** Defines the HTML attributes such as id, class, styles for the specific list item.
    */
  var attributes: js.UndefOr[js.Any] = js.undefined
  /** Defines the specific field name which contains Boolean values to specify whether the list items to be checked by default or not.
    */
  var checked: js.UndefOr[scala.Boolean] = js.undefined
  /** Defines the specific field name which contains id values for the list items.
    */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /** Defines the class name for image in that specific list items.
    */
  var imageClass: js.UndefOr[java.lang.String] = js.undefined
  /** Defines the URL for the image to be displayed in the list item.
    */
  var imageUrl: js.UndefOr[java.lang.String] = js.undefined
  /** To trigger the mousedown event for specific list items.
    */
  var mouseDown: js.UndefOr[java.lang.String] = js.undefined
  /** To trigger the mouseup event for specific list items.
    */
  var mouseUP: js.UndefOr[java.lang.String] = js.undefined
  /** Defines the URL to be navigated while clicking the list item.
    */
  var navigateUrl: js.UndefOr[java.lang.String] = js.undefined
  /** To define the child level of list items inside the parent items.
    */
  var parentPrimaryKey: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies whether to retain the selection of the list item.
    */
  var persistSelection: js.UndefOr[scala.Boolean] = js.undefined
  /** Specifies whether to prevent the selection of the list item.
    */
  var preventSelection: js.UndefOr[scala.Boolean] = js.undefined
  /** To define the first level of list items.
    */
  var primaryKey: js.UndefOr[java.lang.String] = js.undefined
  /** Defines the specific field name in the data source to load the list with data.
    */
  var text: js.UndefOr[java.lang.String] = js.undefined
}

object FieldSettings {
  @scala.inline
  def apply(
    attributes: js.Any = null,
    checked: js.UndefOr[scala.Boolean] = js.undefined,
    id: java.lang.String = null,
    imageClass: java.lang.String = null,
    imageUrl: java.lang.String = null,
    mouseDown: java.lang.String = null,
    mouseUP: java.lang.String = null,
    navigateUrl: java.lang.String = null,
    parentPrimaryKey: java.lang.String = null,
    persistSelection: js.UndefOr[scala.Boolean] = js.undefined,
    preventSelection: js.UndefOr[scala.Boolean] = js.undefined,
    primaryKey: java.lang.String = null,
    text: java.lang.String = null
  ): FieldSettings = {
    val __obj = js.Dynamic.literal()
    if (attributes != null) __obj.updateDynamic("attributes")(attributes)
    if (!js.isUndefined(checked)) __obj.updateDynamic("checked")(checked)
    if (id != null) __obj.updateDynamic("id")(id)
    if (imageClass != null) __obj.updateDynamic("imageClass")(imageClass)
    if (imageUrl != null) __obj.updateDynamic("imageUrl")(imageUrl)
    if (mouseDown != null) __obj.updateDynamic("mouseDown")(mouseDown)
    if (mouseUP != null) __obj.updateDynamic("mouseUP")(mouseUP)
    if (navigateUrl != null) __obj.updateDynamic("navigateUrl")(navigateUrl)
    if (parentPrimaryKey != null) __obj.updateDynamic("parentPrimaryKey")(parentPrimaryKey)
    if (!js.isUndefined(persistSelection)) __obj.updateDynamic("persistSelection")(persistSelection)
    if (!js.isUndefined(preventSelection)) __obj.updateDynamic("preventSelection")(preventSelection)
    if (primaryKey != null) __obj.updateDynamic("primaryKey")(primaryKey)
    if (text != null) __obj.updateDynamic("text")(text)
    __obj.asInstanceOf[FieldSettings]
  }
}

