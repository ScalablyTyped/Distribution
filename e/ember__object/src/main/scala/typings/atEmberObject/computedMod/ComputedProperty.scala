package typings.atEmberObject.computedMod

import typings.std.PropertyDecorator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.atEmberObject.dashPrivateTypesMod.ComputedPropertyMarker because Inheritance from two classes. Inlined ______getType, ______setType */ @js.native
trait ComputedProperty[Get, Set] extends PropertyDecorator {
  // Necessary in order to avoid losing type information
  //    see: https://github.com/typed-ember/ember-cli-typescript/issues/246#issuecomment-414812013
  var ______getType: Get = js.native
  var ______setType: Set = js.native
  def meta(): js.Object = js.native
  /**
    * In some cases, you may want to annotate computed properties with additional
    * metadata about how they function or what values they operate on. For example,
    * computed property functions may close over variables that are then no longer
    * available for introspection.
    */
  def meta(meta: js.Object): this.type = js.native
  /**
    * Sets the dependent keys on this computed property. Pass any number of
    * arguments containing key paths that this computed property depends on.
    */
  def property(path: String*): this.type = js.native
  /**
    * Call on a computed property to set it into read-only mode. When in this
    * mode the computed property will throw an error when set.
    */
  def readOnly(): this.type = js.native
  /**
    * Call on a computed property to set it into non-cached mode. When in this
    * mode the computed property will not automatically cache the return value.
    */
  def volatile(): this.type = js.native
}

