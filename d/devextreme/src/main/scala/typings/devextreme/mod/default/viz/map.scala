package typings.devextreme.mod.default.viz

import typings.devextreme.devextremeStrings.equirectangular
import typings.devextreme.devextremeStrings.lambert
import typings.devextreme.devextremeStrings.mercator
import typings.devextreme.devextremeStrings.miller
import typings.devextreme.mod.DevExpress.viz.VectorMapProjectionConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("devextreme", "viz.map")
@js.native
object map extends js.Object {
  
  @js.native
  object projection extends js.Object {
    
    def apply(data: VectorMapProjectionConfig): js.Any = js.native
    
    def add(name: String, projection: js.Any): Unit = js.native
    def add(name: String, projection: VectorMapProjectionConfig): Unit = js.native
    
    def get(name: String): js.Any = js.native
    @JSName("get")
    def get_equirectangular(name: equirectangular): js.Any = js.native
    @JSName("get")
    def get_lambert(name: lambert): js.Any = js.native
    @JSName("get")
    def get_mercator(name: mercator): js.Any = js.native
    @JSName("get")
    def get_miller(name: miller): js.Any = js.native
  }
}
