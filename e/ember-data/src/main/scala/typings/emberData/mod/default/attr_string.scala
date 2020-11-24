package typings.emberData.mod.default

import typings.ember.mod.default.ComputedProperty
import typings.emberData.emberDataStrings.string
import typings.emberData.mod.DS.AttrOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ember-data", "attr")
@js.native
object attr_string extends js.Object {
  
  /**
    * `DS.attr` defines an attribute on a [DS.Model](/api/data/classes/DS.Model.html).
    * By default, attributes are passed through as-is, however you can specify an
    * optional type to have the value automatically transformed.
    * Ember Data ships with four basic transform types: `string`, `number`,
    * `boolean` and `date`. You can define your own transforms by subclassing
    * [DS.Transform](/api/data/classes/DS.Transform.html).
    */
  def apply(`type`: string): ComputedProperty[String, String] = js.native
  def apply(`type`: string, options: AttrOptions[String]): ComputedProperty[String, String] = js.native
}
