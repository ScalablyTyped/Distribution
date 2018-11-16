package typings
package forgeDashDiLib.forgeDashDiMod.ForgeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Represents a binding between a name, type/instance/function and optional hint.
     */
@js.native
trait IBinding extends js.Object {
  /** The additional binding arguments to help resolve dependencies. */
  var arguments: IBindingArguments = js.native
  /** Alias mapping to this binding. */
  var as: IBinding = js.native
  /** The forge that contains this binding. */
  var forge: forgeDashDiLib.forgeDashDiMod.Forge = js.native
  /** Whether or not this binding is currently resolving. */
  var isResolving: scala.Boolean = js.native
  /** The lifecycle associated with this binding. Defaults to singleton. */
  var lifecycle: ILifecycle = js.native
  /** The binding name. */
  var name: java.lang.String = js.native
  /** The predicate associated with this binding. Used to support hints. */
  @JSName("predicate")
  var predicate_Original: IPredicate = js.native
  /** The resolver for this binding. */
  var resolver: IResolver = js.native
  /** Alias mapping to this binding. */
  var to: IBinding = js.native
  /**
           * Registers a type to a binding. This must be a callable function.
           * @param {T} target The target function.
           */
  def function[T /* <: forgeDashDiLib.Anon_Args */](target: T): IBinding = js.native
  /**
           * Registeres an instance to a binding. This instance will always be returned.
           * @param {T} target The target instance.
           */
  def instance[T /* <: js.Object */](target: T): IBinding = js.native
  /**
           * Checks whether or not this binding matches the hint by executing the predicate.
           * @param {string} hint The hint to check against.
           */
  def matches(hint: java.lang.String): scala.Boolean = js.native
  /**
           * Returns whether or not the hit satisfies this predicate.
           * @param {string} hint The hint to check against.
           */
  /** The predicate associated with this binding. Used to support hints. */
  def predicate(hint: java.lang.String): scala.Boolean = js.native
  /**
           * Configures this binding lifecycle as a singleton. This is the default lifecycle.
           */
  def singleton(): IBinding = js.native
  /**
           * Configures this binding lifecycle as transient.
           * New instances will be created, if this is a type based binding, on each get.
           */
  def transient(): IBinding = js.native
  /**
           * Registers a type to a binding. This type must have a constructor.
           * @param {T} target The target type.
           */
  def `type`[T /* <: IType */](target: T): IBinding = js.native
  /**
           * Registers a hint for this binding.
           * @param {string} hint The hint.
           */
  def when(hint: java.lang.String): IBinding = js.native
  /**
           * Registers a predicate for this binding.
           * @param {IPredicate} predicate The predicate.
           */
  def when(predicate: IPredicate): IBinding = js.native
  /**
           * Registers additional binding arguments to help with resolving.
           * @param {IBindingArguments} args The additional binding arguments.
           */
  def `with`(args: IBindingArguments): IBinding = js.native
}

