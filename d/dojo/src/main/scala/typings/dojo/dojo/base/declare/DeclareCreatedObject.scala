package typings.dojo.dojo.base.declare

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojo/_base/declare.__DeclareCreatedObject.html
  *
  * dojo/_base/declare() returns a constructor C.   new C() returns an Object with the following
  * methods, in addition to the methods and properties specified via the arguments passed to declare().
  *
  */
@JSGlobal("dojo._base.declare.__DeclareCreatedObject")
@js.native
class DeclareCreatedObject () extends js.Object {
  /**
    * Create a subclass of the declared class from a list of base classes.
    * Create a constructor using a compact notation for inheritance and
    * prototype extension.
    *
    * Mixin ancestors provide a type of multiple inheritance.
    * Prototypes of mixin ancestors are copied to the new class:
    * changes to mixin prototypes will not affect classes to which
    * they have been mixed in.
    *
    * @param mixins Specifies a list of bases (the left-most one is the most deepestbase).
    * @param props               OptionalAn optional object whose properties are copied to the created prototype.
    */
  def createSubclass(mixins: js.Array[js.Function]): DeclareCreatedObject = js.native
  def createSubclass(mixins: js.Array[js.Function], props: js.Object): DeclareCreatedObject = js.native
  /**
    * Adds all properties and methods of source to constructor's
    * prototype, making them available to all instances created with
    * constructor. This method is specific to constructors created with
    * declare().
    * Adds source properties to the constructor's prototype. It can
    * override existing properties.
    *
    * This method is similar to dojo.extend function, but it is specific
    * to constructors produced by declare(). It is implemented
    * using dojo.safeMixin, and it skips a constructor property,
    * and properly decorates copied functions.
    *
    * @param source Source object which properties are going to be copied to theconstructor's prototype.
    */
  def extend(source: js.Object): Unit = js.native
  /**
    * Returns a super method.
    * This method is a convenience method for "this.inherited()".
    * It uses the same algorithm but instead of executing a super
    * method, it returns it, or "undefined" if not found.
    *
    * @param name               OptionalThe optional method name. Should be the same as the caller'sname. Usually "name" is specified in complex dynamic cases, whenthe calling method was dynamically added, undecorated bydeclare(), and it cannot be determined.
    * @param args The caller supply this argument, which should be the original"arguments".
    */
  def getInherited(): js.Any = js.native
  def getInherited(name: String): js.Any = js.native
  def getInherited(name: String, args: js.Object): js.Any = js.native
  /**
    * Calls a super method.
    * This method is used inside method of classes produced with
    * declare() to call a super method (next in the chain). It is
    * used for manually controlled chaining. Consider using the regular
    * chaining, because it is faster. Use "this.inherited()" only in
    * complex cases.
    *
    * This method cannot me called from automatically chained
    * constructors including the case of a special (legacy)
    * constructor chaining. It cannot be called from chained methods.
    *
    * If "this.inherited()" cannot find the next-in-chain method, it
    * does nothing and returns "undefined". The last method in chain
    * can be a default method implemented in Object, which will be
    * called last.
    *
    * If "name" is specified, it is assumed that the method that
    * received "args" is the parent method for this call. It is looked
    * up in the chain list and if it is found the next-in-chain method
    * is called. If it is not found, the first-in-chain method is
    * called.
    *
    * If "name" is not specified, it will be derived from the calling
    * method (using a methoid property "nom").
    *
    * @param name               OptionalThe optional method name. Should be the same as the caller'sname. Usually "name" is specified in complex dynamic cases, whenthe calling method was dynamically added, undecorated bydeclare(), and it cannot be determined.
    * @param args The caller supply this argument, which should be the original"arguments".
    * @param newArgs               OptionalIf "true", the found function will be returned withoutexecuting it.If Array, it will be used to call a super method. Otherwise"args" will be used.
    */
  def inherited(): js.Any = js.native
  def inherited(name: String): js.Any = js.native
  def inherited(name: String, args: js.Object): js.Any = js.native
  def inherited(name: String, args: js.Object, newArgs: js.Object): js.Any = js.native
  /**
    * Checks the inheritance chain to see if it is inherited from this
    * class.
    * This method is used with instances of classes produced with
    * declare() to determine of they support a certain interface or
    * not. It models "instanceof" operator.
    *
    * @param cls Class constructor.
    */
  def isInstanceOf(cls: js.Function): js.Any = js.native
}

