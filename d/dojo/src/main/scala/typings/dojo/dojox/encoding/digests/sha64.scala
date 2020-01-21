package typings.dojo.dojox.encoding.digests

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/encoding/digests/_sha-64.html
  *
  *
  */
trait sha64 extends js.Object {
  /**
    *
    */
  var outputTypes: js.Object
  /**
    *
    * @param msg
    * @param length
    * @param hash
    * @param depth
    */
  def digest(msg: js.Any, length: js.Any, hash: js.Any, depth: js.Any): js.Array[_]
  /**
    *
    * @param s
    */
  def stringToUtf8(s: js.Any): js.Any
  /**
    *
    * @param wa
    */
  def toBase64(wa: js.Any): js.Any
  /**
    *
    * @param wa
    */
  def toHex(wa: js.Any): js.Any
  /**
    *
    * @param s
    */
  def toWord(s: js.Any): js.Any
}

object sha64 {
  @scala.inline
  def apply(
    digest: (js.Any, js.Any, js.Any, js.Any) => js.Array[_],
    outputTypes: js.Object,
    stringToUtf8: js.Any => js.Any,
    toBase64: js.Any => js.Any,
    toHex: js.Any => js.Any,
    toWord: js.Any => js.Any
  ): sha64 = {
    val __obj = js.Dynamic.literal(digest = js.Any.fromFunction4(digest), outputTypes = outputTypes.asInstanceOf[js.Any], stringToUtf8 = js.Any.fromFunction1(stringToUtf8), toBase64 = js.Any.fromFunction1(toBase64), toHex = js.Any.fromFunction1(toHex), toWord = js.Any.fromFunction1(toWord))
  
    __obj.asInstanceOf[sha64]
  }
}

