package typings.faker.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Genre extends js.Object {
  
  def genre(): String = js.native
}
object Genre {
  
  @scala.inline
  def apply(genre: () => String): Genre = {
    val __obj = js.Dynamic.literal(genre = js.Any.fromFunction0(genre))
    __obj.asInstanceOf[Genre]
  }
  
  @scala.inline
  implicit class GenreOps[Self <: Genre] (val x: Self) extends AnyVal {
    
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
    def setGenre(value: () => String): Self = this.set("genre", js.Any.fromFunction0(value))
  }
}
