package typings.fridaDashGum.ObjC

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClassSpec[D, T, S] extends js.Object {
  /**
    * Methods to implement.
    */
  var methods: js.UndefOr[
    StringDictionary[
      (UserMethodImplementation[D, T, S]) | (MethodSpec[UserMethodImplementation[D, T, S]])
    ]
  ] = js.undefined
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
  def apply[D, T, S](
    methods: StringDictionary[
      (UserMethodImplementation[D, T, S]) | (MethodSpec[UserMethodImplementation[D, T, S]])
    ] = null,
    name: String = null,
    protocols: js.Array[Protocol] = null,
    `super`: Object = null
  ): ClassSpec[D, T, S] = {
    val __obj = js.Dynamic.literal()
    if (methods != null) __obj.updateDynamic("methods")(methods.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (protocols != null) __obj.updateDynamic("protocols")(protocols.asInstanceOf[js.Any])
    if (`super` != null) __obj.updateDynamic("super")(`super`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClassSpec[D, T, S]]
  }
}

