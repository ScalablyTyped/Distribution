package typings.fastDashGlob.outProvidersFiltersEntryMod

import typings.atMrmlncReaddirDashEnhanced.atMrmlncReaddirDashEnhancedMod.FilterFunction
import typings.fastDashGlob.outTypesPatternsMod.Pattern
import typings.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EntryFilter extends js.Object {
  /**
    * Create record in the cross reader index.
    */
  var createIndexRecord: js.Any
  /**
    * Returns true if entry must be added to result.
    */
  var filter: js.Any
  val index: Map[String, js.UndefOr[scala.Nothing]]
  /**
    * Return true if the entry already has in the cross reader index.
    */
  var isDuplicateEntry: js.Any
  /**
    * Return true when entry match to provided patterns.
    *
    * First, just trying to apply patterns to the path.
    * Second, trying to apply patterns to the path with final slash (need to micromatch to support «directory/ **» patterns).
    */
  var isMatchToPatterns: js.Any
  /**
    * Return true when `absolute` option is enabled and matched to the negative patterns.
    */
  var isSkippedByAbsoluteNegativePatterns: js.Any
  val micromatchOptions: js.Any
  /**
    * Returns true for non-directories if the «onlyDirectories» option is enabled.
    */
  var onlyDirectoryFilter: js.Any
  /**
    * Returns true for non-files if the «onlyFiles» option is enabled.
    */
  var onlyFileFilter: js.Any
  val options: js.Any
  /**
    * Returns filter for directories.
    */
  def getFilter(positive: js.Array[Pattern], negative: js.Array[Pattern]): FilterFunction
}

object EntryFilter {
  @scala.inline
  def apply(
    createIndexRecord: js.Any,
    filter: js.Any,
    getFilter: (js.Array[Pattern], js.Array[Pattern]) => FilterFunction,
    index: Map[String, js.UndefOr[scala.Nothing]],
    isDuplicateEntry: js.Any,
    isMatchToPatterns: js.Any,
    isSkippedByAbsoluteNegativePatterns: js.Any,
    micromatchOptions: js.Any,
    onlyDirectoryFilter: js.Any,
    onlyFileFilter: js.Any,
    options: js.Any
  ): EntryFilter = {
    val __obj = js.Dynamic.literal(createIndexRecord = createIndexRecord.asInstanceOf[js.Any], filter = filter.asInstanceOf[js.Any], getFilter = js.Any.fromFunction2(getFilter), index = index.asInstanceOf[js.Any], isDuplicateEntry = isDuplicateEntry.asInstanceOf[js.Any], isMatchToPatterns = isMatchToPatterns.asInstanceOf[js.Any], isSkippedByAbsoluteNegativePatterns = isSkippedByAbsoluteNegativePatterns.asInstanceOf[js.Any], micromatchOptions = micromatchOptions.asInstanceOf[js.Any], onlyDirectoryFilter = onlyDirectoryFilter.asInstanceOf[js.Any], onlyFileFilter = onlyFileFilter.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[EntryFilter]
  }
}

