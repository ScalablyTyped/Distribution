package typings.dojo.dojox.dtl

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("dojox.dtl.Context")
@js.native
object Context extends js.Object {
  /**
    * Returns a clone of this context object, with the items from the passed objecct mixed in.
    *
    * @param obj The object to extend.
    */
  @js.native
  trait extend extends js.Object {
    def apply(obj: js.Object): js.Any = js.native
    def apply(obj: Context): js.Any = js.native
  }
  
  /**
    * Returns a clone of this context, only containing the items defined in the filter.
    *
    * @param filter
    */
  @js.native
  trait filter extends js.Object {
    def apply(filter: js.Array[String]): js.Any = js.native
    def apply(filter: js.Object): js.Any = js.native
    def apply(filter: Context): js.Any = js.native
  }
  
  /**
    *
    * @param key
    * @param otherwise
    */
  type get = js.Function2[/* key */ js.Any, /* otherwise */ js.Any, js.Any]
  /**
    * Returns the set of keys exported by this context.
    *
    */
  type getKeys = js.Function0[js.Array[js.Any]]
  /**
    * Gets the object on which to perform operations.
    *
    */
  type getThis = js.Function0[js.Any]
  /**
    * Indicates whether the specified key is defined on this context.
    *
    * @param key The key to look up.
    */
  type hasKey = js.Function1[/* key */ String, Boolean]
  /**
    *
    */
  type pop = js.Function0[Unit]
  /**
    *
    */
  type push = js.Function0[js.Any]
  /**
    * Sets the object on which to perform operations.
    *
    * @param scope the this ref.
    */
  type setThis = js.Function1[/* scope */ js.Object, Unit]
  /**
    *
    * @param dict
    */
  type update = js.Function1[/* dict */ js.Any, js.Any]
}

