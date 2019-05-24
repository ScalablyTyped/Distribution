package typings
package electronLib.ElectronNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SourcesOptions extends js.Object {
  /**
    * Set to true to enable fetching window icons. The default value is false. When
    * false the appIcon property of the sources return null. Same if a source has the
    * type screen.
    */
  var fetchWindowIcons: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The size that the media source thumbnail should be scaled to. Default is 150 x
    * 150.
    */
  var thumbnailSize: js.UndefOr[Size] = js.undefined
  /**
    * An array of Strings that lists the types of desktop sources to be captured,
    * available types are screen and window.
    */
  var types: js.Array[java.lang.String]
}

object SourcesOptions {
  @scala.inline
  def apply(
    types: js.Array[java.lang.String],
    fetchWindowIcons: js.UndefOr[scala.Boolean] = js.undefined,
    thumbnailSize: Size = null
  ): SourcesOptions = {
    val __obj = js.Dynamic.literal(types = types)
    if (!js.isUndefined(fetchWindowIcons)) __obj.updateDynamic("fetchWindowIcons")(fetchWindowIcons)
    if (thumbnailSize != null) __obj.updateDynamic("thumbnailSize")(thumbnailSize)
    __obj.asInstanceOf[SourcesOptions]
  }
}

