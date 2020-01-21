package typings.googleapis.clouddebuggerV2Mod.clouddebuggerV2

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An ExtendedSourceContext is a SourceContext combined with additional
  * details describing the context.
  */
@js.native
trait SchemaExtendedSourceContext extends js.Object {
  /**
    * Any source context.
    */
  var context: js.UndefOr[SchemaSourceContext] = js.native
  /**
    * Labels with user defined metadata.
    */
  var labels: js.UndefOr[StringDictionary[String]] = js.native
}

object SchemaExtendedSourceContext {
  @scala.inline
  def apply(context: SchemaSourceContext = null, labels: StringDictionary[String] = null): SchemaExtendedSourceContext = {
    val __obj = js.Dynamic.literal()
    if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    if (labels != null) __obj.updateDynamic("labels")(labels.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaExtendedSourceContext]
  }
}

