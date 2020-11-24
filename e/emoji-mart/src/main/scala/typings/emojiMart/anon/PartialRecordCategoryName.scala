package typings.emojiMart.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<std.Record<emoji-mart.emoji-mart/dist-es/utils/shared-props.CategoryName, string>> */
@js.native
trait PartialRecordCategoryName extends js.Object {
  
  var activity: js.UndefOr[String] = js.native
  
  var custom: js.UndefOr[String] = js.native
  
  var flags: js.UndefOr[String] = js.native
  
  var foods: js.UndefOr[String] = js.native
  
  var nature: js.UndefOr[String] = js.native
  
  var objects: js.UndefOr[String] = js.native
  
  var people: js.UndefOr[String] = js.native
  
  var places: js.UndefOr[String] = js.native
  
  var recent: js.UndefOr[String] = js.native
  
  var search: js.UndefOr[String] = js.native
  
  var symbols: js.UndefOr[String] = js.native
}
object PartialRecordCategoryName {
  
  @scala.inline
  def apply(): PartialRecordCategoryName = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialRecordCategoryName]
  }
  
  @scala.inline
  implicit class PartialRecordCategoryNameOps[Self <: PartialRecordCategoryName] (val x: Self) extends AnyVal {
    
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
    def setActivity(value: String): Self = this.set("activity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActivity: Self = this.set("activity", js.undefined)
    
    @scala.inline
    def setCustom(value: String): Self = this.set("custom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustom: Self = this.set("custom", js.undefined)
    
    @scala.inline
    def setFlags(value: String): Self = this.set("flags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFlags: Self = this.set("flags", js.undefined)
    
    @scala.inline
    def setFoods(value: String): Self = this.set("foods", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFoods: Self = this.set("foods", js.undefined)
    
    @scala.inline
    def setNature(value: String): Self = this.set("nature", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNature: Self = this.set("nature", js.undefined)
    
    @scala.inline
    def setObjects(value: String): Self = this.set("objects", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteObjects: Self = this.set("objects", js.undefined)
    
    @scala.inline
    def setPeople(value: String): Self = this.set("people", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePeople: Self = this.set("people", js.undefined)
    
    @scala.inline
    def setPlaces(value: String): Self = this.set("places", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlaces: Self = this.set("places", js.undefined)
    
    @scala.inline
    def setRecent(value: String): Self = this.set("recent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRecent: Self = this.set("recent", js.undefined)
    
    @scala.inline
    def setSearch(value: String): Self = this.set("search", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSearch: Self = this.set("search", js.undefined)
    
    @scala.inline
    def setSymbols(value: String): Self = this.set("symbols", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSymbols: Self = this.set("symbols", js.undefined)
  }
}
