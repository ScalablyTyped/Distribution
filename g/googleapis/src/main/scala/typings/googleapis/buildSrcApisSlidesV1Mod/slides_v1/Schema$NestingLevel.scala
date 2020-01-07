package typings.googleapis.buildSrcApisSlidesV1Mod.slides_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains properties describing the look and feel of a list bullet at a
  * given level of nesting.
  */
@js.native
trait Schema$NestingLevel extends js.Object {
  /**
    * The style of a bullet at this level of nesting.
    */
  var bulletStyle: js.UndefOr[Schema$TextStyle] = js.native
}

object Schema$NestingLevel {
  @scala.inline
  def apply(bulletStyle: Schema$TextStyle = null): Schema$NestingLevel = {
    val __obj = js.Dynamic.literal()
    if (bulletStyle != null) __obj.updateDynamic("bulletStyle")(bulletStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$NestingLevel]
  }
}

