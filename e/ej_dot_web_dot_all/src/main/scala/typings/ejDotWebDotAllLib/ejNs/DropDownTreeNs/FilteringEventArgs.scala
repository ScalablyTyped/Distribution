package typings
package ejDotWebDotAllLib.ejNs.DropDownTreeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait FilteringEventArgs extends js.Object {
  /** If the event has to be canceled; otherwise, false.
               */
  var cancel: js.UndefOr[scala.Boolean] = js.undefined
  /** Returns the data items of theDropDownTreeView.
               */
  var items: js.UndefOr[js.Any] = js.undefined
  /** DropDownTreeView model.
               */
  var model: js.UndefOr[js.Any] = js.undefined
  /** Returns the search string typed in the search box.
               */
  var searchString: js.UndefOr[java.lang.String] = js.undefined
  /** Selected item's text.
               */
  var selectedText: js.UndefOr[java.lang.String] = js.undefined
  /** Event name
               */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

