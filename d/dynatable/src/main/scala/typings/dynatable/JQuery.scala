package typings.dynatable

import typings.dynatable.JQueryDynatable.Dynatable
import typings.dynatable.JQueryDynatable.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JQuery extends StObject {
  
  /**
    * Initialize Dynatable plugin
    *
    * @param options An optional object that allow you to change the default configuration options
    */
  /**
    * @constructor
    */
  def dynatable(): JQuery
  def dynatable(options: Options): JQuery
  /**
    * @constructor
    */
  @JSName("dynatable")
  var dynatable_Original: Dynatable
}
object JQuery {
  
  inline def apply(dynatable: Dynatable): JQuery = {
    val __obj = js.Dynamic.literal(dynatable = dynatable.asInstanceOf[js.Any])
    __obj.asInstanceOf[JQuery]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: JQuery] (val x: Self) extends AnyVal {
    
    inline def setDynatable(value: Dynatable): Self = StObject.set(x, "dynatable", value.asInstanceOf[js.Any])
  }
}
