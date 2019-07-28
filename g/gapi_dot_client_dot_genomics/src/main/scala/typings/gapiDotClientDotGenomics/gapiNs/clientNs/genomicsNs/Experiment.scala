package typings.gapiDotClientDotGenomics.gapiNs.clientNs.genomicsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Experiment extends js.Object {
  /**
    * The instrument model used as part of this experiment. This maps to
    * sequencing technology in the SAM spec.
    */
  var instrumentModel: js.UndefOr[String] = js.undefined
  /**
    * A client-supplied library identifier; a library is a collection of DNA
    * fragments which have been prepared for sequencing from a sample. This
    * field is important for quality control as error or bias can be introduced
    * during sample preparation.
    */
  var libraryId: js.UndefOr[String] = js.undefined
  /**
    * The platform unit used as part of this experiment, for example
    * flowcell-barcode.lane for Illumina or slide for SOLiD. Corresponds to the
    * @RG PU field in the SAM spec.
    */
  var platformUnit: js.UndefOr[String] = js.undefined
  /** The sequencing center used as part of this experiment. */
  var sequencingCenter: js.UndefOr[String] = js.undefined
}

object Experiment {
  @scala.inline
  def apply(
    instrumentModel: String = null,
    libraryId: String = null,
    platformUnit: String = null,
    sequencingCenter: String = null
  ): Experiment = {
    val __obj = js.Dynamic.literal()
    if (instrumentModel != null) __obj.updateDynamic("instrumentModel")(instrumentModel)
    if (libraryId != null) __obj.updateDynamic("libraryId")(libraryId)
    if (platformUnit != null) __obj.updateDynamic("platformUnit")(platformUnit)
    if (sequencingCenter != null) __obj.updateDynamic("sequencingCenter")(sequencingCenter)
    __obj.asInstanceOf[Experiment]
  }
}

