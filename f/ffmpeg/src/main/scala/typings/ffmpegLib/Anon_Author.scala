package typings
package ffmpegLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Author extends js.Object {
  var author: java.lang.String
  var comment: java.lang.String
  var copyright: java.lang.String
  var rating: java.lang.String
  var title: java.lang.String
}

object Anon_Author {
  @scala.inline
  def apply(
    author: java.lang.String,
    comment: java.lang.String,
    copyright: java.lang.String,
    rating: java.lang.String,
    title: java.lang.String
  ): Anon_Author = {
    val __obj = js.Dynamic.literal(author = author, comment = comment, copyright = copyright, rating = rating, title = title)
  
    __obj.asInstanceOf[Anon_Author]
  }
}

