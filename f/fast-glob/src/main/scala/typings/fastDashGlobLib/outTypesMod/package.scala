package typings
package fastDashGlobLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object outTypesMod {
  type DeepFilterFunction = atNodelibFsDotWalkLib.outSettingsMod.DeepFilterFunction
  type Entry = atNodelibFsDotWalkLib.outTypesMod.Entry
  type EntryFilterFunction = atNodelibFsDotWalkLib.outSettingsMod.EntryFilterFunction
  type EntryItem = java.lang.String | Entry
  type EntryTransformerFunction = js.Function1[/* entry */ Entry, EntryItem]
  type ErrnoException = nodeLib.NodeJSNs.ErrnoException
  type ErrorFilterFunction = atNodelibFsDotWalkLib.outSettingsMod.ErrorFilterFunction
  type FileSystemAdapter = atNodelibFsDotScandirLib.outAdaptersFsMod.FileSystemAdapter
  type Pattern = java.lang.String
  type PatternRe = stdLib.RegExp
  type PatternsGroup = stdLib.Record[java.lang.String, js.Array[Pattern]]
}
