package typings.googleapis.buildSrcApisAdexchangebuyer2V2beta1Mod.adexchangebuyer2_v2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @OutputOnly The type of platform the restriction applies to.
  */
@js.native
trait Schema$PlatformContext extends js.Object {
  /**
    * The platforms this restriction applies to.
    */
  var platforms: js.UndefOr[js.Array[String]] = js.native
}

object Schema$PlatformContext {
  @scala.inline
  def apply(platforms: js.Array[String] = null): Schema$PlatformContext = {
    val __obj = js.Dynamic.literal()
    if (platforms != null) __obj.updateDynamic("platforms")(platforms.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$PlatformContext]
  }
}

