package typings.googleapis.buildSrcApisDataflowV1b3Mod.dataflow_v1b3

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A source that records can be read and decoded from.
  */
@js.native
trait Schema$Source extends js.Object {
  /**
    * While splitting, sources may specify the produced bundles as differences
    * against another source, in order to save backend-side memory and allow
    * bigger jobs. For details, see SourceSplitRequest. To support this use
    * case, the full set of parameters of the source is logically obtained by
    * taking the latest explicitly specified value of each parameter in the
    * order: base_specs (later items win), spec (overrides anything in
    * base_specs).
    */
  var baseSpecs: js.UndefOr[js.Array[StringDictionary[_]]] = js.native
  /**
    * The codec to use to decode data read from the source.
    */
  var codec: js.UndefOr[StringDictionary[js.Any]] = js.native
  /**
    * Setting this value to true hints to the framework that the source
    * doesn&#39;t need splitting, and using SourceSplitRequest on it would
    * yield SOURCE_SPLIT_OUTCOME_USE_CURRENT.  E.g. a file splitter may set
    * this to true when splitting a single file into a set of byte ranges of
    * appropriate size, and set this to false when splitting a filepattern into
    * individual files. However, for efficiency, a file splitter may decide to
    * produce file subranges directly from the filepattern to avoid a splitting
    * round-trip.  See SourceSplitRequest for an overview of the splitting
    * process.  This field is meaningful only in the Source objects populated
    * by the user (e.g. when filling in a DerivedSource). Source objects
    * supplied by the framework to the user don&#39;t have this field
    * populated.
    */
  var doesNotNeedSplitting: js.UndefOr[Boolean] = js.native
  /**
    * Optionally, metadata for this source can be supplied right away, avoiding
    * a SourceGetMetadataOperation roundtrip (see SourceOperationRequest). This
    * field is meaningful only in the Source objects populated by the user
    * (e.g. when filling in a DerivedSource). Source objects supplied by the
    * framework to the user don&#39;t have this field populated.
    */
  var metadata: js.UndefOr[Schema$SourceMetadata] = js.native
  /**
    * The source to read from, plus its parameters.
    */
  var spec: js.UndefOr[StringDictionary[js.Any]] = js.native
}

object Schema$Source {
  @scala.inline
  def apply(
    baseSpecs: js.Array[StringDictionary[_]] = null,
    codec: StringDictionary[js.Any] = null,
    doesNotNeedSplitting: js.UndefOr[Boolean] = js.undefined,
    metadata: Schema$SourceMetadata = null,
    spec: StringDictionary[js.Any] = null
  ): Schema$Source = {
    val __obj = js.Dynamic.literal()
    if (baseSpecs != null) __obj.updateDynamic("baseSpecs")(baseSpecs.asInstanceOf[js.Any])
    if (codec != null) __obj.updateDynamic("codec")(codec.asInstanceOf[js.Any])
    if (!js.isUndefined(doesNotNeedSplitting)) __obj.updateDynamic("doesNotNeedSplitting")(doesNotNeedSplitting.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    if (spec != null) __obj.updateDynamic("spec")(spec.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Source]
  }
}

