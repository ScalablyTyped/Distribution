package typings.gatsbyPluginUtils.pluginOptionsSchemaJoiTypeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SwitchDefault extends StObject {
  
  /**
    * the alternative schema type if no cases matched.
    * Only one otherwise statement is allowed in switch as the last array item.
    */
  var otherwise: SchemaLike = js.native
}
object SwitchDefault {
  
  @scala.inline
  def apply(): SwitchDefault = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SwitchDefault]
  }
  
  @scala.inline
  implicit class SwitchDefaultMutableBuilder[Self <: SwitchDefault] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOtherwise(value: SchemaLike): Self = StObject.set(x, "otherwise", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOtherwiseNull: Self = StObject.set(x, "otherwise", null)
  }
}
