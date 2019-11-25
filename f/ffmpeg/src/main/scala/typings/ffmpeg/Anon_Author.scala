package typings.ffmpeg

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Author extends js.Object {
  var author: String
  var comment: String
  var copyright: String
  var rating: String
  var title: String
}

object Anon_Author {
  @scala.inline
  def apply(author: String, comment: String, copyright: String, rating: String, title: String): Anon_Author = {
    val __obj = js.Dynamic.literal(author = author.asInstanceOf[js.Any], comment = comment.asInstanceOf[js.Any], copyright = copyright.asInstanceOf[js.Any], rating = rating.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Author]
  }
}

