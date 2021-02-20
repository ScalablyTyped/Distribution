package typings.fastGlob

import typings.node.fsMod.Stats
import typings.nodelibFsScandir.typesMod.Dirent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fsMod {
  
  @JSImport("fast-glob/out/utils/fs", "createDirentFromStats")
  @js.native
  def createDirentFromStats(name: String, stats: Stats): Dirent = js.native
}
