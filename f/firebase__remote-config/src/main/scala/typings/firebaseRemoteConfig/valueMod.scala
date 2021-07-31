package typings.firebaseRemoteConfig

import typings.firebaseRemoteConfigTypes.mod.ValueSource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object valueMod {
  
  @JSImport("@firebase/remote-config/dist/src/value", "Value")
  @js.native
  class Value protected ()
    extends StObject
       with typings.firebaseRemoteConfigTypes.mod.Value {
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
