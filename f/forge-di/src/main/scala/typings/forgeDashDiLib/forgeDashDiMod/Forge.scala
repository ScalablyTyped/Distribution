package typings
package forgeDashDiLib.forgeDashDiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Forge extends js.Object {
  /**
       * The bindings mapped to this forge instance.
       */
  var bindings: forgeDashDiLib.forgeDashDiMod.ForgeNs.IBindingMap = js.native
  /**
       * Creates a new binding.
       * @param {string} name The binding name.
       */
  def bind(name: java.lang.String): forgeDashDiLib.forgeDashDiMod.ForgeNs.IBinding = js.native
  /**
       * Creates an instance of the target type attempting to resolve any dependencies.
       * @param {T} target The target type.
       * @param {...args} args Additional args.
       */
  def create[T](target: T, args: js.Any*): T = js.native
  /**
       * Get instance or instances of type registered under the provided name and optional hint.
       * @param {string} name The binding name.
       * @param {string} hint The binding hint.
       * @param {...args} args Additional args.
       */
  def get[T](name: java.lang.String): T = js.native
  /**
       * Get instance or instances of type registered under the provided name and optional hint.
       * @param {string} name The binding name.
       * @param {string} hint The binding hint.
       * @param {...args} args Additional args.
       */
  def get[T](name: java.lang.String, hint: java.lang.String, args: js.Any*): T = js.native
  /**
       * Gets all instances of the type registered under the provided name.
       * @param {string} name The binding name.
       * @param {...args} args Additional args.
       */
  def getAll[T](name: java.lang.String, args: js.Any*): T | js.Array[T] = js.native
  /**
       * Get all bindings registered under a binding name and optional hint.
       * @param {string} name The binding name.
       * @param {string} hint The binding hint.
       */
  def getMatchingBindings(name: java.lang.String): js.Array[forgeDashDiLib.forgeDashDiMod.ForgeNs.IBinding] = js.native
  /**
       * Get all bindings registered under a binding name and optional hint.
       * @param {string} name The binding name.
       * @param {string} hint The binding hint.
       */
  def getMatchingBindings(name: java.lang.String, hint: java.lang.String): js.Array[forgeDashDiLib.forgeDashDiMod.ForgeNs.IBinding] = js.native
  /**
       * Get a single instance of type registered under the provided name and optional hint.
       * @param {string} name The binding name.
       * @param {string} hint The binding hint.
       * @param {...args} args Additional args.
       */
  def getOne[T](name: java.lang.String): T = js.native
  /**
       * Get a single instance of type registered under the provided name and optional hint.
       * @param {string} name The binding name.
       * @param {string} hint The binding hint.
       * @param {...args} args Additional args.
       */
  def getOne[T](name: java.lang.String, hint: java.lang.String, args: js.Any*): T = js.native
  /**
       * Returns a string that represents all bindings within this forge instance.
       */
  def inspect(): java.lang.String = js.native
  /**
       * Unbinds then recreates a binding for this name.
       * @param {string} name The binding name.
       */
  def rebind(name: java.lang.String): forgeDashDiLib.forgeDashDiMod.ForgeNs.IBinding = js.native
  def resolve[T](name: java.lang.String): T | js.Array[T] = js.native
  def resolve[T](name: java.lang.String, context: forgeDashDiLib.forgeDashDiMod.ForgeNs.IContext): T | js.Array[T] = js.native
  def resolve[T](
    name: java.lang.String,
    context: forgeDashDiLib.forgeDashDiMod.ForgeNs.IContext,
    hint: java.lang.String
  ): T | js.Array[T] = js.native
  def resolve[T](
    name: java.lang.String,
    context: forgeDashDiLib.forgeDashDiMod.ForgeNs.IContext,
    hint: java.lang.String,
    all: scala.Boolean,
    args: js.Any*
  ): T | js.Array[T] = js.native
  def resolveBindings(
    context: forgeDashDiLib.forgeDashDiMod.ForgeNs.IContext,
    bindings: js.Array[forgeDashDiLib.forgeDashDiMod.ForgeNs.IBinding],
    hint: java.lang.String,
    args: js.Array[_],
    unwrap: scala.Boolean
  ): js.Array[forgeDashDiLib.forgeDashDiMod.ForgeNs.IBinding] = js.native
  /**
       * Unbinds all bindings for this name. Returns the number of bindings removed.
       * @param {string} name The binding name.
       */
  def unbind(name: java.lang.String): scala.Double = js.native
}

