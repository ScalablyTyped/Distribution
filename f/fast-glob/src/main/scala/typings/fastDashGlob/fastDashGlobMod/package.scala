package typings.fastDashGlob

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object fastDashGlobMod {
  type Entry = typings.fastDashGlob.outTypesMod.Entry
  type EntryObjectModePredicate = /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ P in keyof std.Pick<fast-glob.fast-glob/out/settings.Options, 'objectMode'> ]: -? true}
    */ typings.fastDashGlob.fastDashGlobStrings.EntryObjectModePredicate with js.Any
  type EntryObjectPredicate = EntryObjectModePredicate | EntryStatsPredicate
  type EntryStatsPredicate = /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ P in keyof std.Pick<fast-glob.fast-glob/out/settings.Options, 'stats'> ]: -? true}
    */ typings.fastDashGlob.fastDashGlobStrings.EntryStatsPredicate with js.Any
  type FileSystemAdapter = typings.fastDashGlob.outTypesMod.FileSystemAdapter
  type Options = typings.fastDashGlob.outSettingsMod.Options
  type Pattern = typings.fastDashGlob.outTypesMod.Pattern
  type Task = typings.fastDashGlob.outManagersTasksMod.Task
}
