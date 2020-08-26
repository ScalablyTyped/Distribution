package typings.dexie.mod.default

import org.scalablytyped.runtime.TopLevel
import typings.dexie.mod.Dexie
import typings.dexie.mod.DexieConstructor
import typings.dexie.mod.DexieOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("dexie", JSImport.Default)
@js.native
class ^ protected () extends Dexie {
  def this(databaseName: String) = this()
  def this(databaseName: String, options: DexieOptions) = this()
}

@JSImport("dexie", JSImport.Default)
@js.native
object ^ extends TopLevel[DexieConstructor]

