package typings.fastDashGlob.packageOutProvidersFiltersDeepMod

import typings.atMrmlncReaddirDashEnhanced.atMrmlncReaddirDashEnhancedMod.FilterFunction
import typings.fastDashGlob.packageOutTypesPatternsMod.Pattern
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeepFilter extends js.Object {
  /**
    * Returns «true» for directory that should be read.
    */
  var filter: js.Any
  /**
    * Returns max depth of the provided patterns.
    */
  var getMaxPatternDepth: js.Any
  /**
    * Returns RegExp's for patterns that can affect the depth of reading.
    */
  var getNegativePatternsRe: js.Any
  /**
    * Returns «true» when the «deep» option is disabled or number and depth of the entry is greater that the option value.
    */
  var isSkippedByDeepOption: js.Any
  /**
    * Returns «true» when depth parameter is not an Infinity and entry depth greater that the parameter value.
    */
  var isSkippedByMaxPatternDepth: js.Any
  /**
    * Returns «true» for a directory whose path math to any negative pattern.
    */
  var isSkippedByNegativePatterns: js.Any
  /**
    * Returns «true» for a directory whose name starts with a period if «dot» option is disabled.
    */
  var isSkippedDotDirectory: js.Any
  /**
    * Returns «true» for symlinked directory if the «followSymlinkedDirectories» option is disabled.
    */
  var isSkippedSymlinkedDirectory: js.Any
  val micromatchOptions: js.Any
  val options: js.Any
  /**
    * Returns filter for directories.
    */
  def getFilter(positive: js.Array[Pattern], negative: js.Array[Pattern]): FilterFunction
}

object DeepFilter {
  @scala.inline
  def apply(
    filter: js.Any,
    getFilter: (js.Array[Pattern], js.Array[Pattern]) => FilterFunction,
    getMaxPatternDepth: js.Any,
    getNegativePatternsRe: js.Any,
    isSkippedByDeepOption: js.Any,
    isSkippedByMaxPatternDepth: js.Any,
    isSkippedByNegativePatterns: js.Any,
    isSkippedDotDirectory: js.Any,
    isSkippedSymlinkedDirectory: js.Any,
    micromatchOptions: js.Any,
    options: js.Any
  ): DeepFilter = {
    val __obj = js.Dynamic.literal(filter = filter.asInstanceOf[js.Any], getFilter = js.Any.fromFunction2(getFilter), getMaxPatternDepth = getMaxPatternDepth.asInstanceOf[js.Any], getNegativePatternsRe = getNegativePatternsRe.asInstanceOf[js.Any], isSkippedByDeepOption = isSkippedByDeepOption.asInstanceOf[js.Any], isSkippedByMaxPatternDepth = isSkippedByMaxPatternDepth.asInstanceOf[js.Any], isSkippedByNegativePatterns = isSkippedByNegativePatterns.asInstanceOf[js.Any], isSkippedDotDirectory = isSkippedDotDirectory.asInstanceOf[js.Any], isSkippedSymlinkedDirectory = isSkippedSymlinkedDirectory.asInstanceOf[js.Any], micromatchOptions = micromatchOptions.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeepFilter]
  }
}

