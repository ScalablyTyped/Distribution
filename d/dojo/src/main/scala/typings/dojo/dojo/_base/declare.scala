package typings.dojo.dojo._base

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojo/_base/declare.html
  *
  * Create a feature-rich constructor from compact notation.
  * Create a constructor using a compact notation for inheritance and
  * prototype extension.
  *
  * Mixin ancestors provide a type of multiple inheritance.
  * Prototypes of mixin ancestors are copied to the new class:
  * changes to mixin prototypes will not affect classes to which
  * they have been mixed in.
  *
  * Ancestors can be compound classes created by this version of
  * declare(). In complex cases all base classes are going to be
  * linearized according to C3 MRO algorithm
  * (see http://www.python.org/download/releases/2.3/mro/ for more
  * details).
  *
  * "className" is cached in "declaredClass" property of the new class,
  * if it was supplied. The immediate super class will be cached in
  * "superclass" property of the new class.
  *
  * Methods in "props" will be copied and modified: "nom" property
  * (the declared name of the method) will be added to all copied
  * functions to help identify them for the internal machinery. Be
  * very careful, while reusing methods: if you use the same
  * function under different names, it can produce errors in some
  * cases.
  *
  * It is possible to use constructors created "manually" (without
  * declare()) as bases. They will be called as usual during the
  * creation of an instance, their methods will be chained, and even
  * called by "this.inherited()".
  *
  * Special property "-chains-" governs how to chain methods. It is
  * a dictionary, which uses method names as keys, and hint strings
  * as values. If a hint string is "after", this method will be
  * called after methods of its base classes. If a hint string is
  * "before", this method will be called before methods of its base
  * classes.
  *
  * If "constructor" is not mentioned in "-chains-" property, it will
  * be chained using the legacy mode: using "after" chaining,
  * calling preamble() method before each constructor, if available,
  * and calling postscript() after all constructors were executed.
  * If the hint is "after", it is chained as a regular method, but
  * postscript() will be called after the chain of constructors.
  * "constructor" cannot be chained "before", but it allows
  * a special hint string: "manual", which means that constructors
  * are not going to be chained in any way, and programmer will call
  * them manually using this.inherited(). In the latter case
  * postscript() will be called after the construction.
  *
  * All chaining hints are "inherited" from base classes and
  * potentially can be overridden. Be very careful when overriding
  * hints! Make sure that all chained methods can work in a proposed
  * manner of chaining.
  *
  * Once a method was chained, it is impossible to unchain it. The
  * only exception is "constructor". You don't need to define a
  * method in order to supply a chaining hint.
  *
  * If a method is chained, it cannot use this.inherited() because
  * all other methods in the hierarchy will be called automatically.
  *
  * Usually constructors and initializers of any kind are chained
  * using "after" and destructors of any kind are chained as
  * "before". Note that chaining assumes that chained methods do not
  * return any value: any returned value will be discarded.
  *
  * @param className       OptionalThe optional name of the constructor (loosely, a "class")stored in the "declaredClass" property in the created prototype.It will be used as a global name for a created constructor.
  * @param superclass May be null, a Function, or an Array of Functions. This argumentspecifies a list of bases (the left-most one is the most deepestbase).
  * @param props An object whose properties are copied to the created prototype.Add an instance-initialization function by making it a propertynamed "constructor".
  */
@js.native
trait declare extends js.Object {
  def apply(): js.Any = js.native
  def apply(className: String): js.Any = js.native
  def apply(className: String, superclass: js.Any): js.Any = js.native
  def apply(className: String, superclass: js.Any, props: js.Object): js.Any = js.native
  def apply(className: String, superclass: js.Array[_]): js.Any = js.native
  def apply(className: String, superclass: js.Array[_], props: js.Object): js.Any = js.native
  /**
    * Mix in properties skipping a constructor and decorating functions
    * like it is done by declare().
    * This function is used to mix in properties like lang.mixin does,
    * but it skips a constructor property and decorates functions like
    * declare() does.
    *
    * It is meant to be used with classes and objects produced with
    * declare. Functions mixed in with dojo.safeMixin can use
    * this.inherited() like normal methods.
    *
    * This function is used to implement extend() method of a constructor
    * produced with declare().
    *
    * @param target Target object to accept new properties.
    * @param source Source object for new properties.
    */
  def safeMixin(target: js.Object, source: js.Object): js.Object = js.native
}

@JSGlobal("dojo._base.declare")
@js.native
object declare extends js.Object {
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dojo/_base/declare.__DeclareCreatedObject.html
    *
    * dojo/_base/declare() returns a constructor C.   new C() returns an Object with the following
    * methods, in addition to the methods and properties specified via the arguments passed to declare().
    *
    */
  @js.native
  class __DeclareCreatedObject () extends js.Object {
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
    def createSubclass(mixins: js.Array[js.Function]): __DeclareCreatedObject = js.native
    def createSubclass(mixins: js.Array[js.Function], props: js.Object): __DeclareCreatedObject = js.native
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
  
}

