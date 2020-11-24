package typings.draftJs.mod.Draft.Model.Entity

import typings.draftJs.mod.Draft.Model.Constants.DraftEntityMutability
import typings.draftJs.mod.Draft.Model.Constants.DraftEntityType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An instance of a document entity, consisting of a `type` and relevant
  * `data`, metadata about the entity.
  *
  * For instance, a "link" entity might provide a URI, and a "mention"
  * entity might provide the mentioned user's ID. These pieces of data
  * may be used when rendering the entity as part of a ContentBlock DOM
  * representation. For a link, the data would be used as an href for
  * the rendered anchor. For a mention, the ID could be used to retrieve
  * a hovercard.
  */
@js.native
trait DraftEntityInstance extends js.Object {
  
  def getData(): js.Any = js.native
  
  def getMutability(): DraftEntityMutability = js.native
  
  def getType(): DraftEntityType = js.native
}
object DraftEntityInstance {
  
  @scala.inline
  def apply(getData: () => js.Any, getMutability: () => DraftEntityMutability, getType: () => DraftEntityType): DraftEntityInstance = {
    val __obj = js.Dynamic.literal(getData = js.Any.fromFunction0(getData), getMutability = js.Any.fromFunction0(getMutability), getType = js.Any.fromFunction0(getType))
    __obj.asInstanceOf[DraftEntityInstance]
  }
  
  @scala.inline
  implicit class DraftEntityInstanceOps[Self <: DraftEntityInstance] (val x: Self) extends AnyVal {
    
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
    def setGetData(value: () => js.Any): Self = this.set("getData", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetMutability(value: () => DraftEntityMutability): Self = this.set("getMutability", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetType(value: () => DraftEntityType): Self = this.set("getType", js.Any.fromFunction0(value))
  }
}
