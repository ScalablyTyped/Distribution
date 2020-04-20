package typings.ethers.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Wordlist extends js.Object {
  var locale: String
  def getWord(index: Double): String
  def getWordIndex(word: String): Double
  def join(words: js.Array[String]): String
  def split(mnemonic: String): js.Array[String]
}

object Wordlist {
  @scala.inline
  def apply(
    getWord: Double => String,
    getWordIndex: String => Double,
    join: js.Array[String] => String,
    locale: String,
    split: String => js.Array[String]
  ): Wordlist = {
    val __obj = js.Dynamic.literal(getWord = js.Any.fromFunction1(getWord), getWordIndex = js.Any.fromFunction1(getWordIndex), join = js.Any.fromFunction1(join), locale = locale.asInstanceOf[js.Any], split = js.Any.fromFunction1(split))
    __obj.asInstanceOf[Wordlist]
  }
}

