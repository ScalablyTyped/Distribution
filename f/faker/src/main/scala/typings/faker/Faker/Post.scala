package typings.faker.Faker

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Post extends js.Object {
  var paragraph: String
  var sentence: String
  var sentences: String
  var words: String
}

object Post {
  @scala.inline
  def apply(paragraph: String, sentence: String, sentences: String, words: String): Post = {
    val __obj = js.Dynamic.literal(paragraph = paragraph, sentence = sentence, sentences = sentences, words = words)
  
    __obj.asInstanceOf[Post]
  }
}

