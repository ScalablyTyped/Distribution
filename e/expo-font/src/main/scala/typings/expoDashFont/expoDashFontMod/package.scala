package typings.expoDashFont

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object expoDashFontMod {
  import typings.expoDashAsset.expoDashAssetMod.Asset

  /**
    * A font source can be a URI, a module ID, or an Expo Asset.
    */
  type FontSource = String | Double | Asset
}
