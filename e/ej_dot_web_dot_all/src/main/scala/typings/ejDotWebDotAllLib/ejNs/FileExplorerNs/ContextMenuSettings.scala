package typings
package ejDotWebDotAllLib.ejNs.FileExplorerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ContextMenuSettings extends js.Object {
  /** The customMenuFields property is used to define custom functionality for custom ContextMenu item's which are defined in items property.
               * @Default {[]}
               */
  var customMenuFields: js.UndefOr[js.Array[_]] = js.undefined
  /** The items property is used to configure and group the required ContextMenu items in FileExplorer control.
               * @Default {{% highlight javascript %}{navbar: [NewFolder, Upload, |, Delete, Rename, |, Cut, Copy, Paste, |, Getinfo],cwd: [Refresh, Paste,|, SortBy, |, NewFolder, Upload, |,
               * Getinfo],files: [Open, Download, |, Upload, |, Delete, Rename, |, Cut, Copy, Paste, |, OpenFolderLocation, Getinfo]}{% endhighlight %}}
               */
  var items: js.UndefOr[js.Any] = js.undefined
}

