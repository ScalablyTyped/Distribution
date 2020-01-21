package typings.genericFunctions

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("generic-functions", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def endswithdot(str: String): String = js.native
  def icstrcmp(str1: String, str2: String): Boolean = js.native
  def icstrendswith(str: String, suffix: String): Boolean = js.native
  def objGetKeyByValue(`object`: js.Object, value: js.Any): String = js.native
  def println(message: String): Unit = js.native
  def printlns(message: js.Array[String]): Unit = js.native
  def strcmp(str1: String, str2: String): Boolean = js.native
  def strendswith(str: String, suffix: String): Boolean = js.native
}

