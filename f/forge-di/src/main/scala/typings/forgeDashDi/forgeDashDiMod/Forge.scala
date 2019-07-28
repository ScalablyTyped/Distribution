package typings.forgeDashDi.forgeDashDiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Forge extends js.Object {
  /**
    * The bindings mapped to this forge instance.
    */
  var bindings: IBindingMap = js.native
  /**
    * Creates a new binding.
    * @param {string} name The binding name.
    */
  def bind(name: String): IBinding = js.native
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
  def get[T](name: String): T = js.native
  def get[T](name: String, hint: String, args: js.Any*): T = js.native
  /**
    * Gets all instances of the type registered under the provided name.
    * @param {string} name The binding name.
    * @param {...args} args Additional args.
    */
  def getAll[T](name: String, args: js.Any*): T | js.Array[T] = js.native
  /**
    * Get all bindings registered under a binding name and optional hint.
    * @param {string} name The binding name.
    * @param {string} hint The binding hint.
    */
  def getMatchingBindings(name: String): js.Array[IBinding] = js.native
  def getMatchingBindings(name: String, hint: String): js.Array[IBinding] = js.native
  /**
    * Get a single instance of type registered under the provided name and optional hint.
    * @param {string} name The binding name.
    * @param {string} hint The binding hint.
    * @param {...args} args Additional args.
    */
  def getOne[T](name: String): T = js.native
  def getOne[T](name: String, hint: String, args: js.Any*): T = js.native
  /**
    * Returns a string that represents all bindings within this forge instance.
    */
  def inspect(): String = js.native
  /**
    * Unbinds then recreates a binding for this name.
    * @param {string} name The binding name.
    */
  def rebind(name: String): IBinding = js.native
  def resolve[T](name: String): T | js.Array[T] = js.native
  def resolve[T](name: String, context: IContext): T | js.Array[T] = js.native
  def resolve[T](name: String, context: IContext, hint: String): T | js.Array[T] = js.native
  def resolve[T](name: String, context: IContext, hint: String, all: Boolean, args: js.Any*): T | js.Array[T] = js.native
  def resolveBindings(context: IContext, bindings: js.Array[IBinding], hint: String, args: js.Array[_], unwrap: Boolean): js.Array[IBinding] = js.native
  /**
    * Unbinds all bindings for this name. Returns the number of bindings removed.
    * @param {string} name The binding name.
    */
  def unbind(name: String): Double = js.native
}

