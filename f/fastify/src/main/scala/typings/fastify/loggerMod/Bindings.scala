package typings.fastify.loggerMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Bindings
  extends /* key */ StringDictionary[js.Any] {
  
  var level: js.UndefOr[LogLevel | String] = js.native
  
  var serializers: js.UndefOr[StringDictionary[SerializerFn]] = js.native
}
object Bindings {
  
  @scala.inline
  def apply(): Bindings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Bindings]
  }
  
  @scala.inline
  implicit class BindingsOps[Self <: Bindings] (val x: Self) extends AnyVal {
    
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
    def setLevel(value: LogLevel | String): Self = this.set("level", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLevel: Self = this.set("level", js.undefined)
    
    @scala.inline
    def setSerializers(value: StringDictionary[SerializerFn]): Self = this.set("serializers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSerializers: Self = this.set("serializers", js.undefined)
  }
}
