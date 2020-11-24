package typings.emojiMart.dataMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Data extends js.Object {
  
  var aliases: StringDictionary[String] = js.native
  
  var categories: js.Array[Category] = js.native
  
  var compressed: Boolean = js.native
  
  var emojis: StringDictionary[Emoji] = js.native
}
object Data {
  
  @scala.inline
  def apply(
    aliases: StringDictionary[String],
    categories: js.Array[Category],
    compressed: Boolean,
    emojis: StringDictionary[Emoji]
  ): Data = {
    val __obj = js.Dynamic.literal(aliases = aliases.asInstanceOf[js.Any], categories = categories.asInstanceOf[js.Any], compressed = compressed.asInstanceOf[js.Any], emojis = emojis.asInstanceOf[js.Any])
    __obj.asInstanceOf[Data]
  }
  
  @scala.inline
  implicit class DataOps[Self <: Data] (val x: Self) extends AnyVal {
    
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
    def setAliases(value: StringDictionary[String]): Self = this.set("aliases", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCategoriesVarargs(value: Category*): Self = this.set("categories", js.Array(value :_*))
    
    @scala.inline
    def setCategories(value: js.Array[Category]): Self = this.set("categories", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompressed(value: Boolean): Self = this.set("compressed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmojis(value: StringDictionary[Emoji]): Self = this.set("emojis", value.asInstanceOf[js.Any])
  }
}
