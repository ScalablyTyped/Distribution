package typings.gapiDotClientDotServicemanagement.gapiNs.clientNs.servicemanagementNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SourceContext extends js.Object {
  /**
    * The path-qualified name of the .proto file that contained the associated
    * protobuf element.  For example: `"google/protobuf/source_context.proto"`.
    */
  var fileName: js.UndefOr[String] = js.undefined
}

object SourceContext {
  @scala.inline
  def apply(fileName: String = null): SourceContext = {
    val __obj = js.Dynamic.literal()
    if (fileName != null) __obj.updateDynamic("fileName")(fileName)
    __obj.asInstanceOf[SourceContext]
  }
}

