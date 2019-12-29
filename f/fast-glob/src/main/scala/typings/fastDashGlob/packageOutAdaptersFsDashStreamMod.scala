package typings.fastDashGlob

import typings.fastDashGlob.packageOutTypesEntriesMod.Entry
import typings.fastDashGlob.packageOutTypesPatternsMod.Pattern
import typings.node.NodeJS.ReadableStream
import typings.node.fsMod.Stats
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fast-glob/package/out/adapters/fs-stream", JSImport.Namespace)
@js.native
object packageOutAdaptersFsDashStreamMod extends js.Object {
  @js.native
  trait FileSystemStream
    extends typings.fastDashGlob.packageOutAdaptersFsMod.default[ReadableStream] {
    /**
      * Return entry for the provided path.
      */
    def getEntry(filepath: String, pattern: Pattern): js.Promise[Entry | Null] = js.native
    /**
      * Return fs.Stats for the provided path.
      */
    def getStat(filepath: String): js.Promise[Stats] = js.native
  }
  
  @js.native
  class default () extends FileSystemStream
  
}

