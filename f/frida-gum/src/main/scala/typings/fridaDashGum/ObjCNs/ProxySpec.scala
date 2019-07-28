package typings.fridaDashGum.ObjCNs

import org.scalablytyped.runtime.StringDictionary
import typings.fridaDashGum.Anon_Forward
import typings.fridaDashGum.AnyFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProxySpec extends js.Object {
  /**
    * Callbacks for getting notified about events.
    */
  var events: js.UndefOr[Anon_Forward] = js.undefined
  /**
    * Methods to implement.
    */
  var methods: js.UndefOr[StringDictionary[AnyFunction | MethodSpec]] = js.undefined
  /**
    * Protocols this proxy class conforms to.
    */
  var protocols: js.UndefOr[js.Array[Protocol]] = js.undefined
}

object ProxySpec {
  @scala.inline
  def apply(
    events: Anon_Forward = null,
    methods: StringDictionary[AnyFunction | MethodSpec] = null,
    protocols: js.Array[Protocol] = null
  ): ProxySpec = {
    val __obj = js.Dynamic.literal()
    if (events != null) __obj.updateDynamic("events")(events)
    if (methods != null) __obj.updateDynamic("methods")(methods)
    if (protocols != null) __obj.updateDynamic("protocols")(protocols)
    __obj.asInstanceOf[ProxySpec]
  }
}

