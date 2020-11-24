package typings.fluxStandardAction.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.fluxStandardAction.mod._FluxStandardActionAuto because Already inherited */ @js.native
trait FluxStandardActionWithMeta[Type /* <: String */, Payload, Meta] extends FluxStandardAction[Type, Payload, Meta] {
  
  /**
    * The required `meta` property MAY be any type of value.
    * It is intended for any extra information that is not part of the payload.
    */
  @JSName("meta")
  var meta_FluxStandardActionWithMeta: Meta = js.native
}
object FluxStandardActionWithMeta {
  
  @scala.inline
  def apply[Type /* <: String */, Payload, Meta](meta: Meta, `type`: Type): FluxStandardActionWithMeta[Type, Payload, Meta] = {
    val __obj = js.Dynamic.literal(meta = meta.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FluxStandardActionWithMeta[Type, Payload, Meta]]
  }
  
  @scala.inline
  implicit class FluxStandardActionWithMetaOps[Self <: FluxStandardActionWithMeta[_, _, _], Type /* <: String */, Payload, Meta] (val x: Self with (FluxStandardActionWithMeta[Type, Payload, Meta])) extends AnyVal {
    
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
    def setMeta(value: Meta): Self = this.set("meta", value.asInstanceOf[js.Any])
  }
}
