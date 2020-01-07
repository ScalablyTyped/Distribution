package typings.googleapis.buildSrcApisServicemanagementV1Mod.servicemanagement_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a diagnostic message (error or warning)
  */
@js.native
trait Schema$Diagnostic extends js.Object {
  /**
    * The kind of diagnostic information provided.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * File name and line number of the error or warning.
    */
  var location: js.UndefOr[String] = js.native
  /**
    * Message describing the error or warning.
    */
  var message: js.UndefOr[String] = js.native
}

object Schema$Diagnostic {
  @scala.inline
  def apply(kind: String = null, location: String = null, message: String = null): Schema$Diagnostic = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Diagnostic]
  }
}

