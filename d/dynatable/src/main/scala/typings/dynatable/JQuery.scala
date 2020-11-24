package typings.dynatable

import typings.dynatable.JQueryDynatable.Dynatable
import typings.dynatable.JQueryDynatable.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JQuery extends js.Object {
  
  /**
    * Initialize Dynatable plugin
    *
    * @param options An optional object that allow you to change the default configuration options
    */
  /**
    * @constructor
    */
  def dynatable(): JQuery = js.native
  def dynatable(options: Options): JQuery = js.native
  /**
    * @constructor
    */
  @JSName("dynatable")
  var dynatable_Original: Dynatable = js.native
}
