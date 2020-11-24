package typings.fastGlob

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object typesMod {
  
  type DeepFilterFunction = typings.nodelibFsWalk.settingsMod.DeepFilterFunction
  
  type Entry = typings.nodelibFsWalk.typesMod.Entry
  
  type EntryFilterFunction = typings.nodelibFsWalk.settingsMod.EntryFilterFunction
  
  type EntryItem = java.lang.String | typings.fastGlob.typesMod.Entry
  
  type EntryTransformerFunction = js.Function1[/* entry */ typings.fastGlob.typesMod.Entry, typings.fastGlob.typesMod.EntryItem]
  
  type ErrnoException = typings.node.NodeJS.ErrnoException
  
  type ErrorFilterFunction = typings.nodelibFsWalk.settingsMod.ErrorFilterFunction
  
  type FileSystemAdapter = typings.nodelibFsScandir.fsMod.FileSystemAdapter
  
  type Pattern = java.lang.String
  
  type PatternRe = typings.std.RegExp
  
  type PatternsGroup = typings.std.Record[java.lang.String, js.Array[typings.fastGlob.typesMod.Pattern]]
}
