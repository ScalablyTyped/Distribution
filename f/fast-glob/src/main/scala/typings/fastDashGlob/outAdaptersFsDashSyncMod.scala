package typings.fastDashGlob

import typings.fastDashGlob.outAdaptersFsDashSyncMod.FileSystemSync
import typings.fastDashGlob.outTypesEntriesMod.Entry
import typings.fastDashGlob.outTypesPatternsMod.Pattern
import typings.node.fsMod.Stats
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fast-glob/out/adapters/fs-sync", JSImport.Namespace)
@js.native
object outAdaptersFsDashSyncMod extends js.Object {
  @js.native
  trait FileSystemSync
    extends typings.fastDashGlob.outAdaptersFsMod.default[js.Array[Entry]] {
    /**
      * Return entry for the provided path.
      */
    def getEntry(filepath: String, pattern: Pattern): Entry | Null = js.native
    /**
      * Return fs.Stats for the provided path.
      */
    def getStat(filepath: String): Stats = js.native
  }
  
  @js.native
  class default () extends FileSystemSync
  
}

