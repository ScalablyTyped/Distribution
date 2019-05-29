package typings
package firefoxDashWebextDashBrowserLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ImageDataKeyPath extends js.Object {
  /**
    * Either an ImageData object or a dictionary {size -> ImageData} representing icon to be set. If the icon is
    * specified as a dictionary, the actual image to be used is chosen depending on screen's pixel density. If the
    * number of image pixels that fit into one screen space unit equals `scale`, then image with size `scale` * 19
    * will be selected. Initially only scales 1 and 2 will be supported. At least one image must be specified.
    * Note that 'details.imageData = foo' is equivalent to 'details.imageData = {'19': foo}'
    */
  var imageData: js.UndefOr[
    firefoxDashWebextDashBrowserLib.browserNs.sidebarActionNs.ImageDataType | org.scalablytyped.runtime.NumberDictionary[firefoxDashWebextDashBrowserLib.browserNs.sidebarActionNs.ImageDataType]
  ] = js.undefined
  /**
    * Either a relative image path or a dictionary {size -> relative image path} pointing to icon to be set. If
    * the icon is specified as a dictionary, the actual image to be used is chosen depending on screen's pixel
    * density. If the number of image pixels that fit into one screen space unit equals `scale`, then image with
    * size `scale` * 19 will be selected. Initially only scales 1 and 2 will be supported. At least one image must
    * be specified. Note that 'details.path = foo' is equivalent to 'details.imageData = {'19': foo}'
    */
  var path: js.UndefOr[java.lang.String | org.scalablytyped.runtime.StringDictionary[java.lang.String]] = js.undefined
  /** Sets the sidebar icon for the tab specified by tabId. Automatically resets when the tab is closed. */
  var tabId: js.UndefOr[scala.Double] = js.undefined
  /** Sets the sidebar icon for the window specified by windowId. */
  var windowId: js.UndefOr[scala.Double] = js.undefined
}

object Anon_ImageDataKeyPath {
  @scala.inline
  def apply(
    imageData: firefoxDashWebextDashBrowserLib.browserNs.sidebarActionNs.ImageDataType | org.scalablytyped.runtime.NumberDictionary[firefoxDashWebextDashBrowserLib.browserNs.sidebarActionNs.ImageDataType] = null,
    path: java.lang.String | org.scalablytyped.runtime.StringDictionary[java.lang.String] = null,
    tabId: scala.Int | scala.Double = null,
    windowId: scala.Int | scala.Double = null
  ): Anon_ImageDataKeyPath = {
    val __obj = js.Dynamic.literal()
    if (imageData != null) __obj.updateDynamic("imageData")(imageData.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (tabId != null) __obj.updateDynamic("tabId")(tabId.asInstanceOf[js.Any])
    if (windowId != null) __obj.updateDynamic("windowId")(windowId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ImageDataKeyPath]
  }
}

