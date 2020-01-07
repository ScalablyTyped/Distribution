package typings.googleapis.buildSrcApisClouddebuggerV2Mod.clouddebugger_v2

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An ExtendedSourceContext is a SourceContext combined with additional
  * details describing the context.
  */
@js.native
trait Schema$ExtendedSourceContext extends js.Object {
  /**
    * Any source context.
    */
  var context: js.UndefOr[Schema$SourceContext] = js.native
  /**
    * Labels with user defined metadata.
    */
  var labels: js.UndefOr[StringDictionary[String]] = js.native
}

object Schema$ExtendedSourceContext {
  @scala.inline
  def apply(context: Schema$SourceContext = null, labels: StringDictionary[String] = null): Schema$ExtendedSourceContext = {
    val __obj = js.Dynamic.literal()
    if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    if (labels != null) __obj.updateDynamic("labels")(labels.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ExtendedSourceContext]
  }
}

