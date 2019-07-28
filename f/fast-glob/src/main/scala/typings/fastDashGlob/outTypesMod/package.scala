package typings.fastDashGlob

import typings.std.Record
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object outTypesMod {
  type DeepFilterFunction = typings.atNodelibFsDotWalk.outSettingsMod.DeepFilterFunction
  type Entry = typings.atNodelibFsDotWalk.outTypesMod.Entry
  type EntryFilterFunction = typings.atNodelibFsDotWalk.outSettingsMod.EntryFilterFunction
  type EntryItem = String | Entry
  type EntryTransformerFunction = js.Function1[/* entry */ Entry, EntryItem]
  type ErrnoException = typings.node.NodeJSNs.ErrnoException
  type ErrorFilterFunction = typings.atNodelibFsDotWalk.outSettingsMod.ErrorFilterFunction
  type FileSystemAdapter = typings.atNodelibFsDotScandir.outAdaptersFsMod.FileSystemAdapter
  type Pattern = String
  type PatternRe = RegExp
  type PatternsGroup = Record[String, js.Array[Pattern]]
}
