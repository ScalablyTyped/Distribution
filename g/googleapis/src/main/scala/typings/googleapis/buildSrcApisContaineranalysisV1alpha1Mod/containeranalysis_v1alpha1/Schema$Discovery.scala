package typings.googleapis.buildSrcApisContaineranalysisV1alpha1Mod.containeranalysis_v1alpha1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A note that indicates a type of analysis a provider would perform. This
  * note exists in a provider&#39;s project. A `Discovery` occurrence is
  * created in a consumer&#39;s project at the start of analysis. The
  * occurrence&#39;s operation will indicate the status of the analysis.
  * Absence of an occurrence linked to this note for a resource indicates that
  * analysis hasn&#39;t started.
  */
@js.native
trait Schema$Discovery extends js.Object {
  /**
    * The kind of analysis that is handled by this discovery.
    */
  var analysisKind: js.UndefOr[String] = js.native
}

object Schema$Discovery {
  @scala.inline
  def apply(analysisKind: String = null): Schema$Discovery = {
    val __obj = js.Dynamic.literal()
    if (analysisKind != null) __obj.updateDynamic("analysisKind")(analysisKind.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Discovery]
  }
}

