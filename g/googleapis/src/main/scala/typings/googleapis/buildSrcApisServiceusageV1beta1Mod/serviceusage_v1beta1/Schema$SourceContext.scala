package typings.googleapis.buildSrcApisServiceusageV1beta1Mod.serviceusage_v1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * `SourceContext` represents information about the source of a protobuf
  * element, like the file in which it is defined.
  */
@js.native
trait Schema$SourceContext extends js.Object {
  /**
    * The path-qualified name of the .proto file that contained the associated
    * protobuf element.  For example:
    * `&quot;google/protobuf/source_context.proto&quot;`.
    */
  var fileName: js.UndefOr[String] = js.native
}

object Schema$SourceContext {
  @scala.inline
  def apply(fileName: String = null): Schema$SourceContext = {
    val __obj = js.Dynamic.literal()
    if (fileName != null) __obj.updateDynamic("fileName")(fileName.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$SourceContext]
  }
}

