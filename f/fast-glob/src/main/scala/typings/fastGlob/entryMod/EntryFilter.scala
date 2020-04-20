package typings.fastGlob.entryMod

import typings.fastGlob.typesMod.EntryFilterFunction
import typings.fastGlob.typesMod.Pattern
import typings.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EntryFilter extends js.Object {
  var _createIndexRecord: js.Any
  var _filter: js.Any
  var _isDuplicateEntry: js.Any
  var _isMatchToPatterns: js.Any
  var _isSkippedByAbsoluteNegativePatterns: js.Any
  val _micromatchOptions: js.Any
  var _onlyDirectoryFilter: js.Any
  var _onlyFileFilter: js.Any
  val _settings: js.Any
  val index: Map[String, js.UndefOr[scala.Nothing]]
  def getFilter(positive: js.Array[Pattern], negative: js.Array[Pattern]): EntryFilterFunction
}

object EntryFilter {
  @scala.inline
  def apply(
    _createIndexRecord: js.Any,
    _filter: js.Any,
    _isDuplicateEntry: js.Any,
    _isMatchToPatterns: js.Any,
    _isSkippedByAbsoluteNegativePatterns: js.Any,
    _micromatchOptions: js.Any,
    _onlyDirectoryFilter: js.Any,
    _onlyFileFilter: js.Any,
    _settings: js.Any,
    getFilter: (js.Array[Pattern], js.Array[Pattern]) => EntryFilterFunction,
    index: Map[String, js.UndefOr[scala.Nothing]]
  ): EntryFilter = {
    val __obj = js.Dynamic.literal(_createIndexRecord = _createIndexRecord.asInstanceOf[js.Any], _filter = _filter.asInstanceOf[js.Any], _isDuplicateEntry = _isDuplicateEntry.asInstanceOf[js.Any], _isMatchToPatterns = _isMatchToPatterns.asInstanceOf[js.Any], _isSkippedByAbsoluteNegativePatterns = _isSkippedByAbsoluteNegativePatterns.asInstanceOf[js.Any], _micromatchOptions = _micromatchOptions.asInstanceOf[js.Any], _onlyDirectoryFilter = _onlyDirectoryFilter.asInstanceOf[js.Any], _onlyFileFilter = _onlyFileFilter.asInstanceOf[js.Any], _settings = _settings.asInstanceOf[js.Any], getFilter = js.Any.fromFunction2(getFilter), index = index.asInstanceOf[js.Any])
    __obj.asInstanceOf[EntryFilter]
  }
}

