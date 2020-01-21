package typings.dojo.dojox.encoding.digests

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/encoding/digests/_base.html
  *
  *
  */
trait base_ extends js.Object {
  /**
    * Enumeration for input and output encodings.
    *
    */
  var outputTypes: js.Object
  /**
    * computes the digest of data, and returns the result according to type outputType
    *
    * @param data
    * @param outputType               OptionalAn object with the following properties:Base64HexStringRaw
    */
  def MD5(data: String, outputType: js.Object): Unit
  /**
    * Computes the SHA1 digest of the data, and returns the result according to output type.
    *
    * @param data
    * @param outputType               OptionalAn object with the following properties:Base64HexStringRaw
    */
  def SHA1(data: String, outputType: js.Object): Unit
  /**
    * add a pair of words together with rollover
    *
    * @param a
    * @param b
    */
  def addWords(a: String, b: String): Double
  /**
    *
    * @param input
    */
  def stringToUtf8(input: js.Any): Unit
  /**
    * convert a string to a word array
    *
    * @param s
    */
  def stringToWord(s: String): js.Array[_]
  /**
    * convert an array of words to base64 encoding, should be more efficient
    * than using dojox.encoding.base64
    *
    * @param wa
    */
  def wordToBase64(wa: js.Array[String]): Unit
  /**
    * convert an array of words to a hex tab
    *
    * @param wa
    */
  def wordToHex(wa: js.Array[String]): Unit
  /**
    * convert an array of words to a string
    *
    * @param wa
    */
  def wordToString(wa: js.Array[String]): Unit
}

object base_ {
  @scala.inline
  def apply(
    MD5: (String, js.Object) => Unit,
    SHA1: (String, js.Object) => Unit,
    addWords: (String, String) => Double,
    outputTypes: js.Object,
    stringToUtf8: js.Any => Unit,
    stringToWord: String => js.Array[_],
    wordToBase64: js.Array[String] => Unit,
    wordToHex: js.Array[String] => Unit,
    wordToString: js.Array[String] => Unit
  ): base_ = {
    val __obj = js.Dynamic.literal(MD5 = js.Any.fromFunction2(MD5), SHA1 = js.Any.fromFunction2(SHA1), addWords = js.Any.fromFunction2(addWords), outputTypes = outputTypes.asInstanceOf[js.Any], stringToUtf8 = js.Any.fromFunction1(stringToUtf8), stringToWord = js.Any.fromFunction1(stringToWord), wordToBase64 = js.Any.fromFunction1(wordToBase64), wordToHex = js.Any.fromFunction1(wordToHex), wordToString = js.Any.fromFunction1(wordToString))
  
    __obj.asInstanceOf[base_]
  }
}

