package typings
package ejDotWebDotAllLib.ejNs.PagerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Model extends js.Object {
  /** Triggers when the current page value of the Pager control is changed.
               */
  var change: js.UndefOr[js.Function1[/* e */ ChangeEventArgs, scala.Unit]] = js.undefined
  /** Triggered when pager numeric item is clicked in pager control.
               */
  var click: js.UndefOr[js.Function1[/* e */ ClickEventArgs, scala.Unit]] = js.undefined
  /** Triggered when Pager control is successfully created.
               */
  var create: js.UndefOr[js.Function1[/* e */ CreateEventArgs, scala.Unit]] = js.undefined
  /** Sets the root CSS class, which can be used for customization of pager control.
               */
  var cssClass: js.UndefOr[java.lang.String] = js.undefined
  /** Gets or sets a value that indicates whether to define which page to display currently in pager.
               * @Default {1}
               */
  var currentPage: js.UndefOr[scala.Double] = js.undefined
  /** Gets or sets a value that indicates whether to display the custom text message in Pager.
               */
  var customText: js.UndefOr[java.lang.String] = js.undefined
  /** Triggered when Pager control is successfully destroyed.
               */
  var destroy: js.UndefOr[js.Function1[/* e */ DestroyEventArgs, scala.Unit]] = js.undefined
  /** Gets or sets a value that indicates whether to display the external Message in Pager.
               * @Default {false}
               */
  var enableExternalMessage: js.UndefOr[scala.Boolean] = js.undefined
  /** Gets or sets a value that indicates whether to pass the current page information as a query string along with the URL while navigating to other page.
               * @Default {false}
               */
  var enableQueryString: js.UndefOr[scala.Boolean] = js.undefined
  /** Align content in the pager control from right to left by setting the property as true.
               * @Default {false}
               */
  var enableRTL: js.UndefOr[scala.Boolean] = js.undefined
  /** Enable or disable the Pager control.
               * @Default {true}
               */
  var enabled: js.UndefOr[scala.Boolean] = js.undefined
  /** Gets or sets a value that indicates whether to display the external Message in Pager.
               */
  var externalMessage: js.UndefOr[java.lang.String] = js.undefined
  /** Enables or disables responsive support for the Pager control items on window resize.
               * @Default {false}
               */
  var isResponsive: js.UndefOr[scala.Boolean] = js.undefined
  /** Gets or sets a value that indicates whether to customizing the user interface (UI) as locale-specific in order to display regional data i.e. in a language and culture specific to
               * a particular country or region.
               * @Default {en-US}
               */
  var locale: js.UndefOr[java.lang.String] = js.undefined
  /** Gets or sets a value that indicates whether to define the number of pages displayed in the pager for navigation.
               * @Default {10}
               */
  var pageCount: js.UndefOr[scala.Double] = js.undefined
  /** Gets or sets a value that indicates whether to define the number of records displayed per page.
               * @Default {12}
               */
  var pageSize: js.UndefOr[scala.Double] = js.undefined
  /** It allows to have multiple choices of pageSize values for Pager control. The &quot;pageSize&quot; API value of the pager will be updated depending upon the value being selected
               * from the dropdown.
               * @Default {null}
               */
  var pageSizeList: js.UndefOr[js.Array[_]] = js.undefined
  /** Indicates the pageSizeMessage to be displayed in Pager when pageSizeList API is defined.
               */
  var pageSizeMessage: js.UndefOr[java.lang.String] = js.undefined
  /** Triggered when a value is selected in the pageSizeList dropdown.
               */
  var pageSizeSelected: js.UndefOr[js.Function1[/* e */ PageSizeSelectedEventArgs, scala.Unit]] = js.undefined
  /** Shows or hides the current page information in pager footer.
               * @Default {true}
               */
  var showPageInfo: js.UndefOr[scala.Boolean] = js.undefined
  /** Template option allows to customize UI appearance of the ejPager by defining their own page layout.
               * @Default {null}
               */
  var template: js.UndefOr[java.lang.String] = js.undefined
  /** Get or sets a value of total number of pages in the pager. The totalPages value is calculated based on page size and total records.
               * @Default {null}
               */
  var totalPages: js.UndefOr[scala.Double] = js.undefined
  /** Get the value of total number of records which is bound to a data item.
               * @Default {null}
               */
  var totalRecordsCount: js.UndefOr[scala.Double] = js.undefined
}

