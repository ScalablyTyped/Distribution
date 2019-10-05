package typings.fridaDashGum.ObjC

import org.scalablytyped.runtime.StringDictionary
import typings.fridaDashGum.AnyFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClassSpec extends js.Object {
  /**
    * Methods to implement.
    */
  var methods: js.UndefOr[StringDictionary[AnyFunction | MethodSpec]] = js.undefined
  /**
    * Name of the class.
    *
    * Omit this if you don’t care about the globally visible name and would like the runtime to auto-generate one
    * for you.
    */
  var name: js.UndefOr[String] = js.undefined
  /**
    * Protocols this class conforms to.
    */
  var protocols: js.UndefOr[js.Array[Protocol]] = js.undefined
  /**
    * Super-class, or `null` to create a new root class. Omit to inherit from `NSObject`.
    */
  var `super`: js.UndefOr[Object | Null] = js.undefined
}

object ClassSpec {
  @scala.inline
  def apply(
    methods: StringDictionary[AnyFunction | MethodSpec] = null,
    name: String = null,
    protocols: js.Array[Protocol] = null,
    `super`: Object = null
  ): ClassSpec = {
    val __obj = js.Dynamic.literal()
    if (methods != null) __obj.updateDynamic("methods")(methods)
    if (name != null) __obj.updateDynamic("name")(name)
    if (protocols != null) __obj.updateDynamic("protocols")(protocols)
    if (`super` != null) __obj.updateDynamic("super")(`super`)
    __obj.asInstanceOf[ClassSpec]
  }
}

