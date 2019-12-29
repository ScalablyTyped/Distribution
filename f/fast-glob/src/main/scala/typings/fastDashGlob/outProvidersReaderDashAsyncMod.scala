package typings.fastDashGlob

import typings.atMrmlncReaddirDashEnhanced.atMrmlncReaddirDashEnhancedMod.Options
import typings.fastDashGlob.outManagersTasksMod.ITask
import typings.fastDashGlob.outTypesEntriesMod.EntryItem
import typings.node.NodeJS.ReadableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fast-glob/out/providers/reader-async", JSImport.Namespace)
@js.native
object outProvidersReaderDashAsyncMod extends js.Object {
  @js.native
  trait ReaderAsync
    extends typings.fastDashGlob.outProvidersReaderMod.default[js.Promise[js.Array[EntryItem]]] {
    /**
      * Returns FileSystem adapter.
      */
    val fsAdapter: typings.fastDashGlob.outAdaptersFsDashStreamMod.default = js.native
    /**
      * Returns founded paths.
      */
    def api(root: String, task: ITask, options: Options): ReadableStream = js.native
    /**
      * Api for dynamic tasks.
      */
    def dynamicApi(root: String, options: Options): ReadableStream = js.native
    /**
      * Api for static tasks.
      */
    def staticApi(task: ITask, options: Options): ReadableStream = js.native
  }
  
  @js.native
  class default () extends ReaderAsync
  
}

