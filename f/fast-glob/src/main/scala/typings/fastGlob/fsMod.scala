package typings.fastGlob

import typings.node.fsMod.Stats
import typings.nodelibFsScandir.typesMod.Dirent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fast-glob/out/utils/fs", JSImport.Namespace)
@js.native
object fsMod extends js.Object {
  def createDirentFromStats(name: String, stats: Stats): Dirent = js.native
}

