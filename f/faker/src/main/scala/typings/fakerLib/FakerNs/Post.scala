package typings
package fakerLib.FakerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Post extends js.Object {
  var paragraph: java.lang.String
  var sentence: java.lang.String
  var sentences: java.lang.String
  var words: java.lang.String
}

object Post {
  @scala.inline
  def apply(
    paragraph: java.lang.String,
    sentence: java.lang.String,
    sentences: java.lang.String,
    words: java.lang.String
  ): Post = {
    val __obj = js.Dynamic.literal(paragraph = paragraph, sentence = sentence, sentences = sentences, words = words)
  
    __obj.asInstanceOf[Post]
  }
}

