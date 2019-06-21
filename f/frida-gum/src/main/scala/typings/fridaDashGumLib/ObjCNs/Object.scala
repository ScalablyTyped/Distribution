package typings
package fridaDashGumLib.ObjCNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Dynamically generated wrapper for any Objective-C instance, class, or meta-class.
  */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- org.scalablytyped.runtime.StringDictionary because Already inherited */ @JSGlobal("ObjC.Object")
@js.native
class Object protected ()
  extends fridaDashGumLib.ObjectWrapper
     with ObjectMethods {
  def this(handle: fridaDashGumLib.NativePointer) = this()
  def this(handle: fridaDashGumLib.NativePointer, protocol: Protocol) = this()
  /**
    * Class that this object is an instance of.
    */
  @JSName("$class")
  var $class: Object = js.native
  /**
    * Class name of this object.
    */
  @JSName("$className")
  var $className: java.lang.String = js.native
  /**
    * Instance variables on this object. Supports both access and assignment.
    */
  @JSName("$ivars")
  var $ivars: org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
  /**
    * Whether this is an instance, class, or meta-class.
    */
  @JSName("$kind")
  var $kind: ObjectKind = js.native
  /**
    * Native method names exposed by this object’s class and parent classes.
    */
  @JSName("$methods")
  var $methods: js.Array[java.lang.String] = js.native
  /**
    * Name of module where this object is implemented.
    */
  @JSName("$moduleName")
  var $moduleName: java.lang.String = js.native
  /**
    * Native method names exposed by this object’s class, not including parent classes.
    */
  @JSName("$ownMethods")
  var $ownMethods: js.Array[java.lang.String] = js.native
  /**
    * Protocols that this object conforms to.
    */
  @JSName("$protocols")
  var $protocols: org.scalablytyped.runtime.StringDictionary[Protocol] = js.native
  /**
    * Instance used for chaining up to super-class method implementations.
    */
  @JSName("$super")
  var $super: Object = js.native
  /**
    * Super-class of this object's class.
    */
  @JSName("$superClass")
  var $superClass: Object = js.native
  /* CompleteClass */
  override var handle: fridaDashGumLib.NativePointer = js.native
  def equals(other: fridaDashGumLib.NativePointer): scala.Boolean = js.native
  /**
    * Determines whether two instances refer to the same underlying object.
    *
    * @param other Other object instance or address to compare to.
    */
  def equals(other: Object): scala.Boolean = js.native
}

