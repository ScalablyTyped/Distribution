package typings.elasticlunr.elasticlunrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("elasticlunr", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val version: String = js.native
  def apply[T](): Index[T] = js.native
  def apply[T](config: js.ThisFunction1[/* this */ Index[T], /* idx */ Index[T], Unit]): Index[T] = js.native
  def addStopWords(words: js.Array[String]): Unit = js.native
  def clearStopWords(): Unit = js.native
  def resetStopWords(): Unit = js.native
  def stemmer(w: String): String = js.native
  def stopWordFilter(token: String): String = js.native
  def tokenizer(): js.Array[String] = js.native
  def tokenizer(str: String): js.Array[String] = js.native
  def trimmer(token: String): String = js.native
}

