package typings.gapiDotClientDotBooks.gapi.client.books

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MylibraryResource extends js.Object {
  var annotations: AnnotationsResource
  var bookshelves: BookshelvesResource
  var readingpositions: ReadingpositionsResource
}

object MylibraryResource {
  @scala.inline
  def apply(
    annotations: AnnotationsResource,
    bookshelves: BookshelvesResource,
    readingpositions: ReadingpositionsResource
  ): MylibraryResource = {
    val __obj = js.Dynamic.literal(annotations = annotations, bookshelves = bookshelves, readingpositions = readingpositions)
  
    __obj.asInstanceOf[MylibraryResource]
  }
}

