package typings.firefoxDashWebextDashBrowser

import org.scalablytyped.runtime.NumberDictionary
import typings.firefoxDashWebextDashBrowser.browserNs.pageActionNs.ImageDataType
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
  var imageData: js.UndefOr[ImageDataType | NumberDictionary[ImageDataType]] = js.undefined
  /**
    * Either a relative image path or a dictionary {size -> relative image path} pointing to icon to be set. If
    * the icon is specified as a dictionary, the actual image to be used is chosen depending on screen's pixel
    * density. If the number of image pixels that fit into one screen space unit equals `scale`, then image with
    * size `scale` * 19 will be selected. Initially only scales 1 and 2 will be supported. At least one image must
    * be specified. Note that 'details.path = foo' is equivalent to 'details.imageData = {'19': foo}'
    */
  var path: js.UndefOr[String | NumberDictionary[String]] = js.undefined
  /** The id of the tab for which you want to modify the page action. */
  var tabId: Double
}

object Anon_ImageDataKey {
  @scala.inline
  def apply(
    tabId: Double,
    imageData: ImageDataType | NumberDictionary[ImageDataType] = null,
    path: String | NumberDictionary[String] = null
  ): Anon_ImageDataKey = {
    val __obj = js.Dynamic.literal(tabId = tabId)
    if (imageData != null) __obj.updateDynamic("imageData")(imageData.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ImageDataKey]
  }
}

