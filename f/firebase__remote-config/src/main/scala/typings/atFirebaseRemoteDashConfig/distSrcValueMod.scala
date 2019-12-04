package typings.atFirebaseRemoteDashConfig

import typings.atFirebaseRemoteDashConfigDashTypes.atFirebaseRemoteDashConfigDashTypesMod.ValueSource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/remote-config/dist/src/value", JSImport.Namespace)
@js.native
object distSrcValueMod extends js.Object {
  @js.native
  class Value protected ()
    extends typings.atFirebaseRemoteDashConfigDashTypes.atFirebaseRemoteDashConfigDashTypesMod.Value {
    def this(_source: ValueSource) = this()
    def this(_source: ValueSource, _value: String) = this()
    val _source: js.Any = js.native
    val _value: js.Any = js.native
    /**
      * Gets the value as a boolean.
      *
      * The following values (case insensitive) are interpreted as true:
      * "1", "true", "t", "yes", "y", "on". Other values are interpreted as false.
      */
    /* CompleteClass */
    override def asBoolean(): Boolean = js.native
    /**
      * Gets the value as a number. Comparable to calling <code>Number(value) || 0</code>.
      */
    /* CompleteClass */
    override def asNumber(): Double = js.native
    /**
      * Gets the value as a string.
      */
    /* CompleteClass */
    override def asString(): String = js.native
    /**
      * Gets the {@link ValueSource} for the given key.
      */
    /* CompleteClass */
    override def getSource(): ValueSource = js.native
  }
  
}

