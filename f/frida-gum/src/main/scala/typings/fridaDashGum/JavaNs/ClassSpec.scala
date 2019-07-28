package typings.fridaDashGum.JavaNs

import org.scalablytyped.runtime.StringDictionary
import typings.fridaDashGum.AnyFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClassSpec extends js.Object {
  /**
    * Interfaces implemented by this class.
    */
  var implements: js.UndefOr[js.Array[Wrapper]] = js.undefined
  /**
    * Methods to implement.
    */
  var methods: js.UndefOr[StringDictionary[AnyFunction | MethodSpec | js.Array[MethodSpec]]] = js.undefined
  /**
    * Name of the class.
    */
  var name: String
}

object ClassSpec {
  @scala.inline
  def apply(
    name: String,
    implements: js.Array[Wrapper] = null,
    methods: StringDictionary[AnyFunction | MethodSpec | js.Array[MethodSpec]] = null
  ): ClassSpec = {
    val __obj = js.Dynamic.literal(name = name)
    if (implements != null) __obj.updateDynamic("implements")(implements)
    if (methods != null) __obj.updateDynamic("methods")(methods)
    __obj.asInstanceOf[ClassSpec]
  }
}

