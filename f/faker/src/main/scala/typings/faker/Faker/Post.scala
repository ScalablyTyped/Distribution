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
    val __obj = js.Dynamic.literal(paragraph = paragraph.asInstanceOf[js.Any], sentence = sentence.asInstanceOf[js.Any], sentences = sentences.asInstanceOf[js.Any], words = words.asInstanceOf[js.Any])
    __obj.asInstanceOf[Post]
  }
}

