package typings.diff2html

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsMod {
  
  @JSImport("diff2html/lib/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def escapeForRegExp(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("escapeForRegExp")(str.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def hashCode_(text: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("hashCode")(text.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @scala.inline
  def unifyPath(path: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("unifyPath")(path.asInstanceOf[js.Any]).asInstanceOf[String]
}
