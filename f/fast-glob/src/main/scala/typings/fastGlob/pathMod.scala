package typings.fastGlob

import typings.fastGlob.typesMod.Pattern
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pathMod {
  
  @JSImport("fast-glob/out/utils/path", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def escape(pattern: Pattern): Pattern = ^.asInstanceOf[js.Dynamic].applyDynamic("escape")(pattern.asInstanceOf[js.Any]).asInstanceOf[Pattern]
  
  @scala.inline
  def makeAbsolute(cwd: String, filepath: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("makeAbsolute")(cwd.asInstanceOf[js.Any], filepath.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def removeLeadingDotSegment(entry: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("removeLeadingDotSegment")(entry.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def unixify(filepath: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("unixify")(filepath.asInstanceOf[js.Any]).asInstanceOf[String]
}
