package typings.diff.mod

import typings.diff.anon.ArrayOptionsanyanyPartial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("diff", "Diff")
@js.native
open class Diff () extends StObject {
  
  def castInput(value: Any): Any = js.native
  
  def diff(oldString: String, newString: String): js.Array[Change] = js.native
  def diff(oldString: String, newString: String, options: ArrayOptionsanyanyPartial): js.Array[Change] = js.native
  def diff(oldString: String, newString: String, options: Callback): js.Array[Change] = js.native
  
  def equals(left: Any, right: Any): Boolean = js.native
  
  def extractCommon(basePath: BestPath, newString: String, oldString: String, diagonalPath: Double): Double = js.native
  
  def join(chars: js.Array[String]): String = js.native
  
  def pushComponent(components: js.Array[Change], added: Boolean, removed: Boolean): Unit = js.native
  
  def removeEmpty(array: js.Array[Any]): js.Array[Any] = js.native
  
  def tokenize(value: String): Any = js.native
}
