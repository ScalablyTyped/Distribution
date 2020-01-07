package typings.googleapis.buildSrcApisDataflowV1b3Mod.dataflow_v1b3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Specification of one of the bundles produced as a result of splitting a
  * Source (e.g. when executing a SourceSplitRequest, or when splitting an
  * active task using WorkItemStatus.dynamic_source_split), relative to the
  * source being split.
  */
@js.native
trait Schema$DerivedSource extends js.Object {
  /**
    * What source to base the produced source on (if any).
    */
  var derivationMode: js.UndefOr[String] = js.native
  /**
    * Specification of the source.
    */
  var source: js.UndefOr[Schema$Source] = js.native
}

object Schema$DerivedSource {
  @scala.inline
  def apply(derivationMode: String = null, source: Schema$Source = null): Schema$DerivedSource = {
    val __obj = js.Dynamic.literal()
    if (derivationMode != null) __obj.updateDynamic("derivationMode")(derivationMode.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$DerivedSource]
  }
}

