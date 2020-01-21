package typings.fridaGum.ObjC

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProxySpec[D /* <: ProxyData */, T, S] extends js.Object {
  /**
    * Callbacks for getting notified about events.
    */
  var events: js.UndefOr[ProxyEventCallbacks[D, T, S]] = js.undefined
  /**
    * Methods to implement.
    */
  var methods: js.UndefOr[
    StringDictionary[
      (UserMethodImplementation[D, T, S]) | (MethodSpec[UserMethodImplementation[D, T, S]])
    ]
  ] = js.undefined
  /**
    * Name of the proxy class.
    *
    * Omit this if you don’t care about the globally visible name and would like the runtime to auto-generate one
    * for you.
    */
  var name: js.UndefOr[String] = js.undefined
  /**
    * Protocols this proxy class conforms to.
    */
  var protocols: js.UndefOr[js.Array[Protocol]] = js.undefined
}

object ProxySpec {
  @scala.inline
  def apply[D /* <: ProxyData */, T, S](
    events: ProxyEventCallbacks[D, T, S] = null,
    methods: StringDictionary[
      (UserMethodImplementation[D, T, S]) | (MethodSpec[UserMethodImplementation[D, T, S]])
    ] = null,
    name: String = null,
    protocols: js.Array[Protocol] = null
  ): ProxySpec[D, T, S] = {
    val __obj = js.Dynamic.literal()
    if (events != null) __obj.updateDynamic("events")(events.asInstanceOf[js.Any])
    if (methods != null) __obj.updateDynamic("methods")(methods.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (protocols != null) __obj.updateDynamic("protocols")(protocols.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProxySpec[D, T, S]]
  }
}

