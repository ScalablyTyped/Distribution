package typings
package fastDashGlobLib.outTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReaderOptions
  extends atNodelibFsDotWalkLib.outSettingsMod.Options {
  @JSName("deepFilter")
  var deepFilter_Original: DeepFilterFunction = js.native
  @JSName("entryFilter")
  var entryFilter_Original: EntryFilterFunction = js.native
  @JSName("errorFilter")
  var errorFilter_Original: ErrorFilterFunction = js.native
  @JSName("fs")
  var fs_ReaderOptions: FileSystemAdapter = js.native
  @JSName("stats")
  var stats_ReaderOptions: scala.Boolean = js.native
  @JSName("deepFilter")
  def deepFilter_MReaderOptions(value: atNodelibFsDotWalkLib.outTypesMod.Entry): scala.Boolean = js.native
  @JSName("entryFilter")
  def entryFilter_MReaderOptions(value: atNodelibFsDotWalkLib.outTypesMod.Entry): scala.Boolean = js.native
  @JSName("errorFilter")
  def errorFilter_MReaderOptions(value: atNodelibFsDotWalkLib.outTypesMod.Errno): scala.Boolean = js.native
  def transform(entry: Entry): EntryItem = js.native
}

