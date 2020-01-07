package typings.googleapis.buildSrcApisDigitalassetlinksV1Mod.digitalassetlinks_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Uniquely identifies an asset.  A digital asset is an identifiable and
  * addressable online entity that typically provides some service or content.
  * Examples of assets are websites, Android apps, Twitter feeds, and Plus
  * Pages.
  */
@js.native
trait Schema$Asset extends js.Object {
  /**
    * Set if this is an Android App asset.
    */
  var androidApp: js.UndefOr[Schema$AndroidAppAsset] = js.native
  /**
    * Set if this is a web asset.
    */
  var web: js.UndefOr[Schema$WebAsset] = js.native
}

object Schema$Asset {
  @scala.inline
  def apply(androidApp: Schema$AndroidAppAsset = null, web: Schema$WebAsset = null): Schema$Asset = {
    val __obj = js.Dynamic.literal()
    if (androidApp != null) __obj.updateDynamic("androidApp")(androidApp.asInstanceOf[js.Any])
    if (web != null) __obj.updateDynamic("web")(web.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Asset]
  }
}

