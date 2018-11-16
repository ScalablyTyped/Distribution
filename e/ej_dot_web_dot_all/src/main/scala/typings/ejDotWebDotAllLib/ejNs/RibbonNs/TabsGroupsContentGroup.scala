package typings
package ejDotWebDotAllLib.ejNs.RibbonNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait TabsGroupsContentGroup extends js.Object {
  /** Specifies the Syncfusion button members, events by using this buttonSettings.
               * @Default {Object}
               */
  var buttonSettings: js.UndefOr[js.Any] = js.undefined
  /** It is used to set the count of gallery contents in a row.
               * @Default {null}
               */
  var columns: js.UndefOr[scala.Double] = js.undefined
  /** Specifies the custom items such as div, table, controls as custom controls with the type &quot;ej.Ribbon.Type.Custom&quot; in the groups.
               * @Default {null}
               */
  var contentID: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies the CSS class property to apply styles to the button, split, dropdown controls in the groups.
               * @Default {null}
               */
  var cssClass: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies the Syncfusion button and menu as gallery extra items.
               * @Default {Array}
               */
  var customGalleryItems: js.UndefOr[js.Array[TabsGroupsContentGroupsCustomGalleryItem]] = js.undefined
  /** Provides custom tooltip for button, split button, dropdown list, toggle button, custom controls in the sub groups. Text and HTML support are also provided for title and content.
               * @Default {Object}
               */
  var customToolTip: js.UndefOr[TabsGroupsContentGroupsCustomToolTip] = js.undefined
  /** Specifies the Syncfusion dropdown list members, events by using this dropdownSettings.
               * @Default {Object}
               */
  var dropdownSettings: js.UndefOr[js.Any] = js.undefined
  /** Specifies the separator to the control that is in row type group. The separator separates the control from the next control in the group. Set &quot;true&quot; to enable the
               * separator.
               * @Default {false}
               */
  var enableSeparator: js.UndefOr[scala.Boolean] = js.undefined
  /** Sets the count of gallery contents in a row, when the gallery is in expanded state.
               * @Default {null}
               */
  var expandedColumns: js.UndefOr[scala.Double] = js.undefined
  /** Defines each gallery content.
               * @Default {Array}
               */
  var galleryItems: js.UndefOr[js.Array[TabsGroupsContentGroupsGalleryItem]] = js.undefined
  /** Specifies the Id for button, split button, dropdown list, toggle button, gallery, custom controls in the sub groups.
               * @Default {null}
               */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies the size for button, split button controls. Set &quot;true&quot; for big size and &quot;false&quot; for small size.
               * @Default {null}
               */
  var isBig: js.UndefOr[scala.Boolean] = js.undefined
  /** When isMobileOnly is true,its shows in mobile toolbar.isResponsive should be true for using this property.
               * @Default {false}
               */
  var isMobileOnly: js.UndefOr[scala.Boolean] = js.undefined
  /** Sets the height of each gallery content.
               * @Default {null}
               */
  var itemHeight: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  /** Sets the width of each gallery content.
               * @Default {null}
               */
  var itemWidth: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  /** To add,show and hide controls in Quick Access toolbar.
               * @Default {ej.Ribbon.QuickAccessMode.None}
               */
  var quickAccessMode: js.UndefOr[QuickAccessMode | java.lang.String] = js.undefined
  /** Specifies the Syncfusion split button members, events by using this splitButtonSettings.
               * @Default {Object}
               */
  var splitButtonSettings: js.UndefOr[js.Any] = js.undefined
  /** Specifies the text for button, split button, toggle button controls in the sub groups.
               * @Default {null}
               */
  var text: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies the Syncfusion toggle button members, events by using toggleButtonSettings.
               * @Default {Object}
               */
  var toggleButtonSettings: js.UndefOr[js.Any] = js.undefined
  /** Specifies the tooltip for button, split button, dropdown list, toggle button, custom controls in the sub groups.
               * @Default {null}
               */
  var toolTip: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies the type as &quot;ej.Ribbon.Type.Button&quot; or &quot;ej.Ribbon.Type.SplitButton&quot; or &quot;ej.Ribbon.Type.DropDownList&quot; or
               * &quot;ej.Ribbon.Type.ToggleButton&quot; or &quot;ej.Ribbon.Type.Custom&quot; or &quot;ej.Ribbon.Type.Gallery&quot; to render button, split, dropdown, toggle button, gallery,
               * custom controls.
               * @Default {ej.Ribbon.Type.Button}
               */
  var `type`: js.UndefOr[Type | java.lang.String] = js.undefined
}

