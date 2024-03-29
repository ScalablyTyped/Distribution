package typings.featherlight

import typings.featherlight.Featherlight.Config
import typings.featherlight.Featherlight.FeatherlightStatic
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JQueryStatic extends StObject {
  
  def featherlight(): typings.featherlight.Featherlight.Featherlight
  def featherlight($content: String): typings.featherlight.Featherlight.Featherlight
  def featherlight($content: String, config: Config): typings.featherlight.Featherlight.Featherlight
  def featherlight($content: JQuery): typings.featherlight.Featherlight.Featherlight
  def featherlight($content: JQuery, config: Config): typings.featherlight.Featherlight.Featherlight
  def featherlight(config: Config): typings.featherlight.Featherlight.Featherlight
  @JSName("featherlight")
  var featherlight_Original: FeatherlightStatic
}
object JQueryStatic {
  
  inline def apply(featherlight: FeatherlightStatic): JQueryStatic = {
    val __obj = js.Dynamic.literal(featherlight = featherlight.asInstanceOf[js.Any])
    __obj.asInstanceOf[JQueryStatic]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: JQueryStatic] (val x: Self) extends AnyVal {
    
    inline def setFeatherlight(value: FeatherlightStatic): Self = StObject.set(x, "featherlight", value.asInstanceOf[js.Any])
  }
}
