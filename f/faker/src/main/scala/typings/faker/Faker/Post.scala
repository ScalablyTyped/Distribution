package typings.faker.Faker

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Post extends js.Object {
  
  var paragraph: String = js.native
  
  var sentence: String = js.native
  
  var sentences: String = js.native
  
  var words: String = js.native
}
object Post {
  
  @scala.inline
  def apply(paragraph: String, sentence: String, sentences: String, words: String): Post = {
    val __obj = js.Dynamic.literal(paragraph = paragraph.asInstanceOf[js.Any], sentence = sentence.asInstanceOf[js.Any], sentences = sentences.asInstanceOf[js.Any], words = words.asInstanceOf[js.Any])
    __obj.asInstanceOf[Post]
  }
  
  @scala.inline
  implicit class PostOps[Self <: Post] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setParagraph(value: String): Self = this.set("paragraph", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSentence(value: String): Self = this.set("sentence", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSentences(value: String): Self = this.set("sentences", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWords(value: String): Self = this.set("words", value.asInstanceOf[js.Any])
  }
}
