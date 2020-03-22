package typings.fridaGum.Java

import org.scalablytyped.runtime.StringDictionary
import typings.fridaGum.WrapperDictname
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Dynamically generated wrapper for any Java class, instance, or interface.
  */
@js.native
trait Wrapper[T /* <: Members[T] */]
  extends /**
  * Methods and fields.
  */
/* name */ StringDictionary[js.Any] {
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
    * Instance used for chaining up to super-class method implementations.
    */
  @JSName("$super")
  var $super: WrapperDictname = js.native
  /**
    * Retrieves a `java.lang.Class` wrapper for the current class.
    */
  var `class`: WrapperDictname = js.native
  /**
    * Allocates a new instance without initializing it.
    *
    * Call `$init()` to initialize it.
    */
  @JSName("$alloc")
  def $alloc(params: js.Any*): js.Any = js.native
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

