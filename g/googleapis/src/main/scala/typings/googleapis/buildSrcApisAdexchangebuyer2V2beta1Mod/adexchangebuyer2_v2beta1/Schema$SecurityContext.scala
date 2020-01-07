package typings.googleapis.buildSrcApisAdexchangebuyer2V2beta1Mod.adexchangebuyer2_v2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @OutputOnly A security context.
  */
@js.native
trait Schema$SecurityContext extends js.Object {
  /**
    * The security types in this context.
    */
  var securities: js.UndefOr[js.Array[String]] = js.native
}

object Schema$SecurityContext {
  @scala.inline
  def apply(securities: js.Array[String] = null): Schema$SecurityContext = {
    val __obj = js.Dynamic.literal()
    if (securities != null) __obj.updateDynamic("securities")(securities.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$SecurityContext]
  }
}

