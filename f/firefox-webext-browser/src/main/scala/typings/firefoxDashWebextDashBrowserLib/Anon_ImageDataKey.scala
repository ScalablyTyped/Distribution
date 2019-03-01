package typings
package firefoxDashWebextDashBrowserLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ImageDataKey extends js.Object {
  /**
    * Either an ImageData object or a dictionary {size -> ImageData} representing icon to be set. If the icon is
    * specified as a dictionary, the actual image to be used is chosen depending on screen's pixel density. If the
    * number of image pixels that fit into one screen space unit equals `scale`, then image with size `scale` * 19
    * will be selected. Initially only scales 1 and 2 will be supported. At least one image must be specified.
    * Note that 'details.imageData = foo' is equivalent to 'details.imageData = {'19': foo}'
    */
  var imageData: js.UndefOr[
    firefoxDashWebextDashBrowserLib.browserNs.browserActionNs.ImageDataType | org.scalablytyped.runtime.NumberDictionary[firefoxDashWebextDashBrowserLib.browserNs.browserActionNs.ImageDataType]
  ] = js.undefined
  /**
    * Either a relative image path or a dictionary {size -> relative image path} pointing to icon to be set. If
    * the icon is specified as a dictionary, the actual image to be used is chosen depending on screen's pixel
    * density. If the number of image pixels that fit into one screen space unit equals `scale`, then image with
    * size `scale` * 19 will be selected. Initially only scales 1 and 2 will be supported. At least one image must
    * be specified. Note that 'details.path = foo' is equivalent to 'details.imageData = {'19': foo}'
    */
  var path: js.UndefOr[java.lang.String | org.scalablytyped.runtime.NumberDictionary[java.lang.String]] = js.undefined
  /**
    * When setting a value, it will be specific to the specified tab, and will automatically reset when the tab
    * navigates. When getting, specifies the tab to get the value from; if there is no tab-specific value, the
    * window one will be inherited.
    */
  var tabId: js.UndefOr[scala.Double] = js.undefined
  /**
    * When setting a value, it will be specific to the specified window. When getting, specifies the window to get
    * the value from; if there is no window-specific value, the global one will be inherited.
    */
  var windowId: js.UndefOr[scala.Double] = js.undefined
}

object Anon_ImageDataKey {
  @scala.inline
  def apply(
    imageData: firefoxDashWebextDashBrowserLib.browserNs.browserActionNs.ImageDataType | org.scalablytyped.runtime.NumberDictionary[firefoxDashWebextDashBrowserLib.browserNs.browserActionNs.ImageDataType] = null,
    path: java.lang.String | org.scalablytyped.runtime.NumberDictionary[java.lang.String] = null,
    tabId: scala.Int | scala.Double = null,
    windowId: scala.Int | scala.Double = null
  ): Anon_ImageDataKey = {
    val __obj = js.Dynamic.literal()
    if (imageData != null) __obj.updateDynamic("imageData")(imageData.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (tabId != null) __obj.updateDynamic("tabId")(tabId.asInstanceOf[js.Any])
    if (windowId != null) __obj.updateDynamic("windowId")(windowId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ImageDataKey]
  }
}

