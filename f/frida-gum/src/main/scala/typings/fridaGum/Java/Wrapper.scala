package typings.fridaGum.Java

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Dynamically generated wrapper for any Java class, instance, or interface.
  */
@js.native
trait Wrapper[T /* <: Members[T] */]
  extends /* name */ StringDictionary[js.Any] {
  /**
    * Allocates a new instance without initializing it.
    *
    * Call `$init()` to initialize it.
    */
  @JSName("$alloc")
  var $alloc_Original: MethodDispatcher[T] = js.native
  /**
    * Canonical name of class being wrapped.
    */
  @JSName("$className")
  var $className: String = js.native
  /**
    * Initializes an instance that was allocated but not yet initialized.
    * This wraps the constructor(s).
    *
    * Replace the `implementation` property to hook a given constructor.
    */
  @JSName("$init")
  var $init_Original: MethodDispatcher[T] = js.native
  /**
    * Allocates and initializes a new instance of the given class.
    *
    * Use this to create a new instance.
    */
  @JSName("$new")
  var $new_Original: MethodDispatcher[T] = js.native
  /**
    * Method and field names exposed by this object’s class, not including
    * parent classes.
    */
  @JSName("$ownMembers")
  var $ownMembers: js.Array[String] = js.native
  /**
    * Instance used for chaining up to super-class method implementations.
    */
  @JSName("$super")
  var $super: typings.fridaGum.anon.Wrapper = js.native
  /**
    * Retrieves a `java.lang.Class` wrapper for the current class.
    */
  var `class`: typings.fridaGum.anon.Wrapper = js.native
  /**
    * Allocates a new instance without initializing it.
    *
    * Call `$init()` to initialize it.
    */
  @JSName("$alloc")
  def $alloc(params: js.Any*): js.Any = js.native
  /**
    * Eagerly deletes the underlying JNI global reference without having to
    * wait for the object to become unreachable and the JavaScript
    * runtime's garbage collector to kick in (or script to be unloaded).
    *
    * Useful when a lot of short-lived objects are created in a loop and
    * there's a risk of running out of global handles.
    */
  @JSName("$dispose")
  def $dispose(): Unit = js.native
  /**
    * Initializes an instance that was allocated but not yet initialized.
    * This wraps the constructor(s).
    *
    * Replace the `implementation` property to hook a given constructor.
    */
  @JSName("$init")
  def $init(params: js.Any*): js.Any = js.native
  /**
    * Allocates and initializes a new instance of the given class.
    *
    * Use this to create a new instance.
    */
  @JSName("$new")
  def $new(params: js.Any*): js.Any = js.native
}

