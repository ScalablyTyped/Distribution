package typings.fastGlob

import typings.fastGlob.typesMod.Pattern
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pathMod {
  
  @JSImport("fast-glob/out/utils/path", "escape")
  @js.native
  def escape(pattern: Pattern): Pattern = js.native
  
  @JSImport("fast-glob/out/utils/path", "makeAbsolute")
  @js.native
  def makeAbsolute(cwd: String, filepath: String): String = js.native
  
  @JSImport("fast-glob/out/utils/path", "removeLeadingDotSegment")
  @js.native
  def removeLeadingDotSegment(entry: String): String = js.native
  
  @JSImport("fast-glob/out/utils/path", "unixify")
  @js.native
  def unixify(filepath: String): String = js.native
}
