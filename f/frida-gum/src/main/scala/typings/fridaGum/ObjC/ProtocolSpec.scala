package typings.fridaGum.ObjC

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProtocolSpec extends js.Object {
  var methods: js.UndefOr[StringDictionary[ProtocolMethodSpec]] = js.undefined
  /**
    * Name of the protocol.
    *
    * Omit this if you don’t care about the globally visible name and would like the runtime to auto-generate one
    * for you.
    */
  var name: js.UndefOr[String] = js.undefined
  /**
    * Protocols this protocol conforms to.
    */
  var protocols: js.UndefOr[js.Array[Protocol]] = js.undefined
}

object ProtocolSpec {
  @scala.inline
  def apply(
    methods: StringDictionary[ProtocolMethodSpec] = null,
    name: String = null,
    protocols: js.Array[Protocol] = null
  ): ProtocolSpec = {
    val __obj = js.Dynamic.literal()
    if (methods != null) __obj.updateDynamic("methods")(methods.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (protocols != null) __obj.updateDynamic("protocols")(protocols.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProtocolSpec]
  }
}

