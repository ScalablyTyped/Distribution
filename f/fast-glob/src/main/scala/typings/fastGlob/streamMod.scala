package typings.fastGlob

import typings.fastGlob.tasksMod.Task
import typings.fastGlob.typesMod.ReaderOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object streamMod {
  
  @JSImport("fast-glob/out/providers/stream", JSImport.Default)
  @js.native
  class default () extends ProviderStream
  
  @js.native
  trait ProviderStream
    extends typings.fastGlob.providerMod.default[Readable] {
    
    /* protected */ var _reader: typings.fastGlob.readersStreamMod.default = js.native
    
    def api(root: String, task: Task, options: ReaderOptions): Readable = js.native
  }
}
