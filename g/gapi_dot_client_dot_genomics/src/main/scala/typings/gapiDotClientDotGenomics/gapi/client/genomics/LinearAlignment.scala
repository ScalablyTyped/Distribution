package typings.gapiDotClientDotGenomics.gapi.client.genomics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LinearAlignment extends js.Object {
  /**
    * Represents the local alignment of this sequence (alignment matches, indels,
    * etc) against the reference.
    */
  var cigar: js.UndefOr[js.Array[CigarUnit]] = js.undefined
  /**
    * The mapping quality of this alignment. Represents how likely
    * the read maps to this position as opposed to other locations.
    *
    * Specifically, this is -10 log10 Pr(mapping position is wrong), rounded to
    * the nearest integer.
    */
  var mappingQuality: js.UndefOr[Double] = js.undefined
  /** The position of this alignment. */
  var position: js.UndefOr[Position] = js.undefined
}

object LinearAlignment {
  @scala.inline
  def apply(cigar: js.Array[CigarUnit] = null, mappingQuality: Int | Double = null, position: Position = null): LinearAlignment = {
    val __obj = js.Dynamic.literal()
    if (cigar != null) __obj.updateDynamic("cigar")(cigar.asInstanceOf[js.Any])
    if (mappingQuality != null) __obj.updateDynamic("mappingQuality")(mappingQuality.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    __obj.asInstanceOf[LinearAlignment]
  }
}

