package typings.fastestLevenshtein

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("fastest-levenshtein", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def closest(str: String, arr: js.Array[String]): String = js.native
  
  def distance(a: String, b: String): Double = js.native
}
