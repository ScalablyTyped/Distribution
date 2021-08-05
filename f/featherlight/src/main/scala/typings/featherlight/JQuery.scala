package typings.featherlight

import typings.featherlight.Featherlight.Config
import typings.featherlight.Featherlight.JQueryExtension
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JQuery extends StObject {
  
  def featherlight(): JQuery
  def featherlight($content: String): JQuery
  def featherlight($content: String, config: Config): JQuery
  def featherlight($content: JQuery): JQuery
  def featherlight($content: JQuery, config: Config): JQuery
  def featherlight(config: Config): JQuery
  @JSName("featherlight")
  var featherlight_Original: JQueryExtension
}
object JQuery {
  
  inline def apply(featherlight: JQueryExtension): JQuery = {
    val __obj = js.Dynamic.literal(featherlight = featherlight.asInstanceOf[js.Any])
    __obj.asInstanceOf[JQuery]
  }
  
  extension [Self <: JQuery](x: Self) {
    
    inline def setFeatherlight(value: JQueryExtension): Self = StObject.set(x, "featherlight", value.asInstanceOf[js.Any])
  }
}
