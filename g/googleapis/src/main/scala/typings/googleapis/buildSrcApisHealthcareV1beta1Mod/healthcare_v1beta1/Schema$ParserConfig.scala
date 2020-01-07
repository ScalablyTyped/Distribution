package typings.googleapis.buildSrcApisHealthcareV1beta1Mod.healthcare_v1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The configuration for the parser. It determines how the server parses the
  * messages.
  */
@js.native
trait Schema$ParserConfig extends js.Object {
  /**
    * Determines whether messages with no header are allowed.
    */
  var allowNullHeader: js.UndefOr[Boolean] = js.native
  /**
    * Byte(s) to be used as the segment terminator. If this is unset,
    * &#39;\r&#39; will be used as segment terminator.
    */
  var segmentTerminator: js.UndefOr[String] = js.native
}

object Schema$ParserConfig {
  @scala.inline
  def apply(allowNullHeader: js.UndefOr[Boolean] = js.undefined, segmentTerminator: String = null): Schema$ParserConfig = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowNullHeader)) __obj.updateDynamic("allowNullHeader")(allowNullHeader.asInstanceOf[js.Any])
    if (segmentTerminator != null) __obj.updateDynamic("segmentTerminator")(segmentTerminator.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ParserConfig]
  }
}

