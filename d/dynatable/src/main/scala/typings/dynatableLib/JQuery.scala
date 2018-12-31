package typings
package dynatableLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JQuery extends js.Object {
  /**
    * @constructor
    */
  @JSName("dynatable")
  var dynatable_Original: dynatableLib.JQueryDynatableNs.Dynatable = js.native
  /**
    * Initialize Dynatable plugin
    *
    * @param options An optional object that allow you to change the default configuration options
    */
  /**
    * @constructor
    */
  def dynatable(): JQuery = js.native
  def dynatable(options: dynatableLib.JQueryDynatableNs.Options): JQuery = js.native
}

