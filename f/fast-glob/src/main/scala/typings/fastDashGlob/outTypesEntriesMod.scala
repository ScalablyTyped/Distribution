package typings.fastDashGlob

import typings.fastDashGlob.outTypesEntriesMod.IEntry
import typings.node.fsMod.Stats
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fast-glob/out/types/entries", JSImport.Namespace)
@js.native
object outTypesEntriesMod extends js.Object {
  @js.native
  trait IEntry extends Stats {
    var depth: Double = js.native
    var path: String = js.native
  }
  
  type Entry = IEntry
  type EntryItem = String | IEntry
}

