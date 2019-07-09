package typings
package fastDashGlobLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object fastDashGlobMod {
  type Entry = fastDashGlobLib.outTypesMod.Entry
  type EntryObjectModePredicate = /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ P in keyof std.Pick<fast-glob.fast-glob/out/settings.Options, 'objectMode'> ]: -? true}
    */ fastDashGlobLib.fastDashGlobLibStrings.EntryObjectModePredicate with js.Any
  type EntryObjectPredicate = EntryObjectModePredicate | EntryStatsPredicate
  type EntryStatsPredicate = /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ P in keyof std.Pick<fast-glob.fast-glob/out/settings.Options, 'stats'> ]: -? true}
    */ fastDashGlobLib.fastDashGlobLibStrings.EntryStatsPredicate with js.Any
  type FileSystemAdapter = fastDashGlobLib.outTypesMod.FileSystemAdapter
  type Options = fastDashGlobLib.outSettingsMod.Options
  type Pattern = fastDashGlobLib.outTypesMod.Pattern
  type Task = fastDashGlobLib.outManagersTasksMod.Task
}
